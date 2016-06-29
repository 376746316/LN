package com.chinasofti.cetp.gensee.model;

import java.util.List;

/**
 * 同步分页录制件使用
 * 
 * @author 远扬
 *
 */
public class GenseeSynRecord extends GenseeCode {

	private List<GenseeRecord> list;

	private GenseePage page;

	public List<GenseeRecord> getRecordList() {
		return list;
	}

	public void setRecordList(List<GenseeRecord> list) {
		this.list = list;
	}

	public GenseePage getPage() {
		return page;
	}

	public void setPage(GenseePage page) {
		this.page = page;
	}

}
