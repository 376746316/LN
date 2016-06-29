package com.chinasofti.cetp.attendance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.attendance.model.Vacation;
import com.chinasofti.cetp.attendance.model.VacationComplete;
import com.chinasofti.cetp.attendance.model.VacationExample;

public interface VacationMapper {
    int countByExample(VacationExample example);

    int deleteByExample(VacationExample example);

    int deleteByPrimaryKey(Integer vnId);

    int insert(Vacation record);

    int insertSelective(Vacation record);

    List<Vacation> selectByExampleWithBLOBs(VacationExample example, RowBounds rowBounds);

    List<Vacation> selectByExample(VacationExample example);

    Vacation selectByPrimaryKey(Integer vnId);

    int updateByExampleSelective(@Param("record") Vacation record, @Param("example") VacationExample example);

    int updateByExampleWithBLOBs(@Param("record") Vacation record, @Param("example") VacationExample example);

    int updateByExample(@Param("record") Vacation record, @Param("example") VacationExample example);

    int updateByPrimaryKeySelective(Vacation record);

    int updateByPrimaryKeyWithBLOBs(Vacation record);

    int updateByPrimaryKey(Vacation record);
    
    /*======================华丽的分割线=====================*/
    
    List<VacationComplete> selectVacationComplete(Map<String, Object> map, RowBounds rowBounds);
    
    int updateStateByVnId(Map<String, Object> map);
    
}