<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	$.messager.show({
		title : '操作提示',
		msg : '你好,同学,请继续完成实训任务',
		timeout : 1500,
		showType : 'slide'
	});

	$.extend($.fn.validatebox.defaults.rules, {
		equals : {
			validator : function(value, param) {
				return value == $(param[0]).val();
			},
			message : '两次输入密码必须一致.'
		}
	});

	function doClearSession() {
		$.messager.confirm('提示信息', '是否确认注销实训平台?', function(r) {
			if (r) {
				$.post("clearAllSession.do", null, function(rsp) {
					location = "towebsite.do";
				}).error(function() {
					location = "towebsite.do";
				});

			}
		});
	}
	function doClose(winid) {
		$("#" + winid).window('close');
	}
	function doUpdatePwd() {
		$('#isUpdate').val('updateStuPwd.do');
		$('#updPwd').form('clear');
		$('#updPwdDiv').window('open');
	}
	function saveUpdate() {
		if ($('#updPwd').form('validate')) {
			var stuPwd = {
				old_pwd : $("#old_pwd").val(),
				new_pwd : $("#re_pwd").val()
			};
			
			$.post($('#isUpdate').val(), stuPwd, function(rsp) {
				if (rsp == "success") {
					msgSlider('操作成功！');
				} else if(rsp=="queryError"){
					msgSlider('原密码错误！');
				}else if(rsp=="updateError"){
					msgSlider('操作异常，请重新修改！');
				}
			}).error(function() {
				msgSlider('操作失败！');
			});
			
			$('#updPwdDiv').window('close');
			
		}
	}
	function msgSlider(message) {
		$.messager.show({
			title : '操作提示',
			msg : message,
			timeout : 1500,
			showType : 'slide'
		});
	}
</script>
<div class="top">
	<div class="top_m">
		<div class="ding_right">
			<ul>
				<li>您好,${sessionScope.stuName}</li>
				<c:if test="${sessionScope.stuName != null}">
					<li><a href="javascript:doClearSession();">注销用户</a></li>
				</c:if>
				<li><a href="javascript:doUpdatePwd();">修改密码</a></li>
				<!-- <li><a href="">网站专属二维码</a></li> -->
			</ul>
		</div>
		<div class="top_i">
			<div class="top_img">
				<img src="images/logo.jpg" /> <img src="images/title.jpg" /> <img
					src="images/phone.jpg" />
			</div>
		</div>

		<%@ include file="/WEB-INF/include/menu.jsp"%>


		<div id="updPwdDiv" class="easyui-window" title="修改密码"
			iconCls="icon-save"
			style="width: 330px; height: 210px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="updPwd" name="updPwd">

						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">
							<tr>
								<td align="right" width="110px">原密码：</td>
								<td><input type="text" id="old_pwd" name="old_pwd"
									class="easyui-validatebox" style="width: 180px" required=true/></td>
							</tr>
							<tr>
								<td align="right" width="110px">新密码：</td>
								<td><input type="password" id="new_pwd" name="new_pwd"
									class="easyui-validatebox" style="width: 180px"
									validType="length[6,25]" required=true/></td>
							</tr>
							<tr>
								<td align="right" width="110px">确认新密码：</td>
								<td><input type="password" id="re_pwd" name="re_pwd"
									class="easyui-validatebox" style="width: 180px"
									validType="equals['#new_pwd']" required=true/></td>
							</tr>

						</table>
					</form>
					<br>
					<div region="south" border="false"
						style="text-align: right; height: 30px; line-height: 30px;">
						<input type="hidden" id="isUpdate" name="isUpdate"> <a
							class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="saveUpdate()">保存</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('updPwdDiv')">取消</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
