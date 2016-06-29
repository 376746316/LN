<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	overflow: hidden;
}
</style>
<title>视频播放</title>
<script type="text/javascript" src="
<c:url value="/js/player/jwplayer.js" />
">
	
</script>
<script type='text/javascript'>
	$(function() {
		createPlayer($("#flvName").val());
	});
	var _jwplayer;
	var _video = {};
	_video.split = 60;
	function createPlayer(fileName) {
		_jwplayer = jwplayer('player').setup({
			flashplayer : ctx + '/swf/player.swf',
			file : fileName,
			streamer : $("#red5Rtmp").val(),
			controlbar : 'bottom',
			width : '100%',
			height : '100%',
			autostart : true,
			//	image : ctx + '/images/vadio688_432.png',
			events : {
				onReady : function() {
					_video.studyTime = _jwplayer.getPosition();
					if (_video.time > 0) {
						//console.log("mp4跳转到时间点" + _video.time);
						_jwplayer.seek(_video.time);
					}
				},
				onMeta : function(event) {
				},
				onIdle : function(event) {
					_video.studyTime = _jwplayer.getPosition();
					try {
						onIdle();
					} catch (e) {
					}
				},
				onComplete : function(event) {
					_video.studyTime = _jwplayer.getPosition();
				},
				onTime : function(event) {
					if (_video.endTime == -1 || _video.endTime == 0 || undefined == _video.endTime) {
						_video.endTime = _jwplayer.getDuration();
						//console.log("mp4视频结束时间：" + _video.endTime);
					}
					_video.studyTime = _jwplayer.getPosition();
					if (_video.studyTime >= _video.split) {
						try {
							checkSessionInfo();
						} catch (e) {
						}
					}
				},
				onPause : function(event) {
					_video.studyTime = _jwplayer.getPosition();
				},
				onError : function(e) {
				}
			}

		});
	}
	//暂停播放
	function pause() {
		_jwplayer.pause();
	}
	//播放视频
	function play() {
		_jwplayer.play();
	}
	//跳转到指定位置播放
	function seek(time) {
		if (time == _video.endTime || time < 0) {
			time = 0;
		}
		_jwplayer.seek(time);
	}
	function setSeek(time) {
		if (time == _video.endTime || time < 0) {
			time = 0;
		}
		_video.time = time;
	}
	//获取当前播放时间点
	function getPlayTime() {
		return _video.studyTime;
	}
	//获取结束时间点
	function getEndTime() {
		return _video.endTime;
	}
	//获取视频状态
	function getState() {
		return _jwplayer.getState();
	}
	function split() {
		_jwplayer.seek(_video.split);
	}
</script>
</head>

<body style="margin: 0px">
	<input type="hidden" id="red5Rtmp" name="red5Rtmp" value="${red5Rtmp }">
	<input type="hidden" id="flvName" name="flvName" value="${flvName }">
	<div style="display: block; width: 100%; height: 100%" id="player"></div>
</body>
</html>
