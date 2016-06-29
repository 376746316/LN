package com.chinasofti.cetp.practice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasofti.cetp.practice.model.IncreaseTab;
import com.chinasofti.cetp.practice.model.IncreaseTabExample;

public interface IncreaseTabMapper {
    int countByExample(IncreaseTabExample example);

    int deleteByExample(IncreaseTabExample example);

    int deleteByPrimaryKey(Integer itabId);

    int insert(IncreaseTab record);

    int insertSelective(IncreaseTab record);

    List<IncreaseTab> selectByExample(IncreaseTabExample example);

    IncreaseTab selectByPrimaryKey(Integer itabId);

    int updateByExampleSelective(@Param("record") IncreaseTab record, @Param("example") IncreaseTabExample example);

    int updateByExample(@Param("record") IncreaseTab record, @Param("example") IncreaseTabExample example);

    int updateByPrimaryKeySelective(IncreaseTab record);

    int updateByPrimaryKey(IncreaseTab record);
}