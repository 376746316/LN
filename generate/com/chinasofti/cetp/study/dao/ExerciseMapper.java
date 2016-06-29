package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.live.model.LiveExerciese;
import com.chinasofti.cetp.study.model.Exercise;
import com.chinasofti.cetp.study.model.ExerciseExample;
import com.chinasofti.cetp.study.model.ExerciseWithBLOBs;
import com.chinasofti.cetp.study.model.MoreExercise;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExerciseMapper {
	int countByExample(ExerciseExample example);

	int deleteByExample(ExerciseExample example);

	int deleteByPrimaryKey(Integer exerId);

	int insert(ExerciseWithBLOBs record);

	int insertSelective(ExerciseWithBLOBs record);

	List<ExerciseWithBLOBs> selectByExampleWithBLOBs(ExerciseExample example);

	List<Exercise> selectByExample(ExerciseExample example);

	ExerciseWithBLOBs selectByPrimaryKey(Integer exerId);

	int updateByExampleSelective(@Param("record") ExerciseWithBLOBs record, @Param("example") ExerciseExample example);

	int updateByExampleWithBLOBs(@Param("record") ExerciseWithBLOBs record, @Param("example") ExerciseExample example);

	int updateByExample(@Param("record") Exercise record, @Param("example") ExerciseExample example);

	int updateByPrimaryKeySelective(ExerciseWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(ExerciseWithBLOBs record);

	int updateByPrimaryKey(Exercise record);

	List<ExerciseWithBLOBs> selectExerciseForSub(Integer scId);

	List<Exercise> selectQureyExercises(HashMap<String, Object> map, RowBoundsWithTotalCount rb);

	List<MoreExercise> selectHomeworkForChapter(Integer chapId);
	List<MoreExercise> selectHomeworkForChapterId(Integer chapId,RowBounds rb);
	List<MoreExercise> selectHomeworkNotForChapter(@Param("chapId")Integer chapId,@Param("userNo")Integer userNo,RowBounds rb);

	List<LiveExerciese> selectByLiveClassId(@Param("liveClassId") Integer liveClassId, @Param("stuNo") Integer stuNo, @Param("exerId") Integer exerId);

	List<ExerciseWithBLOBs> selectWithSubCourseId(int subCourseId, RowBounds rb);

	List<ExerciseWithBLOBs> selectNotWithSubCourseId(@Param("subCourseId")int subCourseId,@Param("userNo")Integer userNo, RowBounds rb);

	List<Exercise> selectExerListByScId(Integer scId);

}