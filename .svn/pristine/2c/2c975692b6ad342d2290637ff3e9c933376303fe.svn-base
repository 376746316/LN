package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.HomeworkStu;
import com.chinasofti.cetp.study.model.HomeworkStuExample;
import com.chinasofti.cetp.study.model.HomeworkStuKey;
import com.chinasofti.cetp.study.model.MoreHomework;
import com.chinasofti.cetp.study.model.MoreHomeworkStu;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HomeworkStuMapper {
	int countByExample(HomeworkStuExample example);

	int deleteByPrimaryKey(HomeworkStuKey key);

	int insert(HomeworkStu record);

	int insertSelective(HomeworkStu record);

	List<HomeworkStu> selectByExample(HomeworkStuExample example);

	HomeworkStu selectByPrimaryKey(HomeworkStuKey key);

	int updateByPrimaryKeySelective(HomeworkStu record);

	int updateByPrimaryKey(HomeworkStu record);

	List<MoreHomeworkStu> getChapterHomeworkForChapIdList(Integer chapId, RowBoundsWithTotalCount rb);

	List<MoreHomework> selectMyCourseChpaterHomework(Integer specId, Integer stuNo);
	List<MoreHomeworkStu> checkChapHomeworkByChapAndExerId(HashMap<String, Object>map, RowBounds rb);

	List<MoreHomeworkStu> selectHomeworkForChapIdAndStuNo(@Param("chapId") Integer chapId, @Param("stuNo") Integer stuNo);
}