package com.chinasofti.cetp.ability.model;

import java.util.List;

public class MoreAbility extends Ability{
	private List<MoreAbility> children;
	private int id;
	private String text;
	private String state;
	public List<MoreAbility> getChildren() {
		return children;
	}
	public void setChildren(List<MoreAbility> children) {
		this.children = children;
	}
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
