package com.chinasofti.cetp.gensee.model;

import java.util.List;

/**
 * 导出课堂参会记录
 * 
 * @author 远扬
 *
 */
public class GenseeExportStudyHistory extends GenseeCode {

	private List<GenseeStudyHistory> list;
	/**
	 * 当前页数
	 */
	private Integer pageNo;

	/**
	 * 总的页数
	 */
	private Integer totalPages;

	/**
	 * 总的条数
	 */
	private Integer totalCounts;

	public List<GenseeStudyHistory> getHistoryList() {
		return list;
	}

	public void setHistoryList(List<GenseeStudyHistory> list) {
		this.list = list;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalCounts() {
		return totalCounts;
	}

	public void setTotalCounts(Integer totalCounts) {
		this.totalCounts = totalCounts;
	}

}
