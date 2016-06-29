package com.chinasofti.cetp.resource.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.resource.model.PlayList;
import com.chinasofti.cetp.resource.model.PlayListExample;
import com.chinasofti.cetp.resource.model.PlayListWithVideo;

public interface PlayListMapper {
    int countByExample(PlayListExample example);

    int deleteByPrimaryKey(Integer listId);

    int insert(PlayList record);

    int insertSelective(PlayList record);

    List<PlayList> selectByExampleWithBLOBs(PlayListExample example);

    List<PlayList> selectByExample(PlayListExample example);

    PlayList selectByPrimaryKey(Integer listId);
    
    PlayListWithVideo selectPlayListWithVideoByPrimaryKey(Integer listId);

    int updateByPrimaryKeySelective(PlayList record);

    int updateByPrimaryKeyWithBLOBs(PlayList record);

    int updateByPrimaryKey(PlayList record);

	List<PlayList> selectByExampleWithBLOBs(PlayListExample e, RowBounds rb);
}