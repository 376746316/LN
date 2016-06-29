package com.chinasofti.cetp.resource.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.resource.model.ListVideoWithBLOBs;
import com.chinasofti.cetp.resource.model.Video;
import com.chinasofti.cetp.resource.model.VideoExample;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;

public interface VideoMapper {
	int countByExample(VideoExample example);

	int deleteByPrimaryKey(Integer vId);

	int insert(VideoWithBLOBs record);

	int insertSelective(VideoWithBLOBs record);

	List<VideoWithBLOBs> selectByExampleWithBLOBs(VideoExample example, RowBounds rb);

	List<VideoWithBLOBs> selectByExampleWithBLOBs(VideoExample example);

	List<Video> selectByExample(VideoExample example);

	VideoWithBLOBs selectByPrimaryKey(Integer vId);

	int updateByPrimaryKeySelective(VideoWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(VideoWithBLOBs record);

	int updateByPrimaryKey(Video record);

	List<VideoWithBLOBs> selectByExampleWithBLOBsList(HashMap<String, Object> map, RowBounds rb);

	List<ListVideoWithBLOBs> selectVideoListByListId(HashMap<String, Object> map, RowBounds rb);

	List<VideoWithBLOBs> selectVideoListNotByListId(HashMap<String, Object> map, RowBounds rb);
}