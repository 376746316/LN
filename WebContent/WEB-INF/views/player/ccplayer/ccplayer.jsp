<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CC视频播放</title>
<style type="text/css">
html {
	overflow: hidden;
}
</style>
</style>
</head>
<body>
	<input type="hidden" id="userId" name="userId" value="${userId }">
	<!--C8075CE19C8E1AA9  -->
	<input type="hidden" id="videoId" name="videoId" value="${videoId }">
	<!-- 91C8F3ADC63513689C33DC5901307461 -->
	<!-- objectId:cc_video_91C8F3ADC63513689C33DC5901307461_1240161 -->
	<script src="http://p.bokecc.com/player?vid=${videoId }&siteid=${userId }&autoStart=true&width=100%&height=100%&playerid=C0B4C5DDDB5A3F31&playertype=1" type="text/javascript">
		
	</script>
	<script type="text/javascript">
		var player;
		function on_cc_player_init(vid, objectID) {
			var config = {};
			config.rightmenu_enable = 0;
			config.keyboard_enable = 0;
			config.recommend_enable = 0;
			player = getSWF(objectID);
			player.setConfig(config);
		}

		function getSWF(swfID) {
			if (navigator.appName.indexOf("Microsoft") != -1) {
				return window[swfID];
			} else {
				return document[swfID];
			}
		}
		function on_spark_player_ready() {
			//alert("播放器加载完毕");
		}

		//	-------------------
		//	调用者：flash
		//	功能：播放器开始播放时所调用函数
		//	时间：2010-12-22
		//	说明：用户可以加入相应逻辑
		//	-------------------
		function on_spark_player_start() {
			//console.log("开始事件");
			if (getPlayTime() >= 60) {
				try {
					checkSessionInfo();
				} catch (e) {
				}
			}
		}

		//	-------------------
		//	调用者：flash
		//	功能：播放器暂停时所调用函数
		//	时间：2010-12-22
		//	说明：用户可以加入相应逻辑
		//	-------------------
		function on_spark_player_pause() {
			//alert('暂停播放');
		}
		function on_spark_player_seek() {
			//console.log("拖动事件");
			if (getPlayTime() >= 60) {
				try {
					checkSessionInfo();
				} catch (e) {
				}
			}
		}

		//	-------------------
		//	调用者：flash
		//	功能：播放器暂停后，继续播放时所调用函数
		//	时间：2010-12-22
		//	说明：用户可以加入相应逻辑
		//	-------------------
		function on_spark_player_resume() {
			//alert('暂停后继续播放');
		}
		//	-------------------
		//	调用者：flash
		//	功能：播放出错的时候
		//	时间：2010-12-22
		//	说明：用户可以加入相应逻辑
		//	-------------------
		function on_spark_player_playerror(code) {
			//alert('暂停后继续播放');
		}

		//	-------------------
		//	调用者：flash
		//	功能：播放器播放停止时所调用函数
		//	时间：2010-12-22
		//	说明：用户可以加入相应逻辑
		//	-------------------
		function on_spark_player_stop() {
			try {
				onIdle();
			} catch (e) {
			}
		}
		//暂停播放
		function pause() {
			player.pause();
		}
		//播放视频
		function play() {
			player.start();
		}
		//跳转到指定位置播放
		function seek(time) {
			player.seek(time);
		}
		function setSeek(time) {
		}
		//获取当前播放时间点
		function getPlayTime() {
			return player.getPosition();
		}
		//获取结束时间点
		function getEndTime() {
			return player.getDuration();
		}
		//获取视频状态
		function getState() {
		}
		function split() {
			player.seek(60);
		}
	</script>
</body>
</html>