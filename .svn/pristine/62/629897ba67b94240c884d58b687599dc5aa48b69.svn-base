package com.chinasofti.cetp.practice.model;

import java.util.List;

public class TreeStuScore extends ProTask {
	private String teacherName;
	private PersonPlan personPlan;
	private List<TreeStuScore> children;
	private String state;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public PersonPlan getPersonPlan() {
		return personPlan;
	}

	public void setPersonPlan(PersonPlan personPlan) {
		this.personPlan = personPlan;
	}

	public List<TreeStuScore> getChildren() {
		return children;
	}

	public void setChildren(List<TreeStuScore> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setSumScore() {
		Integer ret = 0;
		if (children != null) {
			for (TreeStuScore tss : children) {
				PersonPlan pp = tss.getPersonPlan();
				if (pp != null && pp.getPnTeacherScore() != null) {
					ret += pp.getPnTeacherScore();
				}
			}
		}
		personPlan = new PersonPlan();
		personPlan.setPnTeacherScore(ret);
	}

}
