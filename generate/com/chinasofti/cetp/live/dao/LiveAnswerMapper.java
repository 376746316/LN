package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.LiveAnswer;
import com.chinasofti.cetp.live.model.LiveAnswerExample;
import java.util.List;

public interface LiveAnswerMapper {
    int countByExample(LiveAnswerExample example);

    int deleteByPrimaryKey(Integer laAnswerId);

    int insert(LiveAnswer record);

    int insertSelective(LiveAnswer record);

    List<LiveAnswer> selectByExampleWithBLOBs(LiveAnswerExample example);

    List<LiveAnswer> selectByExample(LiveAnswerExample example);

    LiveAnswer selectByPrimaryKey(Integer laAnswerId);

    int updateByPrimaryKeySelective(LiveAnswer record);

    int updateByPrimaryKeyWithBLOBs(LiveAnswer record);

    int updateByPrimaryKey(LiveAnswer record);
}