<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
	String.prototype.endsWith = function(value, ignoreCase) {
		var L1 = this.length;
		var L2 = value.length;

		if (L2 > L1)
			return false;

		if (ignoreCase) {
			var oRegex = new RegExp(value + '$', 'i');
			return oRegex.test(this);
		} else
			return (L2 == 0 || this.substr(L1 - L2, L2) == value);
	}
	var getUserTimeOut;
	function toggleOnline(dom) {
		$(dom).attr("disabled", "disabled");
		$.post(ctx + "/setUserOnline.do", {
			online : $(dom).val() == "下线" ? 0 : 1
		}, function(rsp) {
			if (rsp == "success") {
				if ($(dom).val() == "下线") {
					$(dom).val("签到上线");
					$("#onlineStatus").text("离线状态。");
				} else {
					$("#onlineStatus").text("实时在线。");
					$(dom).val("下线");
				}
			}
		}).always(function() {
			$(dom).removeAttr("disabled");
		});
	}
	$(function() {
		$("#toAccept").click(function() {
			$.post(ctx + "/acceptRqa.do", null, function(rsp) {
				if (rsp == "0") {
					alert("操作失败，连线超时或申请已取消。");
				}
				getUserRqaStatus();
			});
		});

		//页面加载时就启动查询
		getUserRqaStatus();

	});
	function getUserRqaStatus() {
		$.post(ctx + "/getUserRqaStatus.do", null, function(rsp) {
			if (rsp.status == "3") {
				$("#rqaStatus").text("有1位学生申请辅导。");
				$("#rqaTitle").text("标题：" + rsp.rqa.rqaTitle);
				$("#rqaDescription").text(rsp.rqa.rqaDescription);
				$("#rqaAttachList").html("");
				$.each(rsp.rqaAttachList, function(i, rqaAttach) {
					var isImg = false;
					$.each(".jpg;.jpeg;.gif;.png".split(";"), function(i, fileType) {
						if ((rqaAttach.raUrl + "").endsWith(fileType, true)) {
							isImg = true;
						}
					});

					var attHtml = "";
					attHtml += ('<div class="rqaattachitem"><div class="ico_big">');
					if (isImg) {
						attHtml += ('<a href="' + ctx + '/getThumb.do?fileurl=' + rqaAttach.raUrl + '" url="' + rqaAttach.raUrl + '" viewmode="img" target="_blank"> <img src="' + ctx + '/getThumb.do?fileurl=' + rqaAttach.raUrl + '&maxWidth=160&maxHeight=100" /></a>');
					}
					attHtml += ('</div><div class="name_big"><span>' + rqaAttach.raName + '</span><div class="down_big"><a href="' + ctx + '/download.do?fileurl=' + rqaAttach.raUrl + '">下载</a>&nbsp;&nbsp;');
					if (isImg) {
						attHtml += ('<a href="' + ctx + '/getThumb.do?fileurl=' + rqaAttach.raUrl + '" target="_blank">预览</a>');
					}
					attHtml += ('</div></div></div>');
					$("#rqaAttachList").append(attHtml);
				});

				$("#stuHead").attr("src", ctx + '/' + rsp.stu.stuHead);
				if (rsp.stu.stuNickname) {
					$("#stuName").text(rsp.stu.stuNickname);
				} else {
					$("#stuName").text(rsp.stu.stuUserid);
				}
				$("#toRqa").hide();
				$("#toAccept").show();
				$("#stuInfo").show();
			} else if (rsp.status == "4") {
				$("#rqaStatus").text("有1位学生在辅导中。");
				$("#rqaTitle").text("标题：" + rsp.rqa.rqaTitle);
				$("#rqaDescription").text(rsp.rqa.rqaDescription);
				$("#rqaAttachList").html("");
				$.each(rsp.rqaAttachList, function(i, rqaAttach) {
					var isImg = false;
					$.each(".jpg;.jpeg;.gif;.png".split(";"), function(i, fileType) {
						if ((rqaAttach.raUrl + "").endsWith(fileType, true)) {
							isImg = true;
						}
					});

					var attHtml = "";
					attHtml += ('<div class="rqaattachitem"><div class="ico_big">');
					if (isImg) {
						attHtml += ('<a href="' + ctx + '/getThumb.do?fileurl=' + rqaAttach.raUrl + '" url="' + rqaAttach.raUrl + '" viewmode="img" target="_blank"> <img src="' + ctx + '/getThumb.do?fileurl=' + rqaAttach.raUrl + '&maxWidth=160&maxHeight=100" /></a>');
					}
					attHtml += ('</div><div class="name_big"><span>' + rqaAttach.raName + '</span><div class="down_big"><a href="' + ctx + '/download.do?fileurl=' + rqaAttach.raUrl + '">下载</a>&nbsp;&nbsp;');
					if (isImg) {
						attHtml += ('<a href="' + ctx + '/getThumb.do?fileurl=' + rqaAttach.raUrl + '" target="_blank">预览</a>');
					}
					attHtml += ('</div></div></div>');
					$("#rqaAttachList").append(attHtml);
				});

				$("#stuHead").attr("src", ctx + '/' + rsp.stu.stuHead);
				if (rsp.stu.stuNickname) {
					$("#stuName").text(rsp.stu.stuNickname);
				} else {
					$("#stuName").text(rsp.stu.stuUserid);
				}
				$("#toRqa").show();
				$("#toAccept").hide();
				$("#stuInfo").show();
			} else {
				$("#rqaStatus").text("无辅导学生。");
				$("#toRqa").hide();
				$("#toAccept").hide();
				$("#stuInfo").hide();
			}
		}, 'json').always(function() {
			if ($("#stuInfo")) {
				clearTimeout(getUserTimeOut);
				getUserTimeOut = setTimeout(getUserRqaStatus, 10000);
			}
		});
	}
