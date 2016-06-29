<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>视频播放</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript">
	//10.9 视频播放

	$(function() {
		var bHeight = $(".roll_box ul li").height(); //获取焦点图的宽度（显示面积）
		var bleng = $(".roll_box ul li").length; //获取焦点图个数
		var pp = 0;
		//上一页按钮
		$(".roll_box .prev").click(function() {
			pp -= 1;
			if (pp == -1) {
				pp = bleng - 1;
			}
			showP(pp);
		});

		//下一页按钮
		$(".roll_box .next").click(function() {
			pp += 1;
			if (pp == bleng) {
				pp = 0;
			}
			showP(pp);
		});

		//本例为左右滚动，即所有li元素都是在同一排向左浮动，所以这里需要计算出外围ul元素的宽度
		$(".roll_box ul").css("height", bHeight * (bleng));

		//显示图片函数，根据接收的index值显示相应的内容
		function showP(pp) { //普通切换
			var nowp = -pp * bHeight; //根据index值计算ul元素的left值
			$(".roll_box ul").animate({
				"top" : nowp
			}, 300); //通过animate()调整ul元素滚动到计算出的position
		}

		$(".roll_box ul li").click(function() {
			readyPlay($(this).attr("vId"));
			$("#vName").html($(this).find("a[vName]").text());
			$(this).addClass("active").siblings().removeClass("active");
		});

		if (bleng < 5) {
			$(".roll_box .next,.roll_box .prev").css("background", "#092a42");

		}

		$(".bf_tit li").click(function() {
			$(this).addClass("active").siblings().removeClass("active");
			$(this).parents(".video_t_r").find(".v_jj_box .v_cut").hide().siblings().eq($(this).index()).show();
		});
		//默认选择第一个视频播放
		if ($("#vId").val() == "") {
			$("#vId").val($(".roll_box ul li:eq(0)").attr("vId"));
			$(".roll_box ul li:eq(0)").click();
		} else {
			$(".roll_box ul li[vid='" + $("#vId").val() + "']").click();
		}
		if ($(".roll_box ul li[class='active']").index() > 3) {
			$(".roll_box .prev").click();
		}

	});
	function doBack() {
		location.href = ctx + "/toGrowthDirection.do";
	}
	function readyPlay(vIdStr) {
		var vId = parseInt(vIdStr);
		$("#vId").val(vId);
		$("#player_div").empty();
		$("#player_div").load(ctx + "/toVideoInfoForPlayer.do", {
			vId : vId
		}, function(data) {
		});
	}
</script>
</head>

<body>
	<%@ include file="/WEB-INF/include/top.jsp"%>
	<input type="hidden" id="vId" value="${vId }">
	<div class="video_box">
		<p>
			学习&gt;成长阶段&gt;

			<c:choose>
				<c:when test="${type eq 1 }">入学季</c:when>
				<c:when test="${type eq 2 }">成长季</c:when>
				<c:when test="${type eq 3 }">毕业季</c:when>
				<c:when test="${type eq 4 }">工作季</c:when>
			</c:choose>
			&gt;${pList.listName }
		</p>
		<h2 class="video_tit" id="vName">&nbsp;</h2>
		<div class="video_top clear1">
			<div id="player_div" class="video_t_l f_l">
				<div class="video_t_l f_l">
					<div class="video">
						<img src="${ctx }/<zk:getParammain paramid="${pList.listId }" parentparamid="72" />" width="747" height="406" alt="">
					</div>
					<ul class="assess">
						<li class="state1">0</li>
						<li class="state2">0</li>
						<li class="state3">收藏</li>
						<li class="state4">分享</li>
					</ul>
				</div>
			</div>
			<div class="video_t_r f_r">
				<ul class="bf_tit clear1">
					<li class="v_juj active">剧集</li>
					<li class="v_jj">简介</li>
				</ul>
				<div class="v_jj_box">
					<div class="v_cut" style="display: block;">
						<div class="roll_box posr">
							<div class="roll posr">
								<ul style="height: 609px; top: 0px;">
									<c:forEach items="${pList.listVideo }" var="lv">
										<li vId="${lv.lvVideoId}">
											<dl>
												<dt>
													<a href="javascript:;"> <c:choose>
															<c:when test="${empty lv.lvImg }">
																<img src="${ctx }/<zk:getParammain paramid="${pList.listId }" parentparamid="72" />" width="77" height="77" alt="">
															</c:when>
															<c:otherwise>
																<img src="${ctx }/${lv.lvImg}" width="77" height="77" alt="">
															</c:otherwise>
														</c:choose>
													</a>
												</dt>
												<dd>
													<p>
														<a href="javascript:;" vName>${lv.video.vName }</a>
													</p>
													<p>
														<a href="javascript:;">第${lv.lvSeq }集</a>
													</p>
												</dd>
											</dl>
										</li>
									</c:forEach>
								</ul>
							</div>
							<a href="javascript:;" class="prev posa"></a> <a href="javascript:;" class="next posa"></a>
						</div>
					</div>
					<div class="v_cut" style="display: none;">
						<div class="js_text">
							<h2>
								<span class="m_color">名称：</span>${pList.listName }
							</h2>
							<p>
								<span class="m_color">作者：</span>${pList.listAnthor }
							</p>
							<p class="jj_wid">
								<span class="m_color">简介：</span>${pList.listInfo }
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="blank20"></div>
	</div>
	<%@ include file="/WEB-INF/include/footer.jsp"%>
</body>
</html>