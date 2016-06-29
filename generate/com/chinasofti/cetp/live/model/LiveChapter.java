package com.chinasofti.cetp.live.model;

import java.util.List;

public class LiveChapter {
	private Integer liveChapId;

	private String liveChapName;

	private Integer liveChapClassId;
	private List<LiveCourse> courseList;

	public List<LiveCourse> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<LiveCourse> courseList) {
		this.courseList = courseList;
	}

	public Integer getLiveChapId() {
		return liveChapId;
	}

	public void setLiveChapId(Integer liveChapId) {
		this.liveChapId = liveChapId;
	}

	public String getLiveChapName() {
		return liveChapName;
	}

	public void setLiveChapName(String liveChapName) {
		this.liveChapName = liveChapName == null ? null : liveChapName.trim();
	}

	public Integer getLiveChapClassId() {
		return liveChapClassId;
	}

	public void setLiveChapClassId(Integer liveChapClassId) {
		this.liveChapClassId = liveChapClassId;
	}
}