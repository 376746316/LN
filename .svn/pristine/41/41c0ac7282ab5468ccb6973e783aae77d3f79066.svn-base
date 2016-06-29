package com.chinasofti.cetp.resource.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.resource.model.SelectElement;
import com.chinasofti.cetp.resource.model.Video;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;
import com.chinasofti.cetp.resource.service.VideoService;
import com.chinasofti.cetp.utils.ccplayer.common.APIServiceFunction;
import com.chinasofti.cetp.utils.ccplayer.common.DemoUtil;
import com.chinasofti.cetp.utils.ccplayer.config.Config;
@Scope("prototype")
@Controller
public class CCVideoController extends BaseController {

	@Autowired
	private VideoService videoService;

	public VideoService getService() {
		return videoService;
	}

	public void setService(VideoService service) {
		this.videoService = service;
	}

	/**
	 * 跳转到cc视频的上传页面
	 * 
	 * @param request
	 * @param response
	 * @param vId
	 *            视频编号
	 * @return
	 */
	@RequestMapping("toUploadForCCPlayer.do")
	public String toUploadForCCPlayer(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "vId", required = false) Integer vId) {
		Map<String, String> paramsMap = new HashMap<String, String>();
		paramsMap.put("userid", Config.userid);
		System.out.println("获取当前视频上传的用户编号：" + Config.userid);
		long time = System.currentTimeMillis();
		String requestURL = APIServiceFunction.createHashedQueryString(paramsMap, time, Config.key);
		// get方式
		String responseStr = APIServiceFunction.HttpRetrieve(Config.api_category + "?" + requestURL);
		Document doc = DemoUtil.build(responseStr);
		@SuppressWarnings("unchecked")
		// 得到视频分类XML
		Iterator<Element> categorys = doc.getRootElement().elementIterator("category");
		Map<String, Iterator<Element>> categoryMap = new HashMap<String, Iterator<Element>>();
		List<SelectElement> pList = new ArrayList<SelectElement>();
		List<SelectElement> sList = new ArrayList<SelectElement>();
		if (categorys != null) {
			while (categorys.hasNext()) {
				Element categoryElement = categorys.next();
				if (categoryElement.elementIterator("sub-category").hasNext()) {
					@SuppressWarnings("unchecked")
					Iterator<Element> subcategorys = categoryElement.elementIterator("sub-category");
					categoryMap.put(categoryElement.elementText("id"), subcategorys);
					SelectElement se = new SelectElement();
					se.setName(categoryElement.elementText("name"));
					se.setValue(categoryElement.elementText("id"));
					pList.add(se);
				}
			}
			for (String superCategoryId : categoryMap.keySet()) {
				Iterator<Element> subcategorys = categoryMap.get(superCategoryId);
				while (subcategorys.hasNext()) {
					Element subcategoryElement = subcategorys.next();
					SelectElement se = new SelectElement();
					se.setName(subcategoryElement.elementText("name"));
					se.setValue(subcategoryElement.elementText("id"));
					sList.add(se);
				}
			}
		}
		if (vId != null) {
			Video video = videoService.selectVideoByParimaryKey(vId);
			request.setAttribute("video", video);
		}

		request.setAttribute("pList", pList);
		request.setAttribute("sList", sList);
		request.setAttribute("notify_url", Config.notify_url);
		request.setAttribute("userId", Config.userid);
		return "ccplayer/upload";
	}

	/**
	 * 获取视频上传参数
	 * 
	 * @param request
	 * @param response
	 * @param description
	 * @param title
	 * @param tag
	 * @param categoryId
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("getuploadurl.do")
	public void getuploadurl(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "title", required = false) String title, @RequestParam(value = "tag", required = false) String tag, @RequestParam(value = "categoryid", required = false) String categoryId,@RequestParam(value="vId",required=false)Integer vId) throws UnsupportedEncodingException {
		VideoWithBLOBs video = null;
		String videoId = null;
		if(vId != null){
			video = videoService.selectVideoByParimaryKey(vId);
			if(video.getvPlayUrl()!= null){
				String[] split = video.getvPlayUrl().split("&");
				videoId = split[1];
			}
		}
		HashMap<String, String> paramsMap = new HashMap<String, String>();
		System.out.println("参数列表：----------------------------");
		System.out.println(title);
		System.out.println(description);
		System.out.println(description);
		System.out.println(tag);
		System.out.println(categoryId);
		System.out.println("参数列表：-----------------end");
		paramsMap.put("userid", Config.userid);
		paramsMap.put("title", title);
		paramsMap.put("description", description);
		paramsMap.put("tag", tag);
		paramsMap.put("categoryid", categoryId);
		long time = System.currentTimeMillis();
		String salt = Config.key;
		String requestURL = APIServiceFunction.createHashedQueryString(paramsMap, time, salt);
		System.out.println("输出URL" + requestURL);
		if(videoId != null){
			String responsestr = APIServiceFunction.HttpRetrieve(Config.api_video + "?userid=" + Config.userid+"&videoid="+videoId);
			Document doc = DemoUtil.build(responsestr);
			String result = doc.getRootElement().getText();
			APIServiceFunction.HttpRetrieve(Config.api_updateVideo + "?" + requestURL);
		}
		this.writeString(requestURL);
	}

	/**
	 * 删除cc视频资源
	 * @param request
	 * @param response
	 * @param videoId 视频编号
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("deleteCCVideo.do")
	public void deleteCCVideo(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "videoid", required = false) String videoId) throws UnsupportedEncodingException {
		Map<String, String> paramsMap = new HashMap<String, String>();
		paramsMap.put("videoid", videoId);
		paramsMap.put("userid", Config.userid);
		long time = System.currentTimeMillis();
		String salt = Config.key;
		String requestURL = APIServiceFunction.createHashedQueryString(paramsMap, time, salt);
		// get方式
		String responsestr = APIServiceFunction.HttpRetrieve(Config.api_deleteVideo + "?" + requestURL);
		Document doc = DemoUtil.build(responsestr);
		String result = doc.getRootElement().getText();
		this.writeString(result);
	}

}
