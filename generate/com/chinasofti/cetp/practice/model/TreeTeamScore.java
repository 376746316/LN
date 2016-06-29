package com.chinasofti.cetp.practice.model;

import java.util.List;

public class TreeTeamScore extends ProTask {
	private MoreTeamPlan moreTeamPlan;
	private TeamPhaseCheck teamPhaseCheck;
	private List<TreeTeamScore> children;
	private String state;

	public List<TreeTeamScore> getChildren() {
		return children;
	}

	public void setChildren(List<TreeTeamScore> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public MoreTeamPlan getMoreTeamPlan() {
		return moreTeamPlan;
	}

	public void setMoreTeamPlan(MoreTeamPlan moreTeamPlan) {
		this.moreTeamPlan = moreTeamPlan;
	}

	public TeamPhaseCheck getTeamPhaseCheck() {
		return teamPhaseCheck;
	}

	public void setTeamPhaseCheck(TeamPhaseCheck teamPhaseCheck) {
		this.teamPhaseCheck = teamPhaseCheck;
	}

}
