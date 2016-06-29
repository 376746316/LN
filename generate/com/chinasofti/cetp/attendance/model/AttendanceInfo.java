package com.chinasofti.cetp.attendance.model;

/**
 * 出勤情况(姓名、 班级、 小组、应到 、实到 、迟到 、 早退、 事假、病假、旷课)
 * 
 * @author Heyq
 * 
 */
public class AttendanceInfo {

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
	private Integer due;
	/** 实到 **/
	private Integer normal;
	/** 迟到 **/
	private Integer late;
	/** 早退 **/
	private Integer early;
	/** 事假 **/
	private Integer matterLeave;
	/** 病假 **/
	private Integer sickLeave;
	/** 旷课 **/
	private Integer absenteeism;

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

	public Integer getDue() {
		return due;
	}

	public void setDue(Integer due) {
		this.due = due;
	}

	public Integer getNormal() {
		return normal;
	}

	public void setNormal(Integer normal) {
		this.normal = normal;
	}

	public Integer getLate() {
		return late;
	}

	public void setLate(Integer late) {
		this.late = late;
	}

	public Integer getEarly() {
		return early;
	}

	public void setEarly(Integer early) {
		this.early = early;
	}

	public Integer getMatterLeave() {
		return matterLeave;
	}

	public void setMatterLeave(Integer matterLeave) {
		this.matterLeave = matterLeave;
	}

	public Integer getSickLeave() {
		return sickLeave;
	}

	public void setSickLeave(Integer sickLeave) {
		this.sickLeave = sickLeave;
	}

	public Integer getAbsenteeism() {
		return absenteeism;
	}

	public void setAbsenteeism(Integer absenteeism) {
		this.absenteeism = absenteeism;
	}

}
