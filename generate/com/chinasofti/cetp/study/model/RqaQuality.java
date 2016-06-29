package com.chinasofti.cetp.study.model;

public class RqaQuality {
    private Integer rqId;

    private String rqText;

    private Double rqPercent;

    public Integer getRqId() {
        return rqId;
    }

    public void setRqId(Integer rqId) {
        this.rqId = rqId;
    }

    public String getRqText() {
        return rqText;
    }

    public void setRqText(String rqText) {
        this.rqText = rqText == null ? null : rqText.trim();
    }

    public Double getRqPercent() {
        return rqPercent;
    }

    public void setRqPercent(Double rqPercent) {
        this.rqPercent = rqPercent;
    }
}