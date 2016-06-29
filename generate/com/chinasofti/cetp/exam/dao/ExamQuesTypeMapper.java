package com.chinasofti.cetp.exam.dao;

import com.chinasofti.cetp.exam.model.ExamQuesType;
import com.chinasofti.cetp.exam.model.ExamQuesTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamQuesTypeMapper {
    int countByExample(ExamQuesTypeExample example);

    int deleteByExample(ExamQuesTypeExample example);

    int deleteByPrimaryKey(Long qtId);

    int insert(ExamQuesType record);

    int insertSelective(ExamQuesType record);

    List<ExamQuesType> selectByExample(ExamQuesTypeExample example);

    ExamQuesType selectByPrimaryKey(Long qtId);

    int updateByExampleSelective(@Param("record") ExamQuesType record, @Param("example") ExamQuesTypeExample example);

    int updateByExample(@Param("record") ExamQuesType record, @Param("example") ExamQuesTypeExample example);

    int updateByPrimaryKeySelective(ExamQuesType record);

    int updateByPrimaryKey(ExamQuesType record);
}