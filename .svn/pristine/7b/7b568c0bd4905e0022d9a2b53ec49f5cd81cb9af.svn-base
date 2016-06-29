package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.SubwareStu;
import com.chinasofti.cetp.study.model.SubwareStuExample;
import com.chinasofti.cetp.study.model.SubwareStuKey;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SubwareStuMapper {
	int countByExample(SubwareStuExample example);

	int deleteByPrimaryKey(SubwareStuKey key);

	int insert(SubwareStu record);

	int insertSelective(SubwareStu record);

	List<SubwareStu> selectByExample(SubwareStuExample example);

	SubwareStu selectByPrimaryKey(SubwareStuKey key);

	int updateByPrimaryKeySelective(SubwareStu record);

	int updateByPrimaryKey(SubwareStu record);

	/**
	 * 课件学时完成
	 * 
	 * @param stuNo
	 * @param specId
	 * @return
	 */
	Integer getCourseStudyProgress(@Param("stuNo") Integer stuNo, @Param("specId") Integer specId);

	/**
	 * 课后作业完成
	 * 
	 * @param stuNo
	 * @param specId
	 * @return
	 */
	Integer getHomeworkFinishedProgress(@Param("stuNo") Integer stuNo, @Param("specId") Integer specId);

	/**
	 * 章节测试完成
	 * 
	 * @param stuNo
	 * @param specId
	 * @return
	 */
	Integer getExamFinishedProgress(@Param("stuNo") Integer stuNo, @Param("specId") Integer specId);

	/**
	 * 学习完成总进度
	 * 
	 * @param stuNo
	 * @param specId
	 * @return
	 */
	Integer getStudyProgress(@Param("stuNo") Integer stuNo, @Param("specId") Integer specId);

}