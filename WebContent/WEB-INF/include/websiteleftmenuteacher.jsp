<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*,com.chinasofti.cetp.utils.SessionInfo"%>

<script type="text/javascript">
	$(function() {
		$('.${active}').addClass('active');
	});
</script>
<div class="wdzb_l f_l">
	<input id="pracId" type="hidden" value="${pracId}" />
	<ul>
		<li class='myk1'><a href='${pageContext.request.contextPath }/toProjectListTeacher.do?pracId=${pracId}'>项目列表<span class='g_jkh'>></span></a></li>
		<li class='myk2'><a href='${pageContext.request.contextPath }/toPracStuMngTeacher.do?pracId=${pracId}'>人员管理<span class='g_jkh'>></span></a></li>
		<li class='myk3'><a href='${pageContext.request.contextPath }/toPracProgressMngTeacher.do?pracId=${pracId}'>进度管理<span class='g_jkh'>></span></a></li>
		<li class='myk9'><a href='${pageContext.request.contextPath }/toPracQuesMng.do?pracId=${pracId}'>问答管理<span class='g_jkh'>></span></a></li>
		<li class='myk4'><a href='${pageContext.request.contextPath }/toPracLogAndWeeklyMng.do?pracId=${pracId}'>日志周报<span class='g_jkh'>></span></a></li>
		<li class='myk6'><a href='${pageContext.request.contextPath }/toPracAchMngTeacher.do?pracId=${pracId}'>成果管理<span class='g_jkh'>></span></a></li>
		<li class='myk7'><a href='${pageContext.request.contextPath }/toPracScoreMngTeacher.do?pracId=${pracId}'>实训打分<span class='g_jkh'>></span></a></li>
	</ul>
</div>
