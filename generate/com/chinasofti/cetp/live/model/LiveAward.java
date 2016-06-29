package com.chinasofti.cetp.live.model;

import java.util.Date;

public class LiveAward {
    private Integer awardId;

    private Integer awardLiveclassId;

    private String awardFlag;

    private Integer awardPrice;

    private Integer awardCount;

    private Date awardStartTime;

    private Date awardEndTime;

    public Integer getAwardId() {
        return awardId;
    }

    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    public Integer getAwardLiveclassId() {
        return awardLiveclassId;
    }

    public void setAwardLiveclassId(Integer awardLiveclassId) {
        this.awardLiveclassId = awardLiveclassId;
    }

    public String getAwardFlag() {
        return awardFlag;
    }

    public void setAwardFlag(String awardFlag) {
        this.awardFlag = awardFlag == null ? null : awardFlag.trim();
    }

    public Integer getAwardPrice() {
        return awardPrice;
    }

    public void setAwardPrice(Integer awardPrice) {
        this.awardPrice = awardPrice;
    }

    public Integer getAwardCount() {
        return awardCount;
    }

    public void setAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
    }

    public Date getAwardStartTime() {
        return awardStartTime;
    }

    public void setAwardStartTime(Date awardStartTime) {
        this.awardStartTime = awardStartTime;
    }

    public Date getAwardEndTime() {
        return awardEndTime;
    }

    public void setAwardEndTime(Date awardEndTime) {
        this.awardEndTime = awardEndTime;
    }
}