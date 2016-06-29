package com.chinasofti.cetp.question.dao;

import com.chinasofti.cetp.question.model.QueLiveExample;
import com.chinasofti.cetp.question.model.QueLiveKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueLiveMapper {
    int countByExample(QueLiveExample example);

    int deleteByExample(QueLiveExample example);

    int deleteByPrimaryKey(QueLiveKey key);

    int insert(QueLiveKey record);

    int insertSelective(QueLiveKey record);

    List<QueLiveKey> selectByExample(QueLiveExample example);

    int updateByExampleSelective(@Param("record") QueLiveKey record, @Param("example") QueLiveExample example);

    int updateByExample(@Param("record") QueLiveKey record, @Param("example") QueLiveExample example);
}