package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.Student;
import com.chinasofti.cetp.admin.model.StudentExample;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudentMapper {
	int countByExample(StudentExample example);

	int deleteByExample(StudentExample example);

	int deleteByPrimaryKey(Integer stuNo);

	int insert(StudentWithBLOBs record);

	int insertSelective(StudentWithBLOBs record);

	List<StudentWithBLOBs> selectByExampleWithBLOBs(StudentExample example);

	List<Student> selectByExample(StudentExample example);

	StudentWithBLOBs selectByPrimaryKey(Integer stuNo);

	int updateByExampleSelective(@Param("record") StudentWithBLOBs record, @Param("example") StudentExample example);

	int updateByExampleWithBLOBs(@Param("record") StudentWithBLOBs record, @Param("example") StudentExample example);

	int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

	int updateByPrimaryKeySelective(StudentWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(StudentWithBLOBs record);

	int updateByPrimaryKey(Student record);

	List<StudentWithBLOBs> selectByExampleWithBLOBs(StudentExample example, RowBounds rb);

	List<StudentWithBLOBs> getStuListForPrac(Integer pracId);

	List<StudentWithBLOBs> getStuNotInTeam(Integer pracId);

	List<StudentWithBLOBs> getStuInTeam(Integer teamId);

	List<StudentWithBLOBs> getLearningStusByLiveId(Integer liveId);

	StudentWithBLOBs selectByIdAndName(HashMap<String, Object> map);
	

}