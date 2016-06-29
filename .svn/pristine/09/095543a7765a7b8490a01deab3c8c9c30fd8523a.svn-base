package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.RqaQuality;
import com.chinasofti.cetp.study.model.RqaQualityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RqaQualityMapper {
    int countByExample(RqaQualityExample example);

    int deleteByExample(RqaQualityExample example);

    int deleteByPrimaryKey(Integer rqId);

    int insert(RqaQuality record);

    int insertSelective(RqaQuality record);

    List<RqaQuality> selectByExample(RqaQualityExample example);

    RqaQuality selectByPrimaryKey(Integer rqId);

    int updateByExampleSelective(@Param("record") RqaQuality record, @Param("example") RqaQualityExample example);

    int updateByExample(@Param("record") RqaQuality record, @Param("example") RqaQualityExample example);

    int updateByPrimaryKeySelective(RqaQuality record);

    int updateByPrimaryKey(RqaQuality record);
}