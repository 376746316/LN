<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/kkpager.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.textSearch-1.0.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/kkpager.css" />
<script type="text/javascript">
	$('#prevChapter').click(
			function() {
				if ($(".slidebox .slidelist .active").prev().attr("chapId")) {
					var param = new Object();
					param["specId"] = $("#specId").val();
					param["search"] = $.trim($("#searchNote").val());
					param["chapId"] = $(".slidebox .slidelist .active").prev()
							.attr("chapId");
					param["chapName"] = $(".slidebox .slidelist .active")
							.prev().attr("chapName");
					$('.grzx_r').load(ctx + "/myCenter/noteChapter.do", param);
				}

			});
	$('#nextChapter').click(
			function() {
				if ($(".slidebox .slidelist .active").next().attr("chapId")) {
					var param = new Object();
					param["specId"] = $("#specId").val();
					param["search"] = $.trim($("#searchNote").val());
					param["chapId"] = $(".slidebox .slidelist .active").next()
							.attr("chapId");
					param["chapName"] = $(".slidebox .slidelist .active")
							.next().attr("chapName");
					$('.grzx_r').load(ctx + "/myCenter/noteChapter.do", param);
				}
			});
	$('.k_inform .operation .editor').die().live(
			"click",
			function() {
				$(this).parent(".operation").hide();
				$(this).parents(".k_bjbj").children(".k_bjlb").show();
				$(this).parents(".k_bjbj").children(".k_bjlb").children(
						".kk_hdwtareac").children("textarea").focus();
				$(this).parents(".k_bjbj").children(".k_bjlb").children(
						".kk_hdwtareac").children("textarea").text(
						$(this).parents(".k_bjbj").children(".c").text());
			});
	$('.k_inform .operation .delete').die().live("click", function() {
		$(".k_dele_qr").attr("noteId", $(this).attr("noteId"));
		$(this).parents(".g_wdbjj_box").find(".k_dele_k1").show();
	});
	$(".k_date_qx").click(function() {
		$(this).parents(".k_dele_k1").hide();
	});
	$(".k_dele_qr").click(function() {
		var param = new Object();
		param["noteId"] = $(this).attr("noteId");
		param["specId"] = $("#specId").val();
		param["search"] = $.trim($("#searchNote").val());
		param["chapId"] = $("#chapId").val();
		param["chapName"] = $(".k_notestitle>strong").text();
		$('.grzx_r').load(ctx + "/myCenter/delNote.do", param);
	});
	$(".k_bjlb .k_bjqx").die().live("click", function() {
		$(this).parents(".k_bjlb").hide();
		$(".operation").show();
	});
	var editing;
	$('.k_bjlb .tjhd').die().live(
			"click",
			function() {
				editing = $(this);
				var param = {
					noteId : $(this).siblings("input[type=hidden]").val(),
					noteContent : $.trim($(this).parents(".kk_hdwtareac")
							.children("textarea").val())
				};
				$.post(
						ctx + "/myCenter/editNote.do",
						param,
						function(rsp) {
							if (rsp == "success") {
								editing.parents(".k_bjbj").children(".c").text(
										editing.parents(".kk_hdwtareac")
												.children("textarea").val());
								editing.parents(".k_bjlb").hide();
								$(".operation").show();
							} else {
								alert("提交失败");
							}
						}).error(function() {
					alert("提交失败");
				});
			});
	function searchNote() {
		var param = new Object();
		param["specId"] = $("#specId").val();
		param["search"] = $.trim($("#searchNote").val());
		param["chapId"] = $("#chapId").val();
		param["chapName"] = $(".k_notestitle>strong").text();
		$('.grzx_r').load(ctx + "/myCenter/noteChapter.do", param);
	}
	$(".sous").click(searchNote);
	if ($.trim($("#searchNote").val()) != "") {
		$(".c").textSearch($("#searchNote").val(), {
			nullReport : false
		});
	}
	var slideStop = false;
	$('.slidebox').find('.t').click(function() {
		if (slideStop) {
			$(this).parent().find('.slidelist').hide();
			slideStop = false;
		} else {
			$(this).parent().find('.slidelist').show();
			slideStop = true;
		}
	});
	$('.slidebox .slidelist').find('a').click(function() {
		slideStop = false;
		var param = new Object();
		param["specId"] = $("#specId").val();
		param["chapId"] = $(this).attr("chapId");
		param["chapName"] = $(this).attr("chapName");
		;
		param["search"] = $.trim($("#searchNote").val());
		$('.grzx_r').load(ctx + "/myCenter/noteChapter.do", param);
	});
</script>
<!-- Start 我的笔记-->
<div class="g_wdbjj_box">
	<input id="specId" type="hidden" value="${specId}" /> <input
		id="chapId" type="hidden" value="${chapId}" />
	<div class="kk_mynotes auto">
		<!-- 搜索 -->
		<div class="k_notessear">
			<div class="sear right">
				<input type="text" class="txt" value="${search}" name=""
					id="searchNote"><input type="button" class="sous"
					value="搜索">
			</div>
			<div class="slidebox right posr">
				<span class="t">章节</span> <span class="sj posa"></span>
				<div class="slidelist posa">
					<c:forEach items="${noteChapterList}" var="chapter"
						varStatus="status">
						<a <c:if test="${chapId eq chapter.chapId}">class="active"</c:if>
							href="javascript:;" chapId="${chapter.chapId}"
							chapName="${chapter.chapName}">第${status.index+1}章</a>
					</c:forEach>
				</div>
			</div>
		</div>
		<!-- End 搜索 -->
		<!-- 标题 -->
		<div class="k_notestitle">
			<strong class="left">${chapName}</strong> <span class="right">
				<a id="prevChapter" href="javascript:;">&lt;上一章</a> <a
				href="javascript:;" id="nextChapter">下一章&gt;</a>
			</span>
		</div>
		<!-- End 标题 -->
		<!-- 列表 -->
		<div class="k_notesbox">

			<c:choose>
				<c:when test="${total gt 0}">
					<ul>
						<c:forEach items="${noteList}" var="note">
							<li class="k_bjbj">
								<div class="c">${note.noteContent}</div>
								<div class="k_inform">
									<span class="left time">${note.scName}&nbsp;${note.notePlayTime}</span>
									<div class="right operation">
										<a href="javascript:;" class="delete right"
											noteId="${note.noteId}">删除</a> <a href="javascript:;"
											class="editor right">编辑</a>
										<div class="jiathis_style right" style="margin-top: 0;">
											<a target="_blank" class="jiathis jiathis_txt"
												href="http://www.jiathis.com/share" style=""><img
												width="64" height="22" alt="" src="${ctx}/images/k_fx01.png"></a>
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
				</c:when>
				<c:when test="${total eq 0 && empty search }">
						当前章节没有笔记
					</c:when>
				<c:otherwise>
					<p>
						抱歉，当前章节没有找到与“<span style="color: red">${search}</span>”相关的笔记。
					</p>
					<br>建议：
					<br>到其他章节查询
					<br>检查输入是否正确
					<br>简化输入词
					<br>尝试其他相关词，如同义、近义词等
				</c:otherwise>
			</c:choose>
		</div>
		<!-- End 列表 -->
		<!-- 分页 -->
		<c:if test="${total gt 0}">
			<div id="myNotePager" style="text-align: center;"></div>
			<script type="text/javascript">
				//生成分页控件  
				kkpager.generPageHtml({
					pagerid : 'myNotePager',
					pno : "${pno}",
					mode : 'click', //设置为click模式
					//总页码  
					total : "${total}",
					//总数据条数  
					totalRecords : "${totalRecords}",
					isGoPage : false,
					isShowTotalPage : false,
					isShowTotalRecords : false,
					isShowFirstPageBtn : false,
					isShowLastPageBtn : false,
					//点击页码、页码输入框跳转、以及首页、下一页等按钮都会调用click
					//适用于不刷新页面，比如ajax
					click : function(n) {
						var param = {
							chapId : $("#chapId").val(),
							page : n,
							search : $.trim($("#searchNote").val())
						};

						$(".k_notesbox").load(ctx + '/myCenter/noteList.do',
								param);
						this.selectPage(n);
					},
					//getHref是在click模式下链接算法，一般不需要配置，默认代码如下
					getHref : function(n) {
						return 'javascript:;';
					}

				}, true);
			</script>
		</c:if>
		<!-- End 分页 -->
	</div>
	<!-- Start 删除弹窗  -->
	<div class="k_dele_k1" style="display: none;">
		<div class="k_dele_t">
			<p>确定删除这条笔记？</p>
			<div class="k_wxkc_g">
				<img src="${ctx}/images/pj_gb.png" width="13" height="14" alt="">
			</div>
		</div>
		<div class="k_date_b">
			<p class="k_date_qx">取消</p>
			<p class="k_dele_qr">确认</p>
		</div>
	</div>
	<!-- End 删除弹窗  -->
</div>
<!-- End 我的笔记-->