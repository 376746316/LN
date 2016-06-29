package com.chinasofti.cetp.utils;

import java.util.List;

public class TreeVO {

	private int id;
	private String text;
	private int parentId;
	private List<TreeVO> children;
	private String state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public List<TreeVO> getChildren() {
		return children;
	}

	public void setChildren(List<TreeVO> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
