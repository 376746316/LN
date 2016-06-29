package com.chinasofti.cetp.practice.model;

public class MoreMorePractice extends MorePractice{
	private Integer stuNo;
	private Integer proId;
	private String  stuName;
	private String  taskName;
	private String proName;
    private Double pnFinishPercent;
    private String stuUserid;
    
	public String getStuUserid() {
		return stuUserid;
	}
	public void setStuUserid(String stuUserid) {
		this.stuUserid = stuUserid;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
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
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Double getPnFinishPercent() {
		return pnFinishPercent;
	}
	public void setPnFinishPercent(Double pnFinishPercent) {
		this.pnFinishPercent = pnFinishPercent;
	}
}
