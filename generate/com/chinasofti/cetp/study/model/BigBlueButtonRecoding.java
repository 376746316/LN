package com.chinasofti.cetp.study.model;


public class BigBlueButtonRecoding {

	private String recordId;
	private String name;
	private String startTime;
	private String published;
	private String playback;
	private Integer length;
	private String description;

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getPlayback() {
		return playback;
	}

	public void setPlayback(String playback) {
		this.playback = playback;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BigBlueButtonRecoding [recordId=" + recordId + ", name=" + name
				+ ", startTime=" + startTime + ", published=" + published
				+ ", playback=" + playback + ", length=" + length
				+ ", description=" + description + "]";
	}

}
