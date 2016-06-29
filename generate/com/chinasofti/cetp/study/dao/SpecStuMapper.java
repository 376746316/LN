package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.study.model.SpecStu;
import com.chinasofti.cetp.study.model.SpecStuExample;
import com.chinasofti.cetp.study.model.SpecStuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SpecStuMapper {
    int countByExample(SpecStuExample example);

    int deleteByExample(SpecStuExample example);

    int deleteByPrimaryKey(SpecStuKey key);

    int insert(SpecStu record);

    int insertSelective(SpecStu record);

    List<SpecStu> selectByExample(SpecStuExample example);

    SpecStu selectByPrimaryKey(SpecStuKey key);

    int updateByExampleSelective(@Param("record") SpecStu record, @Param("example") SpecStuExample example);

    int updateByExample(@Param("record") SpecStu record, @Param("example") SpecStuExample example);

    int updateByPrimaryKeySelective(SpecStu record);

    int updateByPrimaryKey(SpecStu record);
    
    /**
     * 在学习该课程的人
     * @param suSpecId 课程编号
     * @return 学生列表
     */
    List<StudentWithBLOBs> selectLearningStu(Integer suSpecId);
    /**
     * 在学习该课程的人
     * @param suSpecId 课程编号
     * @return 学生列表
     */
    List<StudentWithBLOBs> selectLearningStu(Integer suSpecId,RowBounds rb);
    
    int addSpecStu(@Param("specId") int specId,@Param("limit") int limit);
}