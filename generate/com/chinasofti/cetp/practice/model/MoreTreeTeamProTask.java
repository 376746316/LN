package com.chinasofti.cetp.practice.model;

import java.util.List;

public class MoreTreeTeamProTask extends ProTask {
	private Integer plPlanId;
	private Integer plPlanTime;
	private String plPlanTimeSuffix;
	private String plMemberNo;
	private String stuName;
	private String plStatus;
	private Double plFinishPercent;
	private String plPlanStartTime;
	private String plPlanEndTime;
	private String plRealStartTime;
	private String plRealEndTime;
	private String plLeaderScore;
	private String plLeaderReason;
	private String plTeacherReason;

	private List<MoreTreeTeamProTask> children;
	private String state;

	public String getPlTeacherReason() {
		return plTeacherReason;
	}

	public void setPlTeacherReason(String plTeacherReason) {
		this.plTeacherReason = plTeacherReason;
	}

	public Integer getPlPlanId() {
		return plPlanId;
	}

	public String getPlLeaderReason() {
		return plLeaderReason;
	}

	public void setPlLeaderReason(String plLeaderReason) {
		this.plLeaderReason = plLeaderReason;
	}

	public void setPlPlanId(Integer plPlanId) {
		this.plPlanId = plPlanId;
	}

	public Integer getPlPlanTime() {
		return plPlanTime;
	}

	public void setPlPlanTime(Integer plPlanTime) {
		this.plPlanTime = plPlanTime;
	}

	public String getPlPlanTimeSuffix() {
		return plPlanTimeSuffix;
	}

	public void setPlPlanTimeSuffix(String plPlanTimeSuffix) {
		this.plPlanTimeSuffix = plPlanTimeSuffix;
	}

	public String getPlMemberNo() {
		return plMemberNo;
	}

	public void setPlMemberNo(String plMemberNo) {
		this.plMemberNo = plMemberNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getPlStatus() {
		return plStatus;
	}

	public void setPlStatus(String plStatus) {
		this.plStatus = plStatus;
	}

	public Double getPlFinishPercent() {
		return plFinishPercent;
	}

	public void setPlFinishPercent(Double plFinishPercent) {
		this.plFinishPercent = plFinishPercent;
	}

	public String getPlPlanStartTime() {
		return plPlanStartTime;
	}

	public void setPlPlanStartTime(String plPlanStartTime) {
		this.plPlanStartTime = plPlanStartTime;
	}

	public String getPlPlanEndTime() {
		return plPlanEndTime;
	}

	public void setPlPlanEndTime(String plPlanEndTime) {
		this.plPlanEndTime = plPlanEndTime;
	}

	public String getPlRealStartTime() {
		return plRealStartTime;
	}

	public void setPlRealStartTime(String plRealStartTime) {
		this.plRealStartTime = plRealStartTime;
	}

	public String getPlRealEndTime() {
		return plRealEndTime;
	}

	public void setPlRealEndTime(String plRealEndTime) {
		this.plRealEndTime = plRealEndTime;
	}

	public List<MoreTreeTeamProTask> getChildren() {
		return children;
	}

	public void setChildren(List<MoreTreeTeamProTask> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPlLeaderScore() {
		return plLeaderScore;
	}

	public void setPlLeaderScore(String plLeaderScore) {
		this.plLeaderScore = plLeaderScore;
	}

}
