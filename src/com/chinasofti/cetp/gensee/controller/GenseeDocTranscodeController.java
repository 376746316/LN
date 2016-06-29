package com.chinasofti.cetp.gensee.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.utils.LoginRequired;
import com.chinasofti.cetp.utils.LoginRequired.LoginType;

/**
 * 展示互动文档转换的控制器
 * 
 * @author 远扬
 *
 */
@Scope("prototype")
@RequestMapping("/gensee/doc")
@Controller
public class GenseeDocTranscodeController extends BaseController {
	/**
	 * 编辑文档信息
	 * 
	 * @return
	 */
	@RequestMapping("/toEditDocInfo.do")
	public String toUploadDoc() {
		return "gensee/doc/editDocInfo";
	}

	@LoginRequired(type = LoginType.EXCLUDE)
	@RequestMapping("/transcode.do")
	public void transcode(@RequestParam("gscoursewareId") String gscoursewareId, @RequestParam(value = "gsstatus", required = false) String gsstatus) {
		System.out.println("gscoursewareId=" + gscoursewareId);
		System.out.println("gsstatus=" + gsstatus);
	}
}
