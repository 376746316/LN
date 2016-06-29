package com.chinasofti.cetp.practice.model;

import java.util.Date;

public class MoreTeamMember extends TeamMember{

	private Integer teamId;

    private Integer teamPracId;

    private String teamName;

    private String teamSolagn;

    private String teamLogoUrl;

    private Integer teamLeaderNo;

    private String teamLeaderName;

    private Integer teamProId;

    private Integer teamRealScore;

    private Date teamRegtime;

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getTeamPracId() {
		return teamPracId;
	}

	public void setTeamPracId(Integer teamPracId) {
		this.teamPracId = teamPracId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamSolagn() {
		return teamSolagn;
	}

	public void setTeamSolagn(String teamSolagn) {
		this.teamSolagn = teamSolagn;
	}

	public String getTeamLogoUrl() {
		return teamLogoUrl;
	}

	public void setTeamLogoUrl(String teamLogoUrl) {
		this.teamLogoUrl = teamLogoUrl;
	}

	public Integer getTeamLeaderNo() {
		return teamLeaderNo;
	}

	public void setTeamLeaderNo(Integer teamLeaderNo) {
		this.teamLeaderNo = teamLeaderNo;
	}

	public String getTeamLeaderName() {
		return teamLeaderName;
	}

	public void setTeamLeaderName(String teamLeaderName) {
		this.teamLeaderName = teamLeaderName;
	}

	public Integer getTeamProId() {
		return teamProId;
	}

	public void setTeamProId(Integer teamProId) {
		this.teamProId = teamProId;
	}

	public Integer getTeamRealScore() {
		return teamRealScore;
	}

	public void setTeamRealScore(Integer teamRealScore) {
		this.teamRealScore = teamRealScore;
	}

	public Date getTeamRegtime() {
		return teamRegtime;
	}

	public void setTeamRegtime(Date teamRegtime) {
		this.teamRegtime = teamRegtime;
	}
}