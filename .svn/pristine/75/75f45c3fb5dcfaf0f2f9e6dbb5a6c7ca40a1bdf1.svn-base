<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
	$(function() {
		$('a[perProId]').die().live('click', function() {
			$('.grzx_r').load(ctx + "/myCenter/pracPersonalScore.do?proId=" + $(this).attr('perProId') + "&pracId=" + $(this).attr('pracId'));
		});
		$('a[teamId]').die().live('click', function() {
			$('.grzx_r').load(ctx + "/myCenter/pracTeamScore.do?proId=" + $(this).attr('proId') + "&teamId=" + $(this).attr('teamId'));
		});

		$('.prac_slides').each(function() {
			var lis = $(this).find('li');
			var numpic = lis.size() - 1;
			var nownow = 0;
			var inout = 0;
			var TT = 0;
			var SPEED = 5000;
			$(this).find('li').eq(0).siblings('li').css({
				'display' : 'none'
			});
			var ulstart = '<ul class="prac_slides_pagination">', ulcontent = '', ulend = '</ul>';
			for ( var i = 0; i <= numpic; i++) {
				ulcontent += '<li>' + '<a href="javascript:;">' + (i + 1) + '</a>' + '</li>';
			}
			$(this).after(ulstart + ulcontent + ulend);
			var pagination = $(this).parent().find('ul.prac_slides_pagination li');
			pagination.eq(0).addClass('current');
			pagination.on('click', function() {
				var changenow = $(this).index();
				lis.eq(nownow).css('z-index', '900');
				lis.eq(changenow).css({
					'z-index' : '800'
				}).show();
				pagination.eq(changenow).addClass('current').siblings('li').removeClass('current');
				lis.eq(nownow).fadeOut(400, function() {
					lis.eq(changenow).fadeIn(500);
				});
				nownow = changenow;
			});

			pagination.mouseenter(function() {
				inout = 1;
			});
			pagination.mouseleave(function() {
				inout = 0;
			});
			function GOGO() {
				var NN = nownow + 1;
				if (inout == 1) {
				} else {
					if (nownow < numpic) {
						lis.eq(nownow).css('z-index', '900');
						lis.eq(NN).css({
							'z-index' : '800'
						}).show();
						pagination.eq(NN).addClass('current').siblings('li').removeClass('current');
						lis.eq(nownow).fadeOut(400, function() {
							lis.eq(NN).fadeIn(500);
						});
						nownow += 1;
					} else {
						NN = 0;
						lis.eq(nownow).css('z-index', '900');
						lis.eq(NN).stop(true, true).css({
							'z-index' : '800'
						}).show();
						lis.eq(nownow).fadeOut(400, function() {
							lis.eq(0).fadeIn(500);
						});
						pagination.eq(NN).addClass('current').siblings('li').removeClass('current');
						nownow = 0;
					}
				}
				TT = setTimeout(GOGO, SPEED);
			}
			TT = setTimeout(GOGO, SPEED);
		});
	});
</script>

