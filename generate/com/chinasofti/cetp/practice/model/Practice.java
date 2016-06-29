package com.chinasofti.cetp.practice.model;

import java.util.Date;

public class Practice {
    private Integer pracId;

    private String pracName;

    private String pracIntro;

    private String pracType;

    private String pracIsTeam;

    private Date pracStartDate;

    private Date pracEndDate;

    private Double pracSoftPercent;

    private Double pracTeamPercent;

    private Integer pracCost;

    private Integer pracTechType;

    private Integer pracTeacher;

    private String pracStatus;

    private Integer pracUserNo;

    private Integer pracStuNo;

    private Date pracRegtime;

    public Integer getPracId() {
        return pracId;
    }

    public void setPracId(Integer pracId) {
        this.pracId = pracId;
    }

    public String getPracName() {
        return pracName;
    }

    public void setPracName(String pracName) {
        this.pracName = pracName == null ? null : pracName.trim();
    }

    public String getPracIntro() {
        return pracIntro;
    }

    public void setPracIntro(String pracIntro) {
        this.pracIntro = pracIntro == null ? null : pracIntro.trim();
    }

    public String getPracType() {
        return pracType;
    }

    public void setPracType(String pracType) {
        this.pracType = pracType == null ? null : pracType.trim();
    }

    public String getPracIsTeam() {
        return pracIsTeam;
    }

    public void setPracIsTeam(String pracIsTeam) {
        this.pracIsTeam = pracIsTeam == null ? null : pracIsTeam.trim();
    }

    public Date getPracStartDate() {
        return pracStartDate;
    }

    public void setPracStartDate(Date pracStartDate) {
        this.pracStartDate = pracStartDate;
    }

    public Date getPracEndDate() {
        return pracEndDate;
    }

    public void setPracEndDate(Date pracEndDate) {
        this.pracEndDate = pracEndDate;
    }

    public Double getPracSoftPercent() {
        return pracSoftPercent;
    }

    public void setPracSoftPercent(Double pracSoftPercent) {
        this.pracSoftPercent = pracSoftPercent;
    }

    public Double getPracTeamPercent() {
        return pracTeamPercent;
    }

    public void setPracTeamPercent(Double pracTeamPercent) {
        this.pracTeamPercent = pracTeamPercent;
    }

    public Integer getPracCost() {
        return pracCost;
    }

    public void setPracCost(Integer pracCost) {
        this.pracCost = pracCost;
    }

    public Integer getPracTechType() {
        return pracTechType;
    }

    public void setPracTechType(Integer pracTechType) {
        this.pracTechType = pracTechType;
    }

    public Integer getPracTeacher() {
        return pracTeacher;
    }

    public void setPracTeacher(Integer pracTeacher) {
        this.pracTeacher = pracTeacher;
    }

    public String getPracStatus() {
        return pracStatus;
    }

    public void setPracStatus(String pracStatus) {
        this.pracStatus = pracStatus == null ? null : pracStatus.trim();
    }

    public Integer getPracUserNo() {
        return pracUserNo;
    }

    public void setPracUserNo(Integer pracUserNo) {
        this.pracUserNo = pracUserNo;
    }

    public Integer getPracStuNo() {
        return pracStuNo;
    }

    public void setPracStuNo(Integer pracStuNo) {
        this.pracStuNo = pracStuNo;
    }

    public Date getPracRegtime() {
        return pracRegtime;
    }

    public void setPracRegtime(Date pracRegtime) {
        this.pracRegtime = pracRegtime;
    }
}