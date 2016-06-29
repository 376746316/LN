package com.chinasofti.cetp.gensee.model;

import java.util.Date;

public class GenseeDoc {

	private Long Id ;
	
	private String name ;

	private String upload ;
	
	private Date  createdTime ;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	
}
