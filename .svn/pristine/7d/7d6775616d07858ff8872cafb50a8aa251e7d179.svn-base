<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CETP</title>
<style type="text/css">
.tag-title {
	width: 200px;
	font-size: 16px;
	color: #fff;
	float: left;
	text-transform: capitalize;
	padding: 8px 10px 8px 8px;
	position: relative;
	z-index: 100;
	margin: 0;
	line-height: 100%;
	background: #80b600;
	font-size: 16px;
}

.tag-title:before {
	content: '';
	position: absolute;
	width: 1px;
	height: 0px;
	right: -17px;
	top: 0px;
	border-width: 16px 16px;
	border-style: solid;
	z-index: 10;
	border-color: #80b600 transparent #80b600 transparent;
}

.tag-title-wrap {
	background: url(images/darkdots.png) #fff repeat-x center;
	margin: 0 0 30px 0;
}

.clearfix {
	zoom: 1;
}

.clearfix:before,.clearfix:after {
	content: "";
	display: table;
}

.clearfix:after {
	clear: both;
}

.section {
	padding: 0 20px 40px 20px;
}

.section-mini {
	padding: 0 20px 20px 20px;
}

.section-mini2 {
	padding: 0 20px 10px 20px;
}

.site-intro {
	font-family: 'Cardo', serif;
	font-size: 22px;
	font-style: italic;
	line-height: 150%;
}
</style>
<script type="text/javascript" src="<c:url value="/js/default.js" />"></script>
<script type="text/javascript">
	function logOut() {

		$.messager.confirm('提示信息', '是否确认注销系统用户?', function(r) {
			if (r) {

				$.post("clearUserSession.do", null, function(rsp) {
					location = "tologin.do";
				}).error(function() {
					location = "tologin.do";
				});

			}
		});

	}

	$.extend($.fn.validatebox.defaults.rules, {
		equals : {
			validator : function(value, param) {
				return value == $(param[0]).val();
			},
			message : '两次输入密码必须一致.'
		}
	});

	function doClearSession() {
		$.messager.confirm('提示信息', '是否确认注销实训平台?', function(r) {
			if (r) {
				$.post("clearAllSession.do", null, function(rsp) {
					location = "towebsite.do";
				}).error(function() {
					location = "towebsite.do";
				});

			}
		});
	}
	function doClose(winid) {
		$("#" + winid).window('close');
	}
	function updUserPwd() {
		$('#isUpdate').val('updateUserPwd.do');
		$('#updPwd').form('clear');
		$('#updPwdDiv').window('open');
	}
	function saveUpdate() {
		if ($('#updPwd').form('validate')) {
			var stuPwd = {
				old_pwd : $("#old_pwd").val(),
				new_pwd : $("#re_pwd").val()
			};

			$.post($('#isUpdate').val(), stuPwd, function(rsp) {
				if (rsp == "success") {
					msgSlider('操作成功！');
				} else if (rsp == "queryError") {
					msgSlider('原密码错误！');
				} else if (rsp == "updateError") {
					msgSlider('操作异常，请重新修改！');
				}
			}).error(function() {
				msgSlider('操作失败！');
			});

			$('#updPwdDiv').window('close');

		}
	}
	function msgSlider(message) {
		$.messager.show({
			title : '操作提示',
			msg : message,
			timeout : 1500,
			showType : 'slide'
		});
	}
</script>

<style>
a:hover {
	text-decoration: none;
}

a:visited {
	text-decoration: none;
	font-color: gray;
	font-family: "宋体";
	font-size: 9pt;
}

a:link {
	text-decoration: none;
	font-family: "宋体";
	font-size: 10pt;
	color: #000033;
}

a:active {
	text-decoration: none;
	font-size: 10pt;
}
</style>

</head>


