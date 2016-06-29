<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<script type="text/javascript"
	src="<c:url value="/js/flowplayer-3.2.6.min.js" />"></script>
<script>
	$(function() {
		createPlayer($("#mediaName").val());
	});
	function createPlayer(fileName) {
		var e = $("embed")[0];
		if (e.getAttribute("id")
				&& e.getAttribute("id").toLowerCase() === "player") {
			e.setAttribute("src", ctx + fileName);
			e.setAttribute("filename", location.origin + ctx + fileName);
			e.setAttribute("autostart", "true");
			e.setAttribute("loop", "false");
			e.setAttribute("hidden", "no");
			e.setAttribute("controls", "console");
			newEmbed = e.cloneNode(true);
			e.parentNode.replaceChild(newEmbed, e);
		}
	}
	function flvPause() {

	}
</script>
</head>

<body>
	<input type="hidden" id="mediaName" name="mediaName"
		value="${mediaName }">
	<div id="centerp"
		style="background: #eee; overflow: hidden; width: auto; height: auto;">
		<object classid="clsid:CFCDAA03-8BE4-11cf-B84B-0020AFBBCCFA"
			id="objOne" width="100%" height="100%">
			<embed id="player" width="100%" height="100%" border="0"
				showdisplay="0" showcontrols="1" autostart="0" autorewind="0"
				playcount="0" filename="" src="">
			</embed>
		</object>
	</div>
</body>
</html>