<!-- Start 团队实训-->
<div class="g_wdkc_box">
	<ul class="g_kctt">
		<li class="active"><a href="javascript:;">全部实训 </a> | <span class="sj posa" style="left: 22px;"></span></li>
		<li><a href="javascript:;">个人实训</a> | <span class="sj posa" style="left: 22px;"></span></li>
		<li><a href="javascript:;">团队实训 </a> <span class="sj posa" style="left: 22px;"></span></li>
	</ul>
	<div class="g_cklb_box">
		<!-- Start 全部实训-->
		<div class="g_cklb_nr" style="display: block;">
			<div class="ss_list" style="display: block;">
				<c:choose>
					<c:when test="${fn:length(pracList)>0 }">
						<c:forEach items="${pracList }" var="prac">
							<dl>
								<dt class="prac_slider">
									<ul class="prac_slides" style="width: 202px; height: 132px;">
										<c:forTokens items="${prac.pracImg }" delims="," var="imgUrl" end="10">
											<li><img src="${ctx}${imgUrl}" alt="" style="width: 202px; height: 132px;" /></li>
										</c:forTokens>
									</ul>
								</dt>
								<dd class="posr" style="width: 400px;">
									<h3>
										<a href="#">${prac.pracName }</a>
									</h3>
									<p class="ktang_jj">
										<c:choose>
											<c:when test="${prac.pracCost eq 0 }">
												<span class="ss_lv">免费</span>
											</c:when>
											<c:otherwise>
												<span class="ss_lh">￥${prac.pracCost}</span>
											</c:otherwise>
										</c:choose>
										<span>技术分类：${prac.techTypeName}</span> <span>项目经理：${prac.userName}</span>
									</p>
									<p class="ktang_jj">
										<span>开始时间：<fmt:formatDate value="${prac.pracStartDate}" pattern="yyyy-MM-dd" /></span> <span>结束时间：<fmt:formatDate value="${prac.pracEndDate}" pattern="yyyy-MM-dd" /></span>
									</p>
									<p class="ss_text" style="-webkit-line-clamp: 1;">${prac.pracIntro }</p>
									<p class="ss_xq posa">
										<c:choose>
											<c:when test="${prac.pracStatus eq '4' && not empty prac.proId}">
												<c:choose>
													<c:when test="${ empty prac.teamId}">
														<a href="javascript:;" perProId="${prac.proId}"  pracId="${prac.pracId}">查看成绩 ></a>
													</c:when>
													<c:otherwise>
														<a href="javascript:;" proId="${prac.proId}" teamId="${prac.teamId}">查看成绩 ></a>
													</c:otherwise>
												</c:choose>
											</c:when>
											<c:otherwise>
												<a href="${ctx}/toPracticeDtl.do?pracId=${prac.pracId}">实训管理 ></a>
											</c:otherwise>
										</c:choose>

									</p>
								</dd>
							</dl>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<li>没有参加过实训...</li>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<!-- End 全部实训-->
		<!-- Start 个人实训-->
		<div class="g_cklb_nr">
			<div class="ss_list" style="display: block;">
				<c:choose>
					<c:when test="${fn:length(perPracList)>0 }">
						<c:forEach items="${perPracList }" var="prac">
							<dl>
								<dt class="prac_slider">
									<ul class="prac_slides" style="width: 202px; height: 132px;">
										<c:forTokens items="${prac.pracImg }" delims="," var="imgUrl" end="10">
											<li><img src="${ctx}${imgUrl}" alt="" style="width: 202px; height: 132px;" /></li>
										</c:forTokens>
									</ul>
								</dt>
								<dd class="posr" style="width: 400px;">
									<h3>
										<a href="#">${prac.pracName }</a>
									</h3>
									<p class="ktang_jj">
										<c:choose>
											<c:when test="${prac.pracCost eq 0 }">
												<span class="ss_lv">免费</span>
											</c:when>
											<c:otherwise>
												<span class="ss_lh">￥${prac.pracCost}</span>
											</c:otherwise>
										</c:choose>
										<span>技术分类：${prac.techTypeName}</span> <span>项目经理：${prac.userName}</span>
									</p>
									<p class="ktang_jj">
										<span>开始时间：<fmt:formatDate value="${prac.pracStartDate}" pattern="yyyy-MM-dd" /></span> <span>结束时间：<fmt:formatDate value="${prac.pracEndDate}" pattern="yyyy-MM-dd" /></span>
									</p>
									<p class="ss_text" style="-webkit-line-clamp: 1;">${prac.pracIntro }</p>
									<p class="ss_xq posa">
										<c:choose>
											<c:when test="${prac.pracStatus eq '4' && not empty prac.proId}">
												<a href="javascript:;" perProId="${prac.proId}" pracId="${prac.pracId}">查看成绩 ></a>
											</c:when>
											<c:otherwise>
												<a href="${ctx}/toPracticeDtl.do?pracId=${prac.pracId}">实训管理 ></a>
											</c:otherwise>
										</c:choose>
									</p>
								</dd>
							</dl>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<li>没有参加过个人实训...</li>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<!-- End  个人实训-->
		<!-- Start 团队实训-->
		<div class="g_cklb_nr">
			<div class="ss_list" style="display: block;">
				<c:choose>
					<c:when test="${fn:length(teamPracList)>0 }">
						<c:forEach items="${teamPracList }" var="prac">
							<dl>
								<dt class="prac_slider">
									<ul class="prac_slides" style="width: 202px; height: 132px;">
										<c:forTokens items="${prac.pracImg }" delims="," var="imgUrl" end="10">
											<li><img src="${ctx}${imgUrl}" alt="" style="width: 202px; height: 132px;" /></li>
										</c:forTokens>
									</ul>
								</dt>
								<dd class="posr" style="width: 400px;">
									<h3>
										<a href="#">${prac.pracName }</a>
									</h3>
									<p class="ktang_jj">
										<c:choose>
											<c:when test="${prac.pracCost eq 0 }">
												<span class="ss_lv">免费</span>
											</c:when>
											<c:otherwise>
												<span class="ss_lh">￥${prac.pracCost}</span>
											</c:otherwise>
										</c:choose>
										<span>技术分类：${prac.techTypeName}</span> <span>项目经理：${prac.userName}</span>
									</p>
									<p class="ktang_jj">
										<span>开始时间：<fmt:formatDate value="${prac.pracStartDate}" pattern="yyyy-MM-dd" /></span> <span>结束时间：<fmt:formatDate value="${prac.pracEndDate}" pattern="yyyy-MM-dd" /></span>
									</p>
									<p class="ss_text" style="-webkit-line-clamp: 1;">${prac.pracIntro }</p>
									<p class="ss_xq posa">
										<c:choose>
											<c:when test="${prac.pracStatus eq '4' && not empty prac.proId && not empty prac.teamId}">
												<a href="javascript:;" proId="${prac.proId}" teamId="${prac.teamId}">查看成绩 ></a>
											</c:when>
											<c:otherwise>
												<a href="${ctx}/toPracticeDtl.do?pracId=${prac.pracId}">实训管理 ></a>
											</c:otherwise>
										</c:choose>
									</p>
								</dd>
							</dl>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<li>没有参加过团队实训...</li>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<!-- End 已经团队实训-->
	</div>
</div>
<!-- End 我的实训-->