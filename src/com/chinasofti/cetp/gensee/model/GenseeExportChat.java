package com.chinasofti.cetp.gensee.model;

import java.util.List;

/**
 * 导出实时课堂学生的公共聊天数据
 * 
 * @author 远扬
 *
 */
public class GenseeExportChat extends GenseeCode {

	private List<GenseeChat> list;

	public List<GenseeChat> getChatList() {
		return list;
	}

	public void setChatList(List<GenseeChat> list) {
		this.list = list;
	}

}
