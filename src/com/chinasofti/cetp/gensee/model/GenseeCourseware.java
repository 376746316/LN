package com.chinasofti.cetp.gensee.model;

import java.util.Date;

public class GenseeCourseware extends GenseeCode {
    private String id;

    private String token;

    private String subject;

    private String roomId;

    private String url;

    private String description;

    private String creator;

    private Integer number;

    private String recordId;

    private String screenshot;

    private Date createdTime;

    private Date recordStartTime;

    private Date recordEndTime;

    private Integer userNo;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot == null ? null : screenshot.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getRecordStartTime() {
        return recordStartTime;
    }

    public void setRecordStartTime(Date recordStartTime) {
        this.recordStartTime = recordStartTime;
    }

    public Date getRecordEndTime() {
        return recordEndTime;
    }

    public void setRecordEndTime(Date recordEndTime) {
        this.recordEndTime = recordEndTime;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }
}