package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.ConectStuTeacher;
import com.chinasofti.cetp.study.model.ConectStuTeacherExample;
import com.chinasofti.cetp.study.model.ConectStuTeacherKey;
import java.util.List;

public interface ConectStuTeacherMapper {
    int countByExample(ConectStuTeacherExample example);

    int deleteByPrimaryKey(ConectStuTeacherKey key);

    int insert(ConectStuTeacher record);

    int insertSelective(ConectStuTeacher record);

    List<ConectStuTeacher> selectByExample(ConectStuTeacherExample example);

    ConectStuTeacher selectByPrimaryKey(ConectStuTeacherKey key);

    int updateByPrimaryKeySelective(ConectStuTeacher record);

    int updateByPrimaryKey(ConectStuTeacher record);
}