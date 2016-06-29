package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.ChapterStu;
import com.chinasofti.cetp.study.model.ChapterStuExample;
import com.chinasofti.cetp.study.model.ChapterStuKey;
import java.util.List;

public interface ChapterStuMapper {
    int countByExample(ChapterStuExample example);

    int deleteByPrimaryKey(ChapterStuKey key);

    int insert(ChapterStu record);

    int insertSelective(ChapterStu record);

    List<ChapterStu> selectByExample(ChapterStuExample example);

    ChapterStu selectByPrimaryKey(ChapterStuKey key);

    int updateByPrimaryKeySelective(ChapterStu record);

    int updateByPrimaryKey(ChapterStu record);
}