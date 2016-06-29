package com.chinasofti.cetp.attendance.model;

/**
 * 出勤情况(姓名、 班级、 小组、应到 、实到 、迟到 、 早退、 事假、病假、旷课)
 * 
 * @author Heyq
 * 
 */
public class AttendanceInfoStr {

	/** 学号 **/
	private String stuNum;
	/** 考勤号 **/
	private String patCode;
	/** 班级 **/
	private String className;
	/** 姓名 **/
	private String stuName;
	/** 小组 **/
	private String teamName;
	/** 应到 **/
	private String due;
	/** 实到 **/
	private String normal;
	/** 迟到 **/
	private String late;
	/** 早退 **/
	private String early;
	/** 事假 **/
	private String matterLeave;
	/** 病假 **/
	private String sickLeave;
	/** 旷课 **/
	private String absenteeism;

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getPatCode() {
		return patCode;
	}

	public void setPatCode(String patCode) {
		this.patCode = patCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getDue() {
		return due;
	}

	public void setDue(String due) {
		this.due = due;
	}

	public String getNormal() {
		return normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	public String getLate() {
		return late;
	}

	public void setLate(String late) {
		this.late = late;
	}

	public String getEarly() {
		return early;
	}

	public void setEarly(String early) {
		this.early = early;
	}

	public String getMatterLeave() {
		return matterLeave;
	}

	public void setMatterLeave(String matterLeave) {
		this.matterLeave = matterLeave;
	}

	public String getSickLeave() {
		return sickLeave;
	}

	public void setSickLeave(String sickLeave) {
		this.sickLeave = sickLeave;
	}

	public String getAbsenteeism() {
		return absenteeism;
	}

	public void setAbsenteeism(String absenteeism) {
		this.absenteeism = absenteeism;
	}

}
