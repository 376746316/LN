package com.chinasofti.cetp.study.dao;

import java.util.List;

import com.chinasofti.cetp.study.model.ConectionForDialog;
import com.chinasofti.cetp.study.model.ConectionForDialogKey;
import com.chinasofti.cetp.study.model.MoreConectionForDialog;

public interface ConectionForDialogMapper {
    int deleteByPrimaryKey(ConectionForDialogKey key);

    int insert(ConectionForDialog record);

    int insertSelective(ConectionForDialog record);

    ConectionForDialog selectByPrimaryKey(ConectionForDialogKey key);

    int updateByPrimaryKeySelective(ConectionForDialog record);

    int updateByPrimaryKey(ConectionForDialog record);

	List<MoreConectionForDialog> selectedStudentByTeacher(Integer teacherId);
}