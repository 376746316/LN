package com.chinasofti.cetp.attendance.dao;

import com.chinasofti.cetp.attendance.model.PracAttendance;
import com.chinasofti.cetp.attendance.model.PracAttendanceExample;
import com.chinasofti.cetp.attendance.model.StuAttendance;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PracAttendanceMapper {
	int countByExample(PracAttendanceExample example);

	int deleteByExample(PracAttendanceExample example);

	int deleteByPrimaryKey(Integer patId);

	int insert(PracAttendance record);

	int insertSelective(PracAttendance record);

	List<PracAttendance> selectByExample(PracAttendanceExample example);

	PracAttendance selectByPrimaryKey(Integer patId);

	int updateByExampleSelective(@Param("record") PracAttendance record,
			@Param("example") PracAttendanceExample example);

	int updateByExample(@Param("record") PracAttendance record,
			@Param("example") PracAttendanceExample example);

	int updateByPrimaryKeySelective(PracAttendance record);

	int updateByPrimaryKey(PracAttendance record);

	List<StuAttendance> getStuAttenanceList(@Param("pracId") Integer pracId,
			@Param("stuNum") String stuNum, @Param("stuName") String stuName,
			@Param("className") String className, RowBounds rowBounds);

	int insertSA(StuAttendance record);

	Integer getPatId(@Param("pracId") Integer pracId, @Param("code") String code);
}