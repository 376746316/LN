package com.chinasofti.cetp.practice.model;

import java.util.List;

public class TreeProTask extends ProTask {
	private List<TreeProTask> children;
	private String state;
	public List<TreeProTask> getChildren() {
		return children;
	}
	public void setChildren(List<TreeProTask> children) {
		this.children = children;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
