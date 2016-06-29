package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.SubcwExer;
import com.chinasofti.cetp.study.model.SubcwExerExample;
import com.chinasofti.cetp.study.model.SubcwExerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubcwExerMapper {
    int countByExample(SubcwExerExample example);

    int deleteByExample(SubcwExerExample example);

    int deleteByPrimaryKey(SubcwExerKey key);

    int insert(SubcwExer record);

    int insertSelective(SubcwExer record);

    List<SubcwExer> selectByExample(SubcwExerExample example);

    SubcwExer selectByPrimaryKey(SubcwExerKey key);

    int updateByExampleSelective(@Param("record") SubcwExer record, @Param("example") SubcwExerExample example);

    int updateByExample(@Param("record") SubcwExer record, @Param("example") SubcwExerExample example);

    int updateByPrimaryKeySelective(SubcwExer record);

    int updateByPrimaryKey(SubcwExer record);
}