package com.chinasofti.cetp.survey.model;

import com.chinasofti.cetp.admin.model.User;

public class Surveys extends Survey{
	
	/** 编辑者信息 **/
	private User user;
	
	/** 参加该问卷调查次数 **/
	private Integer info;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

	
	
}
