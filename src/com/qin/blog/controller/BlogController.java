package com.qin.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qin.blog.model.AlogQin;
import com.qin.blog.service.BlogService;

@Controller
public class BlogController {

	@Autowired
	BlogService blogService;

	@RequestMapping("/qinRegister.do")
	public String qinRegister(HttpServletRequest request, HttpServletResponse response, AlogQin alogqin) {
		int flag = blogService.register(alogqin);
		if (flag > 0) {
			request.setAttribute("username", alogqin.getBlogTitle());
			return "qinsuccess";
		} else {
			return "error";
		}

	}
	
	@RequestMapping("/gotoQinRegister.do")
	public String gotoQinRegister(){
		return "qinLogin";
	}
	
	
}
