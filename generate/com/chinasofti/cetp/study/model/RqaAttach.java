package com.chinasofti.cetp.study.model;

public class RqaAttach {
    private Long raId;

    private Long raRqaId;

    private String raName;

    private String raUrl;

    public Long getRaId() {
        return raId;
    }

    public void setRaId(Long raId) {
        this.raId = raId;
    }

    public Long getRaRqaId() {
        return raRqaId;
    }

    public void setRaRqaId(Long raRqaId) {
        this.raRqaId = raRqaId;
    }

    public String getRaName() {
        return raName;
    }

    public void setRaName(String raName) {
        this.raName = raName == null ? null : raName.trim();
    }

    public String getRaUrl() {
        return raUrl;
    }

    public void setRaUrl(String raUrl) {
        this.raUrl = raUrl == null ? null : raUrl.trim();
    }
}