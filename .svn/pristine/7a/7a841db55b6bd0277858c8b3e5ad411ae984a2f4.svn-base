<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消息中心</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript">
	//消息中心
	$(function() {
		$('.xxzx_qhbox ul.x_xxqh').find('li')
				.click(
						function() {
							$(this).addClass('active').siblings().removeClass(
									'active');
							$(this).parents('.xxzx_qhbox').find(
									'.x_xxbox .k_hidden_x').hide().siblings()
									.eq($(this).index()).show();
						});

		$('.x_xxqb ul li').hover(
				function() {
					$(this).children(".x_lbyd").show().siblings().children(
							".x_lbyd").hide();
				}, function() {
					$(".x_xxqb ul li .x_lbyd").hide();
				});

		$('.x_bjyd').click(function() {
			$.ajax('readAllMsg.do', {
				data : {
					msgType : $(this).attr("msgType")
				},
				async : false,
				success : function(data, textStatus, jqXHR) {
					location = "toMessageCenter.do?activeType=" + data;
				}
			});
		});
		$('.x_lbyd').click(
				function() {
					if ($.trim($(this).text()) == "标记为已读") {
						$("[id='" + $(this).parent().attr('id') + "']").each(
								function() {
									$(this).children(".x_lbyd").text("处理中...");
								});
						$.post("readMsg.do", {
							msgId : $(this).parent().attr('id')
						}, function(rsp) {
							if (rsp.indexOf('msg') == 0) {
								var cAll = $("#00_Icon").text();
								var cType = $(
										"#" + $("#" + rsp).attr("msgType")
												+ "_Icon").text();
								cAll = cAll - 1;
								if (cAll == 0) {
									$("#00_Icon").remove();
								} else {
									$("#00_Icon").text(cAll);
								}

								cType = cType - 1;
								if (cType == 0) {
									$(
											"#" + $("#" + rsp).attr("msgType")
													+ "_Icon").remove();
								} else {
									$(
											"#" + $("#" + rsp).attr("msgType")
													+ "_Icon").text(cType);
								}

								$("[id='" + rsp + "']").each(function() {
									$(this).css("font-weight", "");
									$(this).children(".x_lbyd").text("删除");
								});
							} else {
								alert('操作失败！');
								$("[id='" + rsp + "']").each(function() {
									$(this).children(".x_lbyd").text("标记为已读");
								});
							}
						});

					} else if ($.trim($(this).text()) == "删除") {
						$("[id='" + $(this).parent().attr('id') + "']").each(
								function() {
									$(this).children(".x_lbyd").text("处理中...");
								});
						$.post("delMsg.do", {
							msgId : $(this).parent().attr('id')
						}, function(rsp) {
							if (rsp.indexOf('msg') == 0) {
								$("[id='" + rsp + "']").each(function() {
									$(this).remove();
								});
							} else {
								alert('操作失败！');
								$("[id='" + rsp + "']").each(function() {
									$(this).children(".x_lbyd").text("删除");
								});
							}
						});
					}
				});
	});
</script>
</head>

