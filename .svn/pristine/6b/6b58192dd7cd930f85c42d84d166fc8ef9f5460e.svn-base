<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.chinasofti.cetp.utils.ReaderXmlParam"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>中软卓越培训网</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/kkpager.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.textSearch-1.0.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/kkpager.css" />
<script type="text/javascript">
	$(document).ready(function() {
		$('input.k_submit').click(function() {
			var searchParam = $('input.k_search').val();
			location.href = ctx + "/search.do?key=" + searchParam;

		});
		$('input.k_search').bind('keyup', function(event) {
			if (event.keyCode == "13") {
				var searchParam = $('input.k_search').val();
				location.href = ctx + "/search.do?key=" + searchParam;
			}
		});
		$('.search_tit').find('li').click(function() {
			if (!$(this).hasClass('active')) {
				var type = $(this).index();
				location = ctx + "/search.do?type=" + type + "&key=${key}";
			}
		});
		if ($.trim($(".k_search").val()) != "") {
			$(".search_nr li").textSearch($(".k_search").val(), {
				markClass : "zys1",
				nullReport : false
			});
		}
		if ($("#kkpager")) {
			//生成分页控件  
			kkpager.init({
				pagerid : 'kkpager',
				pno : "${pno}",
				mode : 'click', //设置为click模式
				//总页码  
				total : "${total}",
				//总数据条数  
				totalRecords : "${totalRecords}",
				//点击页码、页码输入框跳转、以及首页、下一页等按钮都会调用click
				//适用于不刷新页面，比如ajax
				click : function(n) {
					var re = eval('/(page=)([^&]*)/gi');
					var search = location.search;
					if (search.match(re)) {
						location.search = search.replace(re, 'page=' + n);
					} else {
						location.search = search + '&page=' + n;
					}
				},
				//getHref是在click模式下链接算法，一般不需要配置，默认代码如下
				getHref : function(n) {
					return 'javascript:;';
				}

			});
			kkpager.generPageHtml();
		}
	});
</script>
</head>
<body>
	<%@ include file="/WEB-INF/include/top.jsp"%>
	<div class="blank40"></div>
	<!-- Start 搜索列表 -->
	<div class="search_t">
		<div class="search_top">
			<input type="text" class="k_search" value="${key}" /> <input
				type="button" class="k_submit" value="搜索" />
		</div>
	</div>

	<div class="search_box">
		<div class="search_tit">
			<div class="search_qh">
				<ul>
					<li
						<c:if test="${type eq null || type eq 0 }"> class="active"</c:if>><a>全部</a></li>
					<li <c:if test="${type eq 1 }"> class="active"</c:if>><a>课程<span>（${count1}）</span></a></li>
					<li <c:if test="${type eq 2 }"> class="active"</c:if>><a>实训<span>（${count2}）</span></a></li>
					<li <c:if test="${type eq 3 }"> class="active"</c:if>><a>直播<span>（${count3}）</span></a></li>
				</ul>
			</div>
		</div>
		<div class="search_qhbox">
			<div class="search_nr" style="display: block;">
				<c:choose>
					<c:when test="${total gt 0}">
						<ul>
							<c:forEach items="${list}" var="fi">
								<li>
									<h1>
										<a
											href=<c:choose>
									<c:when test="${fi.fiType eq 1}">"${ctx}/toCourseDescribe.do?specId=${fi.fiId}"</c:when>
									<c:when test="${fi.fiType eq 2}">"${ctx}/toProjectDtlForCreatePrac.do?proId=${fi.fiId}"</c:when>
									</c:choose>>${fi.fiTitle}</a>
									</h1>
									<p>${fi.fiContent}</p> <c:set var="tempType"
										value="${fi.fiType}"></c:set>
									<p class="lbtj">
										类别：<%=ReaderXmlParam.getInstance().getParammain(
								"59",
								(String) pageContext.getAttribute("tempType"))%></p>
								</li>
							</c:forEach>
						</ul>
					</c:when>
					<c:otherwise>
						<p>
							找不到和您查询“<span style="color: red">${key}</span>”相符的内容或信息。
						</p>
						<br />建议： <br />请尝试其它查询词 <br />检查拼写是否有误 
					</c:otherwise>
				</c:choose>
				<div class="c_center">
					<!-- 分页 -->
					<c:if test="${total gt 0}">
						<div id="kkpager" style="text-align: center;"></div>
					</c:if>
					<!-- End 分页 -->
				</div>
			</div>
		</div>
	</div>

	<div class="blank30"></div>


	<!-- End 搜索列表 -->
	<%@ include file="/WEB-INF/include/footer.jsp"%>

</body>
</html>

