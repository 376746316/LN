package com.chinasofti.cetp.study.model;

import java.util.List;

public class ChapterExam {
	private Integer chapId;
	private String chapName;
	private List<MoreTExam> examList;

	public Integer getChapId() {
		return chapId;
	}

	public void setChapId(Integer chapId) {
		this.chapId = chapId;
	}

	public String getChapName() {
		return chapName;
	}

	public void setChapName(String chapName) {
		this.chapName = chapName;
	}

	public List<MoreTExam> getExamList() {
		return examList;
	}

	public void setExamList(List<MoreTExam> examList) {
		this.examList = examList;
	}

}
