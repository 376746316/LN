package com.chinasofti.cetp.ability.model;

import java.util.Date;

public class Profession {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_profession.PROF_ID
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    private Integer profId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_profession.PROF_NAME
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    private String profName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_profession.PROF_CONTENT
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    private String profContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_profession.PROF_REGTIME
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    private Date profRegtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_profession.PROF_ID
     *
     * @return the value of tp_profession.PROF_ID
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public Integer getProfId() {
        return profId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_profession.PROF_ID
     *
     * @param profId the value for tp_profession.PROF_ID
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setProfId(Integer profId) {
        this.profId = profId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_profession.PROF_NAME
     *
     * @return the value of tp_profession.PROF_NAME
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public String getProfName() {
        return profName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_profession.PROF_NAME
     *
     * @param profName the value for tp_profession.PROF_NAME
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setProfName(String profName) {
        this.profName = profName == null ? null : profName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_profession.PROF_CONTENT
     *
     * @return the value of tp_profession.PROF_CONTENT
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public String getProfContent() {
        return profContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_profession.PROF_CONTENT
     *
     * @param profContent the value for tp_profession.PROF_CONTENT
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setProfContent(String profContent) {
        this.profContent = profContent == null ? null : profContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_profession.PROF_REGTIME
     *
     * @return the value of tp_profession.PROF_REGTIME
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public Date getProfRegtime() {
        return profRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_profession.PROF_REGTIME
     *
     * @param profRegtime the value for tp_profession.PROF_REGTIME
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setProfRegtime(Date profRegtime) {
        this.profRegtime = profRegtime;
    }
}