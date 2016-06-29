<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>展示用户页面</h1>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>用户名</td>
				<td>密码</td>
				<td>卡号</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="aqinlist" items="${aqinclassall }">
				<tr>
					<td>${aqinlist.id }</td>
					<td>${aqinlist.name }</td>
					<td>${aqinlist.pwd }</td>
					<td>${aqinlist.cardid}</td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="4"><c:if test="${requestScope.currentPage == 1}">首页</c:if>
					<c:if test="${requestScope.currentPage > 1}">
						<a href="QueryforSplitPaper2.do?currentPage=1">首页</a>
					</c:if> <c:if test="${requestScope.currentPage > 1}">
						<a
							href="QueryforSplitPaper2.do?currentPage=${requestScope.currentPage - 1}">上一页</a>
					</c:if> <c:if test="${requestScope.currentPage <= 1}">
					上一页
				</c:if> <c:if test="${requestScope.currentPage < requestScope.totalPage }">
						<a
							href="QueryforSplitPaper2.do?currentPage=${requestScope.currentPage + 1}">下一页</a>
					</c:if> <c:if test="${requestScope.currentPage >= requestScope.totalPage}">
					下一页
				</c:if> <c:if test="${requestScope.currentPage < requestScope.totalPage}">
						<a
							href="QueryforSplitPaper2.do?currentPage=${requestScope.totalPage }">末页</a>
					</c:if> <c:if test="${requestScope.currentPage >= requestScope.totalPage}">
					末页
				</c:if> 第${requestScope.currentPage}页/共${requestScope.totalPage }页
					总共${requestScope.toTalCount}条记录 <select id="" name="changeRows"
					onchange="changeRows(this.value)">

						<option <c:if test="${requestScope.rows == 5}">selected</c:if>
							value="5">5</option>
						<option <c:if test="${requestScope.rows == 10}">selected</c:if>
							value="10">10</option>
						<option <c:if test="${requestScope.rows == 15}">selected</c:if>
							value="15">15</option>
						<option <c:if test="${requestScope.rows == 20}">selected</c:if>
							value="20">20</option>
				</select></td>
			</tr>
		</tfoot>
	</table>
</body>
</html>