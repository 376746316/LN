package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.CheckExerciseStu;
import com.chinasofti.cetp.study.model.ExerciseStu;
import com.chinasofti.cetp.study.model.ExerciseStuExample;
import com.chinasofti.cetp.study.model.MoreExerciseStu;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExerciseStuMapper {
	int countByExample(ExerciseStuExample example);

	int deleteByExample(ExerciseStuExample example);

	int deleteByPrimaryKey(Integer esId);

	int insert(ExerciseStu record);

	int insertSelective(ExerciseStu record);

	List<ExerciseStu> selectByExample(ExerciseStuExample example);

	ExerciseStu selectByPrimaryKey(Integer esId);

	int updateByExampleSelective(@Param("record") ExerciseStu record,
			@Param("example") ExerciseStuExample example);

	int updateByExample(@Param("record") ExerciseStu record,
			@Param("example") ExerciseStuExample example);

	int updateByPrimaryKeySelective(ExerciseStu record);

	int updateByPrimaryKey(ExerciseStu record);

	List<MoreExerciseStu> selectExerciseStuForShow(@Param("scId") Integer scId,
			@Param("exerId") Integer exerId, @Param("stuNo") Integer stuNo);

	List<CheckExerciseStu> selectAllExerForScIdAndExerId(HashMap<String, Object> map, RowBoundsWithTotalCount rb);
	
}