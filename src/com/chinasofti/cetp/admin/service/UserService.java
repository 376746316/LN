package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.cetp.admin.dao.AreaMapper;
import com.chinasofti.cetp.admin.dao.ModuleMapper;
import com.chinasofti.cetp.admin.dao.OrgMapper;
import com.chinasofti.cetp.admin.dao.StudentMapper;
import com.chinasofti.cetp.admin.dao.UserMapper;
import com.chinasofti.cetp.admin.dao.UserTechTypeMapper;
import com.chinasofti.cetp.admin.model.MoreArea;
import com.chinasofti.cetp.admin.model.MoreModule;
import com.chinasofti.cetp.admin.model.MoreUser;
import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.admin.model.User;
import com.chinasofti.cetp.admin.model.UserExample;
import com.chinasofti.cetp.admin.model.UserExample.Criteria;
import com.chinasofti.cetp.admin.model.UserTechTypeExample;
import com.chinasofti.cetp.admin.model.UserTechTypeKey;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.utils.DocConverter;

/**
 * 
 * @TODO：用户管理 Service层
 * @Author：HuangQ
 * 
 * @Company:ChinaSofti
 * @Create：Since 下午7:16:48
 * @Version：1.0
 */
@Service("userService")
public class UserService {

	private static final Logger logger = Logger.getLogger(DocConverter.class);

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private StudentMapper studentMapper;

	@Autowired
	private OrgMapper orgMapper;

	@Autowired
	private AreaMapper areaMapper;

	@Autowired
	private ModuleMapper moduleMapper;

	@Autowired
	private UserTechTypeMapper userTechTypeMapper;

	public UserTechTypeMapper getUserTechTypeMapper() {
		return userTechTypeMapper;
	}

	public void setUserTechTypeMapper(UserTechTypeMapper userTechTypeMapper) {
		this.userTechTypeMapper = userTechTypeMapper;
	}

	/*
	 * 修改
	 */
	@Transactional
	// public int updateUser(MoreUser record) {
	// return userMapper.updateByPrimaryKeySelective(record);
	// }
	public int validUserId(String vUserId) {
		return userMapper.validUserId(vUserId);
	}

	public List<User> queryUserPwd(Integer userNo, String old_pwd) {
		return userMapper.queryUserPwd(userNo, old_pwd);
	}

	@Transactional
	public int updateUserPwd(Integer userNo, String new_pwd) {
		return userMapper.updateUserPwd(userNo, new_pwd);
	}

	/*
	 * 获取所有没有角色的用户
	 */
	public List<MoreUser> getNoRoleUser() {

		return userMapper.getNoRoleUser();
	}

	/*
	 * 后台用户登陆，加载一级菜单
	 */
	public List<MoreModule> getRootMenuByRole(String userId) {
		return moduleMapper.getRootMenuByRole(userId);
	}

	/*
	 * 后台用户登陆，加载二级菜单，
	 */
	public List<MoreModule> getSubMenuByRole(String userId) {
		return moduleMapper.getSubMenuByRole(userId);
	}

	public List<MoreModule> selectByRole(String roleId) {
		return moduleMapper.selectByRole(roleId);
	}

	@Transactional
	public List<User> loginByExample(User record) {

		return userMapper.loginByExample(record);
	}

	/*
	 * public List<Student> loginByStudentExample(Student record) { return
	 * studentMapper.loginByStudentExample(record); }
	 */

	/*
	 * 根据后台登陆的UserNo,获取其组织Id
	 */
	public User getOrgIdByUserNo(Integer userNo) {

		return userMapper.getOrgIdByUserNo(userNo);
	}

	public List<MoreUser> selectUserList(HashMap<String, Object> map, RowBounds rowBounds) {
		return userMapper.selectUserList(map, rowBounds);
	}

	public int deleteByPrimaryKey(Integer userNo) {
		return userMapper.deleteByPrimaryKey(userNo);
	}

	// public int insert(MoreUser record) {
	// return userMapper.insertSelective(record);
	// }

	public List<MoreUser> queryUser(HashMap<String, Object> map) {
		return userMapper.queryUser(map);
	}

