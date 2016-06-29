package com.chinasofti.cetp.resource.model;

public class ListVideoWithBLOBs extends VideoWithBLOBs {

	private Integer lvId;
	private String lvImg;

	public String getLvImg() {
		return lvImg;
	}

	public void setLvImg(String lvImg) {
		this.lvImg = lvImg;
	}

	public Integer getLvId() {
		return lvId;
	}

	public void setLvId(Integer lvId) {
		this.lvId = lvId;
	}

}
