package com.chinasofti.cetp.study.model;

import java.util.Date;

public class ChapterStu extends ChapterStuKey {
    private Date ctHwLastTime;

    private Date ctExamLastTime;

    public Date getCtHwLastTime() {
        return ctHwLastTime;
    }

    public void setCtHwLastTime(Date ctHwLastTime) {
        this.ctHwLastTime = ctHwLastTime;
    }

    public Date getCtExamLastTime() {
        return ctExamLastTime;
    }

    public void setCtExamLastTime(Date ctExamLastTime) {
        this.ctExamLastTime = ctExamLastTime;
    }
}