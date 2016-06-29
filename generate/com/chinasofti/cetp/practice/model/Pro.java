package com.chinasofti.cetp.practice.model;

import java.util.Date;

public class Pro {
    private Integer proId;

    private String proName;

    private String proStyle;

    private Integer proTypeId;

    private String proIsTeam;

    private String proDomain;

    private String proLanguage;

    private Integer proTime;

    private String proTimeSuffix;

    private String proDiffcult;

    private Integer proPersonNum;

    private String proOwnerFlag;

    private String proKryword;

    private String proPreCond;

    private String proTech;

    private Integer proUserNo;

    private Date proRegtime;

    private Integer proCost;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProStyle() {
        return proStyle;
    }

    public void setProStyle(String proStyle) {
        this.proStyle = proStyle == null ? null : proStyle.trim();
    }

    public Integer getProTypeId() {
        return proTypeId;
    }

    public void setProTypeId(Integer proTypeId) {
        this.proTypeId = proTypeId;
    }

    public String getProIsTeam() {
        return proIsTeam;
    }

    public void setProIsTeam(String proIsTeam) {
        this.proIsTeam = proIsTeam == null ? null : proIsTeam.trim();
    }

    public String getProDomain() {
        return proDomain;
    }

    public void setProDomain(String proDomain) {
        this.proDomain = proDomain == null ? null : proDomain.trim();
    }

    public String getProLanguage() {
        return proLanguage;
    }

    public void setProLanguage(String proLanguage) {
        this.proLanguage = proLanguage == null ? null : proLanguage.trim();
    }

    public Integer getProTime() {
        return proTime;
    }

    public void setProTime(Integer proTime) {
        this.proTime = proTime;
    }

    public String getProTimeSuffix() {
        return proTimeSuffix;
    }

    public void setProTimeSuffix(String proTimeSuffix) {
        this.proTimeSuffix = proTimeSuffix == null ? null : proTimeSuffix.trim();
    }

    public String getProDiffcult() {
        return proDiffcult;
    }

    public void setProDiffcult(String proDiffcult) {
        this.proDiffcult = proDiffcult == null ? null : proDiffcult.trim();
    }

    public Integer getProPersonNum() {
        return proPersonNum;
    }

    public void setProPersonNum(Integer proPersonNum) {
        this.proPersonNum = proPersonNum;
    }

    public String getProOwnerFlag() {
        return proOwnerFlag;
    }

    public void setProOwnerFlag(String proOwnerFlag) {
        this.proOwnerFlag = proOwnerFlag == null ? null : proOwnerFlag.trim();
    }

    public String getProKryword() {
        return proKryword;
    }

    public void setProKryword(String proKryword) {
        this.proKryword = proKryword == null ? null : proKryword.trim();
    }

    public String getProPreCond() {
        return proPreCond;
    }

    public void setProPreCond(String proPreCond) {
        this.proPreCond = proPreCond == null ? null : proPreCond.trim();
    }

    public String getProTech() {
        return proTech;
    }

    public void setProTech(String proTech) {
        this.proTech = proTech == null ? null : proTech.trim();
    }

    public Integer getProUserNo() {
        return proUserNo;
    }

    public void setProUserNo(Integer proUserNo) {
        this.proUserNo = proUserNo;
    }

    public Date getProRegtime() {
        return proRegtime;
    }

    public void setProRegtime(Date proRegtime) {
        this.proRegtime = proRegtime;
    }

    public Integer getProCost() {
        return proCost;
    }

    public void setProCost(Integer proCost) {
        this.proCost = proCost;
    }
}