<body>
	<%@ include file="/WEB-INF/include/top.jsp"%>

	<div class="xxzx_box">
		<%@ include file="/WEB-INF/include/uTop.jsp"%>
		<div class="blank35"></div>

		<!-- Start 消息中心内容-->
		<div class="xxzx_qhbox">
			<ul class="x_xxqh posr">
				<li
					<c:if test="${activeType eq '00' || activeType eq null}">class="active"</c:if>><a>全部</a>
					<c:if test="${unreadAll gt 0 }">
						<span id="00_Icon" class="x_num">${unreadAll}</span>
					</c:if> |<span class="sj posa" style="left: 6px;"></span></li>
				<li <c:if test="${activeType eq '01'}">class="active"</c:if>><a>课程</a>
					<c:if test="${unreadCourse gt 0 }">
						<span id="01_Icon" class="x_num">${unreadCourse}</span>
					</c:if>|<span class="sj posa" style="left: 6px;"></span></li>
				<li <c:if test="${activeType eq '02'}">class="active"</c:if>><a>实训</a>
					<c:if test="${unreadPrac gt 0 }">
						<span id="02_Icon" class="x_num">${unreadPrac}</span>
					</c:if>|<span class="sj posa" style="left: 6px;"></span></li>
				<li <c:if test="${activeType eq '03'}">class="active"</c:if>><a>问答</a>
					<c:if test="${unreadQA gt 0 }">
						<span id="03_Icon" class="x_num">${unreadQA}</span>
					</c:if>|<span class="sj posa" style="left: 6px;"></span></li>
				<li <c:if test="${activeType eq '04'}">class="active"</c:if>><a>求职</a>
					<c:if test="${unreadJob gt 0 }">
						<span id="04_Icon" class="x_num">${unreadJob}</span>
					</c:if>|<span class="sj posa" style="left: 6px;"></span></li>
				<li <c:if test="${activeType eq '05'}">class="active"</c:if>><a>系统</a>
					<c:if test="${unreadSys gt 0 }">
						<span id="05_Icon" class="x_num">${unreadSys}</span>
					</c:if><span class="sj posa" style="left: 6px;"></span></li>
			</ul>
			<div class="x_xxbox">
				<!-- Start 全部-->
				<div class="x_xxqb k_hidden_x"
					<c:if test="${activeType eq '00' || activeType eq null}">style="display: block;"</c:if>>
					<c:if test="${unreadAll gt 0 }">
						<div class="x_bjyd" msgType="00">全部标记为已读</div>
					</c:if>
					<div class="blank20"></div>
					<ul>
						<c:choose>
							<c:when test="${fn:length(allMsgList)>0 }">
								<c:forEach items="${allMsgList }" begin="0" var="msg"
									varStatus="status">
									<li id="msg${msg.msgId}" msgType="${msg.msgType}"
										<c:if test="${msg.msgStatus eq '0' }">style="font-weight: bold;"</c:if>><span
										class=" f_l x_date"><fmt:formatDate
												value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><span
										class="f_l">${msg.msgContent}</span> <span class="x_lbyd f_r">
											<c:choose>
												<c:when test="${msg.msgStatus eq '0' }">标记为已读</c:when>
												<c:otherwise>删除</c:otherwise>
											</c:choose>
									</span></li>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<li>当前没有消息...</li>
							</c:otherwise>
						</c:choose>
					</ul>

				</div>
				<!-- End 全部-->
				<!-- Start 课程-->
				<div class="x_xxqb k_hidden_x"
					<c:if test="${activeType eq '01'}">style="display: block;"</c:if>>
					<c:if test="${unreadCourse gt 0 }">
						<div class="x_bjyd" msgType="01">全部标记为已读</div>
					</c:if>
					<div class="blank20"></div>
					<ul>
						<c:choose>
							<c:when test="${fn:length(courseMsgList)>0 }">
								<c:forEach items="${courseMsgList }" begin="0" var="msg"
									varStatus="status">
									<li id="msg${msg.msgId}" msgType="${msg.msgType}"
										<c:if test="${msg.msgStatus eq '0' }">style="font-weight: bold;"</c:if>><span
										class=" f_l x_date"><fmt:formatDate
												value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><span
										class="f_l">${msg.msgContent}</span> <span class="x_lbyd f_r">
											<c:choose>
												<c:when test="${msg.msgStatus eq '0' }">标记为已读</c:when>
												<c:otherwise>删除</c:otherwise>
											</c:choose>
									</span></li>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<li>当前没有消息...</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
				<!-- End 课程-->
				<!-- Start 实训-->
				<div class="x_xxqb k_hidden_x"
					<c:if test="${activeType eq '02'}">style="display: block;"</c:if>>
					<c:if test="${unreadPrac gt 0 }">
						<div class="x_bjyd" msgType="02">全部标记为已读</div>
					</c:if>
					<div class="blank20"></div>
					<ul>
						<c:choose>
							<c:when test="${fn:length(pracMsgList)>0 }">
								<c:forEach items="${pracMsgList }" begin="0" var="msg"
									varStatus="status">
									<li id="msg${msg.msgId}" msgType="${msg.msgType}"
										<c:if test="${msg.msgStatus eq '0' }">style="font-weight: bold;"</c:if>><span
										class=" f_l x_date"><fmt:formatDate
												value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><span
										class="f_l">${msg.msgContent}</span> <span class="x_lbyd f_r">
											<c:choose>
												<c:when test="${msg.msgStatus eq '0' }">标记为已读</c:when>
												<c:otherwise>删除</c:otherwise>
											</c:choose>
									</span></li>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<li>当前没有消息...</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
				<!-- End 实训-->
				<!-- Start 问答-->
				<div class="x_xxqb k_hidden_x"
					<c:if test="${activeType eq '03'}">style="display: block;"</c:if>>
					<c:if test="${unreadQA gt 0 }">
						<div class="x_bjyd" msgType="03">全部标记为已读</div>
					</c:if>
					<div class="blank20"></div>
					<ul>
						<c:choose>
							<c:when test="${fn:length(qaMsgList)>0 }">
								<c:forEach items="${qaMsgList }" begin="0" var="msg"
									varStatus="status">
									<li id="msg${msg.msgId}" msgType="${msg.msgType}"
										<c:if test="${msg.msgStatus eq '0' }">style="font-weight: bold;"</c:if>><span
										class=" f_l x_date"><fmt:formatDate
												value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><span
										class="f_l">${msg.msgContent}</span> <span class="x_lbyd f_r">
											<c:choose>
												<c:when test="${msg.msgStatus eq '0' }">标记为已读</c:when>
												<c:otherwise>删除</c:otherwise>
											</c:choose>
									</span></li>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<li>当前没有消息...</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
				<!-- End 问答-->
				<!-- Start 求职-->
				<div class="x_xxqb k_hidden_x"
					<c:if test="${activeType eq '04'}">style="display: block;"</c:if>>
					<c:if test="${unreadJob gt 0 }">
						<div class="x_bjyd" msgType="04">全部标记为已读</div>
					</c:if>
					<div class="blank20"></div>
					<ul>
						<c:choose>
							<c:when test="${fn:length(jobMsgList)>0 }">
								<c:forEach items="${jobMsgList }" begin="0" var="msg"
									varStatus="status">
									<li id="msg${msg.msgId}" msgType="${msg.msgType}"
										<c:if test="${msg.msgStatus eq '0' }">style="font-weight: bold;"</c:if>><span
										class=" f_l x_date"><fmt:formatDate
												value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><span
										class="f_l">${msg.msgContent}</span> <span class="x_lbyd f_r">
											<c:choose>
												<c:when test="${msg.msgStatus eq '0' }">标记为已读</c:when>
												<c:otherwise>删除</c:otherwise>
											</c:choose>
									</span></li>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<li>当前没有消息...</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
				<!-- End 求职-->
				<!-- Start 系统-->
				<div class="x_xxqb k_hidden_x"
					<c:if test="${activeType eq '05'}">style="display: block;"</c:if>>
					<c:if test="${unreadSys gt 0 }">
						<div class="x_bjyd" msgType="05">全部标记为已读</div>
					</c:if>
					<div class="blank20"></div>
					<ul>
						<c:choose>
							<c:when test="${fn:length(sysMsgList)>0 }">
								<c:forEach items="${sysMsgList }" begin="0" var="msg"
									varStatus="status">
									<li id="msg${msg.msgId}" msgType="${msg.msgType}"
										<c:if test="${msg.msgStatus eq '0' }">style="font-weight: bold;"</c:if>><span
										class=" f_l x_date"><fmt:formatDate
												value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><span
										class="f_l">${msg.msgContent}</span> <span class="x_lbyd f_r">
											<c:choose>
												<c:when test="${msg.msgStatus eq '0' }">标记为已读</c:when>
												<c:otherwise>删除</c:otherwise>
											</c:choose>
									</span></li>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<li>当前没有消息...</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
				<!-- End 系统-->

			</div>
		</div>
		<!-- End 消息中心内容-->
	</div>

	<!-- End 消息中心 -->
	<div class="blank80"></div>
	<%@ include file="/WEB-INF/include/footer.jsp"%>

</body>
</html>

