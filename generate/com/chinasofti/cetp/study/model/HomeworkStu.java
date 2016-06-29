package com.chinasofti.cetp.study.model;

import java.util.Date;

public class HomeworkStu extends HomeworkStuKey {
    private String hsStatus;

    private String hsTextAnswer;

    private String hsAttachAnswer;

    private Date hsCommitTime;

    private Integer hsScore;

    private Integer hsTeacherId;

    private String hsCheckFlag;

    private Date hsCheckTime;

    public String getHsStatus() {
        return hsStatus;
    }

    public void setHsStatus(String hsStatus) {
        this.hsStatus = hsStatus == null ? null : hsStatus.trim();
    }

    public String getHsTextAnswer() {
        return hsTextAnswer;
    }

    public void setHsTextAnswer(String hsTextAnswer) {
        this.hsTextAnswer = hsTextAnswer == null ? null : hsTextAnswer.trim();
    }

    public String getHsAttachAnswer() {
        return hsAttachAnswer;
    }

    public void setHsAttachAnswer(String hsAttachAnswer) {
        this.hsAttachAnswer = hsAttachAnswer == null ? null : hsAttachAnswer.trim();
    }

    public Date getHsCommitTime() {
        return hsCommitTime;
    }

    public void setHsCommitTime(Date hsCommitTime) {
        this.hsCommitTime = hsCommitTime;
    }

    public Integer getHsScore() {
        return hsScore;
    }

    public void setHsScore(Integer hsScore) {
        this.hsScore = hsScore;
    }

    public Integer getHsTeacherId() {
        return hsTeacherId;
    }

    public void setHsTeacherId(Integer hsTeacherId) {
        this.hsTeacherId = hsTeacherId;
    }

    public String getHsCheckFlag() {
        return hsCheckFlag;
    }

    public void setHsCheckFlag(String hsCheckFlag) {
        this.hsCheckFlag = hsCheckFlag == null ? null : hsCheckFlag.trim();
    }

    public Date getHsCheckTime() {
        return hsCheckTime;
    }

    public void setHsCheckTime(Date hsCheckTime) {
        this.hsCheckTime = hsCheckTime;
    }
}