package com.chinasofti.cetp.study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.study.model.CourseComment;
import com.chinasofti.cetp.study.model.SpecCourseView;
import com.chinasofti.cetp.study.model.SpecCourseViewDetail;
import com.chinasofti.cetp.study.model.SpecCourseViewExample;

public interface SpecCourseViewMapper {
	int countByExample(SpecCourseViewExample example);

	List<SpecCourseView> selectByExampleWithBLOBs(SpecCourseViewExample example);

	List<SpecCourseView> selectByExample(SpecCourseViewExample example);

	// 学生正在学习的课程
	List<SpecCourseView> selectStudingCourse(Integer stuNo);

	// 学生学习过的课程
	List<SpecCourseView> selectStudiedCourse(Integer stuNo);

	// 学生收藏的课程
	List<SpecCourseView> selectCollectedCourse(Integer stuNo);

	// 带分页
	List<SpecCourseView> selectByExampleWithBLOBs(SpecCourseViewExample example, RowBounds rowBounds);

	// 根据指定ID 获得 具体课程信息
	SpecCourseViewDetail selectCourseBySpecID(Integer specID);

	// 查询专业课视图
	SpecCourseView selectSpecCourseViewBySpecId(Integer specId);

	// 根据指定ID 获得课程评论
	List<CourseComment> selectCourseCommentBySpecID(Integer specID, RowBounds rowBounds);

	/**
	 * 看过本课程的人还看过
	 * 
	 * @param specId
	 * @return 课程列表
	 */
	List<SpecCourseView> selectOthersSpec(Integer specId);

	/**
	 * 根据技术分类推荐课程
	 * 
	 * @param techTypeId
	 * @return 课程列表
	 */
	List<SpecCourseView> selectRecByTechType(Integer techTypeId);

	/**
	 * 特别推荐中根据 开发、设计、管理等类型选择
	 * 
	 * @param type
	 * @return
	 */
	List<SpecCourseView> selectRecommCourseByOterType(String type);

	/**
	 * 根据学生推荐课程
	 * 
	 * @param pracId
	 * @param stuNo
	 * @return
	 */
	List<SpecCourseView> selectRecommendByStu(@Param("profId") Integer profId, @Param("stuNo") Integer stuNo);

	/**
	 * 查询岗位下的课程
	 * 
	 * @param profId
	 *            岗位Id
	 * @return
	 */
	List<SpecCourseView> selectByProfId(Integer profId);

	/**
	 * 查询用户的课程
	 * 
	 * @param userNo
	 *            用户编号
	 * @return
	 */
	List<SpecCourseView> selectByTeacherId(Integer userNo);

}