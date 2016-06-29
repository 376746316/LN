package com.chinasofti.cetp.practice.model;

import com.chinasofti.cetp.utils.ReaderXmlParam;

public class MoreTeamPlanWithTask extends TeamPlan {
	private String taskName;
	private String taskDiffcult;
	private Integer taskScore;
	private String taskIsMilestone;
	private String taskPreId;
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDiffcult() {
		return taskDiffcult;
	}
	public void setTaskDiffcult(String taskDiffcult) {
		this.taskDiffcult = this.getParam_name("21", taskDiffcult);
	}
	public Integer getTaskScore() {
		return taskScore;
	}
	public void setTaskScore(Integer taskScore) {
		this.taskScore = taskScore;
	}
	public String getTaskIsMilestone() {
		return taskIsMilestone;
	}
	public void setTaskIsMilestone(String taskIsMilestone) {
		this.taskIsMilestone = this.getParam_name("10", taskIsMilestone);
	}
	public String getTaskPreId() {
		return taskPreId;
	}
	public void setTaskPreId(String taskPreId) {
		this.taskPreId = taskPreId;
	}
	
	private String getParam_name(String parentparamid, String paramid) {
		return ReaderXmlParam.getInstance().getParam(parentparamid, paramid)
				.getParam_name();
	} 
}
