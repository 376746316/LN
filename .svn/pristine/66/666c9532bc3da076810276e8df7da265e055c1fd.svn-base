package com.chinasofti.cetp.question.dao;

import com.chinasofti.cetp.question.model.QueSpecExample;
import com.chinasofti.cetp.question.model.QueSpecKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueSpecMapper {
    int countByExample(QueSpecExample example);

    int deleteByExample(QueSpecExample example);

    int deleteByPrimaryKey(QueSpecKey key);

    int insert(QueSpecKey record);

    int insertSelective(QueSpecKey record);

    List<QueSpecKey> selectByExample(QueSpecExample example);

    int updateByExampleSelective(@Param("record") QueSpecKey record, @Param("example") QueSpecExample example);

    int updateByExample(@Param("record") QueSpecKey record, @Param("example") QueSpecExample example);
}