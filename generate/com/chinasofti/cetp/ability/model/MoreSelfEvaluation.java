package com.chinasofti.cetp.ability.model;

import java.util.List;

public class MoreSelfEvaluation extends SelfEvaluation{
    private Integer abiId;
    private String abiName;
    private Integer abId;
    private String abName;
    private Integer abScore;
    private List<MoreSelfEvaluation> itemlist;
    private String profId;
    private String profName;
    private String waitAbName;
	public Integer getAbiId() {
		return abiId;
	}
	public void setAbiId(Integer abiId) {
		this.abiId = abiId;
	}
	public String getAbiName() {
		return abiName;
	}
	public void setAbiName(String abiName) {
		this.abiName = abiName;
	}
	public Integer getAbId() {
		return abId;
	}
	public void setAbId(Integer abId) {
		this.abId = abId;
	}
	public String getAbName() {
		return abName;
	}
	public void setAbName(String abName) {
		this.abName = abName;
	}
	public Integer getAbScore() {
		return abScore;
	}
	public void setAbScore(Integer abScore) {
		this.abScore = abScore;
	}
	public List<MoreSelfEvaluation> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<MoreSelfEvaluation> itemlist) {
		this.itemlist = itemlist;
	}
	public String getProfId() {
		return profId;
	}
	public void setProfId(String profId) {
		this.profId = profId;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getWaitAbName() {
		return waitAbName;
	}
	public void setWaitAbName(String waitAbName) {
		this.waitAbName = waitAbName;
	}
}
