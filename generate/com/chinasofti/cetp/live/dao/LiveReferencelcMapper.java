package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.LiveReferencelc;
import com.chinasofti.cetp.live.model.LiveReferencelcExample;
import com.chinasofti.cetp.live.model.LiveReferencelcKey;
import java.util.List;

public interface LiveReferencelcMapper {
    int countByExample(LiveReferencelcExample example);

    int deleteByPrimaryKey(LiveReferencelcKey key);

    int insert(LiveReferencelc record);

    int insertSelective(LiveReferencelc record);

    List<LiveReferencelc> selectByExample(LiveReferencelcExample example);

    LiveReferencelc selectByPrimaryKey(LiveReferencelcKey key);

    int updateByPrimaryKeySelective(LiveReferencelc record);

    int updateByPrimaryKey(LiveReferencelc record);
}