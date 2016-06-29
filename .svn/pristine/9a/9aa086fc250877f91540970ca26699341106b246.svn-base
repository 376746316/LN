<%@ page language="java" import="java.util.*,com.chinasofti.cetp.utils.MessageUtils,com.chinasofti.cetp.utils.SessionInfo,com.chinasofti.cetp.admin.model.Message" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/include/top.js"></script>
<jsp:include page="/WEB-INF/include/totop.jsp"></jsp:include>
<script type="text/javascript">
	$(document).ready(function(){
		$('div.search').find('input.k_subsear').click(function(){
			var searchParam = $('#textfield').val();
			location.href = ctx+"/search.do?key="+searchParam;
			
		});
		$('#textfield').bind('keyup',function(event){
			if(event.keyCode=="13"){
				var searchParam = $('#textfield').val();
				location.href = ctx+"/search.do?key="+searchParam;
			}
		});
	});
</script>
<!-- Start 登录层 -->
<div class="k_login posa">
	<div class="tabt posr font_yh">
		<ul>
			<li class="active">个人<span class="sj posa"></span></li>
			<li >企业<span class="sj posa"></span></li>
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
						<input type="button" value="" class="login" tabindex="4" onclick="studenLogin('#logErrorMsg')" /> <a href="" class="qx">取消</a>
					</div>
				</div>
			</form>
		</div>
		<div class="k_hidden">
			<form id="login_form_2" action="" method="post">
				<div class="loginbox">
					<div class="loginboxc">
						<div class="username">
							<input type="text" name="userId" value="用户名/邮箱" id="search" tabindex="1" onblur="if(this.value==''){this.value='用户名/邮箱'}" onfocus="if(this.value=='用户名/邮箱'){this.value=''}"/>
						</div>
						<div class="wordpass">
							<input type="text" name="showPwd" value="密码" /> <input type="password" name="userPwd" value="" tabindex="2"/>
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
						<input type="text" name="verifyCode" id="" tabindex="3"/> <span id="userLogErrorMsg" class="tips">* 请输入验证码</span>
					</div>
				</div>
				<!-- End 验证码 -->
				<div class="k_zcdl">
					<div class="left kw">
						<a href="${pageContext.request.contextPath}/pwdRecoverFirst.do" class="wjmm">忘记密码了</a> <a href="${pageContext.request.contextPath}/sys.do?method=register">注册</a>
					</div>
					<div class="right">
						<input type="button" value="" class="login" tabindex="4" onclick="userLogin('#userLogErrorMsg')" /> <a href="" class="qx">取消</a>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<!-- End 登录层 -->
<!-- Start 公共头部 -->
<div class="top">
	<div class="logo">
		<img src="${pageContext.request.contextPath}/images/logo1.png" width="231" height="69" />
	</div>
	<div class="top_r">
		<c:if test="${sessionScope.sessionInfo == null }">
			<!-- 未登录 -->
			<div class="load-rig">
				<ul>
					<li><a href="javascript:;" id="login">登录</a></li>
					<li>|</li>
					<li><a href="${pageContext.request.contextPath}/sys.do?method=register">注册</a></li>
				</ul>
			</div>
			<!-- End 未登录 -->
		</c:if>
		<!-- 个人用户登录 开始 -->
		<c:if test="${sessionScope.sessionInfo.student != null && sessionScope.sessionInfo.user == null}">
			<!-- 登录后 -->

			<!-- 消息 -->
			<div class="k_masgbox posa">
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
			<div class="load_in">
				<a href="" class="img left"><img id="topImgHead" src="${pageContext.request.contextPath}/${sessionScope.sessionInfo.student.stuHeadS}" width="29" height="27" style="border-radius: 1000px;"  /></a> <span id='topStuName' class="name right"> <c:if test="${sessionScope.sessionInfo.student.stuNickname != null }">
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
			<div class="k_masgbox posa">
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
			<div class="load_in">
				<a href="" class="img left"><img id="topImgHead" src="${pageContext.request.contextPath}/${sessionScope.sessionInfo.user.userHeadS}" width="29" height="27" style="border-radius: 1000px;"  /></a> <span class="name right"> <c:if test="${sessionScope.sessionInfo.user.userNickname != null }">
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
		
		<div class="search">
			<input type="text" name="textfield" id="textfield" class="left text" value="" /> 
			<input type="button" value="  " class="right k_subsear" />
		</div>
	</div>
	<div class="clear"></div>
</div>
<div class="menu" style="background-color: #fff; margin-bottom: 0;">
	<div class="menulist">
		<ul>
			<li id="menuItem_Index"><a href="${pageContext.request.contextPath}/">首页</a></li>
			<li id="menuItem_TA" ><a href="">在线测评</a></li>
			<li id="menuItem_Course" ><a href="${pageContext.request.contextPath}/toCourses.do">课程</a>
				<div class="two_nav posa" style="display: none;">
					<a href="${pageContext.request.contextPath}/toSpecialRecommend.do">特别推荐</a><a href="${pageContext.request.contextPath}/toCourseJob.do">岗位</a><a href="${pageContext.request.contextPath}/toTechDirection.do">技术方向</a><a href="${pageContext.request.contextPath}/toGrowthDirection.do">成长方向</a>
				</div></li>
			<li id="menuItem_Prac" ><a href="">在线实训</a></li>
			<li id="menuItem_Live" ><a href="直播-课程介绍.html">直播</a></li>
			<li id="menuItem_QA" ><a href="">在线答疑</a></li>
			<li id="menuItem_HR" ><a href="">人才服务</a></li>
			<li id="menuItem_Res" ><a href="">资源库</a></li>
			<li id="menuItem_Topic"  class="last"><a href="">专题</a></li>
		</ul>
	</div>
	<div class="navbg" style="display: none;">&emsp;</div>
</div>
<!-- Start 公共头部 -->

