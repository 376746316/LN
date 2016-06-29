package com.chinasofti.cetp.study.model;

import java.util.Date;

public class Chapter {
    private Integer chapId;

    private Integer chapSeq;

    private Integer chapSpecId;

    private String chapName;

    private Long chapExam;

    private Integer chapUserNo;

    private Date chapRegtime;

    public Integer getChapId() {
        return chapId;
    }

    public void setChapId(Integer chapId) {
        this.chapId = chapId;
    }

    public Integer getChapSeq() {
        return chapSeq;
    }

    public void setChapSeq(Integer chapSeq) {
        this.chapSeq = chapSeq;
    }

    public Integer getChapSpecId() {
        return chapSpecId;
    }

    public void setChapSpecId(Integer chapSpecId) {
        this.chapSpecId = chapSpecId;
    }

    public String getChapName() {
        return chapName;
    }

    public void setChapName(String chapName) {
        this.chapName = chapName == null ? null : chapName.trim();
    }

    public Long getChapExam() {
        return chapExam;
    }

    public void setChapExam(Long chapExam) {
        this.chapExam = chapExam;
    }

    public Integer getChapUserNo() {
        return chapUserNo;
    }

    public void setChapUserNo(Integer chapUserNo) {
        this.chapUserNo = chapUserNo;
    }

    public Date getChapRegtime() {
        return chapRegtime;
    }

    public void setChapRegtime(Date chapRegtime) {
        this.chapRegtime = chapRegtime;
    }
}