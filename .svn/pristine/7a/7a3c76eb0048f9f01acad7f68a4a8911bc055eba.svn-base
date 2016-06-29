package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.ReferenceSc;
import com.chinasofti.cetp.study.model.ReferenceScExample;
import com.chinasofti.cetp.study.model.ReferenceScKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferenceScMapper {
    int countByExample(ReferenceScExample example);

    int deleteByExample(ReferenceScExample example);

    int deleteByPrimaryKey(ReferenceScKey key);

    int insert(ReferenceSc record);

    int insertSelective(ReferenceSc record);

    List<ReferenceSc> selectByExample(ReferenceScExample example);

    ReferenceSc selectByPrimaryKey(ReferenceScKey key);

    int updateByExampleSelective(@Param("record") ReferenceSc record, @Param("example") ReferenceScExample example);

    int updateByExample(@Param("record") ReferenceSc record, @Param("example") ReferenceScExample example);

    int updateByPrimaryKeySelective(ReferenceSc record);

    int updateByPrimaryKey(ReferenceSc record);

	void insertReferencByList(List<ReferenceSc> list);
}