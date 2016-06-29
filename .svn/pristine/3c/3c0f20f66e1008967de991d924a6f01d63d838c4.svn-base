<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript"
	src="<c:url value="/js/admin/stuMng.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
<script type="text/javascript">
	function startUpload() {
		$('#stumngfileupload').uploadify('upload', '*');
	}
</script>
</head>
<body>

	<div id="rightcont">

		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>
					<p style="text-align: center;">学生信息查询</p>
				</legend>
				<form id="searchfrom" name="searchfrom" method="post">
					<br>
					<table border="0" cellpadding="0" cellspacing="5"
						style="text-align: left; font-size: 12px;">
						<tr>
							<td width="100px" align="right">姓名：</td>
							<td width="90px" align="left"><input id="s_stuName"
								name="s_stuName" class="easyui-validatebox" style="width: 80px" /></td>
							<td width="100px" align="right">所属组织：</td>
							<td width="90px" align="left"><input id="s_stuOrg"
								name="s_stuOrg" class="easyui-combobox" style="width: 160px" /></td>
							<td><input type="button" value="查询" title="查询" id="findck"
								class="cx" onclick="doSearch()"> <input type="button"
								value="重置" title="重置" id="resetbtn" class="cz"
								onClick="doReset('searchfrom')"></td>
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

		<!-- 添加修改  start-->
		<div id="user_add" class="easyui-window" title="学生基本信息"
			iconCls="icon-save"
			style="width: 1030px; height: 480px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="addform" name="addform" method="post">
						<input type="hidden" id="stuNo" name="stuNo">
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">
							<tr>
								<td align="right" width="100px">学号：</td>
								<td><input type="text" id="stuNum" name="stuNum"
									required="true" class="easyui-validatebox" style="width: 120px" /></td>
								<td align="right" width="100px">姓名：</td>
								<td><input type="text" id="stuName" name="stuName"
									required="true" class="easyui-validatebox" style="width: 120px" /></td>
								<td align="right" width="100px">身份证号：</td>
								<td><input type="text" id="stuIdcard" name="stuIdcard"
									class="easyui-numberbox" style="width: 120px" /></td>
								<td align="right" width="100px">昵称：</td>
								<td><input type="text" id="stuNickname" name="stuNickname"
									class="easyui-validatebox" style="width: 120px" /></td>
							</tr>
							<tr>
								<td align="right" width="100px">登录ID：</td>
								<td><input type="text" id="stuUserid" name="stuUserid"
									class="easyui-validatebox" style="width: 120px"
									required="true " /></td>
								<td align="right" width="100px">密码：</td>
								<td><input type="text" id="stuPwd" name="stuPwd"
									class="easyui-validatebox" style="width: 120px" required="true" /></td>
								<td align="right" width="100px">QQ号：</td>
								<td><input type="text" id="stuQq" name="stuQq"
									class="easyui-numberbox" style="width: 120px" /></td>
								<td align="right" width="100px">QQ群：</td>
								<td><input type="text" id="stuGrpQq" name="stuGrpQq"
									class="easyui-numberbox" style="width: 120px" /></td>
							</tr>
							<tr>
								<td align="right" width="100px">移动电话：</td>
								<td><input type="text" id="stuMobile" name="stuMobile"
									class="easyui-numberbox" style="width: 120px" data-options="validType:'mobile'" /></td>
								<td align="right" width="100px">工作电话：</td>
								<td><input type="text" id="stuPhone" name="stuPhone"
									class="easyui-numberbox" style="width: 120px" data-options="validType:'phone'" /></td>
								<td align="right" width="100px">E-Mail：</td>
								<td><input type="text" id="stuMail" name="stuMail"
									validType="email" class="easyui-validatebox"
									style="width: 120px" data-options="validType:'email'" /></td>
								<td align="right" width="100px">政治面貌：</td>
								<td><select id="stuPolitic" name="stuPolitic"
									class="easyui-combobox" style="width: 120px" panelHeight=110>
										<option value="0">共产党员</option>
										<option value="1">民主党派</option>
										<option value="2">群众</option>
								</select></td>
							</tr>
							<tr>
								<td align="right" width="100px">性别：</td>
								<td><select id="stuSex" name="stuSex" required="true"
									class="easyui-combobox" style="width: 120px" panelHeight=40>
										<option value="1">女</option>
										<option value="0">男</option>
								</select></td>
								<td align="right" width="100px">出生日期：</td>
								<td><input type="text" id="stuBirth" name="stuBirth"
									class="easyui-datebox" style="width: 120px"
									formatter="formatDate" /></td>
								<td align="right" width="100px">省：</td>
								<td><select id="s_province" name="s_province"
									class="easyui-combobox" style="width: 120px"></select></td>
								<td align="right" width="100px">市：</td>
								<td><select id="areaCode" name="areaCode"
									class="easyui-combobox" style="width: 120px"></select></td>
								<!-- 所属市区 -->
							</tr>

							<tr>
								<td align="right" width="100px">邮编：</td>
								<td><input type="text" id="stuPostcode" name="stuPostcode"
									class="easyui-numberbox" style="width: 120px" data-options="validType:'zip'"/></td>
								<td align="right" width="100px">是否为班干部：</td>
								<td><select id="stuIsLeader" name="stuIsLeader"
									class="easyui-combobox" style="width: 120px" panelHeight=40>
										<option value="0">不是</option>
										<option value="1">是</option>
								</select></td>
								<td align="right" width="100px">职务：</td>
								<td><input type="text" id="stuTitle" name="stuTitle"
									style="width: 120px" /></td>
								<td align="right" width="100px">学生性质：</td>
								<td><select id="stuType" name="stuType"
									class="easyui-combobox" style="width: 120px"></select></td>

							</tr>

							<tr>
								<td align="right" width="100px">所属组织：</td>
								<td><select id="stuOrgid" name="stuOrgid"
									class="easyui-combobox" style="width: 120px"></select></td>

								<td align="right" width="100px">学历：</td>
								<td><select id="stuEduLevel" name="stuEduLevel"
									class="easyui-combobox" style="width: 120px" panelHeight=120>
										<option value="0">初中</option>
										<option value="1">高中</option>
										<option value="2">大专</option>
										<option value="3">本科</option>
										<option value="4">硕士</option>
										<option value="5">博士</option>
								</select></td>
								<td align="right" width="100px">年级：</td>
								<td><input type="text" id="stuGrade" name="stuGrade"
									class="easyui-numberbox" style="width: 120px" /></td>

								<td align="right" width="100px">培训周期：</td>
								<td><input type="text" id="stuCycle" name="stuCycle"
									class="easyui-validatebox" style="width: 120px" /></td>

							</tr>

							<tr>

								<td align="right" width="100px">学校：</td>
								<td><select id="stuSchoolId" name="stuSchoolId"
									class="easyui-combobox" style="width: 120px" panelHeight=110>
								</select></td>
								<td align="right" width="100px">专业：</td>
								<td><select id="stuMajor" name="stuMajor"
									class="easyui-combobox" style="width: 120px" panelHeight=110>
								</select></td>
								<td align="right" width="100px">技术方向：</td>
								<td><select id="stuTechDirect" name="stuTechDirect"
									class="easyui-combobox" style="width: 120px" panelHeight=110>
								</select></td>
								<td align="right" width="100px">班级：</td>
								<td><select id="stuClassId" name="stuClassId"
									required="true" class="easyui-combobox" style="width: 120px"
									panelHeight=110>
								</select></td>


							</tr>

							<tr>
								<td align="right" width="100px">特长：</td>
								<td><input type="text" id="stuHobby" name="stuHobby"
									class="easyui-validatebox" style="width: 120px" /></td>
								<td align="right" width="100px">家庭联系人：</td>
								<td><input type="text" id="stuLink" name="stuLink"
									class="easyui-validatebox" style="width: 120px" /></td>
								<td align="right" width="100px">家庭联系方式：</td>
								<td><input type="text" id="stuLinkTel" name="stuLinkTel"
									class="easyui-validatebox" style="width: 120px" /></td>
								<td align="right" width="100px">考勤号：</td>
								<td><input type="text" id="stuTimeCard" name="stuTimeCard"
									class="easyui-validatebox" style="width: 120px" /></td>
							<tr>
							<tr>
								<td align="right" width="100px">入学时间 ：</td>
								<td><input type="text" id="stuEnrol" name="stuEnrol"
									class="easyui-datebox" style="width: 120px" /></td>
								<td align="right" width="100px">毕业时间 ：</td>
								<td><input type="text" id="stuGradeuate"
									name="stuGradeuate" class="easyui-datebox" style="width: 120px" /></td>
								<td align="right" width="100px">入园时间 ：</td>
								<td><input type="text" id="stuJoinBase" name="stuJoinBase"
									class="easyui-datebox" style="width: 120px" /></td>
							</tr>
							<tr>
								<td align="right" width="100px">地址：</td>
								<td colspan="7"><input type="text" id="stuAddress"
									name="stuAddress" class="easyui-validatebox"
									style="width: 800px" /></td>
							</tr>
							<tr>
								<td align="right" width="100px" style="text-align: top">备注：</td>
								<td colspan="7"><textarea id="stuMark" name="stuMark"
										cols="50" rows="6" style="width: 800px; height: 40px"></textarea></td>
							</tr>


							<tr>
								<td align="right" width="100px" style="text-align: top">培训经历：</td>
								<td colspan="7"><textarea id="stuTrain" name="stuTrain"
										cols="50" rows="6" style="width: 800px; height: 40px"></textarea></td>
							</tr>

						</table>
					</form>
					<br>
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px;">
						<input type="hidden" id="isUpdate" name="isUpdate"> <a
							class="easyui-linkbutton" iconCls="icon-search"
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


		<!-- 上传excel -->
		<div id="uploadDiv" class="easyui-window" closed="true" modal="true"
			minimizable="false" maximizable="false" title="请您选择Excel表格"
			style="width: 340px; height: 330px;padding: 10px 5px 0 5px;">
			<input type="file" id="stumngfileupload" name="stumngfileupload" />
			<a href="javascript:startUpload()" class="easyui-linkbutton" iconCls="icon-add" style="float:right;">确认上传</a>
			<div id="uploadQueue" style="margin:30px 0 0 10px"></div>
		</div>
		<!-- 上传excel -->

	</div>

</body>
</html>