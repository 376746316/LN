package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.RqaCost;
import com.chinasofti.cetp.study.model.RqaCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RqaCostMapper {
	int countByExample(RqaCostExample example);

	int deleteByExample(RqaCostExample example);

	int deleteByPrimaryKey(Integer rcId);

	int insert(RqaCost record);

	int insertSelective(RqaCost record);

	List<RqaCost> selectByExample(RqaCostExample example);

	RqaCost selectByPrimaryKey(Integer rcId);

	int updateByExampleSelective(@Param("record") RqaCost record, @Param("example") RqaCostExample example);

	int updateByExample(@Param("record") RqaCost record, @Param("example") RqaCostExample example);

	int updateByPrimaryKeySelective(RqaCost record);

	int updateByPrimaryKey(RqaCost record);

	// =================================== 忧伤的分割线 =======================================

	/**
	 * 根据购买次数查询规则信息
	 * @param qAcount 购买次数
	 * @return
	 */
	RqaCost getRqaCostByQacount(@Param("qAcount") Integer qAcount);
}