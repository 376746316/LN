package com.chinasofti.cetp.utils;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.resource.model.CollectVideo;
import com.chinasofti.cetp.resource.model.CollectVideoKey;
import com.chinasofti.cetp.resource.model.CommentVideo;
import com.chinasofti.cetp.resource.model.CommentVideoKey;
import com.chinasofti.cetp.resource.model.PlayListWithVideo;
import com.chinasofti.cetp.resource.model.VideoUrl;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;
import com.chinasofti.cetp.resource.service.PlayerService;
import com.chinasofti.cetp.utils.PropertiesUtil;

/**
 * 视频播放控制器
 * 
 * @author dyy
 * 
 */
@Scope("prototype")
@Controller
public class PlayerController extends BaseController {

	private static final Logger logger = Logger.getLogger(DocConverter.class);
	private final String playSeq = PropertiesUtil.getProperty("/config.properties", "playSeq");
	private FileUploadHelper fileUploadHelper;

	@Autowired
	private PlayerService playerService;

	public FileUploadHelper getFileUploadHelper() {
		return fileUploadHelper;
	}

	public void setFileUploadHelper(FileUploadHelper fileUploadHelper) {
		this.fileUploadHelper = fileUploadHelper;
	}

	public PlayerService getPlayerService() {
		return playerService;
	}

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	@RequestMapping(value = "toMediaPlayer.do", params = { "vid", "tvId" })
	public String toMediaPlayer(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "vid", required = false) String vid, @RequestParam(value = "tvId", required = false) Integer tvId) {
		VideoWithBLOBs video = playerService.selectVideoByParimaryKey(tvId);
		if ("3".equals(video.getvType()) || "4".equals(video.getvType())) {
			String url = this.toMediaPlayer(request, response, video.getvPlayUrl());
			return url;
		} else if ("1".equals(video.getvType())) {
			request.setAttribute("vPlayUrl", video.getvPlayUrl());
			System.out.println("爱奇艺视频播放地址:vPlayUrl=" + video.getvPlayUrl());
			return "player/iqiyi/iqiyi";
		} else {
			String playUrl = video.getvPlayUrl();
			String[] split = playUrl.split("&");
			request.setAttribute("userId", split[0]);
			request.setAttribute("videoId", split[1]);
			System.out.println("cc视频播放地址:" + tvId + "\t---" + vid);
			return "player/ccplayer/ccplayer";
		}
		// Integer start = videoUrl.lastIndexOf(".") + 1;
		// logger.info("当前视频播放URL" + videoUrl);
		// String type = videoUrl.substring(start).toLowerCase();
		// String tempUrl = fileUploadHelper.getRed5Path() + "\\" + videoUrl;
		// String serviceUrl = request.getSession().getServletContext()
		// .getRealPath("\\upload" + videoUrl);
		// logger.info(tempUrl);
		// logger.info(serviceUrl);
		// File tempUrlFile = new File(tempUrl);
		// File serviceUrlFile = new File(serviceUrl);
		// if (!serviceUrlFile.exists() && !tempUrlFile.exists()) {
		// return "player/error/nofound";
		// }
		// if ("flv".equals(type)) {
		// String red5Path = fileUploadHelper.getRed5Path();
		// int end = red5Path.lastIndexOf("/");
		// String tempPath = red5Path.substring(0,end);
		// logger.info(tempPath);
		// int start2 = tempPath.lastIndexOf("/")+1;
		// String red5Project = tempPath.substring(start2, end);
		// logger.info(red5Project);
		// String flvName = videoUrl.substring(0, start - 1);
		// logger.info("播放的flv名字：" + flvName);
		// request.setAttribute("flvName", flvName);
		// request.setAttribute("red5Project", red5Project);
		// return "player/flv/flvPlayer";
		// } else if ("mp4".equals(type)) {
		// String red5Path = fileUploadHelper.getRed5Path();
		// int end = red5Path.lastIndexOf("/");
		// String tempPath = red5Path.substring(0,end);
		// logger.info(tempPath);
		// int start2 = tempPath.lastIndexOf("/")+1;
		// String red5Project = tempPath.substring(start2, end);
		// logger.info(red5Project);
		// String flvName = videoUrl.substring(0, start - 1);
		// logger.info("播放的mp4名字：" + flvName);
		// request.setAttribute("flvName", flvName+".mp4");
		// request.setAttribute("red5Project", red5Project);
		// return "player/mp4/mp4Player";
		// } else {
		// videoUrl = videoUrl.replace("\\", "/");
		// request.setAttribute("mediaName", "/upload" + videoUrl);
		// return "player/" + type + "/" + type + "Player";
		//
		// }
	}

	@RequestMapping(value = "toMediaPlayer.do", params = { "videoUrl" })
	public String toMediaPlayer(HttpServletRequest request, HttpServletResponse response, @RequestParam("videoUrl") String videoUrl) {
		Integer start = videoUrl.lastIndexOf(".") + 1;
		logger.info("当前视频播放URL" + videoUrl);
		String type = videoUrl.substring(start).toLowerCase();
		String tempUrl = fileUploadHelper.getRed5Path() + File.separator + videoUrl;
		String serviceUrl = request.getSession().getServletContext().getRealPath(File.separator + "upload" + videoUrl);
		logger.info(tempUrl);
		logger.info(serviceUrl);
		File tempUrlFile = new File(tempUrl);
		File serviceUrlFile = new File(serviceUrl);
		// if (!serviceUrlFile.exists() && !tempUrlFile.exists()) {
		// return "player/error/nofound";
		// }
		if ("flv".equals(type)) {
			String flvName = videoUrl.substring(0, start - 1);
			logger.info("播放的flv名字：" + flvName);
			request.setAttribute("flvName", flvName);
			request.setAttribute("red5Rtmp", fileUploadHelper.getRed5Rtmp());
			return "player/flv/flvPlayer";
		} else if ("mp4".equals(type)) {
			String flvName = videoUrl.substring(0, start - 1);
			logger.info("播放的mp4名字：" + flvName);
			request.setAttribute("flvName", flvName + ".mp4");
			request.setAttribute("red5Rtmp", fileUploadHelper.getRed5Rtmp());
			return "player/mp4/mp4Player";
		} else {
			videoUrl = videoUrl.replace("\\", "/");
			request.setAttribute("mediaName", "/upload" + videoUrl);
			return "player/" + type + "/" + type + "Player";

		}
	}

	/**
	 * 进入视频播放页面
	 * 
	 * @param type
	 *            进入的位置(1:入学季，2：成长季，3：毕业季，4：工作季)
	 * @param listId
	 *            播放list编号
	 * @return
	 */
	@RequestMapping("toPlayListShowJsp.do")
	public String toPlayListShowJsp(@RequestParam(value = "type", required = false, defaultValue = "1") String type, @RequestParam("listId") Integer listId, @RequestParam(value = "vId", required = false) Integer vId) {
		PlayListWithVideo pList = playerService.selectPListById(listId);
		if(pList==null){
			return "redirect:sys.do?method=index";
		}
		request.setAttribute("pList", pList);
		request.setAttribute("type", type);
		request.setAttribute("vId", vId);
		return "player/growth/playListShow";
	}

	/**
	 * 获取视频信息页面
	 * 
	 * @param vId
	 * @return
	 */
	@RequestMapping("toVideoInfoForPlayer.do")
	public String toVideoInfoForPlayer(@RequestParam("vId") Integer vId) {
		request.setAttribute("recommend", playerService.selectRecommendCount(vId));
		request.setAttribute("notRecommend", playerService.selectNotRecommendCount(vId));
		if (this.getSessionInfo() != null && this.getSessionInfo().getStuNo() != null) {
			CollectVideoKey key = new CollectVideoKey();
			key.setCollvStuNo(getSessionInfo().getStuNo());
			key.setCollvVId(vId);
			request.setAttribute("collected", playerService.selectCollvByKey(key));
			CommentVideoKey cvkey = new CommentVideoKey();
			cvkey.setCommvStuNo(getSessionInfo().getStuNo());
			cvkey.setCommvVId(vId);
			request.setAttribute("commentVideo", playerService.selectCommvByKey(cvkey));
		}
		request.setAttribute("vId", vId);
		return "player/growth/videoInfo";
	}

	/**
	 * 根据编号获取到播放视频
	 * 
	 * @param vId
	 *            视频编号
	 * @return
	 */
	@RequestMapping("getVideoForPlayer.do")
	public String getVideoForPlayer(@RequestParam("vId") Integer vId) {
		String[] seqArray = playSeq.split(",");
		VideoWithBLOBs video = playerService.selectVideoByParimaryKey(vId);
		String firstPlayType = seqArray[0];
		String secondPlayType = seqArray[1];
		String thirdPlayType = seqArray[2];
		VideoUrl vUrl = null;
		// 根据配置的视频播放顺序来查询当前的视频播放地址
		vUrl = playerService.selectVideoUrlBy(firstPlayType, vId);
		if (vUrl == null || vUrl.getVuPlayUrl() == null) {
			vUrl = playerService.selectVideoUrlBy(secondPlayType, vId);
			if (vUrl == null || vUrl.getVuPlayUrl() == null) {
				vUrl = playerService.selectVideoUrlBy(thirdPlayType, vId);
				if (vUrl == null || vUrl.getVuPlayUrl() == null) {
					vUrl = playerService.selectVideoUrlBy(thirdPlayType, vId);
					return "player/error/nofound";
				}
			}
		}
		String type = vUrl.getVuType();
		String videoUrl = vUrl.getVuPlayUrl();
		video.setvPlayCount(video.getvPlayCount() + 1);
		playerService.updateVideo(video);
		switch (type.charAt(0)) {
		case '2':
			String[] split = videoUrl.split("&");
			request.setAttribute("userId", split[0]);
			request.setAttribute("videoId", split[1]);
			logger.info("cc视频播:" + split[0] + "\t---" + split[1]);
			return "player/ccplayer/ccplayer";
		case '3':
			request.setAttribute("vPlayUrl", videoUrl);
			logger.info("爱奇艺视频播放地址:videoUrl=" + videoUrl);
			return "player/iqiyi/iqiyi";
		default:
			Integer start = videoUrl.lastIndexOf(".") + 1;
			logger.info("当前本地视频播放URL" + videoUrl);
			String fileType = videoUrl.substring(start).toLowerCase();
			if ("flv".equals(fileType)) {
				String flvName = videoUrl.substring(0, start - 1);
				logger.info("播放的flv名字：" + flvName);
				request.setAttribute("flvName", flvName);
				request.setAttribute("red5Rtmp", fileUploadHelper.getRed5Rtmp());
				return "player/flv/flvPlayer";
			} else if ("mp4".equals(fileType)) {
				String flvName = videoUrl.substring(0, start - 1);
				logger.info("播放的mp4名字：" + flvName);
				request.setAttribute("flvName", flvName + ".mp4");
				request.setAttribute("red5Rtmp", fileUploadHelper.getRed5Rtmp());
				return "player/mp4/mp4Player";
			} else {
				videoUrl = videoUrl.replace("\\", "/");
				request.setAttribute("mediaName", "/upload" + videoUrl);
				return "player/" + fileType + "/" + fileType + "Player";

			}
		}

	}

	/**
	 * 收藏视频
	 * 
	 * @param vId
	 */
	@RequestMapping("toCollectVideo.do")
	public void toCollectVideo(@RequestParam("vId") Integer vId) {
		Json json = new Json();
		if (this.getSessionInfo() != null && this.getSessionInfo().getStuNo() != null) {
			CollectVideo cv = new CollectVideo();
			cv.setCollvStuNo(getSessionInfo().getStuNo());
			cv.setCollvVId(vId);
			cv.setCollvUpdatetime(new Date(System.currentTimeMillis()));
			playerService.collectVideo(cv);
			json.setSuccess(true);
		} else {
			json.setMsg("收藏失败，你没有收藏视频的权限");
			json.setSuccess(false);
		}

		this.writeJson(json);
	}

	/**
	 * 取消收藏视频
	 * 
	 * @param vId
	 */
	@RequestMapping("toCancelCollectVideo.do")
	public void toCancelCollectVideo(@RequestParam("vId") Integer vId) {
		Json json = new Json();
		if (this.getSessionInfo() != null && this.getSessionInfo().getStuNo() != null) {
			CollectVideoKey key = new CollectVideoKey();
			key.setCollvStuNo(getSessionInfo().getStuNo());
			key.setCollvVId(vId);
			playerService.cancelCollectVideo(key);
			json.setSuccess(true);
		} else {
			json.setMsg("取消收藏失败");
			json.setSuccess(false);
		}

		this.writeJson(json);
	}

	/**
	 * 评价视频
	 * 
	 * @param vId
	 */
	@RequestMapping("toCommentVideo.do")
	public void toCommentVideo(@RequestParam("vId") Integer vId, @RequestParam(value="commvFlag",defaultValue="1") String commvFlag) {
		Json json = new Json();
		if (this.getSessionInfo() != null && this.getSessionInfo().getStuNo() != null) {
			CommentVideoKey key = new CommentVideoKey();
			key.setCommvStuNo(getSessionInfo().getStuNo());
			key.setCommvVId(vId);
			CommentVideo cv = playerService.selectCommvByKey(key);
			if (cv == null) {
				cv = new CommentVideo();
				cv.setCommvFlag(commvFlag);
				cv.setCommvStuNo(getSessionInfo().getStuNo());
				cv.setCommvUpdatetime(new Date(System.currentTimeMillis()));
				cv.setCommvVId(vId);
				playerService.addCommVideoVideo(cv);
				json.setSuccess(true);
			}else{
//				cv.setCommvFlag(commvFlag);
//				cv.setCommvUpdatetime(new Date(System.currentTimeMillis()));
//				playerService.updateCommVideoVideo(cv);
				json.setMsg("每个人只允许评价一次");
				json.setSuccess(false);
			}
		} else {
			json.setMsg("评价失败，你没有评价视频的权限");
			json.setSuccess(false);
		}

		this.writeJson(json);
	}
}
