package com.chinasofti.cetp.study.model;

import java.util.Date;

public class SpecStu extends SpecStuKey {
    private String suStatus;

    private Integer suCourseProgress;

    private Integer suHwProgress;

    private Integer suExamProgress;

    private Integer suProgress;

    private Long suStudyTime;

    private Date suRegtime;

    public String getSuStatus() {
        return suStatus;
    }

    public void setSuStatus(String suStatus) {
        this.suStatus = suStatus == null ? null : suStatus.trim();
    }

    public Integer getSuCourseProgress() {
        return suCourseProgress;
    }

    public void setSuCourseProgress(Integer suCourseProgress) {
        this.suCourseProgress = suCourseProgress;
    }

    public Integer getSuHwProgress() {
        return suHwProgress;
    }

    public void setSuHwProgress(Integer suHwProgress) {
        this.suHwProgress = suHwProgress;
    }

    public Integer getSuExamProgress() {
        return suExamProgress;
    }

    public void setSuExamProgress(Integer suExamProgress) {
        this.suExamProgress = suExamProgress;
    }

    public Integer getSuProgress() {
        return suProgress;
    }

    public void setSuProgress(Integer suProgress) {
        this.suProgress = suProgress;
    }

    public Long getSuStudyTime() {
        return suStudyTime;
    }

    public void setSuStudyTime(Long suStudyTime) {
        this.suStudyTime = suStudyTime;
    }

    public Date getSuRegtime() {
        return suRegtime;
    }

    public void setSuRegtime(Date suRegtime) {
        this.suRegtime = suRegtime;
    }
}