package com.chinasofti.cetp.utils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ReaderXmlParamTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String parentparamid;
	private String paramid;
	
	public String getParentparamid() {
		return parentparamid;
	}

	public void setParentparamid(String parentparamid) {
		this.parentparamid = parentparamid;
	}

	public String getParamid() {
		return paramid;
	}

	public void setParamid(String paramid) {
		this.paramid = paramid;
	}



	@Override
    public int doStartTag() throws JspException {

        try {

            JspWriter out = this.pageContext.getOut();

            out.println(ReaderXmlParam.getInstance().getParammain(parentparamid, paramid));


        } catch(Exception e) {

            throw new JspException(e.getMessage());

        }

        return SKIP_BODY;

    }

   

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}
