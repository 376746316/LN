package com.chinasofti.cetp.resource.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.resource.model.ListVideo;
import com.chinasofti.cetp.resource.model.ListVideoWithBLOBs;
import com.chinasofti.cetp.resource.model.PlayList;
import com.chinasofti.cetp.resource.model.PlayListExample;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;
import com.chinasofti.cetp.resource.service.PlayListService;
import com.chinasofti.cetp.utils.FileUploadHelper;
import com.chinasofti.cetp.utils.Json;
import com.chinasofti.cetp.utils.LoginRequired;
import com.chinasofti.cetp.utils.LoginRequired.LoginType;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
import com.google.gson.Gson;

@Scope("prototype")
@Controller
@RequestMapping()
public class PlayListController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(PlayListController.class);

	@Autowired
	private PlayListService playListService;
	@Autowired
	private FileUploadHelper fileUploadHelper;

	/**
	 * 进入成长阶段管理页面
	 * 
	 * @return
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("toMngGrowthDirectionVideo.do")
	public String toMngGrowthDirectionVideo() {
		return "resource/growth/playListMng";
	}

	/**
	 * 获取成长阶段栏目
	 * 
	 * @param rows
	 * @param page
	 * @param listName
	 * @throws UnsupportedEncodingException
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("getAllPlayList.do")
	public void getPlayList(@RequestParam("rows") Integer rows, @RequestParam("page") Integer page, @RequestParam(value = "listName", required = false, defaultValue = "") String listName) throws UnsupportedEncodingException {
		listName = URLDecoder.decode(listName, "utf-8");
		PlayListExample example = new PlayListExample();
		example.createCriteria().andListNameLike("%" + listName + "%");
		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);
		Gson gson = new Gson();
		String json = "";
		List<PlayList> list = playListService.selectPlayList(example, rb);
		json = "{\"total\":" + rb.getTotalCount() + ",\"rows\":" + gson.toJson(list) + "}";

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

	/**
	 * 进入编辑栏目页面
	 * 
	 * @param listId
	 *            栏目编号
	 * @return
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("toEditPlayList.do")
	public String toEditPlayList(@RequestParam(value = "listId", required = false) Integer listId) {
		if (listId != null) {
			PlayList playList = playListService.selectPlayListById(listId);
			request.setAttribute("playList", playList);
		}
		return "resource/growth/editPlayList";
	}

	/**
	 * 保存编辑的栏目信息
	 * 
	 * @param playList
	 *            栏目信息
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("addOrUpdatePlayList.do")
	public void addOrUpdatePlayList(PlayList playList) {
		playList.setListUpdatetime(new Date(System.currentTimeMillis()));
		Json json = new Json();
		try {
			if (playList.getListId() == null) {
				playListService.addPlayList(playList);
			} else {
				playListService.updatePlayList(playList);
			}
			json.setSuccess(true);
		} catch (Exception e) {
			json.setMsg("编辑失败，请刷新再试.");
			e.printStackTrace();
		}
		this.writeJson(json);
	}

	/**
	 * 删除栏目
	 * 
	 * @param listId
	 *            栏目编号
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("deletePlayList.do")
	public void deletePlayList(@RequestParam("listId") Integer listId) {
		Json json = new Json();
		try {
			playListService.deletePlayList(listId);
			json.setSuccess(true);
		} catch (Exception e) {
			json.setMsg("编辑失败，请刷新再试.");
			e.printStackTrace();
		}
		this.writeJson(json);
	}

	/**
	 * 进入管理栏目视频
	 * 
	 * @param listId
	 *            栏目编号
	 * @return
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("toMngPlayListVideos.do")
	public String toMngPlayListVideos(@RequestParam("listId") Integer listId) {
		PlayList playList = playListService.selectPlayListById(listId);
		request.setAttribute("playList", playList);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy" + File.separator + "MM");
		String date2 = sdf2.format(new Date());
		String path2 = "growth" + File.separator + "list_" + listId + File.separator + date2 + File.separator;
		System.out.println("当前的red5路径" + path2);
		request.setAttribute("red5Path", path2);
		request.setAttribute("red5Host", fileUploadHelper.getRed5Host());
		return "resource/growth/playListVideosMng";
	}

	/**
	 * 获取栏目下的所有视频
	 * 
	 * @param rows
	 * @param page
	 * @param vName
	 * @param vTypeId
	 * @param selectTypeId
	 * @param selectStatus
	 * @param listId
	 * @throws UnsupportedEncodingException
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("getAllVideosByListId.do")
	public void getAllVideosByListId(@RequestParam("rows") Integer rows, @RequestParam("page") Integer page, @RequestParam(value = "seach_vName", required = false, defaultValue = "") String vName, @RequestParam(value = "seach_vTypeId", required = false, defaultValue = "") String vTypeId, @RequestParam(value = "selectTypeId", required = false) Integer selectTypeId, @RequestParam(value = "selectStatus", required = false, defaultValue = "") String selectStatus, @RequestParam("listId") Integer listId) throws UnsupportedEncodingException {
		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);
		Gson gson = new Gson();
		String json = "";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("listId", listId);
		vName = URLDecoder.decode(vName, "utf-8");
		map.put("vName", "%" + vName + "%");
		map.put("vStatus", "%" + selectStatus + "%");
		map.put("vTypeId", "%" + vTypeId + "%");
		map.put("vTechType", selectTypeId);
		List<ListVideoWithBLOBs> list = playListService.selectVideoListByListId(map, rb);
		json = "{\"total\":" + rb.getTotalCount() + ",\"rows\":" + gson.toJson(list) + "}";

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

	/**
	 * 获取当前栏目中不包含的视频
	 * 
	 * @param rows
	 * @param page
	 * @param vName
	 * @param vTypeId
	 * @param selectTypeId
	 * @param selectStatus
	 * @param listId
	 * @throws UnsupportedEncodingException
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("getAllVideosNotByListId.do")
	public void getAllVideosNotByListId(@RequestParam("rows") Integer rows, @RequestParam("page") Integer page, @RequestParam(value = "seach_vName", required = false, defaultValue = "") String vName, @RequestParam(value = "seach_vTypeId", required = false, defaultValue = "") String vTypeId, @RequestParam(value = "selectTypeId", required = false) Integer selectTypeId, @RequestParam(value = "selectStatus", required = false, defaultValue = "") String selectStatus, @RequestParam("listId") Integer listId) throws UnsupportedEncodingException {
		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);
		Gson gson = new Gson();
		String json = "";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("listId", listId);
		vName = URLDecoder.decode(vName, "utf-8");
		map.put("vName", "%" + vName + "%");
		map.put("vStatus", "%" + selectStatus + "%");
		map.put("vTypeId", "%" + vTypeId + "%");
		map.put("vTechType", selectTypeId);
		List<VideoWithBLOBs> list = playListService.getAllVideosNotByListId(map, rb);
		json = "{\"total\":" + rb.getTotalCount() + ",\"rows\":" + gson.toJson(list) + "}";

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

	/**
	 * 选择栏目视频
	 * 
	 * @param lv
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("addListVideoByKey.do")
	public void addListVideoByKey(ListVideo lv) {
		Json json = new Json();
		lv.setLvUpdatetime(new Date(System.currentTimeMillis()));
		try {
			playListService.addListVideo(lv);
			json.setSuccess(true);
		} catch (Exception e) {
			json.setMsg("服务器繁忙，请稍后重试");
			e.printStackTrace();
		}
		this.writeJson(json);
	}

	/**
	 * 上传栏目视频
	 * 
	 * @param video
	 * @param listId
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("addPlayListVideo.do")
	public void addPlayListVideo(VideoWithBLOBs video, @RequestParam("listId") Integer listId) {
		Json json = new Json();
		if (listId == null) {
			json.setMsg("请选择要添加视频的栏目");
			json.setSuccess(false);
			this.writeJson(json);
			return;
		}
		video.setvPlayCount(0);
		video.setvDownloadCount(0);
		if (video.getvPlayUrl() != null) {
			video.setvDownloadUrl(video.getvPlayUrl());
		}
		video.setvStatus("0");
		video.setvRegtime(new Date(System.currentTimeMillis()));
		try {
			ListVideo lv = new ListVideo();
			lv.setLvUpdatetime(new Date(System.currentTimeMillis()));
			lv.setLvListId(listId);
			lv.setLvVideoId(playListService.addVideo(video));
			playListService.addListVideo(lv);
			json.setSuccess(true);
		} catch (Exception e) {
			json.setMsg("服务器繁忙，请稍后重试");
			e.printStackTrace();
		}
		this.writeJson(json);
	}

	/**
	 * 更新视频封面
	 * 
	 * @param lvId
	 * @param lvImg
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("updatePlayListVideo.do")
	public void updatePlayListVideo(@RequestParam("lvId") Integer lvId, @RequestParam("lvImg") String lvImg) {
		Json json = new Json();
		if (lvId == null) {
			json.setMsg("请选择要添加封面的视频");
			json.setSuccess(false);
			this.writeJson(json);
			return;
		}
		try {
			ListVideo lv = playListService.selectListVideoById(lvId);
			lv.setLvUpdatetime(new Date(System.currentTimeMillis()));
			String tempPath = lvImg;
			if (tempPath != null && !tempPath.equals(lv.getLvImg())) {
				tempPath = tempPath.replace("/", File.separator);
				String savePath = request.getSession().getServletContext().getRealPath(tempPath);
				File thumb = new File(savePath);
				logger.info("临时封面的位置：" + thumb.getAbsolutePath());
				if (thumb.exists()) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy" + File.separator + "MM");
					String ymd = sdf.format(new Date());
					String path = "upload" + File.separator + ymd + File.separator + "resource" + File.separator + "listvideo" + File.separator + lvId + File.separator + "thumb.png";
					File newFile = new File(request.getSession().getServletContext().getRealPath(File.separator + path));
					if (newFile.exists()) {
						newFile.delete();
					}
					if (!newFile.getParentFile().exists()) {
						newFile.getParentFile().mkdirs();
					}
					thumb.renameTo(newFile);
					logger.info("数据库封面的位置：" + newFile.getAbsolutePath());
					lv.setLvImg(path);
					logger.info("更新视频封面：" + lv.getLvImg());
					playListService.updateListVideo(lv);
					json.setSuccess(true);
				}else{
					json.setMsg("未知原因导致了图片不存在");
				}
			}else{
				json.setMsg("您没有更新视频封面");
			}
		} catch (Exception e) {
			json.setMsg("服务器繁忙，请稍后重试");
			e.printStackTrace();
		}
		this.writeJson(json);
	}

	/**
	 * 删除栏目视频
	 * 
	 * @param lvId
	 */
	@LoginRequired(type = LoginType.BACKGROUND)
	@RequestMapping("deleteListVideoByKey.do")
	public void deleteListVideoByKey(@RequestParam("lvId") Integer lvId) {
		Json json = new Json();
		try {
			playListService.deleteListVideoById(lvId);
			json.setSuccess(true);
		} catch (Exception e) {
			json.setMsg("服务器繁忙，请稍后重试");
			e.printStackTrace();
		}
		this.writeJson(json);
	}

	/**
	 * 上传视频封面
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("uploadListVideoThumb.do")
	public void uploadListVideoThumb(HttpServletRequest request, HttpServletResponse response) {

		try {

			String path = "upload" + File.separator + "temp" + File.separator;
			String savePath = request.getSession().getServletContext().getRealPath(path);

			File uploadDir = new File(savePath);
			if (!uploadDir.isDirectory()) {
				uploadDir.mkdirs();
			}

			File file = new File(uploadDir, "listVideoThumb" + System.currentTimeMillis() + ".png");
			String url = path + file.getName();
			ImageInputStream ii = ImageIO.createImageInputStream(request.getInputStream());

			BufferedImage br = ImageIO.read(ii);
			if (!file.exists()) {
				file.createNewFile();
			}
			// 将BufferedImage变量写入文件中。
			ImageIO.write(br, "png", file);

			response.getWriter().append("{\"status\":1,\"url\":\"" + url.replace(File.separator, "/") + "\"}");
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			try {
				response.getWriter().append("{\"status\":-2}");
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}
}
