package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.cetp.admin.dao.ModuleMapper;
import com.chinasofti.cetp.admin.dao.ModuleUrlMapper;
import com.chinasofti.cetp.admin.dao.RoleModuleMapper;
import com.chinasofti.cetp.admin.dao.UrlMapper;
import com.chinasofti.cetp.admin.dao.UserRoleMapper;
import com.chinasofti.cetp.admin.model.ModuleUrl;
import com.chinasofti.cetp.admin.model.MoreModule;
import com.chinasofti.cetp.admin.model.RoleModule;
import com.chinasofti.cetp.admin.model.RoleModuleExample;
import com.chinasofti.cetp.admin.model.RootModule;
import com.chinasofti.cetp.admin.model.Url;
import com.chinasofti.cetp.admin.model.UserRole;
import com.chinasofti.cetp.utils.DocConverter;

/**
 * 
 * @TODO：菜单 Service层
 * @Author：HuangQ
 * 
 * @Company:ChinaSofti
 * @Create：Since 下午7:16:48
 * @Version：1.0
 */
@Service("moduleService")
public class ModuleService {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	
	@Autowired
	private ModuleMapper moduleMapper;
	
	@Autowired
	private UrlMapper urlMapper;
	
	@Autowired
	private ModuleUrlMapper muMapper;
	
	@Autowired
	private RoleModuleMapper roleModuleMapper;

	public UserRoleMapper getUrMapper() {
		return urMapper;
	}

	public void setUrMapper(UserRoleMapper urMapper) {
		this.urMapper = urMapper;
	}


	@Autowired
	private UserRoleMapper urMapper;
	
	public RoleModuleMapper getRoleModuleMapper() {
		return roleModuleMapper;
	}

	public void setRoleModuleMapper(RoleModuleMapper roleModuleMapper) {
		this.roleModuleMapper = roleModuleMapper;
	}

	/*
	 * 查询所有
	 */
	public List<MoreModule> selectAllModule(){
		
		return moduleMapper.selectAllModule();
	}
	
	/*
	 * 查询一级功能
	 */
	public List<MoreModule> getRootModule(int rows, int page) {
		List<MoreModule> list = moduleMapper.selectRootModule();
		
		List<MoreModule> subList = new ArrayList<MoreModule>();
		int start = (page - 1) * rows;
		Iterator<MoreModule> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreModule) it.next());
			n++;
		}
		return subList;
	}
	
	/*
	 * 查询子功能
	 */
	public List<MoreModule> getSubModule(int rows, int page) {
		List<MoreModule> list = moduleMapper.selectSubModule();
		
		List<MoreModule> subList = new ArrayList<MoreModule>();
		int start = (page - 1) * rows;
		Iterator<MoreModule> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreModule) it.next());
			n++;
		}
		return subList;
	}
	/*
	 * 查询所有-分页
	 */
	public List<MoreModule> getLogPerPage(int rows, int page) {
		List<MoreModule> list = moduleMapper.selectAllModule();
		
		List<MoreModule> subList = new ArrayList<MoreModule>();
		int start = (page - 1) * rows;
		Iterator<MoreModule> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreModule) it.next());
			n++;
		}
		return subList;
	}
	
	/*
	 * 模糊查询-分页
	 */
	public List<MoreModule> getQueryLogPerPage(int rows, int page,HashMap<String, Object> map) {
		
		List<MoreModule> list = moduleMapper.queryModule(map);
		
		List<MoreModule> subList = new ArrayList<MoreModule>();
		int start = (page - 1) * rows;
		Iterator<MoreModule> it = list.listIterator(start);
		int n = 0;
		while (it.hasNext() && n < rows) {
			subList.add((MoreModule) it.next());
			n++;
		}
		return subList;
	}
	
	/*
	 * 删除一条
	 */
	public int deleteByPrimaryKey(Integer mdId){
		
		this.urlMapper.deleteByPrimaryKey(mdId);
		
		return moduleMapper.deleteByPrimaryKey(mdId);
	}
	
	/*
	 * 加载所属父模块 
	 */
	public List<MoreModule> getModuleParent(){
		
		return moduleMapper.getModuleParent();
	}
	
	/*
	 * 角色-权限分配
	 */
	@Transactional
	public void doRoleMng(String roleId,List<RoleModule> roleModuleList){
		
		RoleModuleExample example = new RoleModuleExample();
		example.createCriteria().andRmRoleIdEqualTo(Integer.parseInt(roleId));
		roleModuleMapper.deleteByExample(example);
		
		for (RoleModule roleModule : roleModuleList) {
			roleModuleMapper.insertSelective(roleModule);
		}
		
		
		List<RootModule> rootModuleList = roleModuleMapper.selectAllRootModule();
		for (RootModule rootModule : rootModuleList) {
			roleModuleMapper.insertRootModuleByRoleId(Integer.parseInt(roleId),rootModule.getMdId());
		}
		
	}
	
	/*
	 * 角色-用户分配
	 */
	@Transactional
	public void doRoleUserMng(String roleId,List<UserRole> roleUserList){
		
		for (UserRole userRole : roleUserList) {
			urMapper.insertSelective(userRole);
		}
		
	}
	
	
	/*
	 * 添加一条记录
	 */
	public int addModule(MoreModule module,Url url,HashMap<String,Object> map){
		
		//1,插入到TP_MODULE
		this.moduleMapper.insertModule_01(module);
		//2,根据名称，查出module的ID
		List<MoreModule> md_id = this.moduleMapper.queryModuleId(map);
		
		//3,插入到TP_URL
		this.urlMapper.insertSelective(url);
		//4,根据名称，查出url的ID
		List<Url> url_id = this.urlMapper.queryUrlId(map);
		
		ModuleUrl mu = new ModuleUrl();
		
		
		mu.setMuMdId(md_id.get(0).getMdId());
		
		logger.info("mdId ----------" + md_id.get(0).getMdId());
		mu.setMuUrlId(url_id.get(0).getUrlId());
		logger.info(" url id ------------ "+ url_id.get(0).getUrlId());
		
		//5,插入关联表
		return muMapper.insertSelective(mu);
	}
	/*
	 * 更新一条记录(module)
	 */
	public int updateModule(MoreModule module){
		
		return moduleMapper.updateByPrimaryKeySelective(module);
	}
	
	/*
	 * 更新一条记录(url)
	 */
	public int updateUrl(Url url){
		
		return urlMapper.updateByPrimaryKeySelective(url);
	}

	public ModuleMapper getModuleMapper() {
		return moduleMapper;
	}


	public void setModuleMapper(ModuleMapper moduleMapper) {
		this.moduleMapper = moduleMapper;
	}


	public UrlMapper getUrlMapper() {
		return urlMapper;
	}


	public void setUrlMapper(UrlMapper urlMapper) {
		this.urlMapper = urlMapper;
	}


	public ModuleUrlMapper getMuMapper() {
		return muMapper;
	}


	public void setMuMapper(ModuleUrlMapper muMapper) {
		this.muMapper = muMapper;
	}
	
}
