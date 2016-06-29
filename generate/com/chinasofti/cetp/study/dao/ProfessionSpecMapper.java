package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.MoreProfessionSpec;
import com.chinasofti.cetp.study.model.ProfessionSpec;
import com.chinasofti.cetp.study.model.ProfessionSpecExample;
import com.chinasofti.cetp.study.model.ProfessionSpecKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProfessionSpecMapper {
	int countByExample(ProfessionSpecExample example);

	int deleteByExample(ProfessionSpecExample example);

	int deleteByPrimaryKey(ProfessionSpecKey key);

	int insert(ProfessionSpec record);

	int insertSelective(ProfessionSpec record);

	List<ProfessionSpec> selectByExample(ProfessionSpecExample example);

	ProfessionSpec selectByPrimaryKey(ProfessionSpecKey key);

	int updateByExampleSelective(@Param("record") ProfessionSpec record, @Param("example") ProfessionSpecExample example);

	int updateByExample(@Param("record") ProfessionSpec record, @Param("example") ProfessionSpecExample example);

	int updateByPrimaryKeySelective(ProfessionSpec record);

	int updateByPrimaryKey(ProfessionSpec record);

	/**
	 * 岗位路径
	 * 
	 * @param profId
	 * @param stuNo
	 * @return
	 */
	List<MoreProfessionSpec> getProfSpec(@Param("profId") Integer profId, @Param("stuNo") Integer stuNo);

	/**
	 * 批量插入
	 * 
	 * @param list
	 * @return
	 */
	int insertList(List<ProfessionSpec> list);

	List<MoreProfessionSpec> getProfSpecById(Integer profId);
}