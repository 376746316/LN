package com.chinasofti.cetp.live.dao;

import com.chinasofti.cetp.live.model.LiveCourse;
import com.chinasofti.cetp.live.model.LiveCourseExample;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface LiveCourseMapper {
    int countByExample(LiveCourseExample example);

    int deleteByPrimaryKey(Integer liveCourseId);

    int insert(LiveCourse record);

    int insertSelective(LiveCourse record);

    List<LiveCourse> selectByExampleWithBLOBs(LiveCourseExample example);

    List<LiveCourse> selectByExample(LiveCourseExample example, RowBounds rb);
    
    List<LiveCourse> selectByExample(LiveCourseExample example);
    LiveCourse selectByPrimaryKey(Integer liveCourseId);
    List<LiveCourse> selectByLiveClassId(Integer liveClassId);

    int updateByPrimaryKeySelective(LiveCourse record);

    int updateByPrimaryKeyWithBLOBs(LiveCourse record);

    int updateByPrimaryKey(LiveCourse record);
}