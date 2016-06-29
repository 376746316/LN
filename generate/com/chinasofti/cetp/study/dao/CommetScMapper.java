package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.CommetScExample;
import com.chinasofti.cetp.study.model.CommetScKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommetScMapper {
    int countByExample(CommetScExample example);

    int deleteByExample(CommetScExample example);

    int deleteByPrimaryKey(CommetScKey key);

    int insert(CommetScKey record);

    int insertSelective(CommetScKey record);

    List<CommetScKey> selectByExample(CommetScExample example);

    int updateByExampleSelective(@Param("record") CommetScKey record, @Param("example") CommetScExample example);

    int updateByExample(@Param("record") CommetScKey record, @Param("example") CommetScExample example);
}