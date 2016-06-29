package com.chinasofti.cetp.survey.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.survey.model.ModelQuetionaire;
import com.chinasofti.cetp.survey.model.ModelStatement;
import com.chinasofti.cetp.survey.model.Quetionaire;
import com.chinasofti.cetp.survey.model.QuetionaireExample;

public interface QuetionaireMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int countByExample(QuetionaireExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int deleteByExample(QuetionaireExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int deleteByPrimaryKey(Integer qaId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int insert(Quetionaire record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int insertSelective(Quetionaire record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	List<Quetionaire> selectByExampleWithBLOBs(QuetionaireExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	List<Quetionaire> selectByExample(QuetionaireExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	Quetionaire selectByPrimaryKey(Integer qaId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int updateByExampleSelective(@Param("record") Quetionaire record,
			@Param("example") QuetionaireExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int updateByExampleWithBLOBs(@Param("record") Quetionaire record,
			@Param("example") QuetionaireExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int updateByExample(@Param("record") Quetionaire record,
			@Param("example") QuetionaireExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int updateByPrimaryKeySelective(Quetionaire record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int updateByPrimaryKeyWithBLOBs(Quetionaire record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_quetionaire
	 * 
	 * @mbggenerated Thu Jul 25 20:01:32 CST 2013
	 */
	int updateByPrimaryKey(Quetionaire record);

	List<Quetionaire> selectByExampleWithBLOBs(QuetionaireExample example,
			RowBounds rowBounds);
	
	List<Quetionaire> getQuetionaireBySySurveyId(Integer sySurveyId);
	 
	List<Quetionaire> getQuetionaireBySurveyId(Integer sySurveyId);
	
	List<ModelStatement> getModelStatementBySySurveyId(Integer sySurveyId);
}