	/*
	 * 查询所有-分页
	 */
	public List<MoreUser> getLogPerPage(int rows, int page, RowBounds rowBounds, HashMap<String, Object> map) {
		List<MoreUser> list = userMapper.selectUserList(map, rowBounds);
		// 页面数据反显
		for (MoreUser u : list) {
			if (u.getUserType().equals("1")) {
				u.setUserType("基地");
			} else if (u.getUserType().equals("2")) {
				u.setUserType("学校");
			} else if (u.getUserType().equals("3")) {
				u.setUserType("企业");
			} else if (u.getUserType().equals("4")) {
				u.setUserType("政府");
			} else if (u.getUserSex().equals("0")) {
				u.setUserSex("男");
			} else if (u.getUserSex().equals("1")) {
				u.setUserSex("女");
			} else if ((u.getUserType().equals(" ")) || (u.getUserType() == null)) {
				u.setUserType(" ");
			}

			for (MoreUser u1 : list) {
				if (u1.getUserSex().equals("0")) {
					u1.setUserSex("男");
				} else if (u1.getUserSex().equals("1")) {
					u1.setUserSex("女");
				} else if ((u1.getUserSex().equals(" ")) || (u1.getUserSex() == null)) {
					u1.setUserSex(" ");
				}
			}

			for (MoreUser u2 : list) {
				if (u2.getUserEduLevel().equals("0")) {
					u2.setUserEduLevel("初中");
				} else if (u2.getUserEduLevel().equals("1")) {
					u2.setUserEduLevel("高中");
				} else if (u2.getUserEduLevel().equals("2")) {
					u2.setUserEduLevel("大专");
				} else if (u2.getUserEduLevel().equals("3")) {
					u2.setUserEduLevel("本科");
				} else if (u2.getUserEduLevel().equals("4")) {
					u2.setUserEduLevel("硕士");
				} else if (u2.getUserEduLevel().equals("5")) {
					u2.setUserEduLevel("博士");
				} else if ((u2.getUserEduLevel().equals(" ")) || (u2.getUserEduLevel() == null)) {
					u2.setUserEduLevel(" ");
				}
			}

		}

		for (MoreUser u3 : list) {
			if (u3.getUserIsLeader().equals("1")) {
				u3.setUserIsLeader("是");
			} else if (u3.getUserIsLeader().equals("0")) {
				u3.setUserIsLeader("否");
			}

		}
		List<MoreUser> subList = new ArrayList<MoreUser>();
		int start = (page - 1) * rows;
		Iterator<MoreUser> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreUser) it.next());
			n++;
		}
		return subList;
	}

	public List<MoreUser> getQueryLogPerPage(int rows, int page, HashMap<String, Object> map) {

		List<MoreUser> list = userMapper.queryUser(map);
		logger.info("map>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + map);
		// 页面数据反显
		for (MoreUser u : list) {
			if (u.getUserType().equals("1")) {
				u.setUserType("基地");
			} else if (u.getUserType().equals("2")) {
				u.setUserType("学校");
			} else if (u.getUserType().equals("3")) {
				u.setUserType("企业");
			} else if (u.getUserType().equals("4")) {
				u.setUserType("政府");
			} else if (u.getUserSex().equals("0")) {
				u.setUserSex("男");
			} else if (u.getUserSex().equals("1")) {
				u.setUserSex("女");
			}
		}

		for (MoreUser u1 : list) {
			if (u1.getUserSex().equals("0")) {
				u1.setUserSex("男");
			} else if (u1.getUserSex().equals("1")) {
				u1.setUserSex("女");
			} else if ((u1.getUserSex().equals(" ")) || (u1.getUserSex() == null)) {
				u1.setUserSex(" ");
			}
		}

		for (MoreUser u2 : list) {
			if (u2.getUserEduLevel().equals("0")) {
				u2.setUserEduLevel("初中");
			} else if (u2.getUserEduLevel().equals("1")) {
				u2.setUserEduLevel("高中");
			} else if (u2.getUserEduLevel().equals("2")) {
				u2.setUserEduLevel("大专");
			} else if (u2.getUserEduLevel().equals("3")) {
				u2.setUserEduLevel("本科");
			} else if (u2.getUserEduLevel().equals("4")) {
				u2.setUserEduLevel("硕士");
			} else if (u2.getUserEduLevel().equals("5")) {
				u2.setUserEduLevel("博士");
			} else if ((u2.getUserEduLevel().equals(" ")) || (u2.getUserEduLevel() == null)) {
				u2.setUserEduLevel(" ");
			}
		}
		List<MoreUser> subList = new ArrayList<MoreUser>();
		int start = (page - 1) * rows;
		Iterator<MoreUser> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreUser) it.next());
			n++;
		}
		return subList;
	}

	// 用户性别下拉框
	public List<MoreUser> loadUserSex() {
		return userMapper.loadUserSex();
	}

	// 用户学历下拉框
	public List<MoreUser> loadUserEduLev() {
		return userMapper.loadUserEduLev();
	}

	// 用户类型下拉框
	public List<MoreUser> loadUserType() {
		return userMapper.loadUserEduLev();
	}

	public List<MoreArea> getUserProvince() {
		return areaMapper.getStuProvince();
	}

	/*
	 * 所属地区，下拉框
	 */
	public List<MoreArea> loadUserArea(Integer parentId) {

		return areaMapper.selectAllArea(parentId);
	}

	/*
	 * 所属组织，下拉框
	 */
	public List<Org> loadUserOrg() {

		return orgMapper.selectAllOrgF();
	}

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public AreaMapper getAreaMapper() {
		return areaMapper;
	}

	public void setAreaMapper(AreaMapper areaMapper) {
		this.areaMapper = areaMapper;
	}

	public ModuleMapper getModuleMapper() {
		return moduleMapper;
	}

	public void setModuleMapper(ModuleMapper moduleMapper) {
		this.moduleMapper = moduleMapper;
	}

	public OrgMapper getOrgMapper() {
		return orgMapper;
	}

	public void setOrgMapper(OrgMapper orgMapper) {
		this.orgMapper = orgMapper;
	}

	/**
	 * 加载教师列表
	 */
	public List<User> selectTeacher() {
		return userMapper.selectByExample(new UserExample());
	}

	/**
	 * 检查用户名是否可用
	 */
	public boolean chackUserIdAvailable(String userId) {
		boolean flag = false;
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		if (userMapper.selectByExample(example).size() == 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 检查用户名是否可用
	 */
	public boolean chackUserMailAvailable(String userMail) {
		boolean flag = false;
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserMailEqualTo(userMail);
		if (userMapper.selectByExample(example).size() == 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 检查用户名是否可用(用于密码找回)
	 */
	public boolean chackUserNameForRecover(String userId) {
		boolean flag = false;
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		// ◆验证是否为邮箱地址
		Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(userId);

		if (matcher.matches()) { // 判断用户名是否为邮箱格式

			criteria.andUserMailEqualTo(userId);
		} else {

			criteria.andUserIdEqualTo(userId);
		}
		if (userMapper.selectByExample(example).size() > 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 企业用户注册
	 * 
	 * @param user
	 * @return
	 */
	public int saveUser(UserWithBLOBs user) {
		return userMapper.insertSelective(user);
	}

	/**
	 * 企业用户登录
	 * 
	 * @param user
	 * @return
	 */
	public List<UserWithBLOBs> login(User user) {

		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();

		// ◆验证是否为邮箱地址
		Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.getUserId());

		if (matcher.matches()) { // 判断用户名是否为邮箱格式
			criteria.andUserMailEqualTo(user.getUserId());
		} else {
			criteria.andUserIdEqualTo(user.getUserId());
		}
		return userMapper.selectByExampleWithBLOBs(example);

	}

	/**
	 * 企业用户更新
	 * 
	 * @param user
	 * @return
	 */

	public int updateUser(UserWithBLOBs record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	public UserWithBLOBs selectByPrimaryKey(Integer userNo) {
		return userMapper.selectByPrimaryKey(userNo);
	}

	public List<UserWithBLOBs> selectByExampleWithBLOBs(UserExample example) {
		return userMapper.selectByExampleWithBLOBs(example);
	}

	public List<UserTechTypeKey> getUserTechtypes(Integer userNo) {
		UserTechTypeExample example = new UserTechTypeExample();
		example.createCriteria().andUtUserNoEqualTo(userNo);
		return userTechTypeMapper.selectByExample(example);
	}

	@Transactional
	public int setUserTechTypes(Integer userNo, String[] userTechTypes) {
		UserTechTypeExample example = new UserTechTypeExample();
		example.createCriteria().andUtUserNoEqualTo(userNo);
		userTechTypeMapper.deleteByExample(example);
		return userTechTypeMapper.insertList(userNo, userTechTypes);
	}

	public UserWithBLOBs activateAccount(String userId, String flag) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();

		// ◆验证是否为邮箱地址
		Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(userId);

		if (matcher.matches()) { // 判断用户名是否为邮箱格式
			criteria.andUserMailEqualTo(userId);
		} else {
			criteria.andUserIdEqualTo(userId);
			
		}
		List<UserWithBLOBs> userWithBLOBs = userMapper.selectByExampleWithBLOBs(example);
		if (userWithBLOBs.size() > 0) {
			UserWithBLOBs user = userWithBLOBs.get(0);
			if(user.getUserIsactivate()==0){	// 当前账号状态未激活
				if(user.getUserFlag().equals(flag)){
					user.setUserIsactivate(1);
					if(userMapper.updateByPrimaryKey(user)>0){
						return user;
					}
				}
			}
		}
		return null;
	}
	
	public List<User> selectTeachCourseUser(){
		return userMapper.selectTeachCourseUser();
	}
}
