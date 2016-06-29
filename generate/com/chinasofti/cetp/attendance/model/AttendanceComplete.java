package com.chinasofti.cetp.attendance.model;

public class AttendanceComplete extends Attendance {

	/** 学生编号 **/
	private Integer stuId;

	/** 考勤编号 **/
    private String code;

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
