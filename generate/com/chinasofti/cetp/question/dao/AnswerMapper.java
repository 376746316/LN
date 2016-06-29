package com.chinasofti.cetp.question.dao;

import com.chinasofti.cetp.question.model.Answer;
import com.chinasofti.cetp.question.model.AnswerExample;
import com.chinasofti.cetp.question.model.AnswerWithBLOBs;
import com.chinasofti.cetp.question.model.MoreAnswer;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper {
	int countByExample(AnswerExample example);

	int deleteByExample(AnswerExample example);

	int deleteByPrimaryKey(Integer ansId);

	int insert(AnswerWithBLOBs record);

	int insertSelective(AnswerWithBLOBs record);

	List<AnswerWithBLOBs> selectByExampleWithBLOBs(AnswerExample example);

	List<Answer> selectByExample(AnswerExample example);

	AnswerWithBLOBs selectByPrimaryKey(Integer ansId);

	int updateByExampleSelective(@Param("record") AnswerWithBLOBs record, @Param("example") AnswerExample example);

	int updateByExampleWithBLOBs(@Param("record") AnswerWithBLOBs record, @Param("example") AnswerExample example);

	int updateByExample(@Param("record") Answer record, @Param("example") AnswerExample example);

	int updateByPrimaryKeySelective(AnswerWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(AnswerWithBLOBs record);

	int updateByPrimaryKey(Answer record);

	List<MoreAnswer> getAnswers(Integer queId);
}