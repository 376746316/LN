package com.chinasofti.cetp.practice.model;

import com.chinasofti.cetp.utils.ReaderXmlParam;

public class MorePersonPlan extends PersonPlan {
	private String taskName;
	private Integer taskScore;
	private String taskPreId;
	private String taskDiffcult;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Integer getTaskScore() {
		return taskScore;
	}

	public void setTaskScore(Integer taskScore) {
		this.taskScore = taskScore;
	}

	public String getTaskPreId() {
		return taskPreId;
	}

	public void setTaskPreId(String taskPreId) {
		this.taskPreId = taskPreId;
	}

	public String getTaskDiffcult() {
		return taskDiffcult;
	}

	public void setTaskDiffcult(String taskDiffcult) {
		this.taskDiffcult = this.getParam_name("21", taskDiffcult);
	}

	private String getParam_name(String parentparamid, String paramid) {
		return ReaderXmlParam.getInstance().getParam(parentparamid, paramid)
				.getParam_name();
	}
}
