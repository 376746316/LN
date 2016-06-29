package com.chinasofti.cetp.question.dao;

import com.chinasofti.cetp.question.model.AnswerReply;
import com.chinasofti.cetp.question.model.AnswerReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerReplyMapper {
    int countByExample(AnswerReplyExample example);

    int deleteByExample(AnswerReplyExample example);

    int deleteByPrimaryKey(Integer ansRepId);

    int insert(AnswerReply record);

    int insertSelective(AnswerReply record);

    List<AnswerReply> selectByExampleWithBLOBs(AnswerReplyExample example);

    List<AnswerReply> selectByExample(AnswerReplyExample example);

    AnswerReply selectByPrimaryKey(Integer ansRepId);

    int updateByExampleSelective(@Param("record") AnswerReply record, @Param("example") AnswerReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") AnswerReply record, @Param("example") AnswerReplyExample example);

    int updateByExample(@Param("record") AnswerReply record, @Param("example") AnswerReplyExample example);

    int updateByPrimaryKeySelective(AnswerReply record);

    int updateByPrimaryKeyWithBLOBs(AnswerReply record);

    int updateByPrimaryKey(AnswerReply record);
}