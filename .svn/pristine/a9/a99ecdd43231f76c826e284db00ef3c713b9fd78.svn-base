package com.chinasofti.cetp.attendance.dao;

import com.chinasofti.cetp.attendance.model.AttendanceScheme;
import com.chinasofti.cetp.attendance.model.AttendanceSchemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceSchemeMapper {
    int countByExample(AttendanceSchemeExample example);

    int deleteByExample(AttendanceSchemeExample example);

    int deleteByPrimaryKey(Integer asId);

    int insert(AttendanceScheme record);

    int insertSelective(AttendanceScheme record);

    List<AttendanceScheme> selectByExample(AttendanceSchemeExample example);

    AttendanceScheme selectByPrimaryKey(Integer asId);

    int updateByExampleSelective(@Param("record") AttendanceScheme record, @Param("example") AttendanceSchemeExample example);

    int updateByExample(@Param("record") AttendanceScheme record, @Param("example") AttendanceSchemeExample example);

    int updateByPrimaryKeySelective(AttendanceScheme record);

    int updateByPrimaryKey(AttendanceScheme record);

    AttendanceScheme selectByPracCalender(@Param("pacAsId") Integer pacAsId,
			@Param("pacPracId") Integer pacPracId,
			@Param("pacDate") String pacDate);
}