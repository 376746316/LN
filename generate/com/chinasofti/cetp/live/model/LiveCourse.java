package com.chinasofti.cetp.live.model;

import java.util.Date;

public class LiveCourse {
    private Integer liveCourseId;

    private Integer liveCourseChapId;

    private String liveCourseTitle;

    private Date liveCourseStart;

    private Date liveCourseEnd;

    private Integer liveCourseTime;

    private String liveCourseStatus;

    private String liveCourseIntro;
    

	public Integer getLiveCourseId() {
        return liveCourseId;
    }

    public void setLiveCourseId(Integer liveCourseId) {
        this.liveCourseId = liveCourseId;
    }

    public Integer getLiveCourseChapId() {
        return liveCourseChapId;
    }

    public void setLiveCourseChapId(Integer liveCourseChapId) {
        this.liveCourseChapId = liveCourseChapId;
    }

    public String getLiveCourseTitle() {
        return liveCourseTitle;
    }

    public void setLiveCourseTitle(String liveCourseTitle) {
        this.liveCourseTitle = liveCourseTitle == null ? null : liveCourseTitle.trim();
    }

    public Date getLiveCourseStart() {
        return liveCourseStart;
    }

    public void setLiveCourseStart(Date liveCourseStart) {
        this.liveCourseStart = liveCourseStart;
    }

    public Date getLiveCourseEnd() {
        return liveCourseEnd;
    }

    public void setLiveCourseEnd(Date liveCourseEnd) {
        this.liveCourseEnd = liveCourseEnd;
    }

    public Integer getLiveCourseTime() {
        return liveCourseTime;
    }

    public void setLiveCourseTime(Integer liveCourseTime) {
        this.liveCourseTime = liveCourseTime;
    }

    public String getLiveCourseStatus() {
        return liveCourseStatus;
    }

    public void setLiveCourseStatus(String liveCourseStatus) {
        this.liveCourseStatus = liveCourseStatus == null ? null : liveCourseStatus.trim();
    }

    public String getLiveCourseIntro() {
        return liveCourseIntro;
    }

    public void setLiveCourseIntro(String liveCourseIntro) {
        this.liveCourseIntro = liveCourseIntro == null ? null : liveCourseIntro.trim();
    }
}