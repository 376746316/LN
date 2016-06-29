package com.lidezheng.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lidezheng.login.model.Luser;
import com.lidezheng.login.service.LuserService;

@Controller
public class LuserController {
	@Autowired
	LuserService luserService;
	
	/**
	 * 修改功能
	 * @param request
	 * @param response
	 * @param luser
	 * @return
	 */
	@RequestMapping("lidezhengUpdate.do")
	public String lidezhengUpdate(HttpServletRequest request, HttpServletResponse response,Luser luser){
		int flag = luserService.updateOneLuser(luser);
		if(flag>0){
			request.setAttribute("username", luser.getUsername());
			List<Luser> luserList=luserService.findLuserList();
			request.setAttribute("luserList", luserList);
			return "success";
		}else{
			request.setAttribute("errorMessage", "修改失败");
			return "lidezhengerror";
		}

	}
	/**
	 * 删除功能
	 * @param request
	 * @param response
	 * @param id
	 * @return
	 */
	@RequestMapping("/lidezhengDeleteOne.do")
	public String lidezhengDeleteOne(HttpServletRequest request, HttpServletResponse response,String id){
		int flag=luserService.deleteOne(id);
		if(flag>0){
			List<Luser> luserList=luserService.findLuserList();
			request.setAttribute("luserList", luserList);
			return "success";
		}else{
			request.setAttribute("errorMessage", "用户已经不存在");
			return "lidezhengerror";
		}
		
	}
	
	/**
	 * 用户登录功能
	 * @param request
	 * @param response
	 * @param luser
	 * @return
	 */
	@RequestMapping("/lidezhengLogin.do")
	public String lidezhengLogin(HttpServletRequest request, HttpServletResponse response, Luser luser) {
		Luser luser0 = luserService.login(luser);
//		System.out.println("ab123");
//		System.out.println(luser.getUsername());
//		System.out.println(luser.getPasswd());
		if (luser0!=null) {
			if(luser0.getPasswd().equals(luser.getPasswd())){
				request.getSession().setAttribute("usrname", luser0.getUsername());
				List<Luser> luserList=luserService.findLuserList();
				request.setAttribute("luserList", luserList);
				return "success";
			}else{
				request.setAttribute("errorMessage", "对不起，密码错误");
				return "lidezhengerror";
			}

		} else {
			request.setAttribute("errorMessage", "对不起，该用户不存在");
			return "lidezhengerror";
		}

	}
	
	/**
	 * 用户注册功能
	 * @param request
	 * @param response
	 * @param luser
	 * @return
	 */
	@RequestMapping("/lidezhengRegister.do")
	public String lidezhengRegister(HttpServletRequest request, HttpServletResponse response, Luser luser){
		int  flag=luserService.register(luser);
		if(flag>0){
			request.setAttribute("username", luser.getUsername());
			return "lidezhengsuccess";
		}else{
			return "error";
		}
	}
	
	/**
	 * 注册页面
	 * @return
	 */
	@RequestMapping("/lidezhengRegisterView.do")
	public String lidezhengRegisterView() {
		return "lidezhengRegister";
	}
	
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("/lidezhengLoginView.do")
	public String lidezhengLoginView() {
		return "lidezhengLogin";
	}
	
	/**
	 * 修改页面
	 * @return
	 */
	@RequestMapping("/lidezhengUpdateView.do")
	public String lidezhengUpdateView(HttpServletRequest request, HttpServletResponse response,String userId){
		Luser luser=luserService.findOneLuser(userId);
		request.setAttribute("luser", luser);
		return "lidezhengUpdate";
	}
}
