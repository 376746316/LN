<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript"
	src="<c:url value="/js/jquery-1.8.0.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/lazyload.js" />"></script>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

a,img {
	border: 0;
}

body {
	font: 12px/180% Arial, Helvetica, sans-serif, "宋体";
}
/* tabshow */
.tabshow {
	width: 910px;
	height: 422px;
	position: relative;
	margin: 0 auto;
}

.tabshow .hide {
	display: none;
}

.tabshow .udbtn,.tabshow .tabTagBox li {
	background: url(images/study_menu.png) no-repeat;
}

.tabshow .udbtn {
	display: block;
	width: 194px;
	height: 35px;
	line-height: 999em;
	overflow: hidden;
}

.tabshow .uPrev {
	background-position: 0 -580px;
}

.tabshow .dNext {
	background-position: 0 -615px;
}

.tabshow .tabTagBox {
	height: 360px;
	width: 163px;
	overflow: hidden;
	position: relative;
	z-index: 9;
	margin: 1px 0;
}

.tabshow .tabTagBox .tabTagList {
	position: absolute;
	left: 0;
	height: 999em;
}

.tabshow .tabTagBox li {
	float: left;
	width: 163px;
	height: 34px;
	line-height: 99em;
	overflow: hidden;
	cursor: pointer;
}

.tabshow .tabTagBox li.current {
	width: 164px;
}

.tabshow .tabTagBox li#tag01 {
	background-position: -163px 0;
}

.tabshow .tabTagBox li#tag01.current {
	background-position: 0 0;
}

.tabshow .tabTagBox li#tag02 {
	background-position: -163px -35px;
}

.tabshow .tabTagBox li#tag02.current {
	background-position: 0 -35px;
}

.tabshow .tabTagBox li#tag03 {
	background-position: -163px -73px;
}

.tabshow .tabTagBox li#tag03.current {
	background-position: 0 -73px;
}

.tabshow .tabTagBox li#tag04 {
	background-position: -163px -108px;
}

.tabshow .tabTagBox li#tag04.current {
	background-position: 0 -108px;
}

.tabshow .tabTagBox li#tag05 {
	background-position: -163px -144px;
}

.tabshow .tabTagBox li#tag05.current {
	background-position: 0 -144px;
}

.tabshow .tabTagBox li#tag06 {
	background-position: -163px -180px;
}

.tabshow .tabTagBox li#tag06.current {
	background-position: 0 -180px;
}

.tabshow .tabTagBox li#tag07 {
	background-position: -163px -215px;
}

.tabshow .tabTagBox li#tag07.current {
	background-position: 0 -215px;
}

.tabshow .tabTagBox li#tag08 {
	background-position: -163px -250px;
}

.tabshow .tabTagBox li#tag08.current {
	background-position: 0 -250px;
}

.tabshow .tabTagBox li#tag09 {
	background-position: -163px -286px;
}

.tabshow .tabTagBox li#tag09.current {
	background-position: 0 -286px;
}

.tabshow .tabTagBox li#tag10 {
	background-position: -163px -321px;
}

.tabshow .tabTagBox li#tag10.current {
	background-position: 0 -321px;
}
</style>

<script type="text/javascript">
	//选项卡与延迟插件结合
	$(function() {
		$("img[original]").lazyload({
			placeholder : "images/color3.gif"
		});
	});

	function lazyloadForPart(container) {
		container.find('img').each(function() {
			var original = $(this).attr("original");
			if (original) {
				$(this).attr('src', original).removeAttr('original');
			}
		});
	}

	$(function() {

		var navBox = $('.tabTagBox'), navList = $('.tabTagList'), navs = navList
				.children('li'), upBtn = $('.uPrev'), downBtn = $('.dNext'), contentBoxs = $('.tabcon');

		var opts = {
			moveH : 58,
			moveSpeed : 200,
			curMoveH : 0,
			curSumH : 0,
			curNavIndex : 0
		}

		opts.curSumH = (opts.moveH * navs.size()) - navBox.height();

		var navToContentBox = function() {
			navs.removeClass('current');
			contentBoxs.hide().eq(opts.curNavIndex).show();
		}

		var navMove = function() {

			var _arg = arguments.length > 0 ? arguments[0] : '';

			if (_arg === 'up') {
				if (-opts.curSumH === opts.curMoveH) {
					alert('温馨提示：其他行业敬请期待！');
					return;
				}
				opts.curMoveH -= opts.moveH;
				opts.curNavIndex += 1;
			}

			if (_arg === 'down') {
				if (opts.curMoveH === 0) {
					alert('温馨提示：其他行业敬请期待！');
					return;
				}
				opts.curMoveH += opts.moveH;
				opts.curNavIndex -= 1;
			}

			navToContentBox();
			navs.eq(opts.curNavIndex).addClass('current');
			navList.animate({
				top : opts.curMoveH + 'px'
			}, opts.moveSpeed);
			lazyloadForPart(contentBoxs);
		}

		upBtn.click(function() {
			navMove('down');
		});

		downBtn.click(function() {
			navMove('up');
		});

		navs.click(function() {
			opts.curNavIndex = $(this).index();
			navToContentBox();
			$(this).addClass('current');
			lazyloadForPart(contentBoxs);
		});

	});

	//普通选课
	function show1(){
		
		location = "toCourseNotChoiseed.do";
	}
	//专业选课
	function show2(){
		
		location = "toSpecCourseNotChoiseed.do";		
	}
	//普通在修
	function show3(){
		
		location = "toOnStudyCourseList.do";
	}
	//在修专业课
	function show4(){
		
		location = "toOnStudySpecCourseList.do";
	}
	//已修专业课
	function show5(){
		
		location = "toSpecCourseFinish.do";	
	}
	
	//已修普通课
	function show6(){
		
		location = "toFinishedCourseForStu.do";	
	}
	//直播课堂
	function show7(){
		
		location = "toOnlieShowLive.do";	
	}
	//在线答疑
	function show8(){
		
		location = "toOnlineQuestionList.do";	
	}
	
</script>
</head>
<body>
	<div class="tabshow">
		<div class="tabTagBox">
			<ul class="tabTagList">
				<li id="tag00" onclick="show2()">专业课选课
					
				</li>
				<li id="tag02" onclick="show1()">普通课选课
					
				</li>
				<li id="tag03" onclick="show4()">在修专业
					
				</li>
				<li id="tag04" onclick="show3()">在修普通
					
				</li>
				<li id="tag05" onclick="show5()">已修专业课
					
				</li>
				<li id="tag06" onclick="show6()">已修普通科
					
				</li>
				
				<li id="tag07" onclick="show7()">直播课堂
				</li>
				
				<li id="tag08" onclick="show8()">在线答疑
				</li>
				
			</ul>
		</div>
	</div>
</body>
</html>