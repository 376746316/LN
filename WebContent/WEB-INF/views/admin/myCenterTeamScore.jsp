<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link href="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/themes/icon.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/themes/default/treegrid.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<c:url value="/js/admin/myCenterTeamScore.js" />"></script>
<input type="hidden" id="hidStuNo" value="${sessionScope.sessionInfo.stuNo }" />
<input type="hidden" id="hidPlId" />
<input id="hidTeamId" type="hidden" value="${teamId}" />
<input id="hidProId" type="hidden" value="${proId}" />
<!-- Start 实训成绩详细 -->
<div class="kcjs_jj">
	<div class="kc_tit">实训成绩详细</div>
	<div class="clear"></div>
	<div class="blank20"></div>
	<table id="treeTeamScore"></table>
</div>
<!-- End 实训成绩详细 -->
<div class="blank20"></div>
<!-- Start 个人总分列表 -->
<div class="kcjs_jj">
	<div class="kc_tit">个人总分列表</div>
	<div class="clear"></div>
	<div class="rwjs_tab borput2" style="width: 650px;">
		<table width="100%" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th width="15%">学生编号</th>
					<th width="25%">学生姓名</th>
					<th width="15%">任务个数</th>
					<th width="15%">任务总分</th>
					<th width="15%">组长评分</th>
					<th width="15%">项目经理评分</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${tmsList }" var="tms">
					<tr>
						<td>${tms.stuNo }</td>
						<td>${tms.stuName }</td>
						<td>${tms.taskNum }</td>
						<td>${tms.sumTaskScore }</td>
						<td>${tms.sumLeaderScore }</td>
						<td>${tms.sumTeacherScore }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<!-- End 个人总分列表 -->

<!-- 成果物列表 开始 -->
<div class="blank20"></div>
<div class="kcjs_jj">
	<div class="kc_tit">项目成果</div>
	<div class="clear"></div>
	<div class="rwjs_tab borput2" style="width: 100%">
		<table width="100%" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th width="40%">名称</th>
					<th width="20%">类型</th>
					<th width="20%">上传时间</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${empty achList}">
					<tr>
						<td colspan="4">暂无文件</td>
					</tr>
				</c:if>
				<c:forEach items="${achList }" var="ach">
					<tr>
						<td>${ach.achResultName }</td>
						<td>${ach.achResultType }</td>
						<td><fmt:formatDate value="${ach.achRegtime }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td><a href="${ctx}/download.do?fileurl=${ach.achResultUrl }" target="_blank">下载</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<!-- 成果物列表 结束 -->
<!-- 成果物开始 -->
<div class="cgw_box borput2">
	<div class="rwjd_box_fl">
		<h2>
			担当人：<span id="stuName"></span>
		</h2>
	</div>
	<div id="notpr">
		<h2>没有上传成果物</h2>
	</div>
	<c:forEach items="${typeList}" var="type">
		<div class="cgw_box_type" typeId="${type.param_id }">
			<h2>${type.param_name }</h2>
		</div>
	</c:forEach>
</div>
<!-- 成果物结束 -->

