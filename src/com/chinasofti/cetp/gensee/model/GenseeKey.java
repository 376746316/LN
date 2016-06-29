package com.chinasofti.cetp.gensee.model;

import java.util.Date;

public class GenseeKey {
	public static final String TRUE = "1";
	public static final String FALSE = "0";
	private Long genseeKeyId;

	private String genseeKey;

	private Integer genseeKeyUserNo;

	private String genseeKeyRoomId;

	private Date genseeKeyStartTime;

	private Date genseeKeyEndTime;

	private String genseeKeyFlag;

	public Long getGenseeKeyId() {
		return genseeKeyId;
	}

	public void setGenseeKeyId(Long genseeKeyId) {
		this.genseeKeyId = genseeKeyId;
	}

	public String getGenseeKey() {
		return genseeKey;
	}

	public void setGenseeKey(String genseeKey) {
		this.genseeKey = genseeKey == null ? null : genseeKey.trim();
	}

	public Integer getGenseeKeyUserNo() {
		return genseeKeyUserNo;
	}

	public void setGenseeKeyUserNo(Integer genseeKeyUserNo) {
		this.genseeKeyUserNo = genseeKeyUserNo;
	}

	public String getGenseeKeyRoomId() {
		return genseeKeyRoomId;
	}

	public void setGenseeKeyRoomId(String genseeKeyRoomId) {
		this.genseeKeyRoomId = genseeKeyRoomId == null ? null : genseeKeyRoomId.trim();
	}

	public Date getGenseeKeyStartTime() {
		return genseeKeyStartTime;
	}

	public void setGenseeKeyStartTime(Date genseeKeyStartTime) {
		this.genseeKeyStartTime = genseeKeyStartTime;
	}

	public Date getGenseeKeyEndTime() {
		return genseeKeyEndTime;
	}

	public void setGenseeKeyEndTime(Date genseeKeyEndTime) {
		this.genseeKeyEndTime = genseeKeyEndTime;
	}

	public String getGenseeKeyFlag() {
		return genseeKeyFlag;
	}

	public void setGenseeKeyFlag(String genseeKeyFlag) {
		this.genseeKeyFlag = genseeKeyFlag == null ? null : genseeKeyFlag.trim();
	}
}