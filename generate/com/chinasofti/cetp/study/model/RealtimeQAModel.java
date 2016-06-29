package com.chinasofti.cetp.study.model;

import java.io.Serializable;

public class RealtimeQAModel extends RealtimeQA implements Serializable{

	private static final long serialVersionUID = 1L;

	private String stuName;

	private String techTypeName;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getTechTypeName() {
		return techTypeName;
	}

	public void setTechTypeName(String techTypeName) {
		this.techTypeName = techTypeName;
	}
}
