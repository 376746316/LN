package com.chinasofti.cetp.resource.model;

public class ReferenceWithBLOBs extends Reference {
    private String refPlayUrl;

    private String refDownloadUrl;

    private String refThumb;

    public String getRefPlayUrl() {
        return refPlayUrl;
    }

    public void setRefPlayUrl(String refPlayUrl) {
        this.refPlayUrl = refPlayUrl == null ? null : refPlayUrl.trim();
    }

    public String getRefDownloadUrl() {
        return refDownloadUrl;
    }

    public void setRefDownloadUrl(String refDownloadUrl) {
        this.refDownloadUrl = refDownloadUrl == null ? null : refDownloadUrl.trim();
    }

    public String getRefThumb() {
        return refThumb;
    }

    public void setRefThumb(String refThumb) {
        this.refThumb = refThumb == null ? null : refThumb.trim();
    }
}