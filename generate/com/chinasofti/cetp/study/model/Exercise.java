package com.chinasofti.cetp.study.model;

import java.util.Date;

public class Exercise {
    private Integer exerId;

    private String exerTitle;

    private Integer exerTypeId;

    private String exerKeywords;

    private String exerDiffcult;

    private Integer exerSuggestTime;

    private Integer exerScore;

    private String exerAttachRes;

    private String exerAttachAnswer;

    private Integer exerUserNo;

    private Date exerRegtime;

    public Integer getExerId() {
        return exerId;
    }

    public void setExerId(Integer exerId) {
        this.exerId = exerId;
    }

    public String getExerTitle() {
        return exerTitle;
    }

    public void setExerTitle(String exerTitle) {
        this.exerTitle = exerTitle == null ? null : exerTitle.trim();
    }

    public Integer getExerTypeId() {
        return exerTypeId;
    }

    public void setExerTypeId(Integer exerTypeId) {
        this.exerTypeId = exerTypeId;
    }

    public String getExerKeywords() {
        return exerKeywords;
    }

    public void setExerKeywords(String exerKeywords) {
        this.exerKeywords = exerKeywords == null ? null : exerKeywords.trim();
    }

    public String getExerDiffcult() {
        return exerDiffcult;
    }

    public void setExerDiffcult(String exerDiffcult) {
        this.exerDiffcult = exerDiffcult == null ? null : exerDiffcult.trim();
    }

    public Integer getExerSuggestTime() {
        return exerSuggestTime;
    }

    public void setExerSuggestTime(Integer exerSuggestTime) {
        this.exerSuggestTime = exerSuggestTime;
    }

    public Integer getExerScore() {
        return exerScore;
    }

    public void setExerScore(Integer exerScore) {
        this.exerScore = exerScore;
    }

    public String getExerAttachRes() {
        return exerAttachRes;
    }

    public void setExerAttachRes(String exerAttachRes) {
        this.exerAttachRes = exerAttachRes == null ? null : exerAttachRes.trim();
    }

    public String getExerAttachAnswer() {
        return exerAttachAnswer;
    }

    public void setExerAttachAnswer(String exerAttachAnswer) {
        this.exerAttachAnswer = exerAttachAnswer == null ? null : exerAttachAnswer.trim();
    }

    public Integer getExerUserNo() {
        return exerUserNo;
    }

    public void setExerUserNo(Integer exerUserNo) {
        this.exerUserNo = exerUserNo;
    }

    public Date getExerRegtime() {
        return exerRegtime;
    }

    public void setExerRegtime(Date exerRegtime) {
        this.exerRegtime = exerRegtime;
    }
}