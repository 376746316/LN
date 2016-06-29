package com.chinasofti.cetp.utils;

import org.apache.log4j.Logger;

public abstract class Dialect {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	public static enum Type {
		MYSQL, ORACLE
	}

	public abstract String getLimitString(String sql, int skipResults,
			int maxResults);

}
