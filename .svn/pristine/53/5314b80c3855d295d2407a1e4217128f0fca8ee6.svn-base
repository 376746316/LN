package com.chinasofti.cetp.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.admin.model.MoreModule;
import com.chinasofti.cetp.admin.model.MoreUser;
import com.chinasofti.cetp.admin.model.RoleModule;
import com.chinasofti.cetp.admin.model.Url;
import com.chinasofti.cetp.admin.model.UserRole;
import com.chinasofti.cetp.admin.service.ModuleService;
import com.chinasofti.cetp.admin.service.RoleService;
import com.chinasofti.cetp.admin.service.UserService;
import com.chinasofti.cetp.utils.DocConverter;
import com.chinasofti.cetp.utils.Param;
import com.chinasofti.cetp.utils.ReaderXmlParam;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 
 * @TODO：功能模块管理控制器类
 * @Author：HuangQ
 * 
 * @Company:ChinaSofti
 * @Create：Since 2013-8-2下午7:42:24
 * @Version：1.0
 */
@Scope("prototype")
@Controller
public class ModuleController {

	private static final Logger logger = Logger.getLogger(DocConverter.class);

	@Autowired
	private ModuleService moduleService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("moduleMng.do")
	public String majorMng() {

		return "admin/moduleMng";
	}

	/*
	 * 角色-权限管理
	 */
	@RequestMapping("doRoleMng.do")
	public void doRoleMng(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String roleId = request.getParameter("roleId");
		String moduleList = request.getParameter("moduleList");

		List<RoleModule> roleModuleList = new ArrayList<RoleModule>();
		for (String module : moduleList.split("-")) {
			RoleModule roleModule = new RoleModule();
			roleModule.setRmRoleId(Integer.parseInt(roleId));
			roleModule.setRmModuleId(Integer.parseInt(module));
			roleModule.setRmRegtime(new Date());
			roleModuleList.add(roleModule);

		}

		String success = "";

		try {
			this.moduleService.doRoleMng(roleId, roleModuleList);
			success = "success";
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

		response.getWriter().write(success);
	}

	/*
	 * 登录权限
	 */
	@RequestMapping("loadModule.do")
	public String loadModule(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "roleName", required = false) String roleName, @RequestParam("roleId") String roleId) throws IOException {
		roleName = java.net.URLDecoder.decode(roleName, "UTF-8");
		// 全部一级功能
		List<MoreModule> rootModule = moduleService.getRootModule(20, 1);
		request.getSession().setAttribute("rootModule", rootModule);

		// 全部二级功能
		List<MoreModule> subModule = moduleService.getSubModule(300, 1);
		request.getSession().setAttribute("subModule", subModule);

		// 被选中角色所可用的功能
		List<MoreModule> roleUsedModule = userService.selectByRole(roleId);
		request.getSession().setAttribute("roleUsedModule", roleUsedModule);

		request.getSession().setAttribute("roleName", roleName);
		request.getSession().setAttribute("roleId", roleId);

		logger.info("roleId -------->>" + roleId);
		logger.info("roleName -------->>" + roleName);

		return "admin/role_moduleMng";

	}

	/*
	 * 加载没有角色的用户
	 */
	@RequestMapping("loadNoRoleUser.do")
	public String loadNoRoleUser(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "roleName", required = false) String roleName, @RequestParam("roleId") String roleId) throws IOException {
		roleName = java.net.URLDecoder.decode(roleName, "UTF-8");

		List<MoreUser> userList = userService.getNoRoleUser();

		request.getSession().setAttribute("userList", userList);

		request.getSession().setAttribute("roleName", roleName);
		request.getSession().setAttribute("roleId", roleId);

		logger.info("roleId -------->>" + roleId);
		logger.info("roleName -------->>" + roleName);

		return "admin/role_userMng";

	}

	/*
	 * 角色-用户保存
	 */
	@RequestMapping("saveRoleUser.do")
	public void saveRoleUser(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String roleId = request.getParameter("roleId");
		String moduleList = request.getParameter("moduleList");

		List<UserRole> userRole = new ArrayList<UserRole>();
		for (String module : moduleList.split("-")) {

			UserRole ur = new UserRole();
			ur.setUrRoleId(Integer.parseInt(roleId));
			ur.setUrUserId(Integer.parseInt(module));
			ur.setUrRegtime(new Date());
			userRole.add(ur);
		}

		String success = "";

		try {
			this.moduleService.doRoleUserMng(roleId, userRole);
			success = "success";
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

		response.getWriter().write(success);
	}

	// --- >> 查询所有
	@RequestMapping("getModule.do")
	public void getGridData(HttpServletRequest request, HttpServletResponse response, @RequestParam("rows") int rows, @RequestParam("page") int page, @RequestParam(value = "s_mdName", required = false) String s_mdName) throws IOException {

		Gson gson = new Gson();
		String json = "";

		// 角色-权限管理时，用于加载全部权限checkbox的flag

		if (s_mdName == null) {
			json = "{\"total\":" + moduleService.selectAllModule().size() + ",\"rows\":" + gson.toJson(moduleService.getLogPerPage(rows, page)) + "}";
			logger.info("module Json:--->>>----->>>" + json);
		} else {
			// 查询条件 后台转码
			s_mdName = URLDecoder.decode(s_mdName, "UTF-8");
			// 拼接子查询条件到SQL参数加入"%"
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("s_mdName", "%" + s_mdName + "%");

			json = "{\"total\":" + moduleService.selectAllModule().size() + ",\"rows\":" + gson.toJson(moduleService.getQueryLogPerPage(rows, page, map)) + "}";
		}

		try {
			PrintWriter out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}

	// --- >> 删除
	@RequestMapping("deleteModule.do")
	public String deleteMajor(@RequestParam("mdId") Integer mdId) {

		moduleService.deleteByPrimaryKey(mdId);

		return "admin/moduleMng";
	}

	// --- >> 添加
	@RequestMapping("addModule.do")
	public void addMajor(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String json = request.getParameter("json");
		logger.info("addModule..........." + json);

		Gson gson = new Gson();

		MoreModule module = gson.fromJson(json, new TypeToken<MoreModule>() {
		}.getType());

		Url url = gson.fromJson(json, new TypeToken<Url>() {
		}.getType());
		url.setUrlName(url.getMdName());

		String success = "";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("mdName", module.getMdName());
		map.put("_mdName", url.getUrlName());
		if (this.moduleService.addModule(module, url, map) > 0) {
			success = "success";
		}
		response.getWriter().write(success);
	}

	// --->> 修改
	@RequestMapping("updateModule.do")
	public void updateModule(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String json = request.getParameter("json");
		logger.info("updateModule..........." + json);

		Gson gson = new Gson();

		MoreModule module = gson.fromJson(json, new TypeToken<MoreModule>() {
		}.getType());

		Url url = gson.fromJson(json, new TypeToken<Url>() {
		}.getType());
		url.setUrlId(module.getMdId());

		String success = "";

		if ((this.moduleService.updateModule(module) > 0) && (this.moduleService.updateUrl(url)) > 0) {
			success = "success";
		}
		response.getWriter().write(success);
	}

	// --- >> 加载 所属付模块 下拉框 from db
	@RequestMapping("loadCbx_ModuleParent.do")
	public void getMajorParentCbox(HttpServletRequest request, HttpServletResponse response) {

		Gson gson = new Gson();
		List<MoreModule> list = moduleService.getModuleParent();

		logger.info("list:------>>" + list.size());
		String json = gson.toJson(list);
		logger.info("json:------>>" + json);

		try {
			PrintWriter out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}

	// --- >> 加载 状态 下拉框from xml
	@RequestMapping("getIconCbx.do")
	public void getComBox(HttpServletRequest request, HttpServletResponse response, @RequestParam("parentparamid") String parentparamid, @RequestParam(value = "required", required = false) Boolean iRequired) {

		Gson gson = new Gson();
		List<Param> list = ReaderXmlParam.getInstance().getParamList(parentparamid);

		String json = gson.toJson(list);

		try {
			logger.info("getComBox... Loading.......");
			PrintWriter out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
	}

	public ModuleService getModuleService() {
		return moduleService;
	}

	public void setModuleService(ModuleService moduleService) {
		this.moduleService = moduleService;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

}
