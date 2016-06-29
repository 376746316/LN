package com.chinasofti.cetp.study.model;

import java.util.List;

public class MoreStudyAnswer extends StudyAnswer {

	private String userName;
	private String answerTime;
	private String headUrl;
	private List<MoreStudyAnswer> flowAskList;
	
	public List<MoreStudyAnswer> getFlowAskList() {
		return flowAskList;
	}

	public void setFlowAskList(List<MoreStudyAnswer> flowAskList) {
		this.flowAskList = flowAskList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	@Override
	public String toString() {
		return "MoreStudyAnswer [userName=" + userName + ", answerTime="
				+ answerTime + ", headUrl=" + headUrl + "]";
	}

}
