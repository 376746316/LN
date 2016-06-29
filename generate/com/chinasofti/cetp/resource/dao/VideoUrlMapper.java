package com.chinasofti.cetp.resource.dao;

import com.chinasofti.cetp.resource.model.VideoUrl;
import com.chinasofti.cetp.resource.model.VideoUrlExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VideoUrlMapper {
	int countByExample(VideoUrlExample example);

	int deleteByPrimaryKey(Integer vuId);

	int insert(VideoUrl record);

	int insertSelective(VideoUrl record);

	List<VideoUrl> selectByExampleWithBLOBs(VideoUrlExample example);

	List<VideoUrl> selectByExample(VideoUrlExample example);

	VideoUrl selectByPrimaryKey(Integer vuId);

	int updateByPrimaryKeySelective(VideoUrl record);

	int updateByPrimaryKeyWithBLOBs(VideoUrl record);

	int updateByPrimaryKey(VideoUrl record);

	void deleteByMap(@Param("vId") Integer vId, @Param("type") String type);
}