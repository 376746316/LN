package com.chinasofti.cetp.exam.dao;

import com.chinasofti.cetp.exam.model.ChapterQues;
import com.chinasofti.cetp.exam.model.ChapterQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChapterQuesMapper {
    int countByExample(ChapterQuesExample example);

    int deleteByExample(ChapterQuesExample example);

    int deleteByPrimaryKey(Long cqId);

    int insert(ChapterQues record);

    int insertSelective(ChapterQues record);

    List<ChapterQues> selectByExample(ChapterQuesExample example);

    ChapterQues selectByPrimaryKey(Long cqId);

    int updateByExampleSelective(@Param("record") ChapterQues record, @Param("example") ChapterQuesExample example);

    int updateByExample(@Param("record") ChapterQues record, @Param("example") ChapterQuesExample example);

    int updateByPrimaryKeySelective(ChapterQues record);

    int updateByPrimaryKey(ChapterQues record);
}