package com.chinasofti.cetp.attendance.dao;

import com.chinasofti.cetp.attendance.model.MorePracCalendar;
import com.chinasofti.cetp.attendance.model.PracCalendar;
import com.chinasofti.cetp.attendance.model.PracCalendarExample;
import com.chinasofti.cetp.attendance.model.TimeSlot;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PracCalendarMapper {
	int countByExample(PracCalendarExample example);

	int deleteByExample(PracCalendarExample example);

	int deleteByPrimaryKey(Integer pacId);

	int insert(PracCalendar record);

	int insertSelective(PracCalendar record);

	List<PracCalendar> selectByExample(PracCalendarExample example);

	PracCalendar selectByPrimaryKey(Integer pacId);

	int updateByExampleSelective(@Param("record") PracCalendar record,
			@Param("example") PracCalendarExample example);

	int updateByExample(@Param("record") PracCalendar record,
			@Param("example") PracCalendarExample example);

	int updateByPrimaryKeySelective(PracCalendar record);

	int updateByPrimaryKey(PracCalendar record);

	List<MorePracCalendar> getPracCalendarList(Integer pacPracId,
			RowBounds rowBounds);
	
	List<TimeSlot> getPracTimeSlots(Integer pracId);
}