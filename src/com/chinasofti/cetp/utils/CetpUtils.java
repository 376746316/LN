package com.chinasofti.cetp.utils;

import org.apache.log4j.Logger;

/**
 * 
 * @Company : ICS&S DL-ETC
 * @Create :常敬岩
 * @Update : 黄琦
 * @Version : 1.0
 * @Update : 20132013-9-16上午9:42:56
 * TODO : 字符串常量类，后台用户登陆时，
 */
public class CetpUtils {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	public static final String[] LOGIN_URLS = new String[] { "/tologin.do",
			"/towebsite.do", "/ut/session/destroy" };
	
	//后台取用户No
	public static final String SESSION_USER_ID = "CETP_USER";
	public static final String SESSION_RETURN_URL_ID = "CETP_RETURN_URL";
	public static final String SESSION_PARENT_MENU_MAP_ID = "CETP_PARENT_MENU_MAP";
	public static final String SESSION_MENU_LIST_ID = "CETP_MENU_LIST";
	public static final String SESSION_CURRENT_SECOND_MENU_ID = "CETP_CURRENT_SECOND_MENU";
	public static final String SESSION_CURRENT_THIRD_MENU_ID = "CETP_CURRENT_THIRD_MENU";
	public static final String COOKIE_USER_IS_REMEMBER_ID = "CETP_USER_IS_REMEMBER";
	public static final String COOKIE_USER_ID = "CETP_USER";
	public static final String SESSION_USER_INFO_ID = "CETP_USER_INFO";
	
	//前台获取用户信息
	public static final String SESSION_STUDENT_INFO_ID = "CETP_STUDENT_INFO";
	
	
	//后台取用户登陆ID
	public static final String SESSION_USER_NAME_ID = "CETP_USER_NAME";
	
	
	public static final String SESSION_STU_NO = "CETP_STU_NO";
	public static final String SESSION_STU_USER_ID = "CETP_STU_USER_ID";
}
