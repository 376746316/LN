package com.chinasofti.cetp.gensee.model;

import java.util.List;

public class GenseeVoteQuestion {

	private String content;
	private List<GenseeVoteOption> options;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<GenseeVoteOption> getOptions() {
		return options;
	}

	public void setOptions(List<GenseeVoteOption> options) {
		this.options = options;
	}

}
