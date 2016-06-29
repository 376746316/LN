package com.chinasofti.cetp.study.model;

import java.util.Date;

public class Homework extends HomeworkKey {
    private Integer hwSeq;

    private Integer hwUserNo;

    private Date hwRegtime;

    public Integer getHwSeq() {
        return hwSeq;
    }

    public void setHwSeq(Integer hwSeq) {
        this.hwSeq = hwSeq;
    }

    public Integer getHwUserNo() {
        return hwUserNo;
    }

    public void setHwUserNo(Integer hwUserNo) {
        this.hwUserNo = hwUserNo;
    }

    public Date getHwRegtime() {
        return hwRegtime;
    }

    public void setHwRegtime(Date hwRegtime) {
        this.hwRegtime = hwRegtime;
    }
}