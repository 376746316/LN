package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.Homework;
import com.chinasofti.cetp.study.model.HomeworkExample;
import com.chinasofti.cetp.study.model.HomeworkKey;
import com.chinasofti.cetp.study.model.MoreHomework;

import java.util.List;

public interface HomeworkMapper {
    int countByExample(HomeworkExample example);

    int deleteByPrimaryKey(HomeworkKey key);

    int insert(Homework record);

    int insertSelective(Homework record);

    List<Homework> selectByExample(HomeworkExample example);

    Homework selectByPrimaryKey(HomeworkKey key);

    int updateByPrimaryKeySelective(Homework record);

    int updateByPrimaryKey(Homework record);

}