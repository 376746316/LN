package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.cetp.admin.dao.AreaMapper;
import com.chinasofti.cetp.admin.dao.ClassMapper;
import com.chinasofti.cetp.admin.dao.MajorMapper;
import com.chinasofti.cetp.admin.dao.OrgMapper;
import com.chinasofti.cetp.admin.dao.StuTechTypeMapper;
import com.chinasofti.cetp.admin.dao.StudentMapper;
import com.chinasofti.cetp.admin.model.Class;
import com.chinasofti.cetp.admin.model.ClassExample;
import com.chinasofti.cetp.admin.model.Major;
import com.chinasofti.cetp.admin.model.MoreArea;
import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.admin.model.OrgExample;
import com.chinasofti.cetp.admin.model.StuTechTypeExample;
import com.chinasofti.cetp.admin.model.StuTechTypeKey;
import com.chinasofti.cetp.admin.model.Student;
import com.chinasofti.cetp.admin.model.StudentExample;
import com.chinasofti.cetp.admin.model.StudentExample.Criteria;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.practice.dao.PracticeMapper;
import com.chinasofti.cetp.practice.dao.PracticeTeamMapper;
import com.chinasofti.cetp.practice.model.PracPersonKey;
import com.chinasofti.cetp.practice.model.Practice;
import com.chinasofti.cetp.practice.model.PracticeTeam;

/**
 * 
 * @TODO：用户管理 Service
 * @Author：HuangQ
 * 
 * @Company:ChinaSofti
 * @Create：Since 2013-7-30上午9:27:57
 * @Version：1.0
 */
@Service("stuService")
public class StuService {

	@Autowired
	private StudentMapper studentMapper;

	@Autowired
	private OrgMapper orgMapper;

	@Autowired
	private AreaMapper areaMapper;

	@Autowired
	private MajorMapper majorMapper;

	@Autowired
	private ClassMapper classmapper;

	/**
	 * 修改信息
	 * @param stuWithBLOBs
	 * @return
	 */
	public int updateStu(StudentWithBLOBs record) {
		return studentMapper.updateByPrimaryKeySelective(record);
	}

	/*
	 * 删除一条
	 */
	public int deleteByPrimaryKey(Integer stuNo) {
		return studentMapper.deleteByPrimaryKey(stuNo);
	}

	/*
	 * 所属组织，下拉框
	 */
	public List<Org> loadStuOrg() {
		return orgMapper.selectAllOrgF();
	}

	/*
	 * 班级所属组织
	 */
	public List<Org> loadOrgForClass(Integer orgId) {
		return orgMapper.loadOrgForClass(orgId);
	}

	public void loadSubOrg(Integer orgId, List<Org> orgList) {
		if (orgId != null) {
			orgList.add(orgMapper.selectByPrimaryKey(orgId));
		}
		OrgExample example = new OrgExample();
		if (orgId != null) {
			example.createCriteria().andOrgParentIdEqualTo(orgId);
		} else {
			example.createCriteria().andOrgParentIdIsNull();
		}
		List<Org> list = orgMapper.selectByExample(example);
		for (Org org : list) {
			loadSubOrg(org.getOrgId(), orgList);
		}
	}

	public List<MoreArea> getStuProvince() {
		return areaMapper.getStuProvince();
	}

	/*
	 * 所属地区，下拉框
	 */
	public List<MoreArea> loadStuArea(Integer parentId) {

		return areaMapper.selectAllArea(parentId);
	}

	/*
	 * 所属专业，下拉框
	 */
	public List<Major> loadStuMajor() {
		return majorMapper.selectAllMajor();
	}

	/*
	 * 所属班级，下拉框
	 */
	public List<Class> loadStuClass(Integer orgId) {
		ClassExample example = new ClassExample();
		if (orgId != null) {
			List<Org> orgList = new ArrayList<Org>();
			List<Integer> values = new ArrayList<Integer>();
			this.loadSubOrg(orgId, orgList);
			for (Org org : orgList) {
				values.add(org.getOrgId());
			}
			example.createCriteria().andOrgIdIn(values);
		}
		return classmapper.selectByExample(example);
	}

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public OrgMapper getOrgMapper() {
		return orgMapper;
	}

	public void setOrgMapper(OrgMapper orgMapper) {
		this.orgMapper = orgMapper;
	}

	public AreaMapper getAreaMapper() {
		return areaMapper;
	}

	public void setAreaMapper(AreaMapper areaMapper) {
		this.areaMapper = areaMapper;
	}

	public MajorMapper getMajorMapper() {
		return majorMapper;
	}

	public void setMajorMapper(MajorMapper majorMapper) {
		this.majorMapper = majorMapper;
	}

	public ClassMapper getClassmapper() {
		return classmapper;
	}

	public void setClassmapper(ClassMapper classmapper) {
		this.classmapper = classmapper;
	}

	public Boolean validStuUserId(String userId) {
		StudentExample example = new StudentExample();
		example.createCriteria().andStuUseridEqualTo(userId);
		return (studentMapper.countByExample(example) == 0);
	}

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return
	 */
	public int saveStudent(StudentWithBLOBs student) {
		return studentMapper.insertSelective(student);
	}

	/**
	 * 检查用户名是否可用
	 */
	public boolean chackStuNameAvailable(String stuUserid) {
		boolean flag = false;
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuUseridEqualTo(stuUserid);
		if (studentMapper.selectByExample(example).size() == 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 检查用户名是否可用(用于密码找回)
	 */
	public boolean chackUserNameForRecover(String stuUserid) {
		boolean flag = false;
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();

		// ◆验证是否为邮箱地址
		Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stuUserid);

		if (matcher.matches()) { // 判断用户名是否为邮箱格式
			criteria.andStuMailEqualTo(stuUserid);
		} else {
			criteria.andStuUseridEqualTo(stuUserid);
		}
		if (studentMapper.selectByExample(example).size() > 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 检查用户名是否可用
	 */
	public boolean chackEmailAvailable(String email) {
		boolean flag = false;
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuMailEqualTo(email);
		if (studentMapper.selectByExample(example).size() == 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 个人用户登录
	 */
	public List<StudentWithBLOBs> login(Student stu) {

		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();

		// ◆验证是否为邮箱地址
		Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stu.getStuUserid());

		if (matcher.matches()) { // 判断用户名是否为邮箱格式
			criteria.andStuMailEqualTo(stu.getStuUserid());
		} else {
			criteria.andStuUseridEqualTo(stu.getStuUserid());
		}
		return studentMapper.selectByExampleWithBLOBs(example);

	}

	public StudentWithBLOBs selectByPrimaryKey(Integer stuNo) {
		return studentMapper.selectByPrimaryKey(stuNo);
	}

	public List<StudentWithBLOBs> selectByExampleWithBLOBs(StudentExample example) {
		return studentMapper.selectByExampleWithBLOBs(example);
	}

	public List<StudentWithBLOBs> selectByExampleWithBLOBs(StudentExample example, RowBounds rb) {
		return studentMapper.selectByExampleWithBLOBs(example, rb);
	}

	@Autowired
	private StuTechTypeMapper stuTechTypeMapper;

	public StuTechTypeMapper getStuTechTypeMapper() {
		return stuTechTypeMapper;
	}

	public void setStuTechTypeMapper(StuTechTypeMapper stuTechTypeMapper) {
		this.stuTechTypeMapper = stuTechTypeMapper;
	}

	public List<StuTechTypeKey> getStuTechtypes(Integer stuNo) {
		StuTechTypeExample example = new StuTechTypeExample();
		example.createCriteria().andStStuNoEqualTo(stuNo);
		return stuTechTypeMapper.selectByExample(example);
	}

	@Transactional
	public int setStuTechTypes(Integer stuNo, String[] stuTechTypes) {
		StuTechTypeExample example = new StuTechTypeExample();
		example.createCriteria().andStStuNoEqualTo(stuNo);
		stuTechTypeMapper.deleteByExample(example);
		return stuTechTypeMapper.insertList(stuNo, stuTechTypes);
	}
	
	
	//实训相关
	
	@Autowired
	private PracticeTeamMapper practiceTeamMapper;
	
	public PracticeTeamMapper getPracticeTeamMapper() {
		return practiceTeamMapper;
	}

	public void setPracticeTeamMapper(PracticeTeamMapper practiceTeamMapper) {
		this.practiceTeamMapper = practiceTeamMapper;
	}

	/*
	 * 未选择项目的组长
	 */
	public Integer isTeamLeader(Integer stuNo) {
		return practiceTeamMapper.isTeamLeader(stuNo);
	}
	
	/*
	 * 已经选择项目的组长
	 */
	public Integer selectedProTeamLeader(Integer stuNo) {
		return practiceTeamMapper.fullTeamLeader(stuNo);
	}
	
	public PracticeTeam getPtByStuNo(Integer stuNo) {
		return practiceTeamMapper.getTeamIdByStuNo(stuNo);
	}
	
	/*
	 * 根据组编号，查询实训所选项目编号
	 */
	public PracPersonKey getProIdByStuNo(Integer stuNo) {

		return practiceTeamMapper.getProIdByStuNo(stuNo);
	}
	
	@Autowired
	private PracticeMapper practiceMapper;
	
	public PracticeMapper getPracticeMapper() {
		return practiceMapper;
	}

	public void setPracticeMapper(PracticeMapper practiceMapper) {
		this.practiceMapper = practiceMapper;
	}

	public Practice getPracByClassId(Integer classId){
		return practiceMapper.getPracByClassId(classId);
	}

	/**
	 * 激活账号
	 * @param stuUserid
	 * @param flag
	 * @return
	 */
	@Transactional
	public StudentWithBLOBs activateAccount(String stuUserid, String flag) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();

		// ◆验证是否为邮箱地址
		Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stuUserid);

		if (matcher.matches()) { // 判断用户名是否为邮箱格式
			criteria.andStuMailEqualTo(stuUserid);
		} else {
			criteria.andStuUseridEqualTo(stuUserid);
		}
		List<StudentWithBLOBs> students = studentMapper.selectByExampleWithBLOBs(example);
		if (students.size() > 0) {
			StudentWithBLOBs student = students.get(0);
			if(student.getStuIsactivate()==0){	// 当前账号状态未激活
				if(student.getStuFlag().equals(flag)){
					student.setStuIsactivate(1);
					if(studentMapper.updateByPrimaryKey(student)>0){
						return student;
					}
				}
			}
		}
		return null;
	}
}
