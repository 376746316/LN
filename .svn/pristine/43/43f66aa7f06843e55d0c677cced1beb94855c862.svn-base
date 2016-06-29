package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.AreaMapper;
import com.chinasofti.cetp.admin.dao.ClassMapper;
import com.chinasofti.cetp.admin.dao.MajorMapper;
import com.chinasofti.cetp.admin.dao.OrgMapper;
import com.chinasofti.cetp.admin.dao.StudentMapper;
import com.chinasofti.cetp.admin.model.Area;
import com.chinasofti.cetp.admin.model.Major;
import com.chinasofti.cetp.admin.model.MoreArea;
import com.chinasofti.cetp.admin.model.MoreClass;
import com.chinasofti.cetp.admin.model.MoreMajor;
import com.chinasofti.cetp.admin.model.MoreStudent;
import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.admin.model.Student;
import com.chinasofti.cetp.admin.model.User;
import com.chinasofti.cetp.admin.model.Class;
/**
 * 
 * @TODO：班级信息管理Sercice
 * @Author：HuangQ
 *
 * @Company:ChinaSofti
 * @Create：Since 2013-8-2上午10:20:14
 * @Version：1.0
 */
@Service("classService")
public class ClassService {
	
	
	@Autowired
	private ClassMapper classMapper;
	
	@Autowired
	private OrgMapper orgMapper;
	

	@Autowired
	private MajorMapper majorMapper;
	


	/*
	 * 查询班级信息By组织Id
	 */
	public List<MoreClass> selectAllStu(Integer orgId){
		
		return classMapper.selectAllClass(orgId);
	}
	
	/*
	 * 查询所有班级信息
	 */
	public List<MoreClass> selectAllStuAdmin(){
		
		return classMapper.selectAllClassF();
	}
	/*
	 * 查询所有-分页
	 */
	public List<MoreClass> getLogPerPage(int rows, int page,Integer orgId) {
		List<MoreClass> list = classMapper.selectAllClass(orgId);
		// 页面数据反显
		for (MoreClass m : list) {
			if (m.getClassType().equals("1")) {
				m.setClassType("学校");
			} else if (m.getClassType().equals("0")) {
				m.setClassType("基地");
			}else if ((m.getClassType().equals(""))||(m.getClassType()==null) ) {
				m.setClassType("");
			}
		}
		List<MoreClass> subList = new ArrayList<MoreClass>();
		int start = (page - 1) * rows;
		Iterator<MoreClass> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreClass) it.next());
			n++;
		}
		return subList;
	}
	
	
	public List<MoreClass> getQueryLogPerPage(int rows, int page,HashMap<String, Object> map,RowBounds rowBounds) {
		List<MoreClass> list = classMapper.queryClass(map,rowBounds);
		return list;
	}
	public List<MoreClass> queryClassByorgId(int rows, int page,HashMap<String, Object> map,RowBounds rowBounds) {

		List<MoreClass> list = classMapper.queryClassByorgId(map,rowBounds);
		// 页面数据反显
		for (MoreClass m : list) {
			if (m.getClassType().equals("1")) {
				m.setClassType("学校");
			} else if (m.getClassType().equals("0")) {
				m.setClassType("基地");
			}
		}
		return list;
	}

	/*
	 * 删除一条
	 */
	public int deleteByPrimaryKey(Integer classId){
		
		return classMapper.deleteByPrimaryKey(classId);
	}

	
	/*
	 * 添加
	 */
	public int addClass(Class record){
		
		return classMapper.insertSelective(record);
	}
	
	/*
	 * 更新
	 */
	public int updateClass(Class record){
		
		return classMapper.updateByPrimaryKeySelective(record);
	}
	/*
	 * 所属组织，下拉框
	 */
	public List<Org> loadStuOrg(){
		
		return orgMapper.selectAllOrgF();
	}
	
	
	/*
	 * 所属专业，下拉框
	 */
	public List<Major> loadStuMajor(){
		
		return majorMapper.selectAllMajor();
	}

	public ClassMapper getClassMapper() {
		return classMapper;
	}

	public void setClassMapper(ClassMapper classMapper) {
		this.classMapper = classMapper;
	}

	public OrgMapper getOrgMapper() {
		return orgMapper;
	}

	public void setOrgMapper(OrgMapper orgMapper) {
		this.orgMapper = orgMapper;
	}

	public MajorMapper getMajorMapper() {
		return majorMapper;
	}

	public void setMajorMapper(MajorMapper majorMapper) {
		this.majorMapper = majorMapper;
	}

	
}
