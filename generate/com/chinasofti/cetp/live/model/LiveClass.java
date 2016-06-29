package com.chinasofti.cetp.live.model;

import java.util.Date;
import java.util.List;

public class LiveClass {

	private Integer liveClassId;
	private Integer liveClassLiveId;

	private String liveClassName;

	private Date liveClassStart;

	private Integer liveClassWeeks;

	private Integer liveClassTotal;

	private Integer liveClassLogin;

	private Integer liveClassNote;

	private Integer liveClassPost;

	private Integer liveClassWork;

	private Integer liveClassTest;

	private String liveClassFlag;


	List<LiveChapter> chapList;

	public List<LiveChapter> getChapList() {
		return chapList;
	}

	public void setChapList(List<LiveChapter> chapList) {
		this.chapList = chapList;
	}

	public Integer getLiveClassId() {
		return liveClassId;
	}

	public void setLiveClassId(Integer liveClassId) {
		this.liveClassId = liveClassId;
	}

	public String getLiveClassName() {
		return liveClassName;
	}

	public void setLiveClassName(String liveClassName) {
		this.liveClassName = liveClassName == null ? null : liveClassName.trim();
	}

	public Date getLiveClassStart() {
		return liveClassStart;
	}

	public void setLiveClassStart(Date liveClassStart) {
		this.liveClassStart = liveClassStart;
	}

	public Integer getLiveClassWeeks() {
		return liveClassWeeks;
	}

	public void setLiveClassWeeks(Integer liveClassWeeks) {
		this.liveClassWeeks = liveClassWeeks;
	}

	public Integer getLiveClassTotal() {
		return liveClassTotal;
	}

	public void setLiveClassTotal(Integer liveClassTotal) {
		this.liveClassTotal = liveClassTotal;
	}

	public Integer getLiveClassLogin() {
		return liveClassLogin;
	}

	public void setLiveClassLogin(Integer liveClassLogin) {
		this.liveClassLogin = liveClassLogin;
	}

	public Integer getLiveClassNote() {
		return liveClassNote;
	}

	public void setLiveClassNote(Integer liveClassNote) {
		this.liveClassNote = liveClassNote;
	}

	public Integer getLiveClassPost() {
		return liveClassPost;
	}

	public void setLiveClassPost(Integer liveClassPost) {
		this.liveClassPost = liveClassPost;
	}

	public Integer getLiveClassWork() {
		return liveClassWork;
	}

	public void setLiveClassWork(Integer liveClassWork) {
		this.liveClassWork = liveClassWork;
	}

	public Integer getLiveClassTest() {
		return liveClassTest;
	}

	public void setLiveClassTest(Integer liveClassTest) {
		this.liveClassTest = liveClassTest;
	}

	public String getLiveClassFlag() {
		return liveClassFlag;
	}

	public Integer getLiveClassLiveId() {
		return liveClassLiveId;
	}

	public void setLiveClassLiveId(Integer liveClassLiveId) {
		this.liveClassLiveId = liveClassLiveId;
	}

	public void setLiveClassFlag(String liveClassFlag) {
		this.liveClassFlag = liveClassFlag == null ? null : liveClassFlag.trim();
	}
}