package com.chinasofti.cetp.gensee.model;

import java.util.List;

/**
 * 导出课堂参会记录
 * 
 * @author 远扬
 *
 */
public class GenseeExportHistory extends GenseeCode {

	private List<GenseeHistory> list;

	public List<GenseeHistory> getHistoryList() {
		return list;
	}

	public void setHistoryList(List<GenseeHistory> list) {
		this.list = list;
	}

}
