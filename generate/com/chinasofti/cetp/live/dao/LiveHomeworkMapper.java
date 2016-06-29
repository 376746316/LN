package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.LiveHomework;
import com.chinasofti.cetp.live.model.LiveHomeworkExample;
import com.chinasofti.cetp.live.model.LiveHomeworkKey;
import java.util.List;

public interface LiveHomeworkMapper {
    int countByExample(LiveHomeworkExample example);

    int deleteByPrimaryKey(LiveHomeworkKey key);

    int insert(LiveHomework record);

    int insertSelective(LiveHomework record);

    List<LiveHomework> selectByExample(LiveHomeworkExample example);

    LiveHomework selectByPrimaryKey(LiveHomeworkKey key);

    int updateByPrimaryKeySelective(LiveHomework record);

    int updateByPrimaryKey(LiveHomework record);
}