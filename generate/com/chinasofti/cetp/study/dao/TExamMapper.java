package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.MoreTExam;
import com.chinasofti.cetp.study.model.TExam;
import com.chinasofti.cetp.study.model.TExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TExamMapper {
	int countByExample(TExamExample example);

	int deleteByExample(TExamExample example);

	int deleteByPrimaryKey(Long eId);

	int insert(TExam record);

	int insertSelective(TExam record);

	List<TExam> selectByExampleWithBLOBs(TExamExample example);

	List<TExam> selectByExample(TExamExample example);

	TExam selectByPrimaryKey(Long eId);

	int updateByExampleSelective(@Param("record") TExam record, @Param("example") TExamExample example);

	int updateByExampleWithBLOBs(@Param("record") TExam record, @Param("example") TExamExample example);

	int updateByExample(@Param("record") TExam record, @Param("example") TExamExample example);

	int updateByPrimaryKeySelective(TExam record);

	int updateByPrimaryKeyWithBLOBs(TExam record);

	int updateByPrimaryKey(TExam record);

	List<MoreTExam> getSpecExamListForStu(@Param("specId") Integer specId, @Param("stuNo") Integer stuNo, @Param("status") String status, RowBounds rowBounds);

	List<MoreTExam> getChapterExamListForStu(@Param("specId") Integer specId, @Param("stuNo") Integer stuNo, @Param("status") String status);
}