package com.qin.aqintable.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lidezheng.Author.entity.Page;
import com.qin.aqintable.model.Aqintable;
import com.qin.aqintable.model.AqintableExample;
import com.qin.aqintable.model.AqintableExample.Criteria;
import com.qin.aqintable.service.AqintableService;

import antlr.collections.List;

@Controller
public class AqintableController {

	Aqintable aclassqin;

	@Autowired
	AqintableService aqintableService;

	// 初次访问地址（注册）
	@RequestMapping("gotoAqintableRegister.do")
	public String gotoAqintableRegister() {
		// 首个jsp的name
		return "aqinLogin";

	}

	// 伪装首页（首页）
	@RequestMapping("gotoHomePage.do")
	public String gotoHomePage(HttpServletRequest request, HttpServletResponse response) {
		if (aclassqin != null) {
			request.setAttribute("aclassqins", aclassqin);
			return "aqinhomepage";
		} else {
			// 跳转失败页面
			return "aqinfail";
		}

	}

	@RequestMapping("aqinLoginQueryJupe.do")
	public String gotoAqintablelogin() {
		return "aqinLoginquery";
	}

	/**
	 * 修改传参
	 * 
	 * @return
	 */
	@RequestMapping("gotoAqintableUpdata.do")
	public String gotoAqintableupdata(HttpServletRequest request) {
		// String updataName = aclassqin.getName();
		if (aclassqin.getName() != null) {
			// request.setAttribute("updataName", updataName);
			request.setAttribute("updataclas", aclassqin);
			return "aqinupdata";
		} else {
			return "aqinfail";
		}

	}

	/**
	 * 添加 注册…… 与jsp页面相对应的参数，接收jsp的参数并处理逻辑 （判断注册是否成功）
	 */
	@RequestMapping("aqinRegister.do")
	public String aqinRegister(HttpServletRequest request, HttpServletResponse response, Aqintable aqintable) {
		// 执行添加方法，获取返回添加是否添加成功
		int flag = aqintableService.register(aqintable);
		if (flag > 0) {
			// request.setAttribute("fname", aqintable.getName());
			aclassqin = aqintable;
			request.setAttribute("aqintclass", aclassqin);
			return "aqinsuccess";
			// 跳转到成功界面
		} else {
			// 跳转失败页面
			return "aqinfail";
		}
	}

	/**
	 * 修改
	 * 
	 * 1修改方法获取的实体类不是待修改的实体类 2修改并没哟修改为需要修改的数据 3jsp页面没有获取到数据
	 * 
	 * @return
	 */
	@RequestMapping("aqinUpDataUser.do")
	public String aqinDataUp(HttpServletRequest request, HttpServletResponse response, Aqintable aqintable) {
		// 初始判定修改成功值
		int uprest = 0;
		// 关键唯一字段赋值
		aqintable.setName(aclassqin.getName());
		// 对比密码是否一致
		if (aqintable.getPwd() == aclassqin.getPwd() && aqintable.getCardid() == aclassqin.getCardid()) {
			return "aqinfail";
		}
		// 判断新密码不为空
		if (aqintable.getCardid() != null || aqintable.getPwd() != null) {
			uprest = aqintableService.dataup(aqintable);
		} else {
			return "aqinfail";
		}
		// 修改是否成功 跳转相应页面
		if (uprest > 0) {
			request.setAttribute("aclassqins", aqintable);
			return "aqinhomepage";
		} else {
			return "aqinfail";
		}
	}

	/**
	 * 删除
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("gotoAqintableDelete.do")
	public String aqinDataDe(HttpServletRequest request, HttpServletResponse response) {
		int derest = aqintableService.deleteda(aclassqin.getName());
		if (derest > 0) {
			return "aqindeletesuccess";
		} else {
			return "aqinfail";
		}
	}

	/**
	 * 查询：查询其他用户
	 * 
	 * @return
	 */
	/*
	 * @RequestMapping("gotoAqintableQuery.do") public String
	 * aqinDataqQery(HttpServletRequest request, HttpServletResponse response,
	 * String name) { Aqintable aqinclassquery =
	 * aqintableService.querydata(name); if (aqinclassquery != null) {
	 * request.setAttribute("aclassqins", aqinclassquery); aclassqin =
	 * aqinclassquery; return "aqinhomepage"; } else { return "aqinfail"; } }
	 */

	/**
	 * 查询：登陆
	 * 
	 * @return
	 */
	@RequestMapping("aqinLoginQuery.do")
	public String aqinDataQueryLogin(HttpServletRequest request, HttpServletResponse response,
			Aqintable aclassqinlogin) {
		Aqintable aqinclassquerylogin = aqintableService.querydatalgoin(aclassqinlogin);
		if (aqinclassquerylogin != null) {
			request.setAttribute("aclassqins", aqinclassquerylogin);
			aclassqin = aqinclassquerylogin;
			return "aqinhomepage";
		} else {
			return "aqinfail";
		}
	}

	/**
	 * 模糊查询
	 * 
	 * @param request
	 * @param response
	 * @param name
	 * @return
	 */
	@RequestMapping("aqinLoginQueryAllAndLike.do")
	public String aqinDataQueryAllAndLike(HttpServletRequest request, HttpServletResponse response, String name) {
		int currentPage = 3;//
		int offset = (currentPage - 1) * 5;
		Page page = new Page();

		if (offset >= 0) {
			page.setOffset(offset);
			page.setRows(5);
		}
		/***********************/
		if (name == null || name.equals("")) {
			ArrayList<Aqintable> aqintables = aqintableService.querydatall();
			request.setAttribute("aqinclassall", aqintables);
			return "aqinShowUpage";
		} else {
			ArrayList<Aqintable> aqintables = aqintableService.querydatalikename(name);
			int i = 0;
			if ((i = aqintables.size()) > 0) {
				for (int j = 0; j < i; j++) {
					System.out.println(aqintables.get(j).getName() + "GG");
				}
			}
			request.setAttribute("aqinclassall", aqintables);
			return "aqinShowUpage";
		}

	}

}
