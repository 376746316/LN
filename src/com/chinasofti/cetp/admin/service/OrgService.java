package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.OrgMapper;
import com.chinasofti.cetp.admin.model.Major;
import com.chinasofti.cetp.admin.model.MoreOrg;
import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.admin.model.OrgExample;

/**
 * 
 * @Company : ICS&S DL-ETC
 *
 * @Author : HuangQi
 * @Version : 1.0
 * @Create : 20132013-8-28上午9:09:24
 * TODO :组织管理 service层
 */
@Service("orgService")
public class OrgService {

	@Autowired
	private OrgMapper orgMapper;

	/**
	 * 查询组织信息
	 * 
	 * @param example
	 * @return
	 */
	public List<MoreOrg> selectAllOrg() {

		return orgMapper.selectAllOrg();

	}

	/*
	 * 加载所属组织下拉框
	 */
	public List<MoreOrg> loadOrgParebt(){
		
		return orgMapper.loadOrgParebt();
	}
	
	/**
	 * 查询所有结果集分页
	 * @param rows
	 * @param page
	 * @return
	 */
	public List<MoreOrg> getLogPerPage(int rows, int page) {
		List<MoreOrg> list = orgMapper.selectAllOrg();
		List<MoreOrg> subList = new ArrayList<MoreOrg>();
		
		int start = (page - 1) * rows;
		Iterator<MoreOrg> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreOrg) it.next());
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
	/*public List<Org> getQueryLogPerPage(int rows, int page,HashMap<String, Object> map) {

		List<Org> list = majorMapper.QureyMajor(map);
		
		List<Org> subList = new ArrayList<Org>();
		int start = (page - 1) * rows;
		Iterator<Org> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((Org) it.next());
			n++;
		}
		return subList;
	}*/
	
	/**
	 * 删除
	 * @param majorCode
	 * @return
	 */
	public int deleteByPrimaryKey(Integer orgId) {

		return orgMapper.deleteByPrimaryKey(orgId);
	}

	
	/**
	 * 添加
	 * @return
	 */
	public int addOrg(MoreOrg record){

		return orgMapper.insertSelective(record);
	}
	
	/*
	 * 修改
	 */
	public int updateOrg(MoreOrg record){
		return orgMapper.updateByPrimaryKeySelective(record);
	}
	
	public OrgMapper getOrgMapper() {
		return orgMapper;
	}

	public void setOrgMapper(OrgMapper orgMapper) {
		this.orgMapper = orgMapper;
	}
	
}
