package com.chinasofti.cetp.study.model;

import java.util.List;

public class RealtimeQAWithBLOBs extends RealtimeQA {
	private String rqaDescription;

	private String rqaLog;

	private String rqaUnsolved;

	private String rqaFeedback;

	private List<Message> msgList;

	public List<Message> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<Message> msgList) {
		this.msgList = msgList;
	}

	public String getRqaDescription() {
		return rqaDescription;
	}

	public void setRqaDescription(String rqaDescription) {
		this.rqaDescription = rqaDescription == null ? null : rqaDescription.trim();
	}

	public String getRqaLog() {
		return rqaLog;
	}

	public void setRqaLog(String rqaLog) {
		this.rqaLog = rqaLog == null ? null : rqaLog.trim();
	}

	public String getRqaUnsolved() {
		return rqaUnsolved;
	}

	public void setRqaUnsolved(String rqaUnsolved) {
		this.rqaUnsolved = rqaUnsolved == null ? null : rqaUnsolved.trim();
	}

	public String getRqaFeedback() {
		return rqaFeedback;
	}

	public void setRqaFeedback(String rqaFeedback) {
		this.rqaFeedback = rqaFeedback == null ? null : rqaFeedback.trim();
	}
}