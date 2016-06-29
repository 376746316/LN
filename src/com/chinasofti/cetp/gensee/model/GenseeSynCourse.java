package com.chinasofti.cetp.gensee.model;

import java.util.List;
/**
 * 同步课件信息使用
 * @author 远扬
 *
 */
public class GenseeSynCourse extends GenseeCode {

	private List<GenseeCourseware> coursewares;
	
	private List<GenseeCourseware> list;
	
	public List<GenseeCourseware> getList() {
		return list;
	}

	public void setList(List<GenseeCourseware> list) {
		this.list = list;
	}

	private GenseePage page;


	public List<GenseeCourseware> getCoursewares() {
		return coursewares;
	}

	public void setCoursewares(List<GenseeCourseware> coursewares) {
		this.coursewares = coursewares;
	}

	public GenseePage getPage() {
		return page;
	}

	public void setPage(GenseePage page) {
		this.page = page;
	}
	
	
}
