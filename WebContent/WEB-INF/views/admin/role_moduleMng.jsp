<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript"
	src="<c:url value="/js/admin/role_moduleMng.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
</head>
<body style="overflow: hidden">

	<input type="hidden" id="loadRoleId" value="${sessionScope.roleId }">

	<form id="role_module_form" name="role_module_form" method="post"
		style="font-size: 12">
		<font color="gray" style="margin-left: 12px">提示信息:
			本功能为超级管理员可见，对角色相应功能点选即可完成操作。</font> <br> <br>
		<p style="margin-left: 12px">
			您正在对 <strong><font color="red">${sessionScope.roleName}
			</font></strong>角色进行权限分配
		</p>
		<div class="easyui-panel" style="width: 850px; height: 290px;">
		<table border="0" cellpadding="0" cellspacing="4"
			style="font-size: 12px">

			<c:forEach items="${rootModule}" var="rootM">
				<tr style="vertical-align: bottom; height: 30px;">

					<td align="right" width="110px"
						style="text-align: top; font-weight: bold">${rootM.mdName}：</td>

					<td style="text-align: top;">
						<%
							int c = 0;
						%> <c:forEach items="${subModule}" var="subM" varStatus="vs">
							<c:if test="${subM.mdParent eq rootM.mdId}">
								<%
									c++;
								%>
								<input type="checkbox" id="checkbox_${subM.mdId}"
									name="checkbox" mdId="${subM.mdId}"
									<c:forEach items="${roleUsedModule}" var="roleUsedM">
															<c:if test="${roleUsedM.mdId eq subM.mdId}">
																	checked="checked"
															</c:if>
														</c:forEach>
									style="width: 20px; margin: -3px 0 0 2px" />
								<span style="width: 85px; display: inline-block">${subM.mdName}
								</span>
							</c:if>
							<%
								if (c % 6 == 0 && c != 0) {
											out.print("</td></tr><tr style=\"vertical-align: top; \"><td align=\"right\" width=\"110px\" style=\"text-align: top; font-weight: bold\"></td><td>");
											c = 0;
										}
							%>
						</c:forEach>
					</td>
				</tr>
			</c:forEach>

		</table>
		</div>
	</form>
	<br>
	<div border="false"
		style="text-align: center; height: 30px; line-height: 30px;">
		<input type="hidden" id="isUpdate" name="isUpdate"> <a
			class="easyui-linkbutton" iconCls="icon-search"
			href="javascript:void(0)" onclick="doRoleMng()">保存</a> <a
			class="easyui-linkbutton" iconCls="icon-cancel"
			href="javascript:void(0)" onclick="parent.doClose('ss_')">取消</a>
	</div>


</body>
</html>