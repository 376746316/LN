<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!-- Start 我的笔记-->
<script type="text/javascript">
	$('.courseNote').live(
			'click',
			function() {
				$('.grzx_r').load(
						ctx + "/myCenter/noteChapter.do?specId="
								+ $(this).attr('specId'));
			});
</script>
<div class="g_wdbj_box">
	<h1>我的笔记</h1>
	<div class="g_bjlb">
		<ul>
			<c:choose>
				<c:when test="${fn:length(noteCourseList)>0 }">
					<c:forEach items="${noteCourseList }" begin="0" var="course"
						varStatus="status">
						<li>
							<div class="wdbj_t">
								<a href="javascript:;" class="courseNote"
									specId="${course.specId}"> <img
									src="${ctx}/<c:choose>
												<c:when test="${course.specThumb eq null }">images/hkg.png</c:when>
												<c:otherwise>${course.specThumb}</c:otherwise>
											</c:choose>"
									width="138" height="84" alt="">
								</a>
							</div>
							<div class="wdbj_w">
								<h2>
									<a href="javascript:;" class="courseNote"
										specId="${course.specId}">${course.specName}</a>
								</h2>
								<p class="wdbj_ks">
									共<span>${course.scNum}</span>课时 共<span>${course.noteNum}</span>条笔记
								</p>
								<p class="wdbj_rq">
									<fmt:formatDate value="${course.lastEdit}" pattern="yyyy.MM.dd" />
								</p>
							</div>
						</li>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<li>当前没有学习笔记...</li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</div>
<!-- End 我的笔记-->