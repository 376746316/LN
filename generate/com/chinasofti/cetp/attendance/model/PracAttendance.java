package com.chinasofti.cetp.attendance.model;

import java.util.Date;

public class PracAttendance {
    private Integer patId;

    private Integer patPracId;

    private Integer patStuId;

    private String patCode;

    private Integer patClassId;

    private Integer patUserNo;

    private Date patRegtime;

    public Integer getPatId() {
        return patId;
    }

    public void setPatId(Integer patId) {
        this.patId = patId;
    }

    public Integer getPatPracId() {
        return patPracId;
    }

    public void setPatPracId(Integer patPracId) {
        this.patPracId = patPracId;
    }

    public Integer getPatStuId() {
        return patStuId;
    }

    public void setPatStuId(Integer patStuId) {
        this.patStuId = patStuId;
    }

    public String getPatCode() {
        return patCode;
    }

    public void setPatCode(String patCode) {
        this.patCode = patCode == null ? null : patCode.trim();
    }

    public Integer getPatClassId() {
        return patClassId;
    }

    public void setPatClassId(Integer patClassId) {
        this.patClassId = patClassId;
    }

    public Integer getPatUserNo() {
        return patUserNo;
    }

    public void setPatUserNo(Integer patUserNo) {
        this.patUserNo = patUserNo;
    }

    public Date getPatRegtime() {
        return patRegtime;
    }

    public void setPatRegtime(Date patRegtime) {
        this.patRegtime = patRegtime;
    }
}