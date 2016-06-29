package com.chinasofti.cetp.study.model;

public class RecommendSpecKey {
    private Integer rsSpecId;

    private String rsType;

    public Integer getRsSpecId() {
        return rsSpecId;
    }

    public void setRsSpecId(Integer rsSpecId) {
        this.rsSpecId = rsSpecId;
    }

    public String getRsType() {
        return rsType;
    }

    public void setRsType(String rsType) {
        this.rsType = rsType == null ? null : rsType.trim();
    }
}