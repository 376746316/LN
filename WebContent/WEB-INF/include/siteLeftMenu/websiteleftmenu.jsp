<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery EasyUI</title>

<script type="text/javascript">
	//项目选择
	function show1() {
		location = "toProjectChoiceListjsp.do";
	}
	//项目信息
	function show2() {
		location = "toGetProIdjsp.do";
	}
	//任务分配
	function show3() {
		location = "toTaskAllocate.do";
	}
	//个人任务
	function show4() {
		location = "toPersonalTask.do";
	}
	//团队信息
	function show5() {
		location = "TeamInfoMng.do";
	}
	//进度查询
	function show6() {
		//团队进度
		location = "toProjectProgress.do";

		//个人进度
		//location= "toPersonalProjectProgress";
	}
	//个人日志
	function show7() {
		location = "toStuLogListJsp.do";
	}
	//实训周报
	function show8() {
		location = "stuWeeklyToJsp.do";
	}
	//任务打分
	function show9() {
		location = "proTaskScore.do";
	}
	//成绩查询
	function show10() {
		//团队
		location = "toProjectListScoreWeb.do";

		//个人
		//location = "toPersonalProjectListScore";
	}
	//成果发布
	function show11() {
		//团队
		location = "toAchivementUploadList.do";

		//个人
		//location = "toPersonalAchivementUploadList.do";
	}
	//个人问题
	function show12() {
		location = "toPracticeQuestionList.do";
	}
	//问卷调查
	function show13() {
		location = "toSurveyList.do";
	}
	//实训测评
	function show14() {
		location = "selectinRatioEvaluation1.do";
	}
	//个人信息
	function show15() {
		location = "PersionInfoDtl.do";
	}
	//考勤管理
	function show16() {
		location = "toAttendanceManeger.do";
	}
</script>
</head>
<body>

	<div id="aa" class="easyui-accordion"
		style="width: 130px; height: 470px;">

		<div title="实训菜单" iconCls="icon-print" selected="true"
			style="padding-left:10px; padding-right:10px;padding-top:5px; height: 450px">
			<%
				//	实训ID
				Integer pracId = (Integer) session.getAttribute("pracId");
				//	团队类型 2:团队实训 1:个人实训
				Integer pracIsTeam = Integer.parseInt(session.getAttribute(
						"pracIsTeam").toString());
				//	所选项目的ID
				Integer proId = (Integer) session.getAttribute("proId");
				//	学号
				Integer stuNo = (Integer) session.getAttribute("stuNo");
				//	组长编号
				Integer teamLeader = (Integer) session.getAttribute("teamLeaderNo");
				//	团队实训的 组ID
				Integer teamId = (Integer) session.getAttribute("teamId");
			%>
			<%
				//	[项目选择] 按钮是否显示
				//	1，进行中的实训&&未选择项目&&(团队实训&&是组长 ||个人实训)
				if (pracId != null
						&& (proId == null)
						&& ((pracIsTeam.equals(2) && stuNo.equals(teamLeader)) || (pracIsTeam
								.equals(1)))) {
					out.print("<a id=\"xmxz\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" onclick=\"javascript:show1()\">项目选择</a>");
				}
			%>

			<%
				//	[项目查看] 按钮是否显示
				//	1，进行中的实训&&已选择项目
				if ((pracId != null) && (proId != null)) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" style=\"margin-top: 5px;\" onclick=\"javascript:show2()\">项目查看</a>");
				}
			%>

			<%
				//	[任务分配] 按钮是否显示
				//	1，进行中的实训&&团队实训
				if ((pracId != null) && (pracIsTeam.equals(2))) {
					// 1.1，组内已选择项目，并且是组长
					if ((proId != null) && (stuNo.equals(teamLeader))) {
						out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-undo\" style=\"margin-top: 5px;\" onclick=\"javascript:show3()\">分配任务</a>");
					}
				}
				//	2，进行中的实训&&个人实训
				else if ((pracId != null) && (pracIsTeam.equals(1))) {
					//2.1，个人已选项目
					if (proId != null) {
						out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-undo\" style=\"margin-top: 5px;\" onclick=\"javascript:show3()\">分配任务</a>");
					}

				}
			%>
			<%
				//	[个人任务] 按钮是否显示
				//	1，进行中的实训 已选择项目
				if ((pracId != null) && (proId != null)) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-save\"	style=\"margin-top: 5px\" onclick=\"javascript:show4()\">个人任务</a>");
				}
			%>
			<%
				//	[团队信息] 按钮是否显示
				//	1，进行中的实训&&团队实训

				if (pracId != null && (pracIsTeam.equals(2)) && teamId != null) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" style=\"margin-top: 5px;\" onclick=\"javascript:show5()\">团队信息</a>");
				}
			%>
			<%
				//	[个人信息] 按钮是否显示
				//	1，进行中的实训&&团队实训

				if (pracId != null && (pracIsTeam.equals(2)) && teamId != null) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" style=\"margin-top: 5px;\" onclick=\"javascript:show15()\">个人信息</a>");
				}
			%>
			<%
				//	[进度查询] 按钮是否显示
				//	1，进行中的实训&&已选择项目
				if ((pracId != null) && (proId != null)) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" style=\"margin-top: 5px\" onclick=\"javascript:show6()\">进度查询</a>");
				}
			%>
			<%
				//	[个人日志] 按钮是否显示
				//	1，进行中的实训 
				if ((pracId != null)) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-print\"	style=\"margin-top: 5px\" onclick=\"javascript:show7()\">个人日志</a>");
				}
			%>
			<%
				//	[实训周报] 按钮是否显示
				//	1，进行中的实训 
				if ((pracId != null)) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-print\"	style=\"margin-top: 5px\" onclick=\"javascript:show8()\">实训周报</a>");
				}
			%>
			<%
				//	[任务打分] 按钮是否显示
				//	1，进行中的实训&&团队实训 组内已选择项目，并且是组长
				if ((pracId != null) && (pracIsTeam.equals(2)) && (proId != null)
						&& (stuNo.equals(teamLeader))) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-redo\" style=\"margin-top: 5px;\" onclick=\"javascript:show9()\">任务打分</a>");
				}
			%>
			<a href="#" class="easyui-linkbutton" iconCls="icon-search"
				style="margin-top: 5px" onclick="javascript:show10()">成绩查询</a>

			<%
				//	[成果发布] 按钮是否显示
				//	1，进行中的实训&&团队实训 组内已选择项目，并且是组长
				if ((pracId != null)  && (proId != null) && ((pracIsTeam.equals(2)
						&& stuNo.equals(teamLeader))||(pracIsTeam.equals(1)))) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" style=\"margin-top: 5px;\" onclick=\"javascript:show11()\">成果发布</a>");
				}
			%>
			<a href="#" class="easyui-linkbutton" iconCls="icon-help"
				style="margin-top: 5px" onclick="javascript:show12()">个人问题</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-back"
				style="margin-top: 5px" onclick="javascript:show13()">问卷调查</a>
			<%
				//	[实训测评] 按钮是否显示
				//	1，进行中的实训 已选择项目
				if ((pracId != null) && (proId != null)) {
					out.print("<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-no\"	style=\"margin-top: 5px\" onclick=\"javascript:show14()\">实训测评</a>");
				}
			%>
			
			<a href="#" class="easyui-linkbutton" iconCls="icon-help"
				style="margin-top: 5px" onclick="javascript:show16()">考勤管理</a>
		</div>

	</div>
</body>
</html>