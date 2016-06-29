package com.chinasofti.cetp.gensee.model;

import java.util.Date;
import java.util.List;

/**
 * @author 远扬
 *
 */
public class GenseeRollcall {

	private Date startTime ;
	
	private Date endTime ;
	
	private Integer total;
	
	private Integer present ;
	
	private Integer absent ;
	
	private List<GenseeRollCallUser> users;

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPresent() {
		return present;
	}

	public void setPresent(Integer present) {
		this.present = present;
	}

	public Integer getAbsent() {
		return absent;
	}

	public void setAbsent(Integer absent) {
		this.absent = absent;
	}

	public List<GenseeRollCallUser> getUsers() {
		return users;
	}

	public void setUsers(List<GenseeRollCallUser> users) {
		this.users = users;
	}
	
}
