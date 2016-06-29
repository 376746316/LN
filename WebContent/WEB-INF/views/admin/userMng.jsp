<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript"
	src="<c:url value="/js/admin/userMng.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
</head>
<body>

	<div id="rightcont">

		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>
					<p style="text-align: center;">用户信息查询</p>
				</legend>
				<form id="searchfrom" name="searchfrom" method="post">
					<br>
					<table border="0" cellpadding="0" cellspacing="5"
						style="text-align: left; font-size: 12px;">
						<tr>
							<td width="100px" align="right">用户名称：</td>
							<td width="90px" align="left"><input id="userName"
								name="userName" class="easyui-validatebox" style="width: 80px" /></td>


							<td><input type="button" value="查询" title="查询" id="findck"
								class="cx" onclick="doSearch()"> <input type="button"
								value="重置" title="重置" id="resetbtn" class="cz"
								onClick="doReset('searchfrom')"></td>
							</div>
						</tr>
					</table>
					<br>
				</form>
			</fieldset>
		</div>

		<!-- 条件查询 end -->

		<!-- 列表 start -->
		<div id="right_mx">
			<div id="yle_mx">明细列表</div>
		</div>
		<div id="lbmx">
			<table id="list_user" style="height: auto"></table>
		</div>
		<!-- 列表 end -->

		<div id="user_add" class="easyui-window" title="用户信息"
			iconCls="icon-save"
			style="width: 800px; height: 450px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="addform" name="addform" method="post">
						<input type="hidden" id="a_id" name="id"
							class="text ui-widget-content ui-corner-all" />
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">
							<tr>

								<td align="right" width="80px">所属组织：</td>
								<td><select id="a_userOrgid" name="a_userOrgid"
									style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">用户名称：</td>
								<td><input type="text" name="a_userName" id="a_userName"
									required="true" class="easyui-validatebox"
									validType="length[1,7]" precision="1" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">用户登录ID：</td>
								<td><input type="text" name="a_userId" id="a_userId"
									required="true" class="easyui-validatebox" precision="1"
									style="width: 100px"
									validType="remote['validUserId.do','param']" invalidMessage="登录ID已存在或非法（允许字母数字下划线，允许6-16字节）"/></td>
								<td align="right" width="80px">密码：</td>
								<td><input type="text" name="a_userPwd" id="a_userPwd"
									required="true" class="easyui-validatebox"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">用户昵称：</td>
								<td><input type="text" name="a_userNickname"
									id="a_userNickname" class="easyui-validatebox" required=true
									style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">用户手机：</td>
								<td><input type="text" name="a_userMobile"
									id="a_userMobile" class="easyui-validatebox" required=true data-options="validType:'mobile'" 
									precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">工作电话：</td>
								<td><input type="text" name="a_userPhone" id="a_userPhone"
									class="easyui-validatebox" data-options="validType:'phone'"
									required=true precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">邮箱：</td>
								<td><input type="text" name="a_userMail" id="a_userMail"
									required=true validType="email" class="easyui-validatebox"
									precision="0" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">QQ号：</td>
								<td><input type="text" name="a_userQq" id="a_userQq"
									required=true class="easyui-validatebox"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">QQ群：</td>
								<td><input type="text" name="a_userGrpQq" id="a_userGrpQq"
									required=true class="easyui-validatebox"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">职务：</td>
								<td><input type="text" name="a_userTitle" id="a_userTitle"
									class="easyui-validatebox" validType="length[1,10]"
									precision="0" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">性别：</td>
								<td><select id="a_userSex" name="a_userSex"
									style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">出生日期：</td>
								<td><input type="text" name="a_userBirth" id="a_userBirth"
									required="true" class="easyui-datebox" precision="0"
									style="width: 100px" /></td>
								<td align="right" width="80px">邮编：</td>
								<td><input type="text" name="a_userPostCode"
									id="a_userPostCode" class="easyui-validatebox" required="true"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">学历：</td>
								<td><select id="a_userEduLevel" name="a_userEduLevel"
									required="true" style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">所授课程：</td>
								<td><input type="text" name="a_userSubject"
									id="a_userSubject" class="easyui-validatebox" required="true"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">用户性质：</td>
								<td><select id="a_userType" name="a_userType"
									required="true" style="width: 100px" class="easyui-combobox" /></select></td>
							</tr>
							<tr>
								<td align="right" width="80px">省：</td>
								<td><select id="a_province" name="a_province"
									style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">市：</td>
								<td><select id="a_userAreaCode" name="a_userAreaCode"
									required="true" style="width: 110px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">是否为负责人：</td>
								<td><select id="a_userIsLeader" name="a_userIsLeader"
									required="true" style="width: 110px" class="easyui-combobox" />
									<option value="0">不是</option>
									<option value="1">是</option> </select></td>
							</tr>
							<tr>
								<td align="right" width="80px">地址：</td>
								<td colspan="5"><textarea id="a_userAddress"
										name="a_userAddress" cols="50" rows="6"
										style="width: 500px; height: 50px"></textarea></td>

							</tr>
							<tr>
								<td align="right" width="80px">备注：</td>
								<td colspan="5"><textarea id="a_userMark" name="a_userMark"
										cols="50" rows="6" style="width: 500px; height: 50px"></textarea></td>
							</tr>
						</table>
					</form>
					<br> <br>
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px;">
						 <input
							type="hidden" id="isUpdate" name="isUpdate"> <a
							class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="doAddOrEdit()">保存</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('user_add')">取消</a>
					</div>
				</div>
			</div>
		</div>

		<!-- 添加修改end -->

		<div id="user_upd" class="easyui-window" title="用户信息"
			iconCls="icon-save"
			style="width: 800px; height: 450px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="updform" name="updform" method="post">
						<input type="hidden" id="u_id" name="u_id"
							class="text ui-widget-content ui-corner-all" />
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">
							<tr>

								<td align="right" width="80px">所属组织：</td>
								<td><select id="u_userOrgid" name="u_userOrgid"
									style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">用户名称：</td>
								<td><input type="text" name="u_userName" id="u_userName"
									required="true" class="easyui-validatebox"
									validType="length[1,7]" precision="1" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">用户登录ID：</td>
								<td><span style="display: block; width: 100px;"
									name="u_userId" id="u_userId"></span></td>
								<td align="right" width="80px">密码：</td>
								<td><input type="text" name="u_userPwd" id="u_userPwd"
									required="true" class="easyui-validatebox"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">用户昵称：</td>
								<td><input type="text" name="u_userNickname"
									id="u_userNickname" class="easyui-validatebox" required=true
									style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">用户手机：</td>
								<td><input type="text" name="u_userMobile"
									id="u_userMobile" class="easyui-validatebox" required=true
									validType="length[1,11]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">工作电话：</td>
								<td><input type="text" name="u_userPhone" id="u_userPhone"
									class="easyui-validatebox" validType="length[1,15]"
									required=true precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">邮箱：</td>
								<td><input type="text" name="u_userMail" id="u_userMail"
									required=true validType="email" class="easyui-validatebox"
									precision="0" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">QQ号：</td>
								<td><input type="text" name="u_userQq" id="u_userQq"
									required=true class="easyui-validatebox"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">QQ群：</td>
								<td><input type="text" name="u_userGrpQq" id="u_userGrpQq"
									required=true class="easyui-validatebox"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">职务：</td>
								<td><input type="text" name="u_userTitle" id="u_userTitle"
									class="easyui-validatebox" validType="length[1,10]"
									precision="0" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">性别：</td>
								<td><select id="u_userSex" name="u_userSex"
									style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">出生日期：</td>
								<td><input type="text" name="u_userBirth" id="u_userBirth"
									required="true" class="easyui-datebox" precision="0"
									style="width: 100px" /></td>
								<td align="right" width="80px">邮编：</td>
								<td><input type="text" name="u_userPostCode"
									id="u_userPostCode" class="easyui-validatebox" required="true"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
							</tr>
							<tr>
								<td align="right" width="80px">学历：</td>
								<td><select id="u_userEduLevel" name="u_userEduLevel"
									required="true" style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">所授课程：</td>
								<td><input type="text" name="u_userSubject"
									id="u_userSubject" class="easyui-validatebox" required="true"
									validType="length[1,10]" precision="0" style="width: 100px" /></td>
								<td align="right" width="80px">用户性质：</td>
								<td><select id="u_userType" name="u_userType"
									required="true" style="width: 100px" class="easyui-combobox" /></select></td>
							</tr>
							<tr>
								<td align="right" width="80px">省：</td>
								<td><select id="u_province" name="u_province"
									style="width: 100px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">市：</td>
								<td><select id="u_userAreaCode" name="u_userAreaCode"
									required="true" style="width: 110px" class="easyui-combobox" /></select></td>
								<td align="right" width="80px">是否为负责人：</td>
								<td><select id="u_userIsLeader" name="u_userIsLeader"
									required="true" style="width: 110px" class="easyui-combobox" />
									<option value="0">不是</option>
									<option value="1">是</option> </select></td>
							</tr>
							<tr>
								<td align="right" width="80px">地址：</td>
								<td colspan="5"><textarea id="u_userAddress"
										name="u_userAddress" cols="50" rows="6"
										style="width: 500px; height: 50px"></textarea></td>

							</tr>
							<tr>
								<td align="right" width="80px">备注：</td>
								<td colspan="5"><textarea id="u_userMark" name="u_userMark"
										cols="50" rows="6" style="width: 500px; height: 50px"></textarea></td>
							</tr>
						</table>
					</form>
					<br> <br>
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px;">
						<input type="hidden" id="upd_userNo" name="upd_userNo"> <input
							type="hidden" id="u_isUpdate" name="u_isUpdate"> <a
							class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="doUpd()">保存</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('user_upd')">取消</a>
					</div>
				</div>
			</div>
		</div>
	</div>







</body>
</html>