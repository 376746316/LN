package com.chinasofti.cetp.resource.model;

import java.util.Date;

public class Comment {
    private Long coId;

    private Integer coVideo;

    private Integer coTeacher;

    private Integer coContent;

    private Integer coTotal;

    private Integer coStuNo;

    private String coComment;

    private Date coRegtime;

    public Long getCoId() {
        return coId;
    }

    public void setCoId(Long coId) {
        this.coId = coId;
    }

    public Integer getCoVideo() {
        return coVideo;
    }

    public void setCoVideo(Integer coVideo) {
        this.coVideo = coVideo;
    }

    public Integer getCoTeacher() {
        return coTeacher;
    }

    public void setCoTeacher(Integer coTeacher) {
        this.coTeacher = coTeacher;
    }

    public Integer getCoContent() {
        return coContent;
    }

    public void setCoContent(Integer coContent) {
        this.coContent = coContent;
    }

    public Integer getCoTotal() {
        return coTotal;
    }

    public void setCoTotal(Integer coTotal) {
        this.coTotal = coTotal;
    }

    public Integer getCoStuNo() {
        return coStuNo;
    }

    public void setCoStuNo(Integer coStuNo) {
        this.coStuNo = coStuNo;
    }

    public String getCoComment() {
        return coComment;
    }

    public void setCoComment(String coComment) {
        this.coComment = coComment == null ? null : coComment.trim();
    }

    public Date getCoRegtime() {
        return coRegtime;
    }

    public void setCoRegtime(Date coRegtime) {
        this.coRegtime = coRegtime;
    }
}