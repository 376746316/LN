package com.chinasofti.cetp.admin.model;

import java.util.Date;

public class Certificate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_certificate.CERT_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private Integer certId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_certificate.STU_NO
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private Integer stuNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_certificate.CERT_NAME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private String certName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_certificate.CERT_URL
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private String certUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_certificate.CERT_STU_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private Integer certStuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_certificate.CERT_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private Date certRegtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_certificate.CERT_ID
     *
     * @return the value of tp_certificate.CERT_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public Integer getCertId() {
        return certId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_certificate.CERT_ID
     *
     * @param certId the value for tp_certificate.CERT_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setCertId(Integer certId) {
        this.certId = certId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_certificate.STU_NO
     *
     * @return the value of tp_certificate.STU_NO
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public Integer getStuNo() {
        return stuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_certificate.STU_NO
     *
     * @param stuNo the value for tp_certificate.STU_NO
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_certificate.CERT_NAME
     *
     * @return the value of tp_certificate.CERT_NAME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public String getCertName() {
        return certName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_certificate.CERT_NAME
     *
     * @param certName the value for tp_certificate.CERT_NAME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setCertName(String certName) {
        this.certName = certName == null ? null : certName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_certificate.CERT_URL
     *
     * @return the value of tp_certificate.CERT_URL
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public String getCertUrl() {
        return certUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_certificate.CERT_URL
     *
     * @param certUrl the value for tp_certificate.CERT_URL
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setCertUrl(String certUrl) {
        this.certUrl = certUrl == null ? null : certUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_certificate.CERT_STU_ID
     *
     * @return the value of tp_certificate.CERT_STU_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public Integer getCertStuId() {
        return certStuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_certificate.CERT_STU_ID
     *
     * @param certStuId the value for tp_certificate.CERT_STU_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setCertStuId(Integer certStuId) {
        this.certStuId = certStuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_certificate.CERT_REGTIME
     *
     * @return the value of tp_certificate.CERT_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public Date getCertRegtime() {
        return certRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_certificate.CERT_REGTIME
     *
     * @param certRegtime the value for tp_certificate.CERT_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setCertRegtime(Date certRegtime) {
        this.certRegtime = certRegtime;
    }
}