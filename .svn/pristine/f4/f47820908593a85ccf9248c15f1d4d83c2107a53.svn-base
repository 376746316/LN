package com.chinasofti.cetp.study.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.study.model.CourseNote;
import com.chinasofti.cetp.study.model.MoreNote;
import com.chinasofti.cetp.study.model.Note;
import com.chinasofti.cetp.study.model.NoteExample;

public interface NoteMapper {
    int countByExample(NoteExample example);

    int deleteByExample(NoteExample example);

    int deleteByPrimaryKey(Integer noteId);

    int insert(Note record);

    int insertSelective(Note record);

    List<Note> selectByExampleWithBLOBs(NoteExample example);

    List<Note> selectByExample(NoteExample example);

    Note selectByPrimaryKey(Integer noteId);

    int updateByExampleSelective(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByExampleWithBLOBs(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByExample(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKeyWithBLOBs(Note record);

    int updateByPrimaryKey(Note record);

	List<Note> selectNoteListBySpecId(HashMap<String, Integer>map);
	
	List<CourseNote> getCourses(Integer stuNo);

	List<MoreNote> selectWithSC(@Param("stuNo") Integer stuNo,@Param("chapId") Integer chapId,@Param("search") String search,RowBounds rowBounds);
}