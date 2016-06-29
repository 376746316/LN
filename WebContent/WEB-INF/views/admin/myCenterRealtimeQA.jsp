<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="com.chinasofti.cetp.utils.ReaderXmlParam"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/kkpager.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.textSearch-1.0.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/kkpager.css" />
<script type="text/javascript">
	$(function() {
		$(".sous").click(function() {
			var param = new Object();
			param["search"] = $.trim($("#searchRqa").val());
			$('.grzx_r').load(ctx + "/myCenter/stuRqa.do", param);
		});
		$(".delrqa").click(function() {
			var _this = this;
			$.post(ctx + "/deleteRqa.do", {
				rqaId : $(_this).attr("rqaId")
			}, function(rsp) {
				if (rsp == "success") {
					$(_this).parents("li").remove();
				}
			});
		});
		if ($.trim($("#searchRqa").val()) != "") {
			$(".k_rqasbox .t").textSearch($("#searchRqa").val(), {
				nullReport : false
			});
		}
		// 初始化优惠价格
		getRqaCostByQacount(1);

		$("#rechargeableCard").toggle(function() {
			$(".payPage").animate({
				height : 'toggle',
				opacity : 'toggle'
			}, "slow");
		}, function() {
			$(".payPage").animate({
				height : 'toggle',
				opacity : 'toggle'
			});
		});

	});

	function getRqaCostByQacount(qAcount) {
		$.post(ctx + "/myCenter/getRqaCostByQacount.do", {
			qAcount : qAcount
		}, function(data) {
			if (data.success) {
				var rcCoinCost = data.obj.rcCoinCost;
				var rcRmbCost = data.obj.rcRmbCost;
				// 当前优惠价格
				$("#rcCoinCost").html(rcCoinCost);
				$("#rcRmbCost").html(rcRmbCost);
				// 当前消费人民币总额
				var qAcount = $("#qAcount").val();
				if (qAcount == "") {
					$("#J_Total").html("0.0");
					// 当前消费学习币总额
					$("#amount").html(qAcount * rcCoinCost);
				} else {
					$("#J_Total").html(qAcount * rcRmbCost);
					$("#amount").html(qAcount * rcCoinCost);
				}
			}
		}, "json");
	}

	// 学习币购买方式
	function buy() {
		var qAcount = $("#qAcount").val();
		var stuPwd = $("#stuPwd").val();
		if (qAcount > 0 && stuPwd != "") {
			$.post(ctx + "/myCenter/buy.do", {
				qAcount : qAcount,
				stuPwd : stuPwd
			}, function(data) {
				alert(data.msg);
				if (data.success) {
					// 初始化优惠价格
					getRqaCostByQacount(1);
					$("#qAcount").val("");
					$("#stuPwd").val("");
					$("#stuQacount").html(data.obj.stuQacount);
					$("#stuCoin").html(data.obj.stuCoin);
					
					if (qAcount == "") {
						$("#J_Total").html("0.0");
						// 当前消费学习币总额
						$("#amount").html(qAcount * rcCoinCost);
					} else {
						$("#J_Total").html(qAcount * rcRmbCost);
						$("#amount").html(qAcount * rcCoinCost);
					}
					$("#rechargeableCard").click();
				}
			}, "json");
		}
	}
</script>
<style type="text/css">
.price-sum,.price {
	color: #f40;
	font-weight: 400;
	font-size: 18px;
	line-height: 48px;
	font-family: Arial;
	vertical-align: middle;
}

.submit-btn {
	display: inline-block;
	width: 55px;
	color: #fff;
	background: #f40;
	border-radius: 2px;
	text-align: center;
	cursor: pointer;
	text-decoration: none;
}
</style>
<!-- Start 我的答疑-->
<div class="g_wddy_box">
	<div class="kk_myrqas auto">

		<div class="g_wdzh_t">
			<h1 class="g_title">账户余额</h1>
			<p>
				剩余答疑次数：<span id="stuQacount" style="color: #f60;font-weight: 700;font-family: verdana,arial;">${sessionScope.sessionInfo.student.stuQacount}</span> 次
			</p>
		</div>
		<div class="blank48"></div>
		<div class="g_wdzh_m">
			<h1 class="g_title">购买次数</h1>
			<p class="g_zhcz">
				<span>优惠价格：<span id="rcCoinCost" style="color: #f60;font-weight: 700;font-family: verdana,arial;">10</span>学习币/次&nbsp;<span id="rcRmbCost" style="color: #f60;font-weight: 700;font-family: verdana,arial;">10</span>元人民币/次
				</span>
			</p>
			<p class="g_zhcz">
				<span>购买次数：</span><input id="qAcount" name="qAcount" type="text" onkeyup="this.value=this.value.replace(/\D/g,'');getRqaCostByQacount(this.value);" onafterpaste="this.value=this.value.replace(/\D/g,'')" /><span>次 </span> <span class="price-sum">合计：</span><strong class="price-sum">¥<em id="J_Total">0.00</em></strong>
			</p>
			<p class="g_czfs">
				<span>支付方式：</span> <a href="javascript:;" id="rechargeableCard"><img src="${pageContext.request.contextPath}/images/g_czk.png" width="30" height="25" alt="" /><span>学习币</span></a> <a href=""><img src="${pageContext.request.contextPath}/images/g_zfb.png" width="75" height="25" alt="" /></a> <a href=""><img src="${pageContext.request.contextPath}/images/g_cft.png" width="67" height="25" alt="" /></a> <a href=""><img src="${pageContext.request.contextPath}/images/g_yhk.png" width="30" height="25" alt="" /><span>银行卡</span></a>
			</p>
		</div>

		<div class="payPage" style="display: none;">
			<div class="blank48"></div>
			<div class="g_wdzh_t">
				<h1 class="g_title">学习币付款</h1>
				<p>
					学习币余额：<span id="stuCoin" style="color: #f60;font-weight: 700;font-family: verdana,arial;">${sessionScope.sessionInfo.student.stuCoin}</span> 个
				</p>
				<p>
					本次消费：<span id="amount" style="color: #f60;font-weight: 700;font-family: verdana,arial;">-${sessionScope.sessionInfo.student.stuCoin}</span> 个
				</p>
				<p>
					当前密码：<input type="password" style="height: 16px;line-height: 16px;font-size: 12px;color: #666;padding: 2px 5px;border: 1px solid #d2d2d2;width: 120px;" name="stuPwd" id="stuPwd"> <input type="button" class="submit-btn" value="购买" onclick="buy()">
				</p>
			</div>
		</div>

		<div class="blank48"></div>
		<div class="g_wdzh_b">
			<h1 class="g_title">答疑记录</h1>
		</div>

		<!-- 搜索 -->
		<div class="k_rqassear">
			<div class="sear right">
				<input type="text" class="txt" value="${search}" name="" id="searchRqa"><input type="button" class="sous" value="搜索">
			</div>
		</div>
		<!-- End 搜索 -->
		<!-- 列表 -->
		<div class="k_rqasbox">

			<c:choose>
				<c:when test="${total gt 0}">
					<ul>
						<c:forEach items="${rqaList}" var="rqa">
							<li>
								<div class="t">${rqa.rqaTitle}</div>
								<div class="c">${rqa.rqaDescription}</div>
								<div class="k_inform">
									<c:set var="tempStatus" value="${rqa.rqaStatus}"></c:set>
									<span class="left time"><%=ReaderXmlParam.getInstance()
								.getParammain(
										"61",
										(String) pageContext
												.getAttribute("tempStatus"))%>&nbsp;<fmt:formatDate value="${rqa.rqaRegtime}" pattern="yyyy-MM-dd HH:mm:ss" /></span>
									<div class="right operation">
										<c:if test="${rqa.rqaStatus lt 4}">
											<a href="javascript:;" class="delrqa normal right" rqaId="${rqa.rqaId}">删除</a>
										</c:if>
										<c:if test="${(rqa.rqaStatus eq 4 )or (rqa.rqaStatus eq 5)}">
											<a href="${ctx}/realtimeQA.do?step=${rqa.rqaStatus}&rqaId=${rqa.rqaId}" class="normal right">继续</a>
										</c:if>
										<a href="${ctx}/showHistoryRqa.do?rqaId=${rqa.rqaId}" target="_blank" class="normal right">查看</a>
										<div class="jiathis_style right" style="margin-top: 0;">
											<a target="_blank" class="jiathis jiathis_txt" href="http://www.jiathis.com/share" style=""><img width="64" height="22" alt="" src="${ctx}/images/k_fx01.png"></a>
										</div>
									</div>
								</div>
							</li>
						</c:forEach>
					</ul>
				</c:when>
				<c:when test="${total eq 0 && empty search }">
						当前没有答疑记录
					</c:when>
				<c:otherwise>
					<p>
						抱歉，当前章节没有找到与“<span style="color: red">${search}</span>”相关的答疑。
					</p>
					<br>建议：
					<br>检查输入是否正确
					<br>简化输入词
					<br>尝试其他相关词，如同义、近义词等
				</c:otherwise>
			</c:choose>
		</div>
		<!-- End 列表 -->
		<!-- 分页 -->
		<c:if test="${total gt 0}">
			<div id="myRqaPager" style="text-align: center;"></div>
			<script type="text/javascript">
				//生成分页控件  
				kkpager.generPageHtml({
					pagerid : 'myRqaPager',
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
							page : n,
							search : $.trim($("#searchRqa").val())
						};

						$(".grzx_r").load(ctx + '/myCenter/stuRqa.do', param);
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
</div>
<!-- End 我的笔记-->