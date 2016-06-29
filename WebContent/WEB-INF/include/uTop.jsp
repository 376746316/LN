<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.chinasofti.cetp.utils.SessionInfo,com.chinasofti.cetp.utils.UserGroupUtils"%>
<div class="blank10"></div>
<!-- Start banner-->
<div class="xxzx_banner">

	<c:if test="${sessionScope.sessionInfo.student!=null&&sessionScope.sessionInfo.user==null}">
		<p>
		<img src="${ctx}/images/xxzx_b.png" width="1000" height="280" alt="" />
	<p>
	<div class="x_yhtx">
		<img src="${ctx}/${sessionScope.sessionInfo.student.stuHead}" width="100" height="100" style="border-radius: 1000px;" />
	</div>

	<p class="x_yhm">
		<c:if test="${sessionScope.sessionInfo.student.stuNickname != null }">
					${sessionScope.sessionInfo.student.stuNickname}
				</c:if>
		<c:if test="${sessionScope.sessionInfo.student.stuNickname == null }">
					${sessionScope.sessionInfo.student.stuUserid}
				</c:if>
	</p>
	<p class="x_yhdj">
		等级：<span><%=UserGroupUtils.getUserGroup(
					((SessionInfo) session.getAttribute("sessionInfo"))
							.getStudent().getStuGroupId()).getUgLevel()%>级</span> 积分：<span>${sessionScope.sessionInfo.student.stuScore}分</span>
	</p>
	</c:if>
	
	<c:if test="${sessionScope.sessionInfo.user!=null&&sessionScope.sessionInfo.student==null}">
		<p>
		<img src="${ctx}/images/xxzx_b.png" width="1000" height="280" alt="" />
	<p>
	<div class="x_yhtx">
		<img src="${ctx}/${sessionScope.sessionInfo.user.userHead}" width="100" height="100" style="border-radius: 1000px;" />
	</div>

	<p class="x_yhm">
		<c:if test="${sessionScope.sessionInfo.user.userNickname != null }">
					${sessionScope.sessionInfo.user.userNickname}
				</c:if>
		<c:if test="${sessionScope.sessionInfo.user.userNickname == null }">
					${sessionScope.sessionInfo.user.userId}
				</c:if>
	</p>
	<p class="x_yhdj">
		等级：<span><%=UserGroupUtils.getUserGroup(
					((SessionInfo) session.getAttribute("sessionInfo"))
							.getUser().getUserGroupId()).getUgLevel()%>级</span> 积分：<span>${sessionScope.sessionInfo.user.userScore}分</span>
	</p>
	</c:if>
</div>
<!-- End banner-->