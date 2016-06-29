package com.chinasofti.cetp.study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.study.model.RealtimeQA;
import com.chinasofti.cetp.study.model.RealtimeQAExample;
import com.chinasofti.cetp.study.model.RealtimeQAModel;
import com.chinasofti.cetp.study.model.RealtimeQAWithBLOBs;
import com.chinasofti.cetp.study.model.RqaUser;
import com.chinasofti.cetp.utils.FCEvent;

public interface RealtimeQAMapper {
    int countByExample(RealtimeQAExample example);

    int deleteByExample(RealtimeQAExample example);

    int deleteByPrimaryKey(Long rqaId);

    int insert(RealtimeQAWithBLOBs record);

    int insertSelective(RealtimeQAWithBLOBs record);

    List<RealtimeQAWithBLOBs> selectByExampleWithBLOBs(RealtimeQAExample example);
    
    List<RealtimeQAWithBLOBs> selectByExampleWithBLOBs(RealtimeQAExample example,RowBounds rowBounds);

    List<RealtimeQA> selectByExample(RealtimeQAExample example);
    
    List<FCEvent> getUserRqaEvents(RealtimeQAExample example);

    RealtimeQAWithBLOBs selectByPrimaryKey(Long rqaId);

    int updateByExampleSelective(@Param("record") RealtimeQAWithBLOBs record, @Param("example") RealtimeQAExample example);

    int updateByExampleWithBLOBs(@Param("record") RealtimeQAWithBLOBs record, @Param("example") RealtimeQAExample example);

    int updateByExample(@Param("record") RealtimeQA record, @Param("example") RealtimeQAExample example);

    int updateByPrimaryKeySelective(RealtimeQAWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RealtimeQAWithBLOBs record);

    int updateByPrimaryKey(RealtimeQA record);
    
    // ---------------------------------------------------------------------------------------------------------------------
    List<RqaUser> getRqaUsers(@Param("techTypeId") Integer techTypeId,@Param("orderBy") String orderBy,RowBounds rowBounds);
	
	List<RealtimeQAModel> getRealtimeQAModelByRqaUserNo(@Param("userNo") Integer userNo);
}