package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.CollectSc;
import com.chinasofti.cetp.study.model.CollectScExample;
import com.chinasofti.cetp.study.model.CollectScKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectScMapper {
    int countByExample(CollectScExample example);

    int deleteByExample(CollectScExample example);

    int deleteByPrimaryKey(CollectScKey key);

    int insert(CollectSc record);

    int insertSelective(CollectSc record);

    List<CollectSc> selectByExample(CollectScExample example);

    CollectSc selectByPrimaryKey(CollectScKey key);

    int updateByExampleSelective(@Param("record") CollectSc record, @Param("example") CollectScExample example);

    int updateByExample(@Param("record") CollectSc record, @Param("example") CollectScExample example);

    int updateByPrimaryKeySelective(CollectSc record);

    int updateByPrimaryKey(CollectSc record);
}