package com.chinasofti.cetp.admin.model;

import java.util.Date;

public class ScoreRecord {
    private Long srecId;

    private Integer srecRule;

    private Integer srecScore;

    private Integer srecStuNo;

    private Integer srecUserNo;

    private String srecReason;

    private Date srecRegtime;
    
    public Long getSrecId() {
        return srecId;
    }

    public void setSrecId(Long srecId) {
        this.srecId = srecId;
    }

    public Integer getSrecRule() {
        return srecRule;
    }

    public void setSrecRule(Integer srecRule) {
        this.srecRule = srecRule;
    }

    public Integer getSrecScore() {
        return srecScore;
    }

    public void setSrecScore(Integer srecScore) {
        this.srecScore = srecScore;
    }

    public Integer getSrecStuNo() {
        return srecStuNo;
    }

    public void setSrecStuNo(Integer srecStuNo) {
        this.srecStuNo = srecStuNo;
    }

    public Integer getSrecUserNo() {
        return srecUserNo;
    }

    public void setSrecUserNo(Integer srecUserNo) {
        this.srecUserNo = srecUserNo;
    }

    public String getSrecReason() {
        return srecReason;
    }

    public void setSrecReason(String srecReason) {
        this.srecReason = srecReason == null ? null : srecReason.trim();
    }

    public Date getSrecRegtime() {
        return srecRegtime;
    }

    public void setSrecRegtime(Date srecRegtime) {
        this.srecRegtime = srecRegtime;
    }
}