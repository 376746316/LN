package com.chinasofti.cetp.gensee.model;

import java.util.Date;

/**
 * 提问记录
 * 
 * @author 远扬
 *
 */
public class GenseeQA {
	private Long submitter;

	private String published;

	private Date submitTime;

	private String name;

	private Long answerBy;

	private String question;

	private String response;

	public Long getSubmitter() {
		return submitter;
	}

	public void setSubmitter(Long submitter) {
		this.submitter = submitter;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAnswerBy() {
		return answerBy;
	}

	public void setAnswerBy(Long answerBy) {
		this.answerBy = answerBy;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}
