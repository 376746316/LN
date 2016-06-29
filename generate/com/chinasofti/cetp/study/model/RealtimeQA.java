package com.chinasofti.cetp.study.model;

import java.util.Date;

public class RealtimeQA {
	private Long rqaId;

	private Integer rqaStuNo;

	private Integer rqaUserNo;

	private Integer rqaTypeId;

	private String rqaTitle;

	private String rqaStatus;

	private Date rqaStartTime;

	private Date rqaEndTime;

	private String rqaQuality;

	private Date rqaRegtime;

	private String rqaChargemode;

    private Integer rqaPercentage;
    private Double rqaMoney;
    private Double rqaUnialence;
    private Integer rqaPeriodictity;
    private Integer rqaDuration;
    private Integer rqaCycletime;
	public Long getRqaId() {
		return rqaId;
	}

	public void setRqaId(Long rqaId) {
		this.rqaId = rqaId;
	}

	public Integer getRqaStuNo() {
		return rqaStuNo;
	}

	public void setRqaStuNo(Integer rqaStuNo) {
		this.rqaStuNo = rqaStuNo;
	}

	public Integer getRqaUserNo() {
		return rqaUserNo;
	}

	public void setRqaUserNo(Integer rqaUserNo) {
		this.rqaUserNo = rqaUserNo;
	}

	public Integer getRqaTypeId() {
		return rqaTypeId;
	}

	public void setRqaTypeId(Integer rqaTypeId) {
		this.rqaTypeId = rqaTypeId;
	}

	public String getRqaTitle() {
		return rqaTitle;
	}

	public void setRqaTitle(String rqaTitle) {
		this.rqaTitle = rqaTitle == null ? null : rqaTitle.trim();
	}

	public String getRqaStatus() {
		return rqaStatus;
	}

	public void setRqaStatus(String rqaStatus) {
		this.rqaStatus = rqaStatus == null ? null : rqaStatus.trim();
	}

	public Date getRqaStartTime() {
		return rqaStartTime;
	}

	public void setRqaStartTime(Date rqaStartTime) {
		this.rqaStartTime = rqaStartTime;
	}

	public Date getRqaEndTime() {
		return rqaEndTime;
	}

	public void setRqaEndTime(Date rqaEndTime) {
		this.rqaEndTime = rqaEndTime;
	}

	public String getRqaQuality() {
		return rqaQuality;
	}

	public void setRqaQuality(String rqaQuality) {
		this.rqaQuality = rqaQuality == null ? null : rqaQuality.trim();
	}

	public Date getRqaRegtime() {
		return rqaRegtime;
	}

	public void setRqaRegtime(Date rqaRegtime) {
		this.rqaRegtime = rqaRegtime;
	}

	public String getRqaChargemode() {
		return rqaChargemode;
	}

	public void setRqaChargemode(String rqaChargemode) {
		this.rqaChargemode = rqaChargemode == null ? null : rqaChargemode.trim();
	}
    public Integer getRqaPercentage() {
        return rqaPercentage;
    }
    public void setRqaPercentage(Integer rqaPercentage) {
        this.rqaPercentage = rqaPercentage;
    }
    public Double getRqaMoney() {
        return rqaMoney;
    }
    public void setRqaMoney(Double rqaMoney) {
        this.rqaMoney = rqaMoney;
    }
    public Double getRqaUnialence() {
        return rqaUnialence;
    }
    public void setRqaUnialence(Double rqaUnialence) {
        this.rqaUnialence = rqaUnialence;
    }
    public Integer getRqaPeriodictity() {
        return rqaPeriodictity;
    }
    public void setRqaPeriodictity(Integer rqaPeriodictity) {
        this.rqaPeriodictity = rqaPeriodictity;
    }
    public Integer getRqaDuration() {
        return rqaDuration;
    }
    public void setRqaDuration(Integer rqaDuration) {
        this.rqaDuration = rqaDuration;
    }
    public Integer getRqaCycletime() {
        return rqaCycletime;
    }
    public void setRqaCycletime(Integer rqaCycletime) {
        this.rqaCycletime = rqaCycletime;
    }
}