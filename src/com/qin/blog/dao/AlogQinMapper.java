package com.qin.blog.dao;

import com.qin.blog.model.AlogQin;
import com.qin.blog.model.AlogQinExample;
import java.util.List;

public interface AlogQinMapper {
    int countByExample(AlogQinExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(AlogQin record);

    int insertSelective(AlogQin record);

    List<AlogQin> selectByExample(AlogQinExample example);

    AlogQin selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(AlogQin record);

    int updateByPrimaryKey(AlogQin record);
}