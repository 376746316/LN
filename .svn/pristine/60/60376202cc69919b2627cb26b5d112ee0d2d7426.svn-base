<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link href="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/themes/icon.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/themes/default/treegrid.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<c:url value="/js/admin/myCenterStuScore.js" />"></script>
<input id="hidStuNo" type="hidden" value="${sessionScope.sessionInfo.stuNo}" />
<input id="hidProId" type="hidden" value="${proId}" />
<!-- Start 实训成绩详细 -->
<div class="kcjs_jj">
	<div class="kc_tit">实训成绩详细</div>
	<div class="clear"></div>
	<div class="blank20"></div>
	<table id="treeStuScore"></table>
</div>
<!-- End 实训成绩详细 -->

<!-- 成果物列表开始 -->
<div class="blank20"></div>
<div class="kcjs_jj">
	<div class="kc_tit">
		项目成果
	</div>
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
				<c:if test="${empty  achList}">
					<tr>
						<td colspan="4">暂无文件</td>
					</tr>
				</c:if>
				<c:forEach items="${achList }" var="ach">
					<tr>
						<td>${ach.paResultName }</td>
						<td>${ach.paResultType }</td>
						<td><fmt:formatDate value="${ach.achResultRegtime }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td><a href="${ctx}/download.do?fileurl=${ach.paResultUrl }" target="_blank">下载</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<!-- 成果物列表结束 -->
<!-- 成果物开始 -->
<div class="cgw_box borput2">
	<div id="noprp">
		<h2>没有上传成果物</h2>
	</div>
	<c:forEach items="${typeList}" var="type">
		<div class="cgw_box_type" typeId="${type.param_id }">
			<h2>${type.param_name }</h2>
		</div>
	</c:forEach>
</div>
<!-- 成果物结束 -->
