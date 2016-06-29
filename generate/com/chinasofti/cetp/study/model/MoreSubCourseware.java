package com.chinasofti.cetp.study.model;

import java.util.List;

public class MoreSubCourseware extends SubCourseware{

	private String coureseName;
	
	private List<ExerciseWithBLOBs> exerList;

	public List<ExerciseWithBLOBs> getExerList() {
    	return exerList;
    }

	public void setExerList(List<ExerciseWithBLOBs> exerList) {
    	this.exerList = exerList;
    }

	public String getCoureseName() {
		return coureseName;
	}

	public void setCoureseName(String coureseName) {
		this.coureseName = coureseName;
	}
	
}
