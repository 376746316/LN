package com.chinasofti.cetp.resource.dao;

import com.chinasofti.cetp.resource.model.CommentVideo;
import com.chinasofti.cetp.resource.model.CommentVideoExample;
import com.chinasofti.cetp.resource.model.CommentVideoKey;
import java.util.List;

public interface CommentVideoMapper {
    int countByExample(CommentVideoExample example);

    int deleteByPrimaryKey(CommentVideoKey key);

    int insert(CommentVideo record);

    int insertSelective(CommentVideo record);

    List<CommentVideo> selectByExample(CommentVideoExample example);

    CommentVideo selectByPrimaryKey(CommentVideoKey key);

    int updateByPrimaryKeySelective(CommentVideo record);

    int updateByPrimaryKey(CommentVideo record);
}