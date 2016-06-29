package com.chinasofti.cetp.study.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MoreHomeworkStu extends HomeworkStu {
	private String stuName;
	private String stuNickName;

	private ExerciseWithBLOBs homework;

	private Integer exerId;
	private Integer exerScore;

	private String exerTitle;
	private String exerContext;
	private String exerTextAnswer;
	private String exerStep;
	private String showTime;

	public ExerciseWithBLOBs getHomework() {
		return homework;
	}

	public void setHomework(ExerciseWithBLOBs homework) {
		this.homework = homework;
	}

	public String getStuNickName() {
		return stuNickName;
	}

	public void setStuNickName(String stuNickName) {
		this.stuNickName = stuNickName;
	}

	public Integer getExerScore() {
		return exerScore;
	}

	public void setExerScore(Integer exerScore) {
		this.exerScore = exerScore;
	}

	public String getShowTime() {
		Date date = this.getHsCommitTime();
		if (date != null) {
			this.showTime = new SimpleDateFormat("yyyy.MM.dd").format(date);
		}
		return this.showTime;
	}

	public void setShowTime(String showTime) {
		if (showTime != null) {
			this.showTime = showTime;
		} else {
			Date date = this.getHsCommitTime();
			this.showTime = new SimpleDateFormat("yyyy.MM.dd").format(date);
		}
	}

	public Integer getExerId() {
		return exerId;
	}

	public void setExerId(Integer exerId) {
		this.exerId = exerId;
	}

	public String getExerTitle() {
		return exerTitle;
	}

	public void setExerTitle(String exerTitle) {
		this.exerTitle = exerTitle;
	}

	public String getExerContext() {
		return exerContext;
	}

	public void setExerContext(String exerContext) {
		this.exerContext = exerContext;
	}

	public String getExerTextAnswer() {
		return exerTextAnswer;
	}

	public void setExerTextAnswer(String exerTextAnswer) {
		this.exerTextAnswer = exerTextAnswer;
	}

	public String getExerStep() {
		return exerStep;
	}

	public void setExerStep(String exerStep) {
		this.exerStep = exerStep;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

}
