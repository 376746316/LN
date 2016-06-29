package com.chinasofti.cetp.study.model;

import com.chinasofti.cetp.admin.model.StudentWithBLOBs;

public class MoreStuForHwScore extends StudentWithBLOBs {

	private Integer hwScore;

	public Integer getHwScore() {
    	return hwScore;
    }

	public void setHwScore(Integer hwScore) {
    	this.hwScore = hwScore;
    }
}
