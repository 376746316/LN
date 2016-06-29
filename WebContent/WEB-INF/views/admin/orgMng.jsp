<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript" src="<c:url value="/js/admin/orgMng.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
</head>
<body>

	<div id="rightcont">
		

		<!-- 列表 start -->
		<div id="right_mx">
			<div id="yle_mx">明细列表</div>
		</div>
		<div id="lbmx">
			<table id="list_user" style="height: auto"></table>
		</div>
		<!-- 列表 end -->

		<!-- 添加修改  start-->
		<div id="user_add" class="easyui-window" title="组织信息"
			iconCls="icon-save"
			style="width: 800px; height: 320px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="addform" name="addform" method="post">
						
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">
							<tr>
								<td align="right" width="180px">组织编码：</td>
								<td><input type="text" id="ad_orgCode" name="ad_orgCode" class="easyui-validatebox" data-options="required:true"
									style="width: 130px" /></td>
								<td align="right" width="180px">组织名称：</td>
								<td><input type="text" id="ad_orgName" name="ad_orgName" class="easyui-validatebox"  data-options="required:true"
									style="width: 130px" /></td>
							</tr>
							<tr>		
								<td align="right" width="180px">所属组织：</td>
								<td>
									<select id="ad_orgParent" name="ad_orgParent" class="easyui-combobox"  style="width: 130px"  ></select>
								</td>
								<td align="right" width="180px">组织标识：</td>
								<td><select id="ad_orgFlag" name="ad_orgFlag" class="easyui-combobox" editable=false style="width: 130px" ></select>
								</td>
							</tr>
							
							<tr>
								<td align="right" width="180px">联系人：</td>
								<td><input type="text" id="ad_LinkMan" name="ad_LinkMan" class="easyui-validatebox"  data-options="required:true"
									style="width: 130px" /></td>
								<td align="right" width="180px">联系方式：</td>
								<td><input type="text" id="ad_LinkTel" name="ad_LinkTel" class="easyui-validatebox"  data-options="required:true"
									style="width: 130px" /></td>
							</tr>
							
							<tr>
								<td align="right" width="180px">网址：</td>
								<td><input type="text" id="ad_orgSite" name="ad_orgSite" class="easyui-validatebox" 
									style="width: 130px" /></td>
								<td align="right" width="180px">地址：</td>
								<td><input type="text" id="ad_orgAddress" name="ad_orgAddress" class="easyui-validatebox"  data-options="required:true"
									style="width: 130px" /></td>
							</tr>
							
							<tr>
								<td align="right" width="180px">邮编：</td>
								<td><input type="text" id="ad_orgPostCode" name="ad_orgPostCode" class="easyui-validatebox" 
									style="width: 130px" /></td>
								<td align="right" width="180px">传真：</td>
								<td><input type="text" id="ad_orgFax" name="ad_orgFax" class="easyui-validatebox" 
									style="width: 130px" /></td>
							</tr>
							<tr>		
								<td align="right" width="180px">组织分类：</td>
								<td><select id="ad_orgType" name="ad_orgType" class="easyui-combobox"  style="width: 130px" ></select>
								</td>
								<td align="right" width="180px">邮箱：</td>
								<td><input type="text" id="ad_orgMail" name="ad_orgMail" class="easyui-validatebox" 
									style="width: 130px" data-options="required:true,validType:'email'" /></td>
							</tr>
							
							<input type="hidden" id="isUpdate" name="isUpdate" >
							<input type="hidden" id="upd_orgId" name="upd_orgId" >
						</table>
					</form>
					<br> <br>
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px;">
						<a class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="doAdd()">保存</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('user_add')">取消</a>
					</div>
				</div>
			</div>
		</div>
		<!-- 添加修改end -->
		<!-- 详细信息 -->
		<!-- 详细信息 -->
	</div>

</body>
</html>