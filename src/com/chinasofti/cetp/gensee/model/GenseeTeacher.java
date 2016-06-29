package com.chinasofti.cetp.gensee.model;

import java.util.Date;

public class GenseeTeacher {
    private Integer genseeUserNo;

    private String teacherLoginName;

    private String teacherPassword;

    private String name;

    private String sec;

    private String male;

    private Date stratTime;

    private Date invalidDate;

    private String email;

    private String phone;

    private String mobile;

    public Integer getGenseeUserNo() {
        return genseeUserNo;
    }

    public void setGenseeUserNo(Integer genseeUserNo) {
        this.genseeUserNo = genseeUserNo;
    }

    public String getTeacherLoginName() {
        return teacherLoginName;
    }

    public void setTeacherLoginName(String teacherLoginName) {
        this.teacherLoginName = teacherLoginName == null ? null : teacherLoginName.trim();
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec == null ? null : sec.trim();
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male == null ? null : male.trim();
    }

    public Date getStratTime() {
        return stratTime;
    }

    public void setStratTime(Date stratTime) {
        this.stratTime = stratTime;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}