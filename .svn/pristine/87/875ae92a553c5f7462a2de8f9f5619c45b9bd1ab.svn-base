package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.RqaAttach;
import com.chinasofti.cetp.study.model.RqaAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RqaAttachMapper {
    int countByExample(RqaAttachExample example);

    int deleteByExample(RqaAttachExample example);

    int deleteByPrimaryKey(Long raId);

    int insert(RqaAttach record);

    int insertSelective(RqaAttach record);

    List<RqaAttach> selectByExample(RqaAttachExample example);

    RqaAttach selectByPrimaryKey(Long raId);

    int updateByExampleSelective(@Param("record") RqaAttach record, @Param("example") RqaAttachExample example);

    int updateByExample(@Param("record") RqaAttach record, @Param("example") RqaAttachExample example);

    int updateByPrimaryKeySelective(RqaAttach record);

    int updateByPrimaryKey(RqaAttach record);

	int copyRaList(@Param("from") Long from,@Param("to") Long to);
}