package com.chinasofti.cetp.question.dao;

import com.chinasofti.cetp.question.model.QuePracExample;
import com.chinasofti.cetp.question.model.QuePracKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuePracMapper {
    int countByExample(QuePracExample example);

    int deleteByExample(QuePracExample example);

    int deleteByPrimaryKey(QuePracKey key);

    int insert(QuePracKey record);

    int insertSelective(QuePracKey record);

    List<QuePracKey> selectByExample(QuePracExample example);

    int updateByExampleSelective(@Param("record") QuePracKey record, @Param("example") QuePracExample example);

    int updateByExample(@Param("record") QuePracKey record, @Param("example") QuePracExample example);
}