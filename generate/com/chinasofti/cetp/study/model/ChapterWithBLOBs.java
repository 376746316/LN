package com.chinasofti.cetp.study.model;

import java.util.Date;
import java.util.List;

import com.chinasofti.cetp.exam.model.ExamQuesWithBLOBs;

public class ChapterWithBLOBs extends Chapter {
	private String chapHomework;

	private String chapHwAns;

	private List<SubCourseware> subList;

	private List<MoreHomeworkStu> homeworkList;

	private List<MoreExercise> exerList;

	private List<ExamQuesWithBLOBs> examQuesList;

	private double examQuesScore;

	private Integer homeworkScore;
	
	private Date ctHwLastTime;

	private Date ctExamLastTime;

	public Date getCtHwLastTime() {
		return ctHwLastTime;
	}

	public void setCtHwLastTime(Date ctHwLastTime) {
		this.ctHwLastTime = ctHwLastTime;
	}

	public Date getCtExamLastTime() {
		return ctExamLastTime;
	}

	public void setCtExamLastTime(Date ctExamLastTime) {
		this.ctExamLastTime = ctExamLastTime;
	}

	public Integer getHomeworkScore() {
		return homeworkScore;
	}

	public void setHomeworkScore(Integer homeworkScore) {
		this.homeworkScore = homeworkScore;
	}

	public double getExamQuesScore() {
		return examQuesScore;
	}

	public void setExamQuesScore(double examQuesScore) {
		this.examQuesScore = examQuesScore;
	}

	public List<MoreExercise> getExerList() {
		return exerList;
	}

	public void setExerList(List<MoreExercise> exerList) {
		this.exerList = exerList;
	}

	public List<ExamQuesWithBLOBs> getExamQuesList() {
		return examQuesList;
	}

	public void setExamQuesList(List<ExamQuesWithBLOBs> examQuesList) {
		this.examQuesList = examQuesList;
	}

	public List<MoreHomeworkStu> getHomeworkList() {
		return homeworkList;
	}

	public void setHomeworkList(List<MoreHomeworkStu> homeworkList) {
		this.homeworkList = homeworkList;
	}

	public List<SubCourseware> getSubList() {
		return subList;
	}

	public void setSubList(List<SubCourseware> subList) {
		this.subList = subList;
	}

	public String getChapHomework() {
		return chapHomework;
	}

	public void setChapHomework(String chapHomework) {
		this.chapHomework = chapHomework == null ? null : chapHomework.trim();
	}

	public String getChapHwAns() {
		return chapHwAns;
	}

	public void setChapHwAns(String chapHwAns) {
		this.chapHwAns = chapHwAns == null ? null : chapHwAns.trim();
	}

}