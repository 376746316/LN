package com.chinasofti.cetp.question.model;

import java.util.List;

public class MoreAnswer extends AnswerWithBLOBs {
	private String ansName;
	private String ansHead;

	private List<AnswerReply> arList;

	public List<AnswerReply> getArList() {
		return arList;
	}

	public void setArList(List<AnswerReply> arList) {
		this.arList = arList;
	}

	public String getAnsName() {
		return ansName;
	}

	public void setAnsName(String ansName) {
		this.ansName = ansName;
	}

	public String getAnsHead() {
		return ansHead;
	}

	public void setAnsHead(String ansHead) {
		this.ansHead = ansHead;
	}

}
