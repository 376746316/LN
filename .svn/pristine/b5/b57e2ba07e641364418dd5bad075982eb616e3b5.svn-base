package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.SpecCourse;
import com.chinasofti.cetp.study.model.SpecCourseAndComment;
import com.chinasofti.cetp.study.model.SpecCourseExample;
import com.chinasofti.cetp.study.model.SpecCourseWithBLOBs;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SpecCourseMapper {
	int countByExample(SpecCourseExample example);

	int deleteByExample(SpecCourseExample example);

	int deleteByPrimaryKey(Integer specId);

	int insert(SpecCourseWithBLOBs record);

	int insertSelective(SpecCourseWithBLOBs record);

	List<SpecCourseWithBLOBs> selectByExampleWithBLOBs(SpecCourseExample example);

	List<SpecCourse> selectByExample(SpecCourseExample example);

	SpecCourseWithBLOBs selectByPrimaryKey(Integer specId);

	int updateByExampleSelective(@Param("record") SpecCourseWithBLOBs record, @Param("example") SpecCourseExample example);

	int updateByExampleWithBLOBs(@Param("record") SpecCourseWithBLOBs record, @Param("example") SpecCourseExample example);

	int updateByExample(@Param("record") SpecCourse record, @Param("example") SpecCourseExample example);

	int updateByPrimaryKeySelective(SpecCourseWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(SpecCourseWithBLOBs record);

	int updateByPrimaryKey(SpecCourse record);

	/**
	 * 根据专业课的课程级别（初级、中级、高级）选择课程
	 * 
	 * @param specClass
	 * @return
	 */
	List<SpecCourseAndComment> selectBySpecClass(String specClass);

	List<SpecCourse> getTeachingSpecCourse(HashMap<String, Object> map, RowBounds rb);

	/**
	 * 根据条件来获得指定课程集合，如：按学习(type)，浏览(typeCount)，课程类型(status)
	 * 
	 * @param paramters
	 * @return
	 */
	List<SpecCourseAndComment> getAllSpecAndComm(Map<String, Object> paramters);

	/**
	 * 查询课程费用
	 * 
	 * @param specId
	 * @return
	 */
	Integer getCourseCost(Integer specId);

	List<SpecCourseWithBLOBs> selectSpecCourseForList(RowBounds rb, HashMap<String, Object> map);

	/**
	 * 更新指定课程点击量
	 * 
	 * @param specID
	 */
	void updateHitNum(Integer specID);

	List<SpecCourseWithBLOBs> selectSpecCourseForProfIdList(RowBoundsWithTotalCount rb, HashMap<String, Object> map);
}