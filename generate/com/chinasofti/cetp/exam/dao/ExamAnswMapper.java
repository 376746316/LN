package com.chinasofti.cetp.exam.dao;

import com.chinasofti.cetp.exam.model.ExamAnsw;
import com.chinasofti.cetp.exam.model.ExamAnswExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamAnswMapper {
    int countByExample(ExamAnswExample example);

    int deleteByExample(ExamAnswExample example);

    int deleteByPrimaryKey(Integer eaId);

    int insert(ExamAnsw record);

    int insertSelective(ExamAnsw record);

    List<ExamAnsw> selectByExample(ExamAnswExample example);

    ExamAnsw selectByPrimaryKey(Integer eaId);

    int updateByExampleSelective(@Param("record") ExamAnsw record, @Param("example") ExamAnswExample example);

    int updateByExample(@Param("record") ExamAnsw record, @Param("example") ExamAnswExample example);

    int updateByPrimaryKeySelective(ExamAnsw record);

    int updateByPrimaryKey(ExamAnsw record);
}