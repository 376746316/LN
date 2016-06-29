package com.chinasofti.cetp.ability.model;

import java.util.List;

public class MoreWconAbitem extends WconAbitem{
	private Integer abiId;
	private String abiName;
	private Integer abId;
	private String abName;
	private Integer abScore;
	private List<MoreWconAbitem> children;
	private int id;
	private String text;
	private String state;
	public Integer getAbiId() {
		return abiId;
	}
	public void setAbiId(Integer abiId) {
		this.abiId = abiId;
	}
	public String getAbiName() {
		return abiName;
	}
	public void setAbiName(String abiName) {
		this.abiName = abiName;
	}
	public Integer getAbId() {
		return abId;
	}
	public void setAbId(Integer abId) {
		this.abId = abId;
	}
	public String getAbName() {
		return abName;
	}
	public void setAbName(String abName) {
		this.abName = abName;
	}
	public Integer getAbScore() {
		return abScore;
	}
	public void setAbScore(Integer abScore) {
		this.abScore = abScore;
	}
	public List<MoreWconAbitem> getChildren() {
		return children;
	}
	public void setChildren(List<MoreWconAbitem> children) {
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
