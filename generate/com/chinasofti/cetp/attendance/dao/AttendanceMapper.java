package com.chinasofti.cetp.attendance.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.attendance.model.Attendance;
import com.chinasofti.cetp.attendance.model.AttendanceExample;
import com.chinasofti.cetp.attendance.model.AttendanceInfo;
import com.chinasofti.cetp.attendance.model.MoreAttendance;

public interface AttendanceMapper {
	int countByExample(AttendanceExample example);

	int deleteByExample(AttendanceExample example);

	int deleteByPrimaryKey(Integer aeId);

	int insert(Attendance record);

	int insertSelective(Attendance record);

	List<Attendance> selectByExample(AttendanceExample example);

	Attendance selectByPrimaryKey(Integer aeId);

	int updateByExampleSelective(@Param("record") Attendance record,
			@Param("example") AttendanceExample example);

	int updateByExample(@Param("record") Attendance record,
			@Param("example") AttendanceExample example);

	int updateByPrimaryKeySelective(Attendance record);

	int updateByPrimaryKey(Attendance record);

	// add by yf 2014-03-17
	List<MoreAttendance> selectMoreAttendance(@Param("pracId") Integer pracId,
			@Param("dateStart") Date dateStart, @Param("dateEnd") Date dateEnd,
			@Param("patCode") String patCode, @Param("stuName") String stuName,
			@Param("stuNum") String stuNum,
			@Param("className") String className,
			@Param("teamName") String teamName,
			@Param("aeStatus") String aeStatus, @Param("desc") boolean desc,
			RowBounds rowBounds);

	List<Attendance> selectStuAttendance(@Param("pracId") Integer pracId,
			@Param("dateStart") Date dateStart, @Param("dateEnd") Date dateEnd,
			@Param("stuNo") Integer stuNo, @Param("aeStatus") String aeStatus,
			@Param("desc") boolean desc, RowBounds rowBounds);

	List<AttendanceInfo> selectAttendanceInfos(@Param("pracId") Integer pracId,
			@Param("patCode") String patCode, @Param("stuName") String stuName,
			@Param("stuNum") String stuNum,
			@Param("className") String className,
			@Param("teamName") String teamName);
}