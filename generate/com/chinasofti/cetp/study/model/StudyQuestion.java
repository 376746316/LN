package com.chinasofti.cetp.study.model;

import java.util.Date;

public class StudyQuestion {
    private Integer sqQuestionId;

    private Integer sqCourseId;

    private Integer sqStuId;

    private String sqTitle;

    private String sqKryword;

    private Integer sqTypeId;

    private String sqEmergency;

    private Date sqQueTime;

    private String sqStatus;

    private Integer sqBestAnswer;

    private String sqContent;

    public Integer getSqQuestionId() {
        return sqQuestionId;
    }

    public void setSqQuestionId(Integer sqQuestionId) {
        this.sqQuestionId = sqQuestionId;
    }

    public Integer getSqCourseId() {
        return sqCourseId;
    }

    public void setSqCourseId(Integer sqCourseId) {
        this.sqCourseId = sqCourseId;
    }

    public Integer getSqStuId() {
        return sqStuId;
    }

    public void setSqStuId(Integer sqStuId) {
        this.sqStuId = sqStuId;
    }

    public String getSqTitle() {
        return sqTitle;
    }

    public void setSqTitle(String sqTitle) {
        this.sqTitle = sqTitle == null ? null : sqTitle.trim();
    }

    public String getSqKryword() {
        return sqKryword;
    }

    public void setSqKryword(String sqKryword) {
        this.sqKryword = sqKryword == null ? null : sqKryword.trim();
    }

    public Integer getSqTypeId() {
        return sqTypeId;
    }

    public void setSqTypeId(Integer sqTypeId) {
        this.sqTypeId = sqTypeId;
    }

    public String getSqEmergency() {
        return sqEmergency;
    }

    public void setSqEmergency(String sqEmergency) {
        this.sqEmergency = sqEmergency == null ? null : sqEmergency.trim();
    }

    public Date getSqQueTime() {
        return sqQueTime;
    }

    public void setSqQueTime(Date sqQueTime) {
        this.sqQueTime = sqQueTime;
    }

    public String getSqStatus() {
        return sqStatus;
    }

    public void setSqStatus(String sqStatus) {
        this.sqStatus = sqStatus == null ? null : sqStatus.trim();
    }

    public Integer getSqBestAnswer() {
        return sqBestAnswer;
    }

    public void setSqBestAnswer(Integer sqBestAnswer) {
        this.sqBestAnswer = sqBestAnswer;
    }

    public String getSqContent() {
        return sqContent;
    }

    public void setSqContent(String sqContent) {
        this.sqContent = sqContent == null ? null : sqContent.trim();
    }
}