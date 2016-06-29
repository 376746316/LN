package com.chinasofti.cetp.interceptor;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.builder.xml.dynamic.ForEachSqlNode;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.apache.log4j.Logger;

import com.chinasofti.cetp.utils.Dialect;
import com.chinasofti.cetp.utils.DocConverter;
import com.chinasofti.cetp.utils.MySql5Dialect;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class PaginationInterceptor implements Interceptor {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	private final static Log log = LogFactory
			.getLog(PaginationInterceptor.class);

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler) invocation
				.getTarget();
		BoundSql boundSql = statementHandler.getBoundSql();
		MetaObject metaStatementHandler = MetaObject
				.forObject(statementHandler);
		RowBounds rowBounds = (RowBounds) metaStatementHandler
				.getValue("delegate.rowBounds");
		MappedStatement mappedStatement = (MappedStatement) metaStatementHandler
				.getValue("delegate.mappedStatement");

		if (rowBounds == null || rowBounds == RowBounds.DEFAULT) {
			return invocation.proceed();
		}
		Configuration configuration = (Configuration) metaStatementHandler
				.getValue("delegate.configuration");
		Dialect.Type databaseType = null;
		try {
			databaseType = Dialect.Type.valueOf(configuration.getVariables()
					.getProperty("dialect").toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
		if (databaseType == null) {
			throw new RuntimeException(
					"the value of the dialect property in configuration.xml is not defined : "
							+ configuration.getVariables().getProperty(
									"dialect"));
		}
		Dialect dialect = null;
		switch (databaseType) {
		case MYSQL:
			dialect = new MySql5Dialect();

		}

		String originalSql = (String) metaStatementHandler
				.getValue("delegate.boundSql.sql");
		if (rowBounds.getClass().equals(RowBoundsWithTotalCount.class)) {
			// get total count
			Object parameterObject = boundSql.getParameterObject();
			Connection connection = (Connection) invocation.getArgs()[0];
			String countSql = "select count(0) from (" + originalSql
					+ ") as tmp_count"; // 记录统计
			PreparedStatement countStmt = connection.prepareStatement(countSql);
			setParameters(countStmt, mappedStatement, boundSql, parameterObject);
			ResultSet rs = countStmt.executeQuery();
			int count = 0;
			if (rs.next()) {
				count = rs.getInt(1);
			}
			rs.close();
			countStmt.close();
			((RowBoundsWithTotalCount) rowBounds).setTotalCount(count);
		}
		metaStatementHandler.setValue("delegate.boundSql.sql", dialect
				.getLimitString(originalSql, rowBounds.getOffset(),
						rowBounds.getLimit()));
		metaStatementHandler.setValue("delegate.rowBounds.offset",
				RowBounds.NO_ROW_OFFSET);
		metaStatementHandler.setValue("delegate.rowBounds.limit",
				RowBounds.NO_ROW_LIMIT);
		if (log.isDebugEnabled()) {
			log.debug("生成分页SQL : " + boundSql.getSql());
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {

	}

	/**
	 * 对SQL参数(?)设值,参考org.apache.ibatis.executor.parameter.
	 * DefaultParameterHandler
	 * 
	 * @param ps
	 * @param mappedStatement
	 * @param boundSql
	 * @param parameterObject
	 * @throws SQLException
	 */
	private void setParameters(PreparedStatement ps,
			MappedStatement mappedStatement, BoundSql boundSql,
			Object parameterObject) throws SQLException {
		ErrorContext.instance().activity("setting parameters")
				.object(mappedStatement.getParameterMap().getId());
		List<ParameterMapping> parameterMappings = boundSql
				.getParameterMappings();
		if (parameterMappings != null) {
			Configuration configuration = mappedStatement.getConfiguration();
			TypeHandlerRegistry typeHandlerRegistry = configuration
					.getTypeHandlerRegistry();
			MetaObject metaObject = parameterObject == null ? null
					: configuration.newMetaObject(parameterObject);
			for (int i = 0; i < parameterMappings.size(); i++) {
				ParameterMapping parameterMapping = parameterMappings.get(i);
				if (parameterMapping.getMode() != ParameterMode.OUT) {
					Object value;
					String propertyName = parameterMapping.getProperty();
					PropertyTokenizer prop = new PropertyTokenizer(propertyName);
					if (parameterObject == null) {
						value = null;
					} else if (typeHandlerRegistry
							.hasTypeHandler(parameterObject.getClass())) {
						value = parameterObject;
					} else if (boundSql.hasAdditionalParameter(propertyName)) {
						value = boundSql.getAdditionalParameter(propertyName);
					} else if (propertyName
							.startsWith(ForEachSqlNode.ITEM_PREFIX)
							&& boundSql.hasAdditionalParameter(prop.getName())) {
						value = boundSql.getAdditionalParameter(prop.getName());
						if (value != null) {
							value = configuration.newMetaObject(value)
									.getValue(
											propertyName.substring(prop
													.getName().length()));
						}
					} else {
						value = metaObject == null ? null : metaObject
								.getValue(propertyName);
					}
					TypeHandler typeHandler = parameterMapping.getTypeHandler();
					if (typeHandler == null) {
						throw new ExecutorException(
								"There was no TypeHandler found for parameter "
										+ propertyName + " of statement "
										+ mappedStatement.getId());
					}
					typeHandler.setParameter(ps, i + 1, value,
							parameterMapping.getJdbcType());
				}
			}
		}
	}
}
