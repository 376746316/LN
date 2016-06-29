package com.chinasofti.cetp.resource.dao;

import com.chinasofti.cetp.resource.model.CollectVideo;
import com.chinasofti.cetp.resource.model.CollectVideoExample;
import com.chinasofti.cetp.resource.model.CollectVideoKey;
import java.util.List;

public interface CollectVideoMapper {
    int countByExample(CollectVideoExample example);

    int deleteByPrimaryKey(CollectVideoKey key);

    int insert(CollectVideo record);

    int insertSelective(CollectVideo record);

    List<CollectVideo> selectByExample(CollectVideoExample example);

    CollectVideo selectByPrimaryKey(CollectVideoKey key);

    int updateByPrimaryKeySelective(CollectVideo record);

    int updateByPrimaryKey(CollectVideo record);
}