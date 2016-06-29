package com.chinasofti.cetp.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.admin.model.Role;
import com.chinasofti.cetp.admin.service.RoleService;
import com.chinasofti.cetp.utils.DocConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 
 * *@TODO：角色管理 控制器类
 * 
 * @Author：HuangQ
 * 
 * @Company：ChinaSofti
 * @Create：Since 2013-8-7下午1:35:37
 * @Version：1.0
 */
@Scope("prototype")
@Controller
public class RoleController {

	private static final Logger logger = Logger.getLogger(DocConverter.class);

	@Autowired
	private RoleService roleService;

	// 请求转发
	@RequestMapping("roleMng.do")
	public String majorMng() {

		return "admin/roleMng";
	}

	/*
	 * 查询所有角色信息
	 */
	@RequestMapping("getRoleList.do")
	public void getGridData(HttpServletRequest req, HttpServletResponse res, @RequestParam("rows") int rows, @RequestParam("page") int page) throws UnsupportedEncodingException {

		Gson gson = new Gson();

		String json = "";
		json = "{\"total\":" + roleService.selectAllStu().size() + ",\"rows\":" + gson.toJson(roleService.getLogPerPage(rows, page)) + "}";

		try {
			PrintWriter out = res.getWriter();
			out.print(json);
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}

	/*
	 * 删除一条
	 */
	@RequestMapping("deleteRole.do")
	public String deleteStu(@RequestParam("roleId") Integer roleId) {

		roleService.deleteByPrimaryKey(roleId);

		return "admin/roleMng";
	}

	/*
	 * 添加
	 */
	@RequestMapping("addRole.do")
	public void addStu(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String json = request.getParameter("json");
		logger.info("..........." + json);

		Gson gson = new Gson();

		Role classInfo = gson.fromJson(json, new TypeToken<Role>() {
		}.getType());

		classInfo.setRoleRegtime(new Date());

		String success = "";

		if (this.roleService.addClass(classInfo) > 0) {
			success = "success";
		}

		response.getWriter().write(success);
	}

	/*
	 * 修改
	 */
	@RequestMapping("updateRole.do")
	public void updateStu(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String json = request.getParameter("json");
		logger.info("..........." + json);

		Gson gson = new Gson();

		Role classInfo = gson.fromJson(json, new TypeToken<Role>() {
		}.getType());

		classInfo.setRoleRegtime(new Date());

		String success = "";

		if (this.roleService.updateClass(classInfo) > 0) {
			success = "success";
		}

		response.getWriter().write(success);
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

}
