<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
	var flag = true;
	$(function() {
		$(".state1[click='true']").die().live('click', function() {
			if ($(this).attr("act") == "login") {
				try {
					v_iframe.window.pause();
				} catch (e) {

				}
				$("body").append('<div class="lagebg posa"></div>');
				$('.lagebg').css({
					height : $(document).height() || $(window).height()
				});
				$('.k_login').show().css({
					left : ($(window).width() - $('.k_login').outerWidth()) / 2,
					top : ($(window).height() - $('.k_login').outerHeight()) / 2 + $(window).scrollTop()
				});
			} else {
				if ($(".state2").hasClass("state2_selected") || $(this).hasClass("state1_selected")) {
					$("#_tip_lis").text("你已经对视频做出过评价了，谢谢！").show();
					setTimeout('$("#_tip_lis").hide()', 5000);
				} else {
					commentVideo(this);
				}
			}
		});
		$(".state2[click='true']").die().live('click', function() {
			if ($(this).attr("act") == "login") {
				try {
					v_iframe.window.pause();
				} catch (e) {

				}
				$("body").append('<div class="lagebg posa"></div>');
				$('.lagebg').css({
					height : $(document).height() || $(window).height()
				});
				$('.k_login').show().css({
					left : ($(window).width() - $('.k_login').outerWidth()) / 2,
					top : ($(window).height() - $('.k_login').outerHeight()) / 2 + $(window).scrollTop()
				});
			} else {
				if ($(".state1").hasClass("state1_selected") || $(this).hasClass("state2_selected")) {
					$("#_tip_lis").text("你已经对视频做出过评价了，谢谢！").show();
					setTimeout('$("#_tip_lis").hide()', 5000);
				} else {
					commentVideo(this);
				}
			}
		});
		$(".state3").die().live('click', function() {
			if ($(this).attr("act") == "login") {
				try {
					v_iframe.window.pause();
				} catch (e) {

				}
				$("body").append('<div class="lagebg posa"></div>');
				$('.lagebg').css({
					height : $(document).height() || $(window).height()
				});
				$('.k_login').show().css({
					left : ($(window).width() - $('.k_login').outerWidth()) / 2,
					top : ($(window).height() - $('.k_login').outerHeight()) / 2 + $(window).scrollTop()
				});
			} else {
				var url = ctx + "/";
				if ($(this).hasClass("state3_selected")) {
					url += "toCancelCollectVideo.do";
				} else {
					url += "toCollectVideo.do";
				}
				collectVideoMng(url);
			}
		});
		$(".state4").die().live('click', function() {
			if ($(this).attr("act") == "login") {
				try {
					v_iframe.window.pause();
				} catch (e) {

				}
				$("body").append('<div class="lagebg posa"></div>');
				$('.lagebg').css({
					height : $(document).height() || $(window).height()
				});
				$('.k_login').show().css({
					left : ($(window).width() - $('.k_login').outerWidth()) / 2,
					top : ($(window).height() - $('.k_login').outerHeight()) / 2 + $(window).scrollTop()
				});
			} else {
				if ($(this).hasClass("state4_selected")) {
					$(this).removeClass("state4_selected");
				} else {
					$(this).addClass("state4_selected");
				}
			}
		});
	});
	/* function login(obj) {
	 if ($(obj).attr("act") == "login") {
	 $("body").append('<div class="lagebg posa"></div>');
	 $('.lagebg').css({
	 height : $(document).height() || $(window).height()
	 });
	 $('.k_login').show().css({
	 left : ($(window).width() - $('.k_login').outerWidth()) / 2,
	 top : ($(window).height() - $('.k_login').outerHeight()) / 2 + $(window).scrollTop()
	 });
	 }
	 }*/

	function collectVideoMng(url) {
		$.post(url, {
			vId : $("#vId").val()
		}, function(json) {
			if (json.success) {
				if ($(".state3").hasClass("state3_selected")) {
					$(".state3").removeClass("state3_selected");
				} else {
					$(".state3").addClass("state3_selected");
				}
			} else {
				$("#_tip_lis").text(json.msg).show();
				setTimeout('$("#_tip_lis").hide()', 5000);
			}
		}, 'json');
	}
	function commentVideo(obj) {
		$.post(ctx + "/toCommentVideo.do", {
			vId : $("#vId").val(),
			commvFlag : $(obj).attr("val")
		}, function(json) {
			if (json.success) {
				var count = parseInt($(obj).text()) + 1;
				$(obj).text(count);
				$(obj).addClass($(obj).attr("class") + "_selected");
			} else {
				$("#_tip_lis").text(json.msg).show();
				setTimeout('$("#_tip_lis").hide()', 5000);
			}
		}, 'json');
	}
</script>

<div class="video" id="video">
	<iframe name="v_iframe" style="height: 100%; width: 100%; overflow: hidden; border: 0;" src="${ctx }/getVideoForPlayer.do?vId=${vId}"></iframe>
</div>
<ul class="assess">
	<c:choose>
		<c:when test="${not empty sessionScope.sessionInfo }">
			<c:choose>
				<c:when test="${not empty commentVideo}">
					<c:choose>
						<c:when test="${commentVideo.commvFlag eq 1 }">
							<li class="state1_selected">${recommend}</li>
							<li class="state2">${notRecommend}</li>
						</c:when>
						<c:when test="${commentVideo.commvFlag eq 0 }">
							<li class="state1">${recommend}</li>
							<li class="state2_selected">${notRecommend}</li>
						</c:when>
					</c:choose>
				</c:when>
				<c:otherwise>
					<li class="state1" click="true" val="1">${recommend}</li>
					<li class="state2" click="true" val="0">${notRecommend}</li>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:otherwise>
			<li class="state1" act="login" click="true" val="1">${recommend}</li>
			<li class="state2" act="login" click="true" val="0">${notRecommend}</li>
		</c:otherwise>
	</c:choose>
	<li class="tip" id="_tip_lis">&nbsp;</li>
	<c:choose>
		<c:when test="${not empty sessionScope.sessionInfo }">
			<c:choose>
				<c:when test="${collected}">
					<li class="state3 state3_selected">收藏</li>
				</c:when>
				<c:otherwise>
					<li class="state3">收藏</li>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:otherwise>
			<li class="state3" act="login">收藏</li>
		</c:otherwise>
	</c:choose>
	<li class="state4">分享</li>
</ul>