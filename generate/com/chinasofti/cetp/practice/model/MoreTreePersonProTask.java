package com.chinasofti.cetp.practice.model;

import java.util.List;

public class MoreTreePersonProTask extends ProTask {
	private Integer pnPlanId;
	private Integer pnPlanTime;
	private String pnPlanTimeSuffix;
	private String pnStatus;
	private Double pnFinishPercent;
	private String pnPlanStartTime;
	private String pnPlanEndTime;
	private String pnRealStartTime;
	private String pnRealEndTime;
    private Integer pnTeacherScore;
    private String pnTeacherReason;


	public Integer getPnTeacherScore() {
		return pnTeacherScore;
	}

	public void setPnTeacherScore(Integer pnTeacherScore) {
		this.pnTeacherScore = pnTeacherScore;
	}

	public String getPnTeacherReason() {
		return pnTeacherReason;
	}

	public void setPnTeacherReason(String pnTeacherReason) {
		this.pnTeacherReason = pnTeacherReason;
	}

	private List<MoreTreePersonProTask> children;
	private String state;

	public Integer getPnPlanId() {
		return pnPlanId;
	}

	public void setPnPlanId(Integer pnPlanId) {
		this.pnPlanId = pnPlanId;
	}

	public Integer getPnPlanTime() {
		return pnPlanTime;
	}

	public void setPnPlanTime(Integer pnPlanTime) {
		this.pnPlanTime = pnPlanTime;
	}

	public String getPnPlanTimeSuffix() {
		return pnPlanTimeSuffix;
	}

	public void setPnPlanTimeSuffix(String pnPlanTimeSuffix) {
		this.pnPlanTimeSuffix = pnPlanTimeSuffix;
	}

	public String getPnPlanStartTime() {
		return pnPlanStartTime;
	}

	public void setPnPlanStartTime(String pnPlanStartTime) {
		this.pnPlanStartTime = pnPlanStartTime;
	}

	public String getPnPlanEndTime() {
		return pnPlanEndTime;
	}

	public void setPnPlanEndTime(String pnPlanEndTime) {
		this.pnPlanEndTime = pnPlanEndTime;
	}

	public List<MoreTreePersonProTask> getChildren() {
		return children;
	}

	public void setChildren(List<MoreTreePersonProTask> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPnRealStartTime() {
		return pnRealStartTime;
	}

	public void setPnRealStartTime(String pnRealStartTime) {
		this.pnRealStartTime = pnRealStartTime;
	}

	public String getPnRealEndTime() {
		return pnRealEndTime;
	}

	public void setPnRealEndTime(String pnRealEndTime) {
		this.pnRealEndTime = pnRealEndTime;
	}

	public String getPnStatus() {
		return pnStatus;
	}

	public void setPnStatus(String pnStatus) {
		this.pnStatus = pnStatus;
	}

	public Double getPnFinishPercent() {
		return pnFinishPercent;
	}

	public void setPnFinishPercent(Double pnFinishPercent) {
		this.pnFinishPercent = pnFinishPercent;
	}

}
