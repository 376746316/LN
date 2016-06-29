package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.AreaMapper;
import com.chinasofti.cetp.admin.dao.ClassMapper;
import com.chinasofti.cetp.admin.dao.MajorMapper;
import com.chinasofti.cetp.admin.dao.OrgMapper;
import com.chinasofti.cetp.admin.dao.RoleMapper;
import com.chinasofti.cetp.admin.model.Major;
import com.chinasofti.cetp.admin.model.MoreClass;
import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.admin.model.Class;
import com.chinasofti.cetp.admin.model.Role;
import com.chinasofti.cetp.admin.model.RoleExample;

/**
 * 
 * @TODO：角色管理Service
 * @Author：HuangQ
 *
 * @Company：ChinaSofti
 * @Create：Since 2013-8-7上午9:40:08
 * @Version：1.0
 */
@Service("roleService")
public class RoleService {
	
	
	@Autowired
	private RoleMapper roleMapper;

	/*
	 * 查询所有学生信息
	 */
	public List<Role> selectAllStu(){
		
		return roleMapper.selectByExample();
	}

	/*
	 * 查询所有-分页
	 */
	public List<Role> getLogPerPage(int rows, int page) {
		List<Role> list = roleMapper.selectByExample();
	
		List<Role> subList = new ArrayList<Role>();
		int start = (page - 1) * rows;
		Iterator<Role> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((Role) it.next());
			n++;
		}
		return subList;
	}
	
	
	public List<Role> getQueryLogPerPage(int rows, int page,HashMap<String, Object> map) {

		List<Role> list = roleMapper.selectByExample();
		
		List<Role> subList = new ArrayList<Role>();
		int start = (page - 1) * rows;
		Iterator<Role> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((Role) it.next());
			n++;
		}
		return subList;
	}

	/*
	 * 删除一条
	 */
	public int deleteByPrimaryKey(Integer roleId){
		
		return roleMapper.deleteByPrimaryKey(roleId);
	}

	
	/*
	 * 添加
	 */
	public int addClass(Role record){
		
		return roleMapper.insertSelective(record);
	}
	
	/*
	 * 更新
	 */
	public int updateClass(Role record){
		
		return roleMapper.updateByPrimaryKeySelective(record);
	}
	
	public RoleMapper getRoleMapper() {
		return roleMapper;
	}

	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}
	
}
