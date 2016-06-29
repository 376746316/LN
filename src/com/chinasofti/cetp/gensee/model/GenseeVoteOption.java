package com.chinasofti.cetp.gensee.model;

import java.math.BigDecimal;
import java.util.List;

public class GenseeVoteOption {

	private String value;
	
	private BigDecimal precentage ;
	
	private String result;
	
	private Integer type;
	
	private List<GenseeVoteUser> results;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BigDecimal getPrecentage() {
		return precentage;
	}

	public void setPrecentage(BigDecimal precentage) {
		this.precentage = precentage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<GenseeVoteUser> getResults() {
		return results;
	}

	public void setResults(List<GenseeVoteUser> results) {
		this.results = results;
	}
	
	
}
