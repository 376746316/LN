package com.chinasofti.cetp.question.dao;

import com.chinasofti.cetp.question.model.MoreQuestion;
import com.chinasofti.cetp.question.model.Question;
import com.chinasofti.cetp.question.model.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface QuestionMapper {
	int countByExample(QuestionExample example);

	int deleteByExample(QuestionExample example);

	int deleteByPrimaryKey(Integer queId);

	int insert(Question record);

	int insertSelective(Question record);

	List<Question> selectByExampleWithBLOBs(QuestionExample example);

	List<Question> selectByExample(QuestionExample example);

	Question selectByPrimaryKey(Integer queId);

	int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

	int updateByExampleWithBLOBs(@Param("record") Question record, @Param("example") QuestionExample example);

	int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

	int updateByPrimaryKeySelective(Question record);

	int updateByPrimaryKeyWithBLOBs(Question record);

	int updateByPrimaryKey(Question record);

	List<MoreQuestion> getQues(@Param("liveId") Integer liveId, @Param("specId") Integer specId, @Param("pracId") Integer pracId, @Param("ansUserNo") Integer ansUserNo, @Param("ansStuNo") Integer ansStuNo, @Param("stuNo") Integer stuNo, RowBounds rowBounds);
	List<MoreQuestion> selectSpecBestQues(Integer specId);

	MoreQuestion getQue(Integer queId);
}