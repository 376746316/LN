package com.chinasofti.cetp.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * IP工具类
 * @author heyq
 *
 */
public class IpUtil {
	
	private static final Logger logger = Logger.getLogger(DocConverter.class);

	/**
	 * 获取登录用户IP地址
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip.equals("0:0:0:0:0:0:0:1")) {
			ip = "本地";
		}
		return ip;
	}

}
