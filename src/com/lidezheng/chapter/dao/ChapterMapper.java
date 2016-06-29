package com.lidezheng.chapter.dao;

import com.lidezheng.chapter.model.Chapter;
import com.lidezheng.chapter.model.ChapterExample;
import com.lidezheng.chapter.model.ChapterWithBLOBs;
import java.util.List;

public interface ChapterMapper {
    int countByExample(ChapterExample example);

    int deleteByPrimaryKey(Integer chapId);

    int insert(ChapterWithBLOBs record);

    int insertSelective(ChapterWithBLOBs record);

    List<ChapterWithBLOBs> selectByExampleWithBLOBs(ChapterExample example);

    List<Chapter> selectByExample(ChapterExample example);

    ChapterWithBLOBs selectByPrimaryKey(Integer chapId);

    int updateByPrimaryKeySelective(ChapterWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ChapterWithBLOBs record);

    int updateByPrimaryKey(Chapter record);
}