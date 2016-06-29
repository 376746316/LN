package com.chinasofti.cetp.live.model;

import java.util.Date;

public class LiveQuestion {
    private Integer lqQuestionId;

    private Integer lqLiveId;

    private Integer lqStuId;

    private String lqTitle;

    private String lqKeyword;

    private Integer lqTypeId;

    private String lqEmergency;

    private Date lqQueTime;

    private String lqStatus;

    private Integer lqBestAnswer;

    private String lqContent;

    public Integer getLqQuestionId() {
        return lqQuestionId;
    }

    public void setLqQuestionId(Integer lqQuestionId) {
        this.lqQuestionId = lqQuestionId;
    }

    public Integer getLqLiveId() {
        return lqLiveId;
    }

    public void setLqLiveId(Integer lqLiveId) {
        this.lqLiveId = lqLiveId;
    }

    public Integer getLqStuId() {
        return lqStuId;
    }

    public void setLqStuId(Integer lqStuId) {
        this.lqStuId = lqStuId;
    }

    public String getLqTitle() {
        return lqTitle;
    }

    public void setLqTitle(String lqTitle) {
        this.lqTitle = lqTitle == null ? null : lqTitle.trim();
    }

    public String getLqKeyword() {
        return lqKeyword;
    }

    public void setLqKeyword(String lqKeyword) {
        this.lqKeyword = lqKeyword == null ? null : lqKeyword.trim();
    }

    public Integer getLqTypeId() {
        return lqTypeId;
    }

    public void setLqTypeId(Integer lqTypeId) {
        this.lqTypeId = lqTypeId;
    }

    public String getLqEmergency() {
        return lqEmergency;
    }

    public void setLqEmergency(String lqEmergency) {
        this.lqEmergency = lqEmergency == null ? null : lqEmergency.trim();
    }

    public Date getLqQueTime() {
        return lqQueTime;
    }

    public void setLqQueTime(Date lqQueTime) {
        this.lqQueTime = lqQueTime;
    }

    public String getLqStatus() {
        return lqStatus;
    }

    public void setLqStatus(String lqStatus) {
        this.lqStatus = lqStatus == null ? null : lqStatus.trim();
    }

    public Integer getLqBestAnswer() {
        return lqBestAnswer;
    }

    public void setLqBestAnswer(Integer lqBestAnswer) {
        this.lqBestAnswer = lqBestAnswer;
    }

    public String getLqContent() {
        return lqContent;
    }

    public void setLqContent(String lqContent) {
        this.lqContent = lqContent == null ? null : lqContent.trim();
    }
}