package com.chinasofti.cetp.study.model;

import java.util.Date;

public class SpecCourseView {
	private Integer specId;

	private String specName;

	private String userName;

	private Integer specCost;

	private String specClass;

	private Integer typeid;

	private String specStatus;

	private Long hitnum;

	private Date updatetime;

	private Long stunum;

	private String typename;

	private Long comnum;

	private String imgurl;

	private String specTipMsg;

	public Integer getSpecId() {
		return specId;
	}

	public void setSpecId(Integer specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName == null ? null : specName.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public Integer getSpecCost() {
		return specCost;
	}

	public void setSpecCost(Integer specCost) {
		this.specCost = specCost;
	}

	public String getSpecClass() {
		return specClass;
	}

	public void setSpecClass(String specClass) {
		this.specClass = specClass == null ? null : specClass.trim();
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getSpecStatus() {
		return specStatus;
	}

	public void setSpecStatus(String specStatus) {
		this.specStatus = specStatus == null ? null : specStatus.trim();
	}

	public Long getHitnum() {
		return hitnum;
	}

	public void setHitnum(Long hitnum) {
		this.hitnum = hitnum;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Long getStunum() {
		return stunum;
	}

	public void setStunum(Long stunum) {
		this.stunum = stunum;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename == null ? null : typename.trim();
	}

	public Long getComnum() {
		return comnum;
	}

	public void setComnum(Long comnum) {
		this.comnum = comnum;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl == null ? null : imgurl.trim();
	}

	public String getSpecTipMsg() {
		return specTipMsg;
	}

	public void setSpecTipMsg(String specTipMsg) {
		this.specTipMsg = specTipMsg == null ? null : specTipMsg.trim();
	}
}