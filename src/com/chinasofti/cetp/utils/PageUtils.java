package com.chinasofti.cetp.utils;

public class PageUtils {

	private static final int PERITEM = 8; // 每页显示条目数

	public static int pageCount(int recordCount, Integer perPage) {
		if (perPage == null) {
			int pc = (int) Math.ceil(recordCount / (double) PERITEM);
			return (pc == 0) ? 1 : pc;
		} else {
			int pc = (int) Math.ceil(recordCount / (double) perPage);
			return (pc == 0) ? 1 : pc;
		}

	}
}
