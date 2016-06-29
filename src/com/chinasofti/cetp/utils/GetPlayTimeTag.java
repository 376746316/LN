package com.chinasofti.cetp.utils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GetPlayTimeTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int doStartTag() throws JspException {

		try {

			JspWriter out = this.pageContext.getOut();
			Long time = Long.valueOf(value);
			Long hour = time / 3600000;
			Long min = (time % 3600000) / 60000;
			Long sec = (time % 60000) / 1000;
			String strHour = hour > 0 ? (hour >= 10 ? hour + ":" : "0" + hour + ":") : "";
			String strMin = min >= 10 ? min + ":" : "0" + min + ":";
			String strSec = sec >= 10 ? sec.toString() : "0" + sec;
			out.println(strHour + strMin + strSec);

		} catch (Exception e) {

			throw new JspException(e.getMessage());

		}

		return SKIP_BODY;

	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
