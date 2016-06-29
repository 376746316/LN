package com.chinasofti.cetp.utils.ccplayer.config;

import com.chinasofti.cetp.utils.PropertiesUtil;

/**
 * 功能：设置帐户有关信息及返回路径（基础配置页面） 版本：2.1.2 日期：2013-11-13 作者：chu
 **/
public class Config {
	public static final String userid = PropertiesUtil.getProperty("/config.properties", "ccplayer.userid");
	public static final String key = PropertiesUtil.getProperty("/config.properties", "ccplayer.key");

	// notify_url 视频上传过程中服务器通知的页面 要用 http://格式的完整路径，不允许加?id=123这类自定义参数
	public static final String notify_url = PropertiesUtil.getProperty("/config.properties", "ccplayer.notify_url");
	// api_videos api获取视频信息接口
	public static final String api_videos = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_videos");
	// api_userinfo api获取用户信息接口
	public static final String api_user = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_user");
	// api_video api获取指定视频接口
	public static final String api_video = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_video");
	// api_category api获取用户全部分类接口
	public static final String api_category = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_category");
	// api_updatevideo api编辑视频接口
	public static final String api_updateVideo = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_updateVideo");
	// api_deletevideo api删除视频接口
	public static final String api_deleteVideo = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_deleteVideo");
	// api_playCode api获取视频播放代码接口
	public static final String api_playCode = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_playCode");
	// api_searchVideos api搜索视频接口
	public static final String api_searchVideos = PropertiesUtil.getProperty("/config.properties", "ccplayer.api_searchVideos");

}
