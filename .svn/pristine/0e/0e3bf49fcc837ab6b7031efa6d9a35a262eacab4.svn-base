<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*,com.chinasofti.cetp.utils.SessionInfo"%>

<script type="text/javascript">
	$(function() {
		$('.${active}').addClass('active');
	});
</script>
<%
	//	实训ID
	Integer pracId = (Integer) session.getAttribute("pracId");
	//	团队类型 2:团队实训 1:个人实训
	Integer pracIsTeam = Integer.parseInt(session.getAttribute("pracIsTeam").toString());
	//	所选项目的ID
	Integer proId = (Integer) session.getAttribute("proId");
	//	学号
	Integer stuNo = ((SessionInfo) session.getAttribute("sessionInfo")).getStuNo();
	//	组长编号
	Integer teamLeader = (Integer) session.getAttribute("teamLeaderNo");
	out.print("<input type='hidden' id='isTeamLeader' value='" + (teamLeader == null || teamLeader.intValue() == stuNo.intValue()) + "'/>");
	//	团队实训的 组ID
	Integer teamId = (Integer) session.getAttribute("teamId");
	String ctx = request.getContextPath();
%>

<div class="wdzb_l f_l">
	<ul>
		<%
			//	[项目选择] 按钮是否显示
			//	1，进行中的实训&&未选择项目&&(团队实训&&是组长 ||个人实训)
			if (pracId != null && (proId == null)) {
				out.print("<li class='myk1'><a href='" + ctx + "/toProjectChoiceListjsp.do' >项目选择<span class='g_jkh'>></span></a></li>");
			}
			//	[项目查看] 按钮是否显示
			//	1，进行中的实训&&已选择项目
			if ((pracId != null) && (proId != null)) {
				out.print("<li class='myk1'><a href='" + ctx + "/toProjectDtl.do'>项目查看<span class='g_jkh'>></span></a></li>");
			}
			//	[个人任务] 按钮是否显示
			//	1，进行中的实训 已选择项目
			if ((pracId != null) && (proId != null)) {
				out.print("<li class='myk2'><a href='" + ctx + "/toPersonalTask.do'>工作任务<span class='g_jkh'>></span></a></li>");
			}
			//	[进度查询] 按钮是否显示
			//	1，进行中的实训&&已选择项目
			if ((pracId != null) && (proId != null)) {
				out.print("<li class='myk3'><a href='" + ctx + "/toProjectProgress.do'>进度查询<span class='g_jkh'>></span></a></li>");
			}
			//	[实训问答] 按钮是否显示
			//	1，进行中的实训 
			if ((pracId != null)) {
				out.print("<li class='myk9'><a href='" + ctx + "/toPracQues.do'>实训问答<span class='g_jkh'>></span></a></li>");
			}
			//	[个人日志] 按钮是否显示
			//	1，进行中的实训 
			if ((pracId != null)) {
				out.print("<li class='myk4'><a href='" + ctx + "/toStuLogListJsp.do'>日志周报<span class='g_jkh'>></span></a></li>");
			}
			//	[成果发布] 按钮是否显示
			//	1，进行中的实训&&团队实训 组内已选择项目，并且是组长
			if ((pracId != null) && (proId != null) && ((pracIsTeam.equals(2) && stuNo.equals(teamLeader)) || (pracIsTeam.equals(1)))) {
				out.print("<li class='myk6'><a href='" + ctx + "/toAchivementUploadList.do'>项目成果<span class='g_jkh'>></span></a></li>");
			}
			//	[成绩查询] 按钮是否显示
			//	进行中的实训，已选择项目 
			if ((pracId != null) && (proId != null)) {
				// 团队实训
				if (pracIsTeam.equals(2)) {
					out.print("<li class='myk7'><a href='" + ctx + "/toTeamMemberScoreWeb.do'>成绩查询<span class='g_jkh'>></span></a></li>");
				} else if (pracIsTeam.equals(1)) {// 个人实训
					out.print("<li class='myk7'><a href='" + ctx + "/toPersonalScoreWeb.do'>成绩查询<span class='g_jkh'>></span></a></li>");
				}
			}
			//	[实训测评] 按钮是否显示
			//	1，进行中的实训 已选择项目
			if ((pracId != null) && (proId != null)) {
				out.print("<li class='myk8'><a href='" + ctx + "/selectinRatioEvaluation1.do'>实训测评<span class='g_jkh'>></span></a></li>");
			}
		%>
	</ul>
</div>
