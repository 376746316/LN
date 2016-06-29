package com.chinasofti.cetp.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasofti.cetp.utils.ValidCodeUtils;

/**
 * <p>Title： 生成验证码控制器</p>
 */
@Controller
public class ImageController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(ImageController.class);

	@RequestMapping("/image.do")
	public void createCheckCode(HttpServletRequest request, HttpServletResponse response){
        try {
        	ValidCodeUtils.getImage(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}
