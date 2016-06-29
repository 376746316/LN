package com.chinasofti.cetp.gensee.model;

import java.util.Date;

/**
 * 为课件导出按天同步访问记录
 * 
 * @author 远扬
 *
 */
public class GenseeStudyHistory {

	private String id;

	private Long uid;

	private Date startTime;

	private Date leaveTime;

	private String name;

	private String duration;

	private Integer device;

	private String ip;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Integer getDevice() {
		return device;
	}

	public void setDevice(Integer device) {
		this.device = device;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