<body class="easyui-layout" style="overflow-y: hidden" scroll="no">

	<div data-options="region:'north',split:false"
		style="height: 100px; padding: 0; overflow: heiiden">

		<div
			style="background: url('./images/main/swtp_01.jpg') no-repeat; width: 100%; height: 100%;">
			<div
				style="float: right; color: white; margin-top: -1px; margin-right: 10px">
				您好,尊敬的用户： &nbsp;${sessionScope.userName} <img
					src="images/swtp_admin.jpg" style="margin-top: 3px"> <a
					href="javascript:updUserPwd();" class="easyui-linkbutton"
					iconCls="icon-save">修改密码</a><a href="javascript:logOut();"
					class="easyui-linkbutton" iconCls="icon-redo">注销系统</a>
			</div>
		</div>

	</div>


	<div data-options="region:'west',split:true" title="用户菜单"
		style="width: 180px; padding1: 1px; overflow: hidden;">
		<div id="menu" class="easyui-accordion"
			data-options="fit:true,border:false">

			<!-- 循环一级菜单 start -->


			<c:forEach items="${rootMenu}" var="rootM">
				<div title="${rootM.mdName}" style="padding: 10px; overflow: auto;">
					<!-- 循环二级菜单 start -->
					<c:forEach items="${subMenu }" var="subM" varStatus="vs">

						<c:if test="${subM.mdParent eq rootM.mdId}">
							<p>
							<div style="float: left; margin-right: 3px">
								<img src="${subM.mdUrlIconUrl }" width="16px" height="16px" />
							</div>
							<a
								href="javascript:addTab('${ subM.mdName}','${subM.mdUrlHref}')">${subM.mdName}</a>
							</p>
						</c:if>
					</c:forEach>
					<!-- 循环二级菜单 end -->
				</div>


			</c:forEach>

		</div>
	</div>

	<div id="mainPanle" region="center"
		style="background: #eee; overflow-y: hidden">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎使用"
				style="padding: 20px; overflow-x: hidden; overflow-y: scroll;">
				<div class="section section-mini">
					<h2 class="site-intro">“中软国际大学生实训平台”根植于中软国际、微软、Oracle、IBM等全球领先的软件和服务巨擘，成功的将行业最高标准转化的为适合于本科及高职院校的全面的解决方案，以精细管理方式保障了实训效果。</h2>
				</div>
				<div class="section-mini2">
					<div class="tag-title-wrap clearfix">
						<h4 class="tag-title">1、真实的企业项目案例库</h4>
					</div>
					<p style="font-size: 16px; font-weight: bold; line-height: 20px;">&nbsp;&nbsp;&nbsp;&nbsp;中软国际实训平台提供具有代表性的实训项目案例，涵盖完整的技术领域，提供java、.net、云计算、Android、移动互联、嵌入式等方向案例达500个。</p>
				</div>
				<div class="section-mini2">
					<div class="tag-title-wrap clearfix">
						<h4 class="tag-title">2、丰富的知识库</h4>
					</div>
					<p style="font-size: 16px; font-weight: bold; line-height: 20px;">&nbsp;&nbsp;&nbsp;&nbsp;中软国际实训平台提供了基于角色的便捷安全高效的知识库管理，平台针对不同项目涵盖知识点做到“细化小点，各个击破”，各知识点教学资源包括配套的课件、视频、音频、电子书籍、课后习题模拟考试、课后作业等。</p>
				</div>
				<div class="section-mini2">
					<div class="tag-title-wrap clearfix">
						<h4 class="tag-title">3、标准的实训流程</h4>
					</div>
					<p style="font-size: 16px; font-weight: bold; line-height: 20px;">&nbsp;&nbsp;&nbsp;&nbsp;严格遵守国际软件开发行业标准完成个项目实践，阶段化、任务化规划项目，让学生在软件开发的每个阶段的学习目的更加明确，同时可以对照平台提供的教学资源、文档报表模板有计划有针对性的学习，让学生熟悉企业标准。</p>
				</div>
				<div class="section-mini2">
					<div class="tag-title-wrap clearfix">
						<h4 class="tag-title">4、职业能力测评</h4>
					</div>
					<p style="font-size: 16px; font-weight: bold; line-height: 20px;">&nbsp;&nbsp;&nbsp;&nbsp;为了在具体的实训教学中有效总结学生的综合就业能力，中软国际实训平台独创学院职业全能单健力报告人，详细记录学生在实训过程中的成绩和表现，并依据行业人才标准，全面、细致、公正的分析、评估、展示学生的专业技能、职业素养和职场价值。成为学校教学总结、学员职业发展、企业高效益招聘的得力助手。</p>
				</div>
				<div class="section-mini2">
					<div class="tag-title-wrap clearfix">
						<h4 class="tag-title">5、灵活运作方式</h4>
					</div>
					<p style="font-size: 16px; font-weight: bold; line-height: 20px;">&nbsp;&nbsp;&nbsp;&nbsp;中软国际团队精心设计了实训平台的模块式架构，各个组成部分即能无缝对接，形成完备的实训教学，又可以便携地拆分使用。实训平台采用分层架构，用户可快捷地添加自主实训项目，甚至将整个平台运用到更广泛的教学管理领域；实训项目架构完整，覆盖UI、逻辑、数据库多方面内容，用户可以分块采用或作为一个完整的企业应用软件使用。</p>
				</div>
			</div>
		</div>
	</div>

	<div id="win"></div>
	<div id="updPwdDiv" class="easyui-window" title="修改密码"
		iconCls="icon-save"
		style="width: 330px; height: 210px; padding: 5px; background: #fafafa;"
		closed="true" modal="true">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false"
				style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<form id="updPwd" name="updPwd">

					<table border="0" cellpadding="0" cellspacing="4"
						style="font-size: 12px;">
						<tr>
							<td align="right" width="110px">原密码：</td>
							<td><input type="text" id="old_pwd" name="old_pwd"
								class="easyui-validatebox" style="width: 180px" required=true /></td>
						</tr>
						<tr>
							<td align="right" width="110px">新密码：</td>
							<td><input type="password" id="new_pwd" name="new_pwd"
								class="easyui-validatebox" style="width: 180px"
								validType="length[6,25]" required=true /></td>
						</tr>
						<tr>
							<td align="right" width="110px">确认新密码：</td>
							<td><input type="password" id="re_pwd" name="re_pwd"
								class="easyui-validatebox" style="width: 180px"
								validType="equals['#new_pwd']" required=true /></td>
						</tr>

					</table>
				</form>
				<br>
				<div region="south" border="false"
					style="text-align: right; height: 30px; line-height: 30px;">
					<input type="hidden" id="isUpdate" name="isUpdate"> <a
						class="easyui-linkbutton" iconCls="icon-search"
						href="javascript:void(0)" onclick="saveUpdate()">保存</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="doClose('updPwdDiv')">取消</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
