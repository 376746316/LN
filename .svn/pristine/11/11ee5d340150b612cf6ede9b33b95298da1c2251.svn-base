package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.Chapter;
import com.chinasofti.cetp.study.model.ChapterExample;
import com.chinasofti.cetp.study.model.ChapterWithBLOBs;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChapterMapper {
	int countByExample(ChapterExample example);

	int deleteByExample(ChapterExample example);

	int deleteByPrimaryKey(Integer chapId);

	int insert(ChapterWithBLOBs record);

	int insertSelective(ChapterWithBLOBs record);

	List<ChapterWithBLOBs> selectByExampleWithBLOBs(ChapterExample example, RowBounds rb);

	List<ChapterWithBLOBs> selectByExampleWithBLOBs(ChapterExample example);

	List<Chapter> selectByExample(ChapterExample example);

	List<Chapter> selectByExample(ChapterExample example, RowBounds rowBounds);

	ChapterWithBLOBs selectByPrimaryKey(Integer chapId);

	int updateByExampleSelective(@Param("record") ChapterWithBLOBs record, @Param("example") ChapterExample example);

	int updateByExampleWithBLOBs(@Param("record") ChapterWithBLOBs record, @Param("example") ChapterExample example);

	int updateByExample(@Param("record") Chapter record, @Param("example") ChapterExample example);

	int updateByPrimaryKeySelective(ChapterWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(ChapterWithBLOBs record);

	int updateByPrimaryKey(Chapter record);

	// ///////////////////////////////////////////

	List<Chapter> selectChapterWithTerm(HashMap<String, Object> map, RowBounds rb);

	List<Chapter> selectChapter(Integer specId);

}