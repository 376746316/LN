<%@ page language="java" import="java.util.*,com.chinasofti.cetp.utils.MessageUtils,com.chinasofti.cetp.utils.SessionInfo,com.chinasofti.cetp.admin.model.Message" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/include/top.js"></script>
<jsp:include page="/WEB-INF/include/totop.jsp"></jsp:include>
<script type="text/javascript">
	$(document).ready(function() {
		$('div.search').find('input.k_subsear').click(function() {
			var searchParam = $('#textfield').val();
			location.href = ctx + "/search.do?key=" + searchParam;

		});
		$('#textfield').bind('keyup', function(event) {
			if (event.keyCode == "13") {
				var searchParam = $('#textfield').val();
				location.href = ctx + "/search.do?key=" + searchParam;
			}
		});
		// 个人登录页回车登录事件
		$('#login_form_1 input').bind('keyup', function(event) {
			if (event.keyCode == "13") {
				//studenLogin('#logErrorMsg'); // 个人用户登录
				$("#stuLoginBut").click();
			}
		});
		// 企业登录页回车登录事件
		$('#login_form_2 input').bind('keyup', function(event) {
			if (event.keyCode == "13") {
				//userLogin('#userLogErrorMsg'); // 企业用户登录
				$("#userLoginBut").click();
			}
		});

	});
</script>
<!-- Start 登录层 -->
<div class="k_login posa" id="k_login_win">
	<div class="tabt posr font_yh">
		<ul>
			<li class="active">个人<span class="sj posa"></span></li>
			<li>工程师<span class="sj posa"></span></li>
		</ul>
		<span class="line">&emsp;</span>
	</div>

	<div class="tabc">
		<div class="k_hidden" style="display: block;">
			<form id="login_form_1" action="" method="post">
				<div class="loginbox">
					<div class="loginboxc">
						<div class="username">
							<input type="text" name="stuUserid" value="用户名/邮箱" id="search" tabindex="1" onblur="if(this.value==''){this.value='用户名/邮箱'}" onfocus="if(this.value=='用户名/邮箱'){this.value=''}" />
						</div>
						<div class="wordpass">
							<input type="text" name="showPwd" value="密码" /> <input type="password" name="stuPwd" value="" tabindex="2" />
						</div>
					</div>
					<div class="loginbom"></div>
				</div>
				<!-- 验证码 -->
				<div class="yzmbox">
					<div class="left num">
						<span class="yzmnum"><img id="img_1" title="点击更换" onclick="javascript:refresh(this);" src="${pageContext.request.contextPath}/image.do" style="width: 120px; height: 49px" /></span> <a href="javascript:refresh($('#img_1')[0])">看不清楚，换一张</a>
					</div>
					<div class="right inputxt">
						<input type="text" name="verifyCode" id="" tabindex="3" /> <span id="logErrorMsg" class="tips">* 请输入验证码</span>
					</div>
				</div>
				<!-- End 验证码 -->
				<div class="k_zcdl">
					<div class="left kw">
						<a href="${pageContext.request.contextPath}/student.do?method=pwdRecoverFirst" class="wjmm">忘记密码了</a> <a href="${pageContext.request.contextPath}/sys.do?method=register">注册</a>
					</div>
					<div class="right">
						<input id="stuLoginBut" type="button" value="登录" class="login" tabindex="4" onclick="studenLogin('#logErrorMsg')" style="color: aliceblue; font-size: 17px;" /> <a href="javascript:;" class="qx">取消</a>
					</div>
				</div>
			</form>
		</div>
		<div class="k_hidden">
			<form id="login_form_2" action="" method="post">
				<div class="loginbox">
					<div class="loginboxc">
						<div class="username">
							<input type="text" name="userId" value="用户名/邮箱" id="search" tabindex="1" onblur="if(this.value==''){this.value='用户名/邮箱'}" onfocus="if(this.value=='用户名/邮箱'){this.value=''}" />
						</div>
						<div class="wordpass">
							<input type="text" name="showPwd" value="密码" /> <input type="password" name="userPwd" value="" tabindex="2" />
						</div>
					</div>
					<div class="loginbom"></div>
				</div>
				<!-- 验证码 -->
				<div class="yzmbox">
					<div class="left num">
						<span class="yzmnum"><img id="img_2" title="点击更换" onclick="javascript:refresh(this);" src="${pageContext.request.contextPath}/image.do" style="width: 120px; height: 49px"></span> <a href="javascript:refresh($('#img_2')[0])">看不清楚，换一张</a>
					</div>
					<div class="right inputxt">
						<input type="text" name="verifyCode" id="" tabindex="3" /> <span id="userLogErrorMsg" class="tips">* 请输入验证码</span>
					</div>
				</div>
				<!-- End 验证码 -->
				<div class="k_zcdl">
					<div class="left kw">
						<a href="${pageContext.request.contextPath}/pwdRecoverFirst.do" class="wjmm">忘记密码了</a> <a href="${pageContext.request.contextPath}/sys.do?method=register">注册</a>
					</div>
					<div class="right">
						<input id="userLoginBut" type="button" value="登录" class="login" tabindex="4" onclick="userLogin('#userLogErrorMsg')" style="color: aliceblue; font-size: 17px;" /> <a href="javascript:;" class="qx">取消</a>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<!-- End 登录层 -->

<!-- Start 头部 -->
<div class="b_header_box">
	<div class="b_header posr">
		<h1>中软国际旗下IT人才培训平台</h1>
		<div class="b_header_r">
			<c:if test="${sessionScope.sessionInfo == null }">
				<!-- 未登录 -->
				<div class="load-rig" style="top: 0px; color: #5d5d5d;">
					<ul>
						<li><a href="javascript:;" id="login" style="color: #5d5d5d">登录</a></li>
						<li>|</li>
						<li><a href="${pageContext.request.contextPath}/sys.do?method=register" style="color: #5d5d5d">注册</a></li>
					</ul>
				</div>
				<!-- End 未登录 -->
			</c:if>
			<!-- 个人用户登录 开始 -->
			<c:if test="${sessionScope.sessionInfo.student != null && sessionScope.sessionInfo.user == null}">
				<!-- 登录后 -->
				<!-- 消息 -->
				<div class="k_masgbox posa" style="top: 0px;">
					<%
						List<Message> topMsgList = MessageUtils.getMsgList("s" + ((SessionInfo) session.getAttribute("sessionInfo")).getStuNo());
							request.setAttribute("topMsgList", topMsgList);
					%>
					<span id="newMsgNum" class="num"><%=topMsgList.size() > 0 ? topMsgList.size() : ""%></span>
					<div class="cont posa">
						<div class="tit">
							<img src="${pageContext.request.contextPath}/images/k_icold.png" alt="" /> 未读通知
						</div>
						<div class="mid">
							<ul id="newMsgbox">
								<c:forEach items="${topMsgList }" begin="0" var="msg" varStatus="status">
									<li><span><fmt:formatDate value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><a href="toMessageCenter.do?activeType=${msg.msgType}">${msg.msgContent}</a></li>
								</c:forEach>
							</ul>
						</div>
						<div class="bom">
							<a href="${pageContext.request.contextPath}/toMessageCenter.do">全部消息</a>
						</div>
					</div>
				</div>
				<!-- End 消息 -->

				<div class="load_in" style="top: 2px;">
					<a href="javascript:;" class="img left"> <img id="topImgHead" class="img left" src="${pageContext.request.contextPath}/${sessionScope.sessionInfo.student.stuHeadS}" width="29" height="27" style="border-radius: 1000px;" />
					</a> <span id='topStuName' class="name right"> <c:if test="${sessionScope.sessionInfo.student.stuNickname != null }">
					${sessionScope.sessionInfo.student.stuNickname}
				</c:if> <c:if test="${sessionScope.sessionInfo.student.stuNickname == null }">
					${sessionScope.sessionInfo.student.stuUserid}
				</c:if>
					</span>
					<div class="grzx" style="display: none;">
						<div class="grzx_x">
							<ul>
								<li><a href="${pageContext.request.contextPath}/myCenter/view.do">个人中心</a></li>
								<li><a href="${pageContext.request.contextPath}/student.do?method=dataSet">设置</a></li>
								<li class="bord1"><a href="${pageContext.request.contextPath }/student.do?method=toFeedback">意见反馈</a></li>
								<li class="tuichu"><a href="javascript:studenLogout();">退出</a></li>
							</ul>
							<div class="shangjian">
								<img src="${pageContext.request.contextPath}/images/shangjian.png" width="11" height="8" alt="" />
							</div>
						</div>
					</div>
				</div>
				<!-- End 登录后 -->
			</c:if>
			<!-- 个人用户登录 结束 -->

			<!-- 企业用户登录 开始 -->
			<c:if test="${sessionScope.sessionInfo.user != null && sessionScope.sessionInfo.student == null}">
				<!-- 登录后 -->
				<!-- 消息 -->
				<div class="k_masgbox posa" style="top: 0px;">
					<%
						List<Message> topMsgList = MessageUtils.getMsgList("u" + ((SessionInfo) session.getAttribute("sessionInfo")).getUser().getUserNo());
							request.setAttribute("topMsgList", topMsgList);
					%>
					<span id="newMsgNum" class="num"><%=topMsgList.size() > 0 ? topMsgList.size() : ""%></span>
					<div class="cont posa">
						<div class="tit">
							<img src="${pageContext.request.contextPath}/images/k_icold.png" alt="" /> 未读通知
						</div>
						<div class="mid">
							<ul id="newMsgbox">
								<c:forEach items="${topMsgList }" begin="0" var="msg" varStatus="status">
									<li><span><fmt:formatDate value="${msg.msgTime}" pattern="yyyy-MM-dd" /></span><a href="toMessageCenter.do?activeType=${msg.msgType}">${msg.msgContent}</a></li>
								</c:forEach>
							</ul>
						</div>
						<div class="bom">
							<a href="${pageContext.request.contextPath}/toMessageCenter.do">全部消息</a>
						</div>
					</div>
				</div>
				<!-- End 消息 -->
				<div class="load_in" style="top: 2px;">
					<a href="javascript:;" class="img left"><img id="topImgHead" src="${pageContext.request.contextPath}/${sessionScope.sessionInfo.user.userHeadS}" width="29" height="27" style="border-radius: 1000px;" /></a> <span id='topStuName' class="name right"> <c:if test="${sessionScope.sessionInfo.user.userNickname != null }">
					${sessionScope.sessionInfo.user.userNickname}
				</c:if> <c:if test="${sessionScope.sessionInfo.user.userNickname == null }">
					${sessionScope.sessionInfo.user.userId}
				</c:if>
					</span>
					<div class="grzx" style="display: none;">
						<div class="grzx_x">
							<ul>
								<li><a href="${pageContext.request.contextPath}/myCenter/view.do">个人中心</a></li>
								<li><a href="${pageContext.request.contextPath}/userDataSet.do">设置</a></li>
								<li class="bord1"><a href="${pageContext.request.contextPath}/student.do?method=toFeedback">意见反馈</a></li>
								<li class="tuichu"><a href="javascript:userLogout();">退出</a></li>
							</ul>
							<div class="shangjian">
								<img src="${pageContext.request.contextPath}/images/shangjian.png" width="11" height="8" alt="" />
							</div>
						</div>
					</div>
				</div>
				<!-- End 登录后 -->
			</c:if>
			<!-- 企业用户登录 结束 -->
		</div>
	</div>
</div>
<!-- Start 导航 -->
<div class="b_menu_box">
	<div class="b_menu">
		<div class="zk_lg f_l">
			<a href="${pageContext.request.contextPath}/"> <img src="${pageContext.request.contextPath}/images/zkxy_lg.gif" width="138" height="66" />
			</a>
		</div>
		<ul class="f_l">
			<li><a href="${pageContext.request.contextPath}/">首页</a></li>
			<li><a href="javascript:;">学习</a>
				<div class="twob_nav posa" style="display: none; padding-left: 18px;">
					<dl>
						<dt class="nav_tit">
							<a href="${pageContext.request.contextPath}/toCourses.do" style="line-height: 40px; font-size: 14px;">视频课程</a>
						</dt>
						<dd>
							<a href="${pageContext.request.contextPath}/toSpecialRecommend.do">特别推荐</a>
						</dd>
						<dd>
							<a href="${pageContext.request.contextPath}/toCourseJob.do">工作岗位</a>
						</dd>
						<dd>
							<a href="${pageContext.request.contextPath}/toTechDirection.do">技术方向</a>
						</dd>
						<dd>
							<a href="${pageContext.request.contextPath}/toGrowthDirection.do">成长阶段</a>
						</dd>
					</dl>
					<dl>
						<dt class="nav_tit">直播</dt>
						<dd>
							<a href="${pageContext.request.contextPath}/toReadyPlayLiveCourse.do">即将直播</a>
						</dd>
						<dd>
							<a href="${pageContext.request.contextPath}/toPlaybackLiveCourse.do">精彩回顾</a>
						</dd>
					</dl>
					<dl>
						<dt class="nav_tit">在线辅导</dt>
						<dd>
							<a href="#">一对一辅导</a>
						</dd>
						<dd>
							<a href="#">在线问答</a>
						</dd>
					</dl>
					<dl>
						<dt class="nav_tit">知识库</dt>
						<dd>
							<a href="#">知识库</a>
						</dd>
					</dl>
				</div></li>
			<li><a href="javascript:;">实训</a>
				<div class="twob_nav posa" style="display: none;">
					<div class="two_nav_list">
						<c:choose>
							<c:when test="${empty sessionScope.pracId }">
								<%-- <a href="${pageContext.request.contextPath}/toPracticeList.do">实训列表</a> --%>
								<a href="${pageContext.request.contextPath}/toProjectList.do">项目列表</a>
							</c:when>
							<c:otherwise>
								<a href="${pageContext.request.contextPath}/toPracticeDtl.do?pracId=${sessionScope.pracId}">实训管理</a>
							</c:otherwise>
						</c:choose>

						<a href="${pageContext.request.contextPath}/toProjectShow.do">案例展示</a>
					</div>
				</div></li>
			<li><a href="javascript:;">评测</a>
				<div class="twob_nav posa" style="display: none;">
					<div class="two_nav_list">
						<a href="#">自我测评</a> <a href="#">在线考试</a>
					</div>
				</div></li>
			<li><a href="${pageContext.request.contextPath}/sys.do?method=employmentService">就业</a>
				<div class="twob_nav posa" style="display: none;">
					<dl>
						<dt class="nav_tit">大学生</dt>
						<dd>
							<a href="#">找工作</a>
						</dd>
						<dd>
							<a href="#">实习机会</a>
						</dd>
						<dd>
							<a href="#">深造学习</a>
						</dd>
					</dl>
					<dl>
						<dt class="nav_tit">企业</dt>
						<dd>
							<a href="#">校园招聘</a>
						</dd>
						<dd>
							<a href="#">社会招聘</a>
						</dd>
						<dd>
							<a href="#">人才定制</a>
						</dd>
						<dd>
							<a href="#">岗前培训</a>
						</dd>
					</dl>
				</div></li>
			<li><a href="javascript:;">社区</a></li>
			<li><a href="javascript:;">服务</a>
				<div class="twob_nav posa" style="display: none;">
					<div class="two_nav_list">
						<a href="#">服务介绍</a> <a href="#">服务套餐</a>
					</div>
				</div></li>
			<li><a href="javascript:;">专题</a>
				<div class="twob_nav posa" style="display: none; left: -180px;">
					<div class="two_nav_list">
						<a href="#">热点专题</a> <a href="#">期刊</a> <a href="#">会员活动</a>
					</div>
				</div></li>
		</ul>
		<div class="search f_r" style="top: 22px;">
			<input type="text" name="textfield" id="textfield" class="left text" value="" /> <input type="button" value="  " class="right k_subsear" />
		</div>
	</div>
	<div class="navbg_b" style="display: none;"></div>
</div>
<!-- end 导航 -->

