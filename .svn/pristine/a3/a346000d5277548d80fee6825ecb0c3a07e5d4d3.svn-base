<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="/zk" prefix="zk"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
	$(".kcjs_jj a[pracDtl]").die().live('click', function() {
		$("body").append('<div class="lagebg posa"></div>');
		$('.lagebg').css({
			height : $(document).height() || $(window).height()
		});

		$('#pracName').text('');
		$('#starDate').text('');
		$('#endDate').text('');
		$('#pro_name').text('');
		$('#techTypeName').text('');
		$('#pracTeamPercent').text('');
		$('#pracSoftPercent').text('');
		$('#pracIntro').text('');

		$.post(ctx + "/toTrainingMngUpd.do", {
			pracId : $(this).attr('pracId')
		}, function(prac) {
			$('#pracName').text(prac.pracName);
			$('#starDate').text(prac.starDate);
			$('#endDate').text(prac.endDate);
			$('#pro_name').text(prac.pro_name);
			$('#techTypeName').text(prac.techTypeName);
			$('#pracTeamPercent').text(prac.pracTeamPercent);
			$('#pracSoftPercent').text(prac.pracSoftPercent);
			$('#pracIntro').text(prac.pracIntro);

		}, 'json');

		$('.rwjs_box').show();
	});

	$(".kcjs_jj a[startPrac]").die().live('click', function() {
		$('#selectedPrac').val($(this).attr('pracId'));
		$('#msgConfirmStartPrac').show();
	});
	$(".kcjs_jj a[endPrac]").die().live('click', function() {
		$('#selectedPrac').val($(this).attr('pracId'));
		$('#msgConfirmEndPrac').show();
	});

	$("#msgConfirmStartPrac #confirm").die().live('click', function() {
		$('#msgConfirmStartPrac').hide();
		var param = {
			pracId : $('#selectedPrac').val(),
			pracStatus : "3"
		};
		$.post(ctx + "/updPracticeStatus.do", param, function(resp) {
			$('.g_grzxx .w_wdsx').click();
		}).error(function() {
			alert("操作失败");
		});
	});
	$("#msgConfirmStartPrac #cancel").die().live('click', function() {
		$('#msgConfirmStartPrac').hide();
	});

	$("#msgConfirmEndPrac #confirm").die().live('click', function() {
		$('#msgConfirmEndPrac').hide();
		var param = {
			pracId : $('#selectedPrac').val(),
			pracStatus : "4"
		};
		$.post(ctx + "/updPracticeStatus.do", param, function(resp) {
			$('.g_grzxx .w_wdsx').click();
		}).error(function() {
			alert("操作失败");
		});
	});
	$("#msgConfirmEndPrac #cancel").die().live('click', function() {
		$('#msgConfirmEndPrac').hide();
	});
</script>
<div class="kcjs_jj">
	<div class="kc_tit">实训列表</div>
	<div class="clear"></div>
	<input type="hidden" id="selectedPrac" />
	<div class="rwjs_tab borput2" style="width: 100%">
		<table width="100%" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th width="30%">实训名称</th>
					<th width="25%">项目名称</th>
					<th width="10%">个人/团队</th>
					<th width="10%">实训状态</th>
					<th width="25%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${fn:length(pracList) eq 0 }">
					<tr class="nofiletr">
						<td colspan="4">暂无实训</td>
					</tr>
				</c:if>
				<c:forEach items="${pracList }" var="prac">
					<tr>
						<td width="30%">${prac.pracName }</td>
						<td width="25%">${prac.proName }</td>
						<td width="10%"><zk:getParammain paramid="${prac.pracIsTeam }" parentparamid="34" /></td>
						<td width="10%"><zk:getParammain paramid="${prac.pracStatus }" parentparamid="43" /></td>
						<td width="25%"><a href='javascript:;' pracDtl pracId='${prac.pracId }'>详细</a>&nbsp;&nbsp; <a href="${ctx}/toProjectListTeacher.do?pracId=${prac.pracId }">实训管理</a> <c:choose>
								<c:when test="${prac.pracStatus eq '2' }">
									<a href='javascript:;' startPrac pracId='${prac.pracId }'>开始实训</a>
								</c:when>
								<c:when test="${prac.pracStatus eq '3' }">
									<a href='javascript:;' endPrac pracId='${prac.pracId }'>结束实训</a>
								</c:when>
							</c:choose></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div id="msgConfirmStartPrac" class="ljz_three" style="display: none;">
		<h3>确定要开始实训么？</h3>
		<p class="z_pre">&nbsp;&nbsp;&nbsp;&nbsp;</p>
		<div class="gcs_cx">
			<input id="cancel" type="button" value="取消" /> <input id="confirm" type="button" value="确定" />
			<div class="clear"></div>
		</div>
	</div>

	<div id="msgConfirmEndPrac" class="ljz_three" style="display: none;">
		<h3>确定要结束实训么？</h3>
		<p class="z_pre">&nbsp;&nbsp;&nbsp;&nbsp;</p>
		<div class="gcs_cx">
			<input id="cancel" type="button" value="取消" /> <input id="confirm" type="button" value="确定" />
			<div class="clear"></div>
		</div>
	</div>

	<div class="rwjs_box" style="display: none;">
		<div class="rwjs_t posr">
			<h1 class="fp_tit">实训介绍</h1>
			<div class="z_gb posa">
				<img src="${ctx}/images/z_guanb.png" width="8" height="10" alt="" />
			</div>
		</div>
		<div class="rwjs_m">
			<div class="rwjs_m_b">
				<!--Start 基本信息-->
				<div class="wrjs_qh" style="display: block;">
					<div class="jbxx">
						<div class="jbxx_t">
							<ul style="clear: both;">
								<li>
									<p>
										实训名称：<span id="pracName"></span>
									</p>
								</li>
							</ul>
							<ul style="clear: both;">
								<li>
									<p>
										开始时间：<span id="starDate"></span>
									</p>
									<p>
										结束时间：<span id="endDate"></span>
									</p>
								</li>
								<li>
									<p>
										个人/团队：<span id="pro_name"></span>
									</p>
									<p>
										技术分类：<span id="techTypeName"></span>
									</p>
								</li>
								<li>
									<p>
										团队成绩比重：<span id="pracTeamPercent"></span>%
									</p>
									<p>
										软技能成绩比重：<span id="pracSoftPercent"></span>%
									</p>
								</li>
							</ul>
						</div>
						<div class="blank5"></div>
						<div class="jbxx_list">
							<p class="f_l">实训简介：</p>
							<p class="mb_text" id="pracIntro"></p>
						</div>
					</div>
					<p class="nl_gb">
						<input type="button" value="关闭">
					</p>
				</div>
				<!--End 基本信息-->
			</div>
		</div>
	</div>
</div>