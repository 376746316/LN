package com.chinasofti.cetp.practice.dao;

import com.chinasofti.cetp.practice.model.MorePracAnswer;
import com.chinasofti.cetp.practice.model.PracAnswer;
import com.chinasofti.cetp.practice.model.PracAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PracAnswerMapper {
    int countByExample(PracAnswerExample example);

    int deleteByExample(PracAnswerExample example);

    int deleteByPrimaryKey(Integer crAnswerId);

    int insert(PracAnswer record);

    int insertSelective(PracAnswer record);

    List<PracAnswer> selectByExampleWithBLOBs(PracAnswerExample example);

    List<PracAnswer> selectByExample(PracAnswerExample example);

    MorePracAnswer selectByPrimaryKey(Integer crAnswerId);

    int updateByExampleSelective(@Param("record") PracAnswer record, @Param("example") PracAnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") PracAnswer record, @Param("example") PracAnswerExample example);

    int updateByExample(@Param("record") PracAnswer record, @Param("example") PracAnswerExample example);

    int updateByPrimaryKeySelective(PracAnswer record);

    int updateByPrimaryKeyWithBLOBs(PracAnswer record);

    int updateByPrimaryKey(PracAnswer record);
    List<MorePracAnswer> getAllPracQuestionAnswerList(Integer pqQuestionId);
}