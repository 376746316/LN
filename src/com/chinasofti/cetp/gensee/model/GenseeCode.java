package com.chinasofti.cetp.gensee.model;

public class GenseeCode {

	private Integer code;

	private String message;
	/**
	 * 0 成功 
	 * -1 失败 
	 * 101 参数错误 
	 * 102 参数转换错误 
	 * 200 认证失败
	 * 201 口令过期 
	 * 300 系统错误 
	 * 500 业务错误 
	 * 501 业务错误 –数据不存在 
	 * 502 业务错误 –重复数据 
	 * 600 接口被禁用，请联系管理员
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * 0 成功 
	 * -1 失败 
	 * 101 参数错误 
	 * 102 参数转换错误 
	 * 200 认证失败
	 * 201 口令过期 
	 * 300 系统错误 
	 * 500 业务错误 
	 * 501 业务错误 –数据不存在 
	 * 502 业务错误 –重复数据 
	 * 600 接口被禁用，请联系管理员
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
