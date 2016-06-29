package com.chinasofti.cetp.practice.dao;

import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.practice.model.MoreAvailPro;
import com.chinasofti.cetp.practice.model.MorePracticeClass;
import com.chinasofti.cetp.practice.model.PracticeClass;
import com.chinasofti.cetp.practice.model.PracticeClassExample;
import com.chinasofti.cetp.practice.model.PracticeClassKey;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PracticeClassMapper {
	int deleteStu(HashMap map);

	List<MorePracticeClass> getClassCbx(Integer pracId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int countByExample(PracticeClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int deleteByExample(PracticeClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int deleteByPrimaryKey(PracticeClassKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int insert(PracticeClass record);

	List<MorePracticeClass> selStu(Integer classId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int insertSelective(PracticeClass record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	List<PracticeClass> selectByExample(PracticeClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	PracticeClass selectByPrimaryKey(PracticeClassKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int updateByExampleSelective(@Param("record") PracticeClass record, @Param("example") PracticeClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int updateByExample(@Param("record") PracticeClass record, @Param("example") PracticeClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int updateByPrimaryKeySelective(PracticeClass record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tp_practice_class
	 * 
	 * @mbggenerated Thu Jul 25 19:47:24 CST 2013
	 */
	int updateByPrimaryKey(PracticeClass record);

	/* star add by wang-hw 2013-08-07 */
	List<MorePracticeClass> selectClass(Integer pracId, RowBounds rowBounds);

	// List<MorePracticeClass> notSelectClass(HashMap map,RowBounds rowBounds);

	List<MorePracticeClass> selectQueryNotProMng(HashMap map, RowBounds rowBounds);

	/* end */

	// edit by YF 2013-11-20
	List<MorePracticeClass> notSelectClass(@Param("orgName") String orgName, @Param("className") String className, @Param("orgId") Integer orgId, @Param("orgList") List<Org> orgList, RowBounds rowBounds);

	/**
	 * 2014-7-9 获取默认班级ID 实训班级中ID最大者
	 * 
	 * @author Fly
	 * @param pracId
	 * @return
	 */
	Integer getDefaultClass(Integer pracId);

}