<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
	$(document).ready(function() {
		$('.g_wdkc_box ul.g_kctt').find('li').live('click', function() {
			$(this).addClass('active').siblings().removeClass('active');
			$(this).parents('.g_wdkc_box').find('.g_cklb_nr').hide().siblings().eq($(this).index()).show();
		});
	});
</script>
<!-- Start 我的课程-->
<div class="g_wdkc_box">
	<ul class="g_kctt">
		<li class="active"><a href="javascript:;">正在学的课程 </a> | <span class="sj posa" style="left: 22px;"></span></li>
		<li><a href="javascript:;">收藏的课程</a> | <span class="sj posa" style="left: 22px;"></span></li>
		<li><a href="javascript:;">已经学过的课程 </a> | <span class="sj posa" style="left: 22px;"></span></li>
		<li><a href="javascript:;">推荐课程</a> <span class="sj posa" style="left: 22px;"></span></li>
	</ul>
	<div class="g_cklb_box">
		<!-- Start 正在学的课程-->
		<div class="g_cklb_nr" style="display: block;">
			<div class="g_cklb_b">
				<ul>
					<c:choose>
						<c:when test="${fn:length(studingCourseList)>0 }">
							<c:forEach items="${studingCourseList }" begin="0" var="course" varStatus="status">
								<li>
									<div class="kgkc_t">
										<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}"> <img src="${ctx}/<c:choose>
												<c:when test="${course.imgurl eq null }">images/hkg.png</c:when>
												<c:otherwise>${course.imgurl}</c:otherwise>
											</c:choose>" width="153" height="110" alt="">
										</a>
									</div>
									<div class="kgkc_w">
										<h2>
											<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}">${course.specName}</a>
										</h2>
										<p class="hkg_js">
											<span class="kgkc_js">讲师：${course.userName}</span> <span><img src="${ctx}/images/nantx.png" width="12" height="10" alt=""></span> <span>${course.stunum}</span>
										</p>
										<div class="">
											<c:choose>
												<c:when test="${course.specCost eq null or course.specCost eq 0 }">
													<span style="color: #3EB752">免费</span>
												</c:when>
												<c:otherwise>
													<span style="color: red">${course.specCost}</span>学习币</c:otherwise>
											</c:choose>
											<span class="ml_20"><img src="${ctx}/images/sjb.png" width="16" height="15"></span> <span><fmt:formatDate value="${course.updatetime}" pattern="M月d日 HH:mm" /></span>
										</div>
									</div>
								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<li>当前没有正在学习的课程...</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
		<!-- End 正在学的课程-->
		<!-- Start 收藏的课程-->
		<div class="g_cklb_nr">
			<div class="g_cklb_b">
				<ul>
					<c:choose>
						<c:when test="${fn:length(collectedCourseList)>0 }">
							<c:forEach items="${collectedCourseList }" begin="0" var="course" varStatus="status">
								<li>
									<div class="kgkc_t">
										<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}"> <img src="${ctx}/<c:choose>
												<c:when test="${course.imgurl eq null }">images/hkg.png</c:when>
												<c:otherwise>${course.imgurl}</c:otherwise>
											</c:choose>" width="153" height="110" alt="">
										</a>
									</div>
									<div class="kgkc_w">
										<h2>
											<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}">${course.specName}</a>
										</h2>
										<p class="hkg_js">
											<span class="kgkc_js">讲师：${course.userName}</span> <span><img src="${ctx}/images/nantx.png" width="12" height="10" alt=""></span> <span>${course.stunum}</span>
										</p>
										<div class="">
											<c:choose>
												<c:when test="${course.specCost eq null or course.specCost eq 0 }">
													<span style="color: #3EB752">免费</span>
												</c:when>
												<c:otherwise>
													<span style="color: red">${course.specCost}</span>学习币</c:otherwise>
											</c:choose>
											<span class="ml_20"><img src="${ctx}/images/sjb.png" width="16" height="15"></span> <span><fmt:formatDate value="${course.updatetime}" pattern="M月d日 HH:mm" /></span>
										</div>
									</div>
								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<li>当前没有收藏的课程...</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
		<!-- End 收藏的课程-->
		<!-- Start 已经学过的课程-->
		<div class="g_cklb_nr">
			<div class="g_cklb_b">
				<ul>
					<c:choose>
						<c:when test="${fn:length(studiedCourseList)>0 }">
							<c:forEach items="${studiedCourseList }" begin="0" var="course" varStatus="status">
								<li>
									<div class="kgkc_t">
										<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}"> <img src="${ctx}/<c:choose>
												<c:when test="${course.imgurl eq null }">images/hkg.png</c:when>
												<c:otherwise>${course.imgurl}</c:otherwise>
											</c:choose>" width="153" height="110" alt="">
										</a>
									</div>
									<div class="kgkc_w">
										<h2>
											<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}">${course.specName}</a>
										</h2>
										<p class="hkg_js">
											<span class="kgkc_js">讲师：${course.userName}</span> <span><img src="${ctx}/images/nantx.png" width="12" height="10" alt=""></span> <span>${course.stunum}</span>
										</p>
										<div class="">
											<c:choose>
												<c:when test="${course.specCost eq null or course.specCost eq 0 }">
													<span style="color: #3EB752">免费</span>
												</c:when>
												<c:otherwise>
													<span style="color: red">${course.specCost}</span>学习币</c:otherwise>
											</c:choose>
											<span class="ml_20"><img src="${ctx}/images/sjb.png" width="16" height="15"></span> <span><fmt:formatDate value="${course.updatetime}" pattern="M月d日 HH:mm" /></span>
										</div>
									</div>
								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<li>当前没有学过的课程...</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
		<!-- End 已经学过的课程-->
		<!-- Start 推荐课程-->
		<div class="g_cklb_nr">
			<div class="g_cklb_b">
				<ul>
					<c:choose>
						<c:when test="${fn:length(recommendedCourseList)>0 }">
							<c:forEach items="${recommendedCourseList }" begin="0" var="course" varStatus="status">
								<li>
									<div class="kgkc_t">
										<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}"> <img src="${ctx}/<c:choose>
												<c:when test="${course.imgurl eq null }">images/hkg.png</c:when>
												<c:otherwise>${course.imgurl}</c:otherwise>
											</c:choose>" width="153" height="110" alt="">
										</a>
									</div>
									<div class="kgkc_w">
										<h2>
											<a href="${ctx}/toCourseDescribe.do?specId=${course.specId}">${course.specName}</a>
										</h2>
										<p class="hkg_js">
											<span class="kgkc_js">讲师：${course.userName}</span> <span><img src="${ctx}/images/nantx.png" width="12" height="10" alt=""></span> <span>${course.stunum}</span>
										</p>
										<div class="">
											<c:choose>
												<c:when test="${course.specCost eq null or course.specCost eq 0 }">
													<span style="color: #3EB752">免费</span>
												</c:when>
												<c:otherwise>
													<span style="color: red">${course.specCost}</span>学习币</c:otherwise>
											</c:choose>
											<span class="ml_20"><img src="${ctx}/images/sjb.png" width="16" height="15"></span> <span><fmt:formatDate value="${course.updatetime}" pattern="M月d日 HH:mm" /></span>
										</div>
									</div>
								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<li>当前没有推荐的课程...</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
		<!-- End 推荐课程-->
	</div>
</div>
<!-- End 我的课程-->