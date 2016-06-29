package com.chinasofti.cetp.study.model;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.chinasofti.cetp.admin.model.Student;

/**
 * 课程评论类
 * @author Administrator
 *
 */
public class CourseComment {
	
	private int specId;
	private int coId;//评论ID
	private int coTotal;//总体评价
	private String coComment;//评论内容
	private Timestamp coRegtime;//评论时间
	
	private int stuNo;//学生编号
	private String stuName;//学生姓名
	private String stuHead;//学生头像


	public int getSpecId() {
		return specId;
	}


	public void setSpecId(int specId) {
		this.specId = specId;
	}


	public int getCoId() {
		return coId;
	}


	public void setCoId(int coId) {
		this.coId = coId;
	}


	public int getCoTotal() {
		return coTotal;
	}


	public void setCoTotal(int coTotal) {
		this.coTotal = coTotal;
	}


	public String getCoComment() {
		return coComment;
	}


	public void setCoComment(String coComment) {
		this.coComment = coComment;
	}





	public String getCoRegtime() {
		Date date = new Date(coRegtime.getTime());
		return new SimpleDateFormat("yyyy.MM.dd").format(date);
		
	}


	public void setCoRegtime(Timestamp coRegtime) {
		this.coRegtime = coRegtime;
	}


	public int getStuNo() {
		return stuNo;
	}


	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getStuHead() {
		return stuHead;
	}


	public void setStuHead(String stuHead) {
		this.stuHead = stuHead;
	}


	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,ToStringStyle.MULTI_LINE_STYLE);
	}

}
