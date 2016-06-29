package com.chinasofti.cetp.admin.model;

import java.util.Date;

public class UserGroup {
    private Integer ugId;

    private Integer ugLevel;

    private String ugName;

    private Integer ugTopscore;

    private Integer ugLowestscore;

    private Integer ugCoin;

    private String ugLiveFlag;

    private String ugDownloadFlag;

    private String ugExchangeFlag;

    private String ugSalonFlag;

    private Date ugRegtime;

    public Integer getUgId() {
        return ugId;
    }

    public void setUgId(Integer ugId) {
        this.ugId = ugId;
    }

    public Integer getUgLevel() {
        return ugLevel;
    }

    public void setUgLevel(Integer ugLevel) {
        this.ugLevel = ugLevel;
    }

    public String getUgName() {
        return ugName;
    }

    public void setUgName(String ugName) {
        this.ugName = ugName == null ? null : ugName.trim();
    }

    public Integer getUgTopscore() {
        return ugTopscore;
    }

    public void setUgTopscore(Integer ugTopscore) {
        this.ugTopscore = ugTopscore;
    }

    public Integer getUgLowestscore() {
        return ugLowestscore;
    }

    public void setUgLowestscore(Integer ugLowestscore) {
        this.ugLowestscore = ugLowestscore;
    }

    public Integer getUgCoin() {
        return ugCoin;
    }

    public void setUgCoin(Integer ugCoin) {
        this.ugCoin = ugCoin;
    }

    public String getUgLiveFlag() {
        return ugLiveFlag;
    }

    public void setUgLiveFlag(String ugLiveFlag) {
        this.ugLiveFlag = ugLiveFlag == null ? null : ugLiveFlag.trim();
    }

    public String getUgDownloadFlag() {
        return ugDownloadFlag;
    }

    public void setUgDownloadFlag(String ugDownloadFlag) {
        this.ugDownloadFlag = ugDownloadFlag == null ? null : ugDownloadFlag.trim();
    }

    public String getUgExchangeFlag() {
        return ugExchangeFlag;
    }

    public void setUgExchangeFlag(String ugExchangeFlag) {
        this.ugExchangeFlag = ugExchangeFlag == null ? null : ugExchangeFlag.trim();
    }

    public String getUgSalonFlag() {
        return ugSalonFlag;
    }

    public void setUgSalonFlag(String ugSalonFlag) {
        this.ugSalonFlag = ugSalonFlag == null ? null : ugSalonFlag.trim();
    }

    public Date getUgRegtime() {
        return ugRegtime;
    }

    public void setUgRegtime(Date ugRegtime) {
        this.ugRegtime = ugRegtime;
    }
}