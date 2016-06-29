package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.RqaParam;
import com.chinasofti.cetp.study.model.RqaParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RqaParamMapper {
    int countByExample(RqaParamExample example);

    int deleteByExample(RqaParamExample example);

    int deleteByPrimaryKey(Integer rpId);

    int insert(RqaParam record);

    int insertSelective(RqaParam record);

    List<RqaParam> selectByExample(RqaParamExample example);

    RqaParam selectByPrimaryKey(Integer rpId);

    int updateByExampleSelective(@Param("record") RqaParam record, @Param("example") RqaParamExample example);

    int updateByExample(@Param("record") RqaParam record, @Param("example") RqaParamExample example);

    int updateByPrimaryKeySelective(RqaParam record);

    int updateByPrimaryKey(RqaParam record);
}