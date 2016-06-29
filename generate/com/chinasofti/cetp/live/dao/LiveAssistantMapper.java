package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.LiveAssistant;
import com.chinasofti.cetp.live.model.LiveAssistantExample;
import com.chinasofti.cetp.live.model.LiveAssistantKey;

import java.util.List;

public interface LiveAssistantMapper {
    int countByExample(LiveAssistantExample example);

    int deleteByPrimaryKey(LiveAssistantKey key);

    int insert(LiveAssistantKey record);

    int insertSelective(LiveAssistantKey record);

    List<LiveAssistantKey> selectByExample(LiveAssistantExample example);

	void insertList(List<LiveAssistantKey> list);

	void deleteByLiveId(Integer liveId);

	List<LiveAssistant> selectByLiveId(Integer liveId);
}