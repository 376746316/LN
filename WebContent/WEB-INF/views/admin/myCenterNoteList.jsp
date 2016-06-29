<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<ul>
	<c:forEach items="${noteList}" var="note">
		<li class="k_bjbj">
			<div class="c">${note.noteContent}</div>
			<div class="k_inform">
				<span class="left time">${note.scName}&nbsp;${note.notePlayTime}</span>
				<div class="right operation">
					<a href="javascript:;" class="delete right" noteId="${note.noteId}">删除</a>
					<a href="javascript:;" class="editor right">编辑</a>
					<div class="jiathis_style right" style="margin-top: 0;">
						<a target="_blank" class="jiathis jiathis_txt"
							href="http://www.jiathis.com/share" style=""><img width="64"
							height="22" alt="" src="${ctx}/images/k_fx01.png"></a>
					</div>
				</div>
			</div>
			<div class="k_bjlb">
				<div class="kk_hdwtareac">
					<textarea name="" id="" cols="30" rows="10"></textarea>
					<p>
						<input type="hidden" value="${note.noteId}"> <input
							type="button" value="提交" class="tjhd right"><span
							class="k_bjqx">取消</span>
					</p>
				</div>
			</div>
		</li>
	</c:forEach>
</ul>