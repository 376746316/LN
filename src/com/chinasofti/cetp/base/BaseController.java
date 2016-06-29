package com.chinasofti.cetp.base;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.portlet.mvc.SimpleFormController;

import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.SessionInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * 基础Controller,其他Controller继承此Controller来获得writeJson功能
 * 
 * @author heyq
 * 
 */
//@Scope("prototype")
@Controller
public class BaseController  {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BaseController.class);

	/** 获取HttpServletRequest, HttpServletResponse, HttpSession 对象 */
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.session = request.getSession();
	}

	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @param response
	 */
	
	public void writeJson(Object object) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		try {
			response.setContentType("text/html;charset=utf-8");
			Writer out = response.getWriter();
			out.write(gson.toJson(object));
			out.flush();
			out.close();
			logger.info(gson.toJson(object));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将字符串响应回前台
	 * 
	 * @param String
	 * @param response
	 */
	public void writeString(String str) {
		try {
			response.setContentType("text/html;charset=utf-8");
			Writer out = response.getWriter();
			out.write(str);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 日期格式转换器
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	/**
	 * 字符串转换到时间格式
	 * 
	 * @param dateStr
	 *            需要转换的字符串
	 * @param formatStr
	 *            需要格式的目标字符串 举例 yyyy-MM-dd
	 * @return Date 返回转换后的时间
	 * @throws ParseException
	 *             转换异常
	 */
	public Date StringToDate(String dateStr, String formatStr) {
		DateFormat sdf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 将对象转换为JSON 字符串
	 * @param object
	 * @return
	 */
	public String toJSONString(Object object){
		return new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(object);
	}

	/**
	 * 获取SessionInfo
	 * 
	 * @return
	 */
	public SessionInfo getSessionInfo() {
		return (SessionInfo) session.getAttribute(Constants.SESSIONINFO);
	}
	
}
