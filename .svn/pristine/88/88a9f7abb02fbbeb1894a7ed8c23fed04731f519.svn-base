package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.MajorMapper;
import com.chinasofti.cetp.admin.model.Major;
import com.chinasofti.cetp.admin.model.MajorExample;
//import com.chinasofti.cetp.practice.model.MoreStuLog;

/**
 * 
 * @TODO：专业管理 Service层
 * @Author：HuangQ
 * 
 * @Company:ChinaSofti
 * @Create：Since 下午7:16:48
 * @Version：1.0
 */
@Service("majorService")
public class MajorService {

	@Autowired
	private MajorMapper majorMapper;

	/**
	 * 查询专业信息
	 * 
	 * @param example
	 * @return
	 */
	public List<Major> selectAllMajor() {

		return majorMapper.selectAllMajor();

	}

	/**
	 * 查询所有结果集分页
	 * @param rows
	 * @param page
	 * @return
	 */
	public List<Major> getLogPerPage(int rows, int page) {
		List<Major> list = majorMapper.selectAllMajor();
		// 页面数据反显
		for (Major m : list) {
			if (m.getMajorStatus().equals("1")) {
				m.setMajorStatus("启用");
			} else if (m.getMajorStatus().equals("0")) {
				m.setMajorStatus("未启用");
			}
		}

		List<Major> subList = new ArrayList<Major>();
		int start = (page - 1) * rows;
		Iterator<Major> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((Major) it.next());
			n++;
		}
		return subList;
	}

	/**
	 * 条件查找分页
	 * @param rows
	 * @param page
	 * @param map
	 * @return
	 */
	public List<Major> getQueryLogPerPage(int rows, int page,HashMap<String, Object> map) {

		List<Major> list = majorMapper.QureyMajor(map);
		// 页面数据反显
		for (Major m : list) {
			if (m.getMajorStatus().equals("1")) {
				m.setMajorStatus("启用");
			} else if (m.getMajorStatus().equals("0")) {
				m.setMajorStatus("未启用");
			}
		}
		List<Major> subList = new ArrayList<Major>();
		int start = (page - 1) * rows;
		Iterator<Major> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((Major) it.next());
			n++;
		}
		return subList;
	}
	
	/**
	 * 删除
	 * @param majorCode
	 * @return
	 */
	public int deleteByPrimaryKey(String majorCode) {

		return majorMapper.deleteByPrimaryKey(majorCode);
	}

	/**
	 * 添加
	 * @return
	 */
	public void addMajor(Major major){

		majorMapper.addMajor(major);
	}
	
	/**
	 * 加载所属专业
	 * @return
	 */
	public List<Major> loadMajorParent(){
		
		return majorMapper.loadMajorParent();
	}
	
	
	public MajorMapper getMajorMapper() {

		return majorMapper;
	}

	public void setMajorMapper(MajorMapper majorMapper) {
		this.majorMapper = majorMapper;
	}

}
