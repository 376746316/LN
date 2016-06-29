package com.chinasofti.cetp.ability.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasofti.cetp.ability.model.MoreSysEvaluation;
import com.chinasofti.cetp.ability.model.SysEvaluation;
import com.chinasofti.cetp.ability.model.SysEvaluationExample;
import com.chinasofti.cetp.ability.model.SysEvaluationKey;

public interface SysEvaluationMapper {
	// add by YF 2013-10-28
	Integer getMaxAbiValue(@Param("abiId") Integer abiId,
			@Param("stuNo") Integer stuNo);

	// end

	List<MoreSysEvaluation> selectSelfEvaluation(HashMap map);

	List<MoreSysEvaluation> selectStandard(HashMap map);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int countByExample(SysEvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int deleteByExample(SysEvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int deleteByPrimaryKey(SysEvaluationKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int insert(SysEvaluation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int insertSelective(SysEvaluation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	List<SysEvaluation> selectByExample(SysEvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	SysEvaluation selectByPrimaryKey(SysEvaluationKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int updateByExampleSelective(@Param("record") SysEvaluation record,
			@Param("example") SysEvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int updateByExample(@Param("record") SysEvaluation record,
			@Param("example") SysEvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int updateByPrimaryKeySelective(SysEvaluation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_sys_evaluation
	 * 
	 * @mbggenerated Fri Aug 09 09:51:47 CST 2013
	 */
	int updateByPrimaryKey(SysEvaluation record);
}