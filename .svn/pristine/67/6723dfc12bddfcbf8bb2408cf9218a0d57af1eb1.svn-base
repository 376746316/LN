<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
	$(function() {
		//首先将#back-to-top隐藏
		$("#totop").hide();
		//当滚动条的位置处于距顶部100像素以下时，跳转链接出现，否则消失
		$(function() {
			$(window).scroll(function() {
				if ($(window).scrollTop() > 100) {
					$("#totop").fadeIn();
				} else {
					$("#totop").fadeOut();
				}
			});
			//当点击跳转链接后，回到页面顶部位置
			$("#totop").click(function() {
				$('body,html').animate({
					scrollTop : 0
				}, 500);
				return false;
			});
			$("#icoRealtimeQA").click(function() {
				if ($('#login').text() == "登录") {
					$('#login').click();
					return false;
				}
				return true;
			});
		});
	});
</script>
<style>
* {
	margin: 0;
	padding: 0;
}
/*share_start*/
#share {
	position: fixed;
	_position: absolute;
	_top: expression(eval(document.documentElement.scrollTop +   document.documentElement.clientHeight) -34+"px" );
	bottom: 34px;
	left: 95%;
	width: 30px;
	zoom: 1;
}

#share a {
	background-image: url(${pageContext.request.contextPath }/images/share.png);
	background-repeat: no-repeat;
	display: block;
	width: 30px;
	height: 30px;
	margin-bottom: 2px;
	overflow: hidden;
	text-indent: -999px;
	-webkit-transition: all 0.2s ease-in-out;
	-moz-transition: all 0.2s ease-in-out;
	-o-transition: all 0.2s ease-in-out;
	-ms-transition: all 0.2s ease-in-out;
	transition: all 0.2s ease-in-out;
}

#share a {
	
}

#share .sina {
	background-position: 0 0;
	position: absolute;
	bottom: 32px;
}

#share a.sina:hover {
	background-position: -30px 0;
}

#share .tencent {
	background-position: 0 -30px;
	position: absolute;
	bottom: 0;
}

#share a.tencent:hover {
	background-position: -30px -30px;
}

#share a#totop {
	background-position: 0 -120px;
	position: absolute;
	bottom: 64px;
	cursor: pointer;
}

#share a#totop:hover {
	background-position: -30px -120px;
}
/*share_end*/
</style>
<div id="share">
	<a id="totop" title="返回顶部">返回顶部</a> 
	<a title="意见反馈" href="${pageContext.request.contextPath }/student.do?method=toFeedback" target="_blank" class="sina">意见反馈</a> 
	<a id="icoRealtimeQA" href="${pageContext.request.contextPath }/realtimeQA.do<c:if test="${not empty rqaTechType}">?rqaTechType=${rqaTechType}</c:if>" target="_blank" class="tencent" title="在线答疑">在线答疑</a>
</div>

