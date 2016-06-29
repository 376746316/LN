package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.Live;
import com.chinasofti.cetp.live.model.LiveExample;
import com.chinasofti.cetp.live.model.LiveWithBLOBs;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface LiveMapper {
	int countByExample(LiveExample example);

	int deleteByPrimaryKey(Integer liveId);

	int insert(LiveWithBLOBs record);

	int insertSelective(LiveWithBLOBs record);

	List<LiveWithBLOBs> selectByExampleWithBLOBs(LiveExample example);

	List<LiveWithBLOBs> selectByExampleWithBLOBs(LiveExample example, RowBounds rb);

	List<Live> selectByExample(LiveExample example, RowBounds rb);

	LiveWithBLOBs selectByPrimaryKey(Integer liveId);

	LiveWithBLOBs selectByLiveCourseId(Integer liveCourseId);

	List<LiveWithBLOBs> selectMyLiveByStuNo(Integer stuNo);
	List<LiveWithBLOBs> selectPlayBackList(RowBounds rb);

	int updateByPrimaryKeySelective(LiveWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(LiveWithBLOBs record);

	int updateByPrimaryKey(Live record);
}