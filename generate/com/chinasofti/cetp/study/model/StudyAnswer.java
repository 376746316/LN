package com.chinasofti.cetp.study.model;

import java.util.Date;

public class StudyAnswer {
    private Integer saAnswerId;

    private Integer saQuestionId;

    private Integer saAnswerUser;

    private String saAnswerRole;

    private String saReplyAttach;

    private Date saReplyTime;

    private Integer saPump;

    private String saReplyContent;

    public Integer getSaAnswerId() {
        return saAnswerId;
    }

    public void setSaAnswerId(Integer saAnswerId) {
        this.saAnswerId = saAnswerId;
    }

    public Integer getSaQuestionId() {
        return saQuestionId;
    }

    public void setSaQuestionId(Integer saQuestionId) {
        this.saQuestionId = saQuestionId;
    }

    public Integer getSaAnswerUser() {
        return saAnswerUser;
    }

    public void setSaAnswerUser(Integer saAnswerUser) {
        this.saAnswerUser = saAnswerUser;
    }

    public String getSaAnswerRole() {
        return saAnswerRole;
    }

    public void setSaAnswerRole(String saAnswerRole) {
        this.saAnswerRole = saAnswerRole == null ? null : saAnswerRole.trim();
    }

    public String getSaReplyAttach() {
        return saReplyAttach;
    }

    public void setSaReplyAttach(String saReplyAttach) {
        this.saReplyAttach = saReplyAttach == null ? null : saReplyAttach.trim();
    }

    public Date getSaReplyTime() {
        return saReplyTime;
    }

    public void setSaReplyTime(Date saReplyTime) {
        this.saReplyTime = saReplyTime;
    }

    public Integer getSaPump() {
        return saPump;
    }

    public void setSaPump(Integer saPump) {
        this.saPump = saPump;
    }

    public String getSaReplyContent() {
        return saReplyContent;
    }

    public void setSaReplyContent(String saReplyContent) {
        this.saReplyContent = saReplyContent == null ? null : saReplyContent.trim();
    }
}