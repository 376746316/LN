package com.chinasofti.cetp.gensee.model;

import java.util.List;

/**
 * 为课堂导出学生参课过程中的Q&A 记录
 * 
 * @author 远扬
 *
 */
public class GenseeExportQA extends GenseeCode {

	private List<GenseeQA> list;

	public List<GenseeQA> getQaList() {
		return list;
	}

	public void setQaList(List<GenseeQA> list) {
		this.list = list;
	}

}
