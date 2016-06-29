package com.chinasofti.cetp.resource.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.resource.model.Video;
import com.chinasofti.cetp.resource.model.VideoUrl;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;
import com.chinasofti.cetp.resource.service.VideoService;
import com.chinasofti.cetp.study.model.SubCourseware;
import com.chinasofti.cetp.study.model.TechType;
import com.chinasofti.cetp.survey.model.DataGrid;
import com.chinasofti.cetp.utils.FileUploadHelper;
import com.chinasofti.cetp.utils.FileUrl;
import com.chinasofti.cetp.utils.Json;
import com.chinasofti.cetp.utils.ReaderXmlParam;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
import com.chinasofti.cetp.utils.TechTypeUtils;
import com.chinasofti.cetp.utils.ccplayer.config.Config;
import com.chinasofti.cetp.utils.iqiyi.IQiYi;

/**
 * 视频资源管理器
 * 
 * @author dingyuanyang
 * 
 */
@Scope("prototype")
@Controller
public class VideoController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(VideoController.class);

	@Autowired
	private VideoService videoService;

	@Autowired
	private FileUploadHelper fileUploadHelper;

	public FileUploadHelper getFileUploadHelper() {
		return fileUploadHelper;
	}

	public void setFileUploadHelper(FileUploadHelper fileUploadHelper) {
		this.fileUploadHelper = fileUploadHelper;
	}

	public VideoService getVideoService() {
		return videoService;
	}

	public void setVideoService(VideoService videoService) {
		this.videoService = videoService;
	}

	/**
	 * 进入视频管理器
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("toVideoMng.do")
	public String toVideoMng(HttpServletRequest request, HttpServletResponse response) {

		request.setAttribute("uid", IQiYi.uid);
		request.setAttribute("appKey", IQiYi.appKey);
		request.setAttribute("appSecret", IQiYi.appSecret);
		request.setAttribute("red5Host", fileUploadHelper.getRed5Host());
		return "resource/videoMng";
	}

	/**
	 * 通过查询条件获取当前的视频列表
	 * 
	 * @param request
	 * @param response
	 * @param rows
	 *            当前页面的行数
	 * @param page
	 *            显示的页面
	 * @param vTitle
	 *            视频标题
	 * @param vTypeId
	 *            视频分类
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("getVideoListByExample.do")
	public void getVideoListByExample(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "seach_vName", required = false, defaultValue = "") String vName, @RequestParam(value = "seach_vTypeId", required = false, defaultValue = "") String vTypeId, @RequestParam(value = "selectTypeId", required = false) String selectTypeId, @RequestParam(value = "selectStatus", required = false, defaultValue = "") String selectStatus, @RequestParam("rows") Integer rows, @RequestParam("page") Integer page) throws UnsupportedEncodingException {
		vName = URLDecoder.decode(vName, "utf-8");
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (selectTypeId == null || "不限制".equals(selectTypeId)) {
			map.put("vName", "%" + vName + "%");
			map.put("vStatus", "%" + selectStatus + "%");
			map.put("vTypeId", "%" + vTypeId + "%");
		} else {
			map.put("vName", "%" + vName + "%");
			map.put("vStatus", "%" + selectStatus + "%");
			map.put("vTypeId", "%" + vTypeId + "%");
			map.put("vTechType", selectTypeId);
		}
		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);
		List<VideoWithBLOBs> list = new ArrayList<VideoWithBLOBs>();
		list = videoService.selectByExampleWithBLOBsList(map, rb);
		for (VideoWithBLOBs video : list) {
			String status = ReaderXmlParam.getInstance().getParam("64", video.getvStatus()).getParam_name();
			video.setvStatus(status);
		}
		DataGrid dataGrid = new DataGrid();
		dataGrid.setRows(list);
		dataGrid.setTotal(rb.getTotalCount());

		writeJson(dataGrid);
	}

	/**
	 * 保存视频的基本信息
	 * 
	 * @param request
	 * @param response
	 * @param vName
	 *            视频名称
	 * @param vComment
	 *            视频简介
	 * @param vType
	 *            视频资源类型
	 */
	@RequestMapping("addVideoInfo.do")
	public void addVideoInfo(HttpServletRequest request, HttpServletResponse response, @RequestParam("vName") String vName, @RequestParam(value = "vFileName", required = false) String vFileName, @RequestParam(value = "vComment", required = false, defaultValue = "没有简介") String vComment, @RequestParam(value = "vPlayUrl", required = false) String vPlayUrl, @RequestParam(value = "vTechType", required = false, defaultValue = "1") Integer vTechType, @RequestParam("vType") String vType) {
		VideoWithBLOBs video = new VideoWithBLOBs();
		video.setvType(vType);
		video.setvName(vName);
		video.setvFileName(vFileName);
		video.setvPlayCount(0);
		video.setvDownloadCount(0);
		video.setvComment(vComment);
		video.setvTechType(vTechType);
		if (vPlayUrl != null) {
			video.setvPlayUrl(vPlayUrl);
			video.setvDownloadUrl(vPlayUrl);
		}
		video.setvStatus("0");
		video.setvRegtime(new Date(System.currentTimeMillis()));
		Integer vId = videoService.addVideo(video);
		video.setvId(vId);
		if (vPlayUrl != null) {
			VideoUrl vu = new VideoUrl();
			vu.setVuPlayUrl(video.getvPlayUrl());
			vu.setVuType("1");
			vu.setVuVId(video.getvId());
			videoService.addVideoUrl(vu);
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy" + File.separator + "MM");
		String date2 = sdf2.format(new Date());
		String path2 = "resource" + File.separator + date2 + File.separator;
		System.out.println("当前的red5路径" + path2);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("video", video);
		map.put("path", path2);
		writeJson(map);
	}

	/***
	 * 修改视频信息
	 * 
	 * @param request
	 * @param response
	 * @param vId
	 *            视频编号
	 * @param vName
	 *            视频名称
	 * @param vComment
	 *            视频简介
	 * @param vType
	 *            视频类型
	 * @param vPlayUrl
	 *            视频播放地址
	 * @param vDownloadUrl
	 *            视频下载地址
	 */
	@RequestMapping("updateVideoInfo.do")
	public void updateVideoInfo(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "vId", required = false) Integer vId, @RequestParam(value = "vName", required = false) String vName, @RequestParam(value = "vFileName", required = false) String vFileName, @RequestParam(value = "vStatus", required = false, defaultValue = "0") String vStatus, @RequestParam(value = "vTechType", required = false) Integer vTechType, @RequestParam(value = "vComment", required = false) String vComment, @RequestParam(value = "vType", required = false) String vType, @RequestParam(value = "vPlayUrl", required = false) String vPlayUrl, @RequestParam(value = "vDownloadUrl", required = false) String vDownloadUrl, @RequestParam(value = "scId", required = false) Integer scId, @RequestParam(value = "scPlayTime", required = false) Integer scPlayTime) {
		VideoWithBLOBs video = new VideoWithBLOBs();
		video.setvType(vType);
		video.setvFileName(vFileName);
		video.setvName(vName);
		video.setvComment(vComment);
		video.setvId(vId);
		video.setvTechType(vTechType);
		video.setvStatus(vStatus);
		if (vPlayUrl != null) {
			video.setvPlayUrl(vPlayUrl);
			video.setvPlayCount(0);
		}
		if (vDownloadUrl != null) {
			video.setvDownloadCount(0);
			video.setvDownloadUrl(vDownloadUrl);
		}
		if (vId == null) {
			video.setvRegtime(new Date(System.currentTimeMillis()));
			vId = videoService.addVideo(video);
			video.setvId(vId);
		} else {
			videoService.updateVideo(video);
		}
		VideoUrl vu = new VideoUrl();
		vu.setVuPlayUrl(video.getvPlayUrl());
		vu.setVuType("1");
		vu.setVuVId(video.getvId());
		if (videoService.selectVideoUrlBy(vId, "1") == null) {
			videoService.addVideoUrl(vu);
		} else {
			videoService.updateVideoUrl(vu);
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy" + File.separator + "MM");
		String date2 = sdf2.format(new Date());
		String path2 = "resource" + File.separator + date2 + File.separator;
		video = videoService.selectVideoByParimaryKey(vId);
		if (scId != null) {
			SubCourseware sc = videoService.selectSubCoursewareById(scId);
			if (sc == null) {
				sc = new SubCourseware();
			}
			sc.setScPlayTime(scPlayTime);
			videoService.updateScById(sc);
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("video", video);
		map.put("path", path2);
		writeJson(map);
	}

	/**
	 * 根据视频编号删除当前的视频
	 * 
	 * @param request
	 * @param response
	 * @param vId
	 *            视频编号
	 */
	@RequestMapping("deleteVideoInfo.do")
	public void deleteVideoInfo(HttpServletRequest request, HttpServletResponse response, @RequestParam("vId") Integer vId) {
		try {
			VideoWithBLOBs video = videoService.selectVideoByParimaryKey(vId);
			// if ("3".equals(video.getvType())) {
			// String downloadUrl = fileUploadHelper.getSavePath() +
			// File.separator;
			// String playerUrl = fileUploadHelper.getRed5Path() +
			// File.separator;
			// downloadUrl += video.getvDownloadUrl();
			// playerUrl += video.getvPlayUrl();
			// System.out.println("下载视频路径：" + downloadUrl);
			// System.out.println("播放视频路径：" + playerUrl);
			// File dFile = new File(downloadUrl);
			// File pFile = new File(playerUrl);
			// if (dFile.delete()) {
			// System.out.println("下载资源已删除");
			// }
			// if (pFile.delete()) {
			// System.out.println("播放资源已删除");
			// }
			// }
			if (video != null) {
				videoService.deleteVideo(vId);
				writeString("success");
			} else {
				writeString("fail");
			}
		} catch (Exception e) {
			writeString("fail");
			e.printStackTrace();
		}
	}

	/**
	 * 上传当前的本地资源
	 * 
	 * @param request
	 * @param response
	 * @param vId
	 * @return
	 */
	@RequestMapping("toUploadForResource.do")
	public String toUploadForResource(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "vId", required = false) Integer vId) {
		if (vId != null) {
			Video video = videoService.selectVideoByParimaryKey(vId);
			request.setAttribute("video", video);
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy" + File.separator + "MM");
		String date2 = sdf2.format(new Date());
		String path2 = "resource" + File.separator + date2 + File.separator;
		System.out.println("当前的red5路径" + path2);
		request.setAttribute("red5Host", fileUploadHelper.getRed5Host());
		request.setAttribute("red5Path", path2);
		return "resource/videoUpload";
	}

	/**
	 * 上传到Iqiyi资源库
	 * 
	 * @param request
	 * @param response
	 * @param vId
	 * @return
	 */
	@RequestMapping("toUploadForIQiYi.do")
	public String toUploadForIQiYi(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "vId", required = false) Integer vId) {
		if (vId != null) {
			Video video = videoService.selectVideoByParimaryKey(vId);
			request.setAttribute("video", video);
		}
		request.setAttribute("uid", IQiYi.uid);
		request.setAttribute("appKey", IQiYi.appKey);
		request.setAttribute("appSecret", IQiYi.appSecret);
		return "iqiyi/upload";
	}

	/**
	 * 上传资源库管理的视频资源
	 * 
	 * @param request
	 * @param response
	 * @param vId
	 *            视频编号
	 * @throws Exception
	 */
	@RequestMapping("videoFileUploadToResource.do")
	public void videoFileUploadToResource(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "vId", required = false) Integer vId) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy" + File.separator + "MM");
		String date = sdf.format(new Date());
		VideoWithBLOBs video = videoService.selectVideoByParimaryKey(vId);
		String path = File.separator + date + File.separator + "resource" + File.separator + "video" + File.separator + vId + File.separator;
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMM");
		String date2 = sdf2.format(new Date());
		String path2 = File.separator + date2 + File.separator;
		List<TechType> list = TechTypeUtils.findParents(video.getvTechType());
		logger.info("当前的分类：" + list.size());
		String[] arr = new String[list.size()];
		int i = 0;
		for (TechType t : list) {
			arr[i] = t.getTechTypeName();
			i++;
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			if (!"".equals(arr[j])) {
				path2 += arr[j] + File.separator;
			}
		}
		System.out.println("当前的red5路径" + path2 + vId + File.separator);
		List<FileUrl> fileNameList = fileUploadHelper.uploadFiles(request, path, true, path2 + vId + File.separator);
		FileUrl fileUrl = fileNameList.get(0);
		// this.deleteHomeworkFile(request, response, chapId, exerId, null);
		// System.out.println("删除原有文件");
		// 删除文件
		FileUrl temp = new FileUrl();
		if ("3".equals(video.getvType()) && (video.getvPlayUrl() != null && video.getvDownloadUrl() != null)) {
			temp.setDownloadUrl(video.getvDownloadUrl());
			temp.setVideoUrl(video.getvPlayUrl());
			try {
				fileUploadHelper.deleteFile(request, temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 重新设置文件
		video.setvDownloadCount(0);
		video.setvPlayCount(0);
		video.setvPlayUrl(fileUrl.getVideoUrl());
		video.setvDownloadUrl(fileUrl.getDownloadUrl());
		// 更新视频信息到数据库
		try {
			videoService.updateVideo(video);
			response.setCharacterEncoding("utf-8");
			response.getWriter().write("success");
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("fail");
		}
	}

	@RequestMapping("deleteVideoUploadFile.do")
	public void deleteVideoUploadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("vId") Integer vId) {
		VideoWithBLOBs video = this.videoService.selectVideoByParimaryKey(vId);
		FileUrl fileUrl = new FileUrl();
		fileUrl.setDownloadUrl(video.getvDownloadUrl());
		fileUrl.setVideoUrl(video.getvPlayUrl());
		try {
			fileUploadHelper.deleteFile(request, fileUrl);
			video.setvDownloadUrl("");
			video.setvPlayUrl("");
			this.videoService.updateVideo(video);
			this.writeString("success");
		} catch (Exception e) {
			this.writeString("fail");
			e.printStackTrace();
		}
	}

	/**
	 * 学生预览课
	 * 
	 * @param request
	 * @param response
	 * @param vId
	 */
	@RequestMapping("checkVideoTypeForPlayer.do")
	public void checkVideoTypeForPlayer(HttpServletRequest request, HttpServletResponse response, @RequestParam("scId") Integer scId) {
		SubCourseware sc = videoService.selectSubCoursewareById(scId);
		Json json = new Json();
		if (sc == null || sc.getScVideo() == null) {
			json.setMsg("预览失败，视频正在完善中....");
			json.setSuccess(false);
			writeJson(json);
			return;
		}
		Integer vId = sc.getScVideo();
		VideoWithBLOBs video = this.videoService.selectVideoByParimaryKey(vId);
		if (video == null || video.getvPlayUrl() == null || "1".equals(video.getvType()) || "2".equals(video.getvType())) {
			json.setMsg("预览失败，当前资源不能提供预览功能，请先学习本门课程.");
			json.setSuccess(false);
		} else {
			json.setSuccess(true);
			json.setObj(video.getvPlayUrl());
		}
		writeJson(json);
	}

	/********** -视频发布 ******************************/
	@RequestMapping(value = "publishCCCallback_{vId}.do", method = RequestMethod.GET)
	public void publishCCCallback(@PathVariable Integer vId, @RequestParam(value = "videoid", required = false, defaultValue = "-1") String videoid, @RequestParam(value = "status", required = false) String status, @RequestParam(value = "duration", required = false) String duration, @RequestParam(value = "image", required = false) String image) {
		logger.info("发布视频回调:" + vId);
		Json json = new Json();
		if ("-1".equals(videoid)) {
			json.setMsg("视频发布失败");
			json.setSuccess(false);
			writeJson(json);
			VideoWithBLOBs video = new VideoWithBLOBs();
			video.setvId(vId);
			video.setvStatus("2");
			videoService.updateVideo(video);
			return;
		} else {
			VideoWithBLOBs video = videoService.selectVideoByParimaryKey(vId);
			List<VideoUrl> list = videoService.selectVideoUrlBy(vId, "2");
			VideoUrl v = new VideoUrl();
			if (list != null && list.size() > 0) {
				v = list.get(0);
				videoService.deleteByMap(vId, "2");
			}
			v.setVuType("2");
			v.setVuPlayUrl(Config.userid + "&" + videoid);
			v.setVuVId(vId);
			videoService.addVideoUrl(v);
			video.setvStatus("3");
			videoService.updateVideo(video);
			json.setSuccess(true);
			json.setMsg("发布视频成功.");
			writeJson(json);
		}
	}
}
