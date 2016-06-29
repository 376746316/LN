package com.chinasofti.cetp.live.model;

import com.chinasofti.cetp.exam.model.ExamQuesWithBLOBs;

public class LiveExam extends ExamQuesWithBLOBs {
	private Integer liveCourseId;

	public Integer getLiveCourseId() {
		return liveCourseId;
	}

	public void setLiveCourseId(Integer liveCourseId) {
		this.liveCourseId = liveCourseId;
	}

}
