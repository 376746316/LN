<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript" src="<c:url value="/js/admin/roleMng.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
</head>
<body>

	<div id="rightcont">

		<!-- 条件查询 start -->
	
		<!-- 条件查询 end -->

		<!-- 列表 start -->
		<div id="right_mx">
			<div id="yle_mx">明细列表</div>
		</div>
		<div id="lbmx">
			<table id="list_user" style="height: auto"></table>
		</div>
		<!-- 列表 end -->

		<!-- 添加修改  start-->
		<div id="user_add" class="easyui-window" title="管理员信息"
			iconCls="icon-save"
			style="width: 390px; height: 250px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="addform" name="addform" method="post" >

						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">
							<tr>
								<td align="right" width="110px">角色名称：</td>
								<td><input type="text" id="a_roleName"
									name="a_roleName" class="easyui-validatebox" data-options="required:true"
									style="width: 180px" /></td>
							</tr>
							<tr>
								<td align="right" width="110px">角色描述：</td>
								<td><input type="text" id="a_roleIntro"
									name="a_roleIntro" class="easyui-validatebox"
									style="width: 180px" /></td>
							</tr>
				
						</table>
					</form>
					<br> 
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px;">
						<input type="hidden" id="isUpdate" name="isUpdate" >
						
						<a class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="doAdd()">保存</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('user_add')">取消</a>
					</div>
				</div>
			</div>
		</div>
		<!-- 添加修改end -->
		<div id="ss_" class="easyui-window" title="权限分配"
			iconCls="icon-save"
			style="width: 900px; height: 480px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div id="role_moduleDiv" style="width: 100%; height: 100%;"></div>
		</div>
		
		<div id="uu_" class="easyui-window" title="用户分配"
			iconCls="icon-save"
			style="width: 740px; height: 480px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div id="role_userDiv" style="width: 100%; height: 100%;"></div>
		</div>
		<!-- 上传excel -->

		<div id="uploadDiv" class="easyui-window" closed="true" modal="true" minimizable="false"
			maximizable="false" title="请您选择Excel表格" style="width: 430px; height: 200px;">
			
			<div style="font-family: 微软雅黑; margin-top: 40px;margin-left: 40px;">文件路径：<input type="file" id="up" name="ad_majorCode" class="easyui-validatebox"
									style="width: 230px" />
									</div>
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px; margin-top: 30px">
						<a class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="doUp()">保存</a> 
							<a class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('uploadDiv')" >取消</a>
					</div>
			</div>
			
		<!-- 上传excel -->

	</div>

</body>
</html>