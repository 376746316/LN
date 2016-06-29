package com.chinasofti.cetp.live.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.live.model.LiveClass;
import com.chinasofti.cetp.live.model.LiveClassExample;
import com.chinasofti.cetp.live.model.MoreLiveClass;

public interface LiveClassMapper {
    int countByExample(LiveClassExample example);

    int deleteByPrimaryKey(Integer liveClassId);

    int insert(LiveClass record);

    int insertSelective(LiveClass record);

    List<LiveClass> selectByExample(LiveClassExample example);

    LiveClass selectByPrimaryKey(Integer liveClassId);
    
    List<LiveClass> selectByExample(LiveClassExample example,RowBounds rb);
    
    int updateByPrimaryKeySelective(LiveClass record);

    int updateByPrimaryKey(LiveClass record);
    
    List<MoreLiveClass> selectCountLiveClassByLiveId(@Param("liveId")Integer liveId,@Param("stuNo")Integer stuNo);
    List<MoreLiveClass> selectMyCenterLiveByStuNo(@Param("status")String status,@Param("stuNo")Integer stuNo);
}