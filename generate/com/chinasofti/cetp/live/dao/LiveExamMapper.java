package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.LiveExamExample;
import com.chinasofti.cetp.live.model.LiveExamKey;
import java.util.List;

public interface LiveExamMapper {
    int countByExample(LiveExamExample example);

    int deleteByPrimaryKey(LiveExamKey key);

    int insert(LiveExamKey record);

    int insertSelective(LiveExamKey record);

    List<LiveExamKey> selectByExample(LiveExamExample example);
}