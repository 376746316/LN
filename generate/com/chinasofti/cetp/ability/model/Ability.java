package com.chinasofti.cetp.ability.model;

import java.util.Date;

public class Ability {
    private Integer abiId;

    private String abiName;

    private String abiCode;

    private Integer abiParent;

    private Integer abiLevel;

    private Integer abiSeq;

    private String abiContent;

    private Date abiRegtime;

    public Integer getAbiId() {
        return abiId;
    }

    public void setAbiId(Integer abiId) {
        this.abiId = abiId;
    }

    public String getAbiName() {
        return abiName;
    }

    public void setAbiName(String abiName) {
        this.abiName = abiName == null ? null : abiName.trim();
    }

    public String getAbiCode() {
        return abiCode;
    }

    public void setAbiCode(String abiCode) {
        this.abiCode = abiCode == null ? null : abiCode.trim();
    }

    public Integer getAbiParent() {
        return abiParent;
    }

    public void setAbiParent(Integer abiParent) {
        this.abiParent = abiParent;
    }

    public Integer getAbiLevel() {
        return abiLevel;
    }

    public void setAbiLevel(Integer abiLevel) {
        this.abiLevel = abiLevel;
    }

    public Integer getAbiSeq() {
        return abiSeq;
    }

    public void setAbiSeq(Integer abiSeq) {
        this.abiSeq = abiSeq;
    }

    public String getAbiContent() {
        return abiContent;
    }

    public void setAbiContent(String abiContent) {
        this.abiContent = abiContent == null ? null : abiContent.trim();
    }

    public Date getAbiRegtime() {
        return abiRegtime;
    }

    public void setAbiRegtime(Date abiRegtime) {
        this.abiRegtime = abiRegtime;
    }
}