package com.chinasofti.cetp.study.model;

import java.util.List;

public class TreeTechType {
	private int id;
	private String text;
	private String iconCls;
	private List<TreeTechType> children;
	private String state;
	private TechType attributes;
	private String checked;

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

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public List<TreeTechType> getChildren() {
		return children;
	}

	public void setChildren(List<TreeTechType> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public TechType getAttributes() {
		return attributes;
	}

	public void setAttributes(TechType attributes) {
		this.attributes = attributes;
		this.id = attributes.getTechTypeId();
		this.text = attributes.getTechTypeName();
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

}
