package com.chinasofti.cetp.exam.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.exam.model.ExamQues;
import com.chinasofti.cetp.exam.model.ExamQuesExample;
import com.chinasofti.cetp.exam.model.ExamQuesWithBLOBs;
import com.chinasofti.cetp.live.model.LiveExam;

public interface ExamQuesMapper {
	int countByExample(ExamQuesExample example);

	int deleteByExample(ExamQuesExample example);

	int deleteByPrimaryKey(Long qId);

	int insert(ExamQuesWithBLOBs record);

	int insertSelective(ExamQuesWithBLOBs record);

	List<ExamQuesWithBLOBs> selectByExampleWithBLOBs(ExamQuesExample example);

	List<ExamQues> selectByExample(ExamQuesExample example);

	ExamQuesWithBLOBs selectByPrimaryKey(Long qId);

	int updateByExampleSelective(@Param("record") ExamQuesWithBLOBs record, @Param("example") ExamQuesExample example);

	int updateByExampleWithBLOBs(@Param("record") ExamQuesWithBLOBs record, @Param("example") ExamQuesExample example);

	int updateByExample(@Param("record") ExamQues record, @Param("example") ExamQuesExample example);

	int updateByPrimaryKeySelective(ExamQuesWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(ExamQuesWithBLOBs record);

	int updateByPrimaryKey(ExamQues record);

	// ----------------------------------------------------------------------------------------
	List<ExamQuesWithBLOBs> selectByExampleWithBLOBs(ExamQuesExample example, RowBounds rb);
	
	// 查询测验试题带有试题类型字段
	List<ExamQuesWithBLOBs> selectWithQuesTypeAll(Map<String, Object> map);
	int selectQuesCount(Map<String, Object> map);
	
	// 查询各章节测验试题带有试题类型字段
	List<ExamQuesWithBLOBs> selectWithQuesTypeChapter(Map<String, Object> map);
	int selectQuesCountChapter(Map<String, Object> map);

	List<ExamQuesWithBLOBs> getQuesAllByChapId(Map<String, Object> map);

	List<LiveExam> selectExamByLiveClassId(Integer liveClassId);

	List<ExamQuesWithBLOBs> getQuesAllByLiveCourseId(Map<String, Object> map);
}