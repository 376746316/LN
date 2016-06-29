package com.chinasofti.cetp.practice.model;

public class MoreStuWeekly extends StuWeekly {

	private String stuName;

	private String pracName;
	
	private String date_registertime;
	
	public String getDate_registertime() {
		return date_registertime;
	}

	public void setDate_registertime(String date_registertime) {
		this.date_registertime = date_registertime;
	}

	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getPracName() {
		return pracName;
	}

	public void setPracName(String pracName) {
		this.pracName = pracName;
	}

}
