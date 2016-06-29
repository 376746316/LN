package com.chinasofti.cetp.admin.model;

import java.util.Date;

public class Url {
	
	private String mdName;
    public String getMdName() {
		return mdName;
	}

	public void setMdName(String mdName) {
		this.mdName = mdName;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_url.URL_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private Integer urlId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_url.URL_NAME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private String urlName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_url.URL_HREF
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private String urlHref;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_url.URL_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    private Date urlRegtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_url.URL_ID
     *
     * @return the value of tp_url.URL_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public Integer getUrlId() {
        return urlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_url.URL_ID
     *
     * @param urlId the value for tp_url.URL_ID
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_url.URL_NAME
     *
     * @return the value of tp_url.URL_NAME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public String getUrlName() {
        return urlName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_url.URL_NAME
     *
     * @param urlName the value for tp_url.URL_NAME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setUrlName(String urlName) {
        this.urlName = urlName == null ? null : urlName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_url.URL_HREF
     *
     * @return the value of tp_url.URL_HREF
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public String getUrlHref() {
        return urlHref;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_url.URL_HREF
     *
     * @param urlHref the value for tp_url.URL_HREF
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setUrlHref(String urlHref) {
        this.urlHref = urlHref == null ? null : urlHref.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_url.URL_REGTIME
     *
     * @return the value of tp_url.URL_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public Date getUrlRegtime() {
        return urlRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_url.URL_REGTIME
     *
     * @param urlRegtime the value for tp_url.URL_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setUrlRegtime(Date urlRegtime) {
        this.urlRegtime = urlRegtime;
    }
}