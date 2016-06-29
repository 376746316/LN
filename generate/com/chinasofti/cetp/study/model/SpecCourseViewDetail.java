package com.chinasofti.cetp.study.model;


import java.util.Date;


import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


public class SpecCourseViewDetail  {

	private int SPEC_ID;  //课程id
	private String SPEC_NAME;  //课程名字
	private String SPEC_TIME;//所有课时
	private String SPEC_INTRO; //课程介绍
	private String USER_NAME; //教师名字
	private String USER_INTRO;//教师简介
	private String USER_HEAD;//教师头像
	private String ORG_NAME;//教师所属组织名
	private String SPEC_APP_CROWD;//课程使用人群
	private String SPEC_THUMB;//课程缩略图
	private Integer SPEC_COST;//课程费用
	private Integer SPEC_TYPE_ID;//技术分类
	private String SPEC_STATUS;
	private String SPEC_TIP_MSG;
	

	public String getSPEC_STATUS() {
    	return SPEC_STATUS;
    }

	public void setSPEC_STATUS(String sPEC_STATUS) {
    	SPEC_STATUS = sPEC_STATUS;
    }

	public String getSPEC_TIP_MSG() {
    	return SPEC_TIP_MSG;
    }

	public void setSPEC_TIP_MSG(String sPEC_TIP_MSG) {
    	SPEC_TIP_MSG = sPEC_TIP_MSG;
    }

	public Integer getSPEC_TYPE_ID() {
		return SPEC_TYPE_ID;
	}

	public void setSPEC_TYPE_ID(Integer sPEC_TYPE_ID) {
		SPEC_TYPE_ID = sPEC_TYPE_ID;
	}

	public int getSPEC_ID() {
		return SPEC_ID;
	}

	public void setSPEC_ID(int sPEC_ID) {
		SPEC_ID = sPEC_ID;
	}

	public String getSPEC_NAME() {
		return SPEC_NAME;
	}

	public void setSPEC_NAME(String sPEC_NAME) {
		SPEC_NAME = sPEC_NAME;
	}

	public String getSPEC_TIME() {
		return SPEC_TIME;
	}

	public void setSPEC_TIME(String sPEC_TIME) {
		SPEC_TIME = sPEC_TIME;
	}

	public String getSPEC_INTRO() {
		return SPEC_INTRO;
	}

	public void setSPEC_INTRO(String sPEC_INTRO) {
		SPEC_INTRO = sPEC_INTRO;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}

	public String getUSER_INTRO() {
		return USER_INTRO;
	}

	public void setUSER_INTRO(String uSER_INTRO) {
		USER_INTRO = uSER_INTRO;
	}

	public String getUSER_HEAD() {
		return USER_HEAD;
	}

	public void setUSER_HEAD(String uSER_HEAD) {
		USER_HEAD = uSER_HEAD;
	}

	public String getORG_NAME() {
		return ORG_NAME;
	}

	public void setORG_NAME(String oRG_NAME) {
		ORG_NAME = oRG_NAME;
	}

	public String getSPEC_APP_CROWD() {
		return SPEC_APP_CROWD;
	}

	public void setSPEC_APP_CROWD(String sPEC_APP_CROWD) {
		SPEC_APP_CROWD = sPEC_APP_CROWD;
	}

	public String getSPEC_THUMB() {
		return SPEC_THUMB;
	}

	public void setSPEC_THUMB(String sPEC_THUMB) {
		SPEC_THUMB = sPEC_THUMB;
	}

	public Integer getSPEC_COST() {
		return SPEC_COST;
	}

	public void setSPEC_COST(Integer sPEC_COST) {
		SPEC_COST = sPEC_COST;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ReflectionToStringBuilder.toString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
}
