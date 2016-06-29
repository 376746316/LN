package com.chinasofti.cetp.gensee.model;

import java.util.List;

public class GenseeVote {

	private String subject ;
	
	private List<GenseeVoteQuestion> questions ;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<GenseeVoteQuestion> getQuestions() {
		return questions;
	}

	public void setQuestions(List<GenseeVoteQuestion> questions) {
		this.questions = questions;
	}
	
	
}
