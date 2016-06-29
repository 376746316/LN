package com.chinasofti.cetp.gensee.model;

import java.util.Date;

/**
 * 展示互动录制件同步
 * 
 * @author 远扬
 *
 */
public class GenseeRecord {

	private Integer recordId;

	private String id;

	private String name;

	private Date recordStartTime;

	private Date recordEndTime;

	private Date createdTime;

	private Long size;

	private String roomId;

	private Long creator;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

}
