package com.chinasofti.cetp.gensee.model;

/**
 * 展示互动的分页同步数据时
 * 
 * @author 远扬
 *
 */
public class GenseePage {

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
