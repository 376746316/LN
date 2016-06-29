package com.chinasofti.cetp.utils;

import java.util.List;

import org.apache.log4j.Logger;

public class GanttData {
	
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	
	private String name;
	private String desc;
	private List<GanttDataValue> values;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<GanttDataValue> getValues() {
		return values;
	}

	public void setValues(List<GanttDataValue> values) {
		this.values = values;
	}

}