</script>
<!-- Start 辅导中心-->
<div class="gg_smbox">
	<div class="g_dqzt_box">
		<div style="position: relative;">
			<h1 class="g_title">当前状态</h1>
			<c:choose>
				<c:when test="${userOnline eq 0}">
					<p id="onlineStatus">离线状态。</p>
					<input type="button" value="签到上线" class="y_subonline" onclick="toggleOnline(this);">
				</c:when>
				<c:when test="${userOnline eq 1}">
					<p id="onlineStatus">实时在线。</p>
					<input type="button" value="下线" class="y_subonline" onclick="toggleOnline(this);">
				</c:when>
				<c:otherwise>
					<p id="onlineStatus">答疑中。</p>
					<input type="button" value="下线" class="y_subonline" onclick="toggleOnline(this);">
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	<div class="blank40"></div>
	<div class="g_dqzt_box">
		<div>
			<h1 class="g_title">正在辅导的学生</h1>
			<p id="rqaStatus"></p>
			<div id="stuInfo" style="margin: 10px 0 10px 0; position: relative;">
				<img id="stuHead" alt="" src="" width="40" height="40" /> <span id="stuName"></span>
				<div class="zxfd_wt" style="width: 580px; margin-top: 10px;">
					<h2>问题</h2>
					<div class="blank20"></div>
					<div class="zxfd_jj">
						<p id="rqaTitle">标题：</p>
						<div class="wti">
							<p class="wt_tit">描述：</p>
							<p id="rqaDescription" class="wt_jj" style="width: 580px;"></p>
							<div class="clear"></div>
						</div>
						<p class="wt_fj">附件：</p>
						<div id="rqaAttachList">
							<c:forEach items="${rqaAttachList}" var="rqaAttach">
								<c:set value="false" var="isImg"></c:set>
								<c:forTokens items="${'.jpg;.jpeg;.gif;.png'}" delims=";" var="fileType">
									<c:if test="${fn:endsWith(rqaAttach.raUrl,fileType)}">
										<c:set value="true" var="isImg"></c:set>
									</c:if>
								</c:forTokens>
								<div class="rqaattachitem">
									<div class="ico_big">
										<c:if test="${isImg}">
											<a href="${ctx}/getThumb.do?fileurl=${rqaAttach.raUrl}" url="${rqaAttach.raUrl}" viewmode="img" target="_blank"> <img src="${ctx}/getThumb.do?fileurl=${rqaAttach.raUrl}&maxWidth=160&maxHeight=100" />
											</a>
										</c:if>
									</div>
									<div class="name_big">
										<span>${rqaAttach.raName}</span>
										<div class="down_big">
											<a href="${ctx}/download.do?fileurl=${rqaAttach.raUrl}">下载</a>&nbsp;&nbsp;
											<c:if test="${isImg}">
												<a href="${ctx}/getThumb.do?fileurl=${rqaAttach.raUrl}" target="_blank">预览</a>
											</c:if>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
				<a id="toRqa" target="_blank" class="y_subtorqa" href="${ctx}/realtimeQA.do?userInterface=true">进入答疑页面</a> <a id="toAccept"  class="y_subtorqa" href="javascript:;">确认申请</a>
			</div>
		</div>
	</div>
	<div class="blank40"></div>
	<div class="g_dqzt_box">
		<div style="position: relative;">
			<!-- <h1 class="g_title">收入明细</h1>
			<div class="blank48"></div> -->
			<div class="g_wdzh_b">
				<h1 class="g_title">收入明细</h1>
				<div class="g_table">
					<table width="100%">
						<tr>
							<th>时间</th>
							<th>学生姓名</th>
							<th>计费次数</th>
							<th>服务时长(分)</th>
							<th>计费时长(分)</th>
							<th>服务质量(%)</th>
							<th>答疑类型</th>
							<th>计费标准(元/时)</th>
							<th>金额(元)</th>
						</tr>
						
						<c:forEach var="qaModel" items="${requestScope.qaModelList }">
							<tr>
								<th><fmt:formatDate value="${qaModel.rqaRegtime }" pattern="yyyy.MM.dd" /></th>
								<th>${qaModel.stuName }</th>
								<th>${qaModel.rqaPeriodictity }</th>
								<th>${qaModel.rqaCycletime }</th>
								<th>${qaModel.rqaDuration }</th>
								<th>${qaModel.rqaPercentage }</th>
								<th>${qaModel.techTypeName }</th>
								<th>${qaModel.rqaUnialence }</th>
								<th>${qaModel.rqaMoney }</th>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		
		</div>
	</div>
	
</div>
<!-- End 辅导中心-->