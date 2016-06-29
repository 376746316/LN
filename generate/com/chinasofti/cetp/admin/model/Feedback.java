package com.chinasofti.cetp.admin.model;

import java.util.Date;

public class Feedback {
    private Integer fbId;

    private String fbTitle;

    private String fbMail;

    private String fbPhone;

    private String fbAttachment;

    private Date fbRegtime;

    private String fbContent;

    public Integer getFbId() {
        return fbId;
    }

    public void setFbId(Integer fbId) {
        this.fbId = fbId;
    }

    public String getFbTitle() {
        return fbTitle;
    }

    public void setFbTitle(String fbTitle) {
        this.fbTitle = fbTitle == null ? null : fbTitle.trim();
    }

    public String getFbMail() {
        return fbMail;
    }

    public void setFbMail(String fbMail) {
        this.fbMail = fbMail == null ? null : fbMail.trim();
    }

    public String getFbPhone() {
        return fbPhone;
    }

    public void setFbPhone(String fbPhone) {
        this.fbPhone = fbPhone == null ? null : fbPhone.trim();
    }

    public String getFbAttachment() {
        return fbAttachment;
    }

    public void setFbAttachment(String fbAttachment) {
        this.fbAttachment = fbAttachment == null ? null : fbAttachment.trim();
    }

    public Date getFbRegtime() {
        return fbRegtime;
    }

    public void setFbRegtime(Date fbRegtime) {
        this.fbRegtime = fbRegtime;
    }

    public String getFbContent() {
        return fbContent;
    }

    public void setFbContent(String fbContent) {
        this.fbContent = fbContent == null ? null : fbContent.trim();
    }
}