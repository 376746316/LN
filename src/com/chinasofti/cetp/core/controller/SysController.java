package com.chinasofti.cetp.core.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.chinasofti.cetp.admin.model.UserExample;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.core.service.SysService;
import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.PropertiesUtil;

/**
 * 控制页面跳转控制器
 * 
 * @author heyuqiang
 * 
 */
@Controller
@RequestMapping("/sys.do")
public class SysController {
	private static final Integer userBegin = Integer.valueOf(PropertiesUtil.getProperty("/config.properties", "system.userBegin"));
	@Autowired
	private SysService sysService;

	public SysService getSysService() {
		return sysService;
	}

	public void setSysService(SysService sysService) {
		this.sysService = sysService;
	}
	
	/**
	 * 跳转到系统主界面
	 */
	@RequestMapping(params = "method=index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		// 进入系统首页
		return new ModelAndView("/index");
	}

	/**
	 * 跳转到用户注册页面
	 */
	@RequestMapping(params = "method=register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("/register");
	}

	/**
	 * 跳转到用户注册页面
	 * 
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(params = "method=loginRedirect")
	public ModelAndView loginRedirect(HttpServletRequest request, HttpServletResponse response, @RequestParam("redirect") String redirect) throws UnsupportedEncodingException {
		redirect = URLDecoder.decode(redirect, "UTF-8");
		if (request.getSession().getAttribute(Constants.SESSIONINFO) == null) {
			request.setAttribute("redirect", redirect);
			return new ModelAndView("/loginRedirect");
		}
		return new ModelAndView(new RedirectView(redirect));

	}

	/**
	 * 就业服务
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "method=employmentService")
	public ModelAndView employmentService(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("/special/employmentService");
	}

	/**
	 * 一对一辅导
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "method=oneToOneService")
	public ModelAndView oneToOneService(HttpServletRequest request, HttpServletResponse response) {
		UserExample example = new UserExample();
		example.createCriteria().andUserNoGreaterThanOrEqualTo(userBegin);
		List<UserWithBLOBs> list = sysService.selectUserByExample(example);
		int total = list.size();
		double rows = Math.ceil(total / 2.0);
		request.setAttribute("rows", (int) rows);
		request.setAttribute("userList", list);
		return new ModelAndView("/special/oneToOneService");
	}

	/**
	 * 项目实训
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "method=projectPracticeService")
	public ModelAndView projectPracticeService(HttpServletRequest request, HttpServletResponse response) {
		UserExample example = new UserExample();
		example.createCriteria().andUserNoGreaterThanOrEqualTo(userBegin);
		List<UserWithBLOBs> list = sysService.selectUserByExample(example);
		int total = list.size();
		double rows = Math.ceil(total / 2.0);
		request.setAttribute("rows", (int) rows);
		request.setAttribute("userList", list);
		return new ModelAndView("/special/projectPracticeService");
	}

	/**
	 * 人才订制
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "method=talentCustomMadeService")
	public ModelAndView talentCustomMadeService(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("/special/talentCustomMadeService");
	}
}
