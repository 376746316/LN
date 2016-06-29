package com.chinasofti.cetp.practice.model;

import java.util.Date;

public class PersonPlan {
    private Integer pnPlanId;

    private Integer pnStuNo;

    private Integer pnTaskId;

    private Integer pnSuggestTime;

    private String pnSuggestTimeSuffix;

    private Integer pnPlanTime;

    private String pnPlanTimeSuffix;

    private Date pnPlanStartTime;

    private Date pnPlanEndTime;

    private Date pnRealStartTime;

    private Date pnRealEndTime;

    private Integer pnRealTime;

    private String pnStatus;

    private String pnResult;

    private Date pnCommitTime;

    private Double pnFinishPercent;

    private Integer pnTeacherId;

    private Integer pnTeacherScore;

    private String pnTeacherReason;

    private Date pnTeacherTime;

    private Date plRegtime;

    public Integer getPnPlanId() {
        return pnPlanId;
    }

    public void setPnPlanId(Integer pnPlanId) {
        this.pnPlanId = pnPlanId;
    }

    public Integer getPnStuNo() {
        return pnStuNo;
    }

    public void setPnStuNo(Integer pnStuNo) {
        this.pnStuNo = pnStuNo;
    }

    public Integer getPnTaskId() {
        return pnTaskId;
    }

    public void setPnTaskId(Integer pnTaskId) {
        this.pnTaskId = pnTaskId;
    }

    public Integer getPnSuggestTime() {
        return pnSuggestTime;
    }

    public void setPnSuggestTime(Integer pnSuggestTime) {
        this.pnSuggestTime = pnSuggestTime;
    }

    public String getPnSuggestTimeSuffix() {
        return pnSuggestTimeSuffix;
    }

    public void setPnSuggestTimeSuffix(String pnSuggestTimeSuffix) {
        this.pnSuggestTimeSuffix = pnSuggestTimeSuffix == null ? null : pnSuggestTimeSuffix.trim();
    }

    public Integer getPnPlanTime() {
        return pnPlanTime;
    }

    public void setPnPlanTime(Integer pnPlanTime) {
        this.pnPlanTime = pnPlanTime;
    }

    public String getPnPlanTimeSuffix() {
        return pnPlanTimeSuffix;
    }

    public void setPnPlanTimeSuffix(String pnPlanTimeSuffix) {
        this.pnPlanTimeSuffix = pnPlanTimeSuffix == null ? null : pnPlanTimeSuffix.trim();
    }

    public Date getPnPlanStartTime() {
        return pnPlanStartTime;
    }

    public void setPnPlanStartTime(Date pnPlanStartTime) {
        this.pnPlanStartTime = pnPlanStartTime;
    }

    public Date getPnPlanEndTime() {
        return pnPlanEndTime;
    }

    public void setPnPlanEndTime(Date pnPlanEndTime) {
        this.pnPlanEndTime = pnPlanEndTime;
    }

    public Date getPnRealStartTime() {
        return pnRealStartTime;
    }

    public void setPnRealStartTime(Date pnRealStartTime) {
        this.pnRealStartTime = pnRealStartTime;
    }

    public Date getPnRealEndTime() {
        return pnRealEndTime;
    }

    public void setPnRealEndTime(Date pnRealEndTime) {
        this.pnRealEndTime = pnRealEndTime;
    }

    public Integer getPnRealTime() {
        return pnRealTime;
    }

    public void setPnRealTime(Integer pnRealTime) {
        this.pnRealTime = pnRealTime;
    }

    public String getPnStatus() {
        return pnStatus;
    }

    public void setPnStatus(String pnStatus) {
        this.pnStatus = pnStatus == null ? null : pnStatus.trim();
    }

    public String getPnResult() {
        return pnResult;
    }

    public void setPnResult(String pnResult) {
        this.pnResult = pnResult == null ? null : pnResult.trim();
    }

    public Date getPnCommitTime() {
        return pnCommitTime;
    }

    public void setPnCommitTime(Date pnCommitTime) {
        this.pnCommitTime = pnCommitTime;
    }

    public Double getPnFinishPercent() {
        return pnFinishPercent;
    }

    public void setPnFinishPercent(Double pnFinishPercent) {
        this.pnFinishPercent = pnFinishPercent;
    }

    public Integer getPnTeacherId() {
        return pnTeacherId;
    }

    public void setPnTeacherId(Integer pnTeacherId) {
        this.pnTeacherId = pnTeacherId;
    }

    public Integer getPnTeacherScore() {
        return pnTeacherScore;
    }

    public void setPnTeacherScore(Integer pnTeacherScore) {
        this.pnTeacherScore = pnTeacherScore;
    }

    public String getPnTeacherReason() {
        return pnTeacherReason;
    }

    public void setPnTeacherReason(String pnTeacherReason) {
        this.pnTeacherReason = pnTeacherReason == null ? null : pnTeacherReason.trim();
    }

    public Date getPnTeacherTime() {
        return pnTeacherTime;
    }

    public void setPnTeacherTime(Date pnTeacherTime) {
        this.pnTeacherTime = pnTeacherTime;
    }

    public Date getPlRegtime() {
        return plRegtime;
    }

    public void setPlRegtime(Date plRegtime) {
        this.plRegtime = plRegtime;
    }
}