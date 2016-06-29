package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.LiveChapter;
import com.chinasofti.cetp.live.model.LiveChapterExample;
import java.util.List;

public interface LiveChapterMapper {
	int countByExample(LiveChapterExample example);

	int deleteByPrimaryKey(Integer liveChapId);

	int insert(LiveChapter record);

	int insertSelective(LiveChapter record);

	List<LiveChapter> selectByExample(LiveChapterExample example);

	LiveChapter selectByPrimaryKey(Integer liveChapId);

	int updateByPrimaryKeySelective(LiveChapter record);

	int updateByPrimaryKey(LiveChapter record);

	LiveChapter selectByLiveCourseId(Integer liveCourseId);
}