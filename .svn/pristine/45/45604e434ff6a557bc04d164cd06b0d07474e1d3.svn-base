<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	//选项卡与延迟插件结合
	/*
	$(function() {
		$("img[original]").lazyload({
			placeholder : "images/color3.gif"
		});
	});
	*/
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
	//项目选择
	function show1() {
		location = "toProjectChoiceListjsp.do";
	}
	//项目信息
	function show2() {
		location = "toGetProIdjsp.do";
	}
	//任务分配
	function show3() {
		location = "toTaskAllocate.do";
	}
	//个人任务
	function show4() {
		location = "toPersonalTask.do";
	}
	//团队信息
	function show5() {
		location="TeamInfoMng.do";
	}
	//进度查询
	function show6() {
		//团队进度
		location="toProjectProgress.do";
		
		//个人进度
		//location= "toPersonalProjectProgress";
	}
	//个人日志
	function show7(){
		location = "toStuLogListJsp.do";
	}
	//实训周报
	function show8(){
		location = "stuWeeklyToJsp.do";
	}
	//任务打分
	function show9(){
		location = "proTaskScore.do";
	}
	//成绩查询
	function show10(){
		//团队
		location = "toProjectListScoreWeb.do";
		
		//个人
		//location = "toPersonalProjectListScore";
	}
	//成果发布
	function show11(){
		//团队
		location = "toAchivementUploadList.do";
		
		//个人
		//location = "toPersonalAchivementUploadList.do";
	}
	//个人问题
	function show12(){
		location = "toPracticeQuestionList.do";
	}
	//问卷调查
	function show13(){
		location = "toSurveyList.do";
	}
	//实训测评
	function show14(){
		location = "selectinRatioEvaluation1.do";
	}
</script>
<style>
.tabshow {
	width: 910px;
	height: 422px;
	margin: 0 auto;
}

.tabshow .hide {

	display: none;
}

.tabshow .udbtn,.tabshow .tabTagBox li {
	background: url(images/tab-all-bg.png) no-repeat;
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
	height: 478px;
	width: 163px;
	overflow: hidden;
	position: relative;
	z-index: 9;
	margin: 1px 0;
}

.tabshow .tabTagBox .tabTagList {
	position: absolute;
	left: 0;
	height: 478px;
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

.tabshow .tabTagBox li#tag11 {
	background-position: -163px -356px;
}

.tabshow .tabTagBox li#tag11.current {
	background-position: 0 -356px;
}
.tabshow .tabTagBox li#tag12 {
	background-position: -163px -391px;
}

.tabshow .tabTagBox li#tag12.current {
	background-position: 0 -391px;
}
.tabshow .tabTagBox li#tag13 {
	background-position: -163px -426px;
}

.tabshow .tabTagBox li#tag13.current {
	background-position: 0 -426px;
}
.tabshow .tabTagBox li#tag14 {
	background-position: -163px -461px;
}

.tabshow .tabTagBox li#tag14.current {
	background-position: 0 -461px;
}
</style>
<div class="tabshow">
	<div class="tabTagBox">
		<ul class="tabTagList">
			<li id="tag01" onclick="show1()">项目选择</li>
			<li id="tag02" onclick="show2()">项目查看</li>
			<li id="tag03" onclick="show3()">任务分配</li>
			<li id="tag04" onclick="show4()">个人任务</li>
			<li id="tag05" onclick="show5()">团队信息</li>
			<li id="tag06" onclick="show6()">项目进度</li>
			<li id="tag07" onclick="show7()">个人日志</li>
			<li id="tag08" onclick="show8()">实训周报</li>
			<li id="tag09" onclick="show9()">任务打分</li>
			<li id="tag10" onclick="show10()">课设成绩</li>
			<li id="tag11" onclick="show11()">成果发布</li>
			<li id="tag12" onclick="show12()">个人问题</li>
			<li id="tag13" onclick="show13()">问卷调查</li>
			<li id="tag14" onclick="show14()">实训测评</li>
		</ul>
	</div>
</div>