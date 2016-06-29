package com.chinasofti.cetp.utils;

import java.util.List;

import org.apache.log4j.Logger;

public class FusionChartsSets {
	
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	
	private String seriesName;
	private String color;
	private List<String> dataset;
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getDataset() {
		return dataset;
	}
	public void setDataset(List<String> dataset) {
		this.dataset = dataset;
	}
	
}
