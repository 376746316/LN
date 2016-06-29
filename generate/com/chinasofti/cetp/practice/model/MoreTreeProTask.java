package com.chinasofti.cetp.practice.model;

import java.util.List;

public class MoreTreeProTask extends ProTask {
	private Integer plPlanId;
	private Integer plMemberNo;
	private String stuName;
	private Integer plPlanTime;
	private String plPlanStartTime;
	private String plPlanEndTime;
	
	private List<MoreTreeProTask> children;
	private String state;
	public List<MoreTreeProTask> getChildren() {
		return children;
	}
	public void setChildren(List<MoreTreeProTask> children) {
		this.children = children;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPlPlanId() {
		return plPlanId;
	}
	public void setPlPlanId(Integer plPlanId) {
		this.plPlanId = plPlanId;
	}
	public Integer getPlMemberNo() {
		return plMemberNo;
	}
	public void setPlMemberNo(Integer plMemberNo) {
		this.plMemberNo = plMemberNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getPlPlanTime() {
		return plPlanTime;
	}
	public void setPlPlanTime(Integer plPlanTime) {
		this.plPlanTime = plPlanTime;
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
	
	
}
