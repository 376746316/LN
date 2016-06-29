package com.chinasofti.cetp.utils;

public class Param {

	public Param() {
	}

	public Param(String param_id, String param_name) {
		this.param_id = param_id;
		this.param_name = param_name;
	}

	private String param_id = "";
	private String param_name = "";

	public String getParam_id() {
		return param_id;
	}

	public void setParam_id(String param_id) {
		this.param_id = param_id;
	}

	public String getParam_name() {
		return param_name;
	}

	public void setParam_name(String param_name) {
		this.param_name = param_name;
	}
}
