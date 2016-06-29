package com.chinasofti.cetp.gensee.model;

import java.util.List;

public class GenseeSynDoc extends GenseeCode {

	private List<GenseeDoc> list;
	
	private GenseePage page;

	public List<GenseeDoc> getList() {
		return list;
	}

	public void setList(List<GenseeDoc> list) {
		this.list = list;
	}

	public GenseePage getPage() {
		return page;
	}

	public void setPage(GenseePage page) {
		this.page = page;
	}
	
	
}
