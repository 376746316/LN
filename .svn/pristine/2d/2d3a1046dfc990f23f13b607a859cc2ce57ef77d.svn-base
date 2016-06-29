package com.chinasofti.cetp.resource.dao;

import com.chinasofti.cetp.resource.model.FulltextIndexExample;
import com.chinasofti.cetp.resource.model.FulltextIndexKey;
import com.chinasofti.cetp.resource.model.FulltextIndexWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FulltextIndexMapper {
	int countByExample(FulltextIndexExample example);

	int deleteByExample(FulltextIndexExample example);

	int deleteByPrimaryKey(FulltextIndexKey key);

	int insert(FulltextIndexWithBLOBs record);

	int insertSelective(FulltextIndexWithBLOBs record);

	List<FulltextIndexWithBLOBs> selectByExampleWithBLOBs(
			FulltextIndexExample example);

	List<FulltextIndexKey> selectByExample(FulltextIndexExample example);

	FulltextIndexWithBLOBs selectByPrimaryKey(FulltextIndexKey key);

	int updateByExampleSelective(
			@Param("record") FulltextIndexWithBLOBs record,
			@Param("example") FulltextIndexExample example);

	int updateByExampleWithBLOBs(
			@Param("record") FulltextIndexWithBLOBs record,
			@Param("example") FulltextIndexExample example);

	int updateByExample(@Param("record") FulltextIndexKey record,
			@Param("example") FulltextIndexExample example);

	int updateByPrimaryKeySelective(FulltextIndexWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(FulltextIndexWithBLOBs record);

	/**
	 * 获取索引表原始数据
	 * 
	 * @param table
	 *            原始表
	 * @param type
	 *            类别编号
	 * @param col_id
	 *            id列列名
	 * @param col_title
	 *            title列列名
	 * @param col_content
	 *            content列列名
	 * @param where_conditon
	 *            查询条件
	 * @return
	 */
	List<FulltextIndexWithBLOBs> getSourceInfo(@Param("table") String table,
			@Param("type") String type, @Param("col_id") String col_id,
			@Param("col_title") String col_title,
			@Param("col_content") String col_content,
			@Param("where_conditon") String where_conditon
			);

	/**
	 * 分页查询
	 * 
	 * @param example
	 * @param rowBounds
	 * @return
	 */
	List<FulltextIndexWithBLOBs> search(@Param("key") String key,
			@Param("type") String type, RowBounds rowBounds);

	/**
	 * 分类总数
	 * @param key
	 * @param type
	 * @return
	 */
	Integer countBySearch(@Param("key") String key, @Param("type") String type);

	int replace(List<FulltextIndexWithBLOBs> list);
}