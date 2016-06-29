package com.chinasofti.cetp.utils;

import org.apache.ibatis.session.RowBounds;

public class RowBoundsWithTotalCount extends RowBounds {

	private Integer totalCount;

	public RowBoundsWithTotalCount() {
		// TODO 自动生成的构造函数存根
	}

	public RowBoundsWithTotalCount(int rows, int page) {
		super((page - 1) * rows, rows);
		// TODO 自动生成的构造函数存根
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

}
