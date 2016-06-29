package com.chinasofti.cetp.practice.model;

public class TeamMemberScore {
	private Integer stuNo;
	private String stuName;
	private Integer taskNum;
	private Integer sumTaskScore;
	private Integer sumLeaderScore;
	private Integer sumTeacherScore;
	private String teacherName;

	public Integer getStuNo() {
		return stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getTaskNum() {
		return taskNum;
	}

	public void setTaskNum(Integer taskNum) {
		this.taskNum = taskNum;
	}

	public Integer getSumTaskScore() {
		return sumTaskScore;
	}

	public void setSumTaskScore(Integer sumTaskScore) {
		this.sumTaskScore = sumTaskScore;
	}

	public Integer getSumLeaderScore() {
		return sumLeaderScore;
	}

	public void setSumLeaderScore(Integer sumLeaderScore) {
		this.sumLeaderScore = sumLeaderScore;
	}

	public Integer getSumTeacherScore() {
		return sumTeacherScore;
	}

	public void setSumTeacherScore(Integer sumTeacherScore) {
		this.sumTeacherScore = sumTeacherScore;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
