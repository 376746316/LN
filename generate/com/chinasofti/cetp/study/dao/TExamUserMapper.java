package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.TExamUser;
import com.chinasofti.cetp.study.model.TExamUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExamUserMapper {
    int countByExample(TExamUserExample example);

    int deleteByExample(TExamUserExample example);

    int deleteByPrimaryKey(Long euId);

    int insert(TExamUser record);

    int insertSelective(TExamUser record);

    List<TExamUser> selectByExample(TExamUserExample example);

    TExamUser selectByPrimaryKey(Long euId);

    int updateByExampleSelective(@Param("record") TExamUser record, @Param("example") TExamUserExample example);

    int updateByExample(@Param("record") TExamUser record, @Param("example") TExamUserExample example);

    int updateByPrimaryKeySelective(TExamUser record);

    int updateByPrimaryKey(TExamUser record);
}