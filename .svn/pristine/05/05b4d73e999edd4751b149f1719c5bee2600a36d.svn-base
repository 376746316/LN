$(function() {

	// 初始化登录Dilog
	$('#include_websiteclear_stuLoginDialog').show().dialog({
		title : '登　录',
		width : 500,
		height : 200,
		closed : false,
		cache : false,
		modal : true
	}).dialog('close');

	// 初始化登录form 表单
	$('#include_websiteclear_stuLoginForm').form({
		url : 'stuLogin.do',
		onSubmit : function() {
			var isValid = $(this).form('validate');
			if (!isValid) {
				$.messager.progress('close'); // 当form不合法的时候隐藏工具条
			}
			return isValid; // 返回false将停止form提交
		},
		success : function(data) {
			var r = $.parseJSON(data);
			$.messager.show({
				title : '提示',
				msg : r.msg
			});
			if(r.success){
				window.location="loginSuccess.do";
			}
			
		}
	});

});

// 点击学生登录
function openStuLoginDialog() {
	$('#include_websiteclear_stuLoginDialog').dialog('open');
}

// 用户登录提交form表单
function doSubmit() {
	$('#include_websiteclear_stuLoginForm').submit();
}

// 键盘操作事件
document.onkeydown = function(event) {
	var e = event || window.event || arguments.callee.caller.arguments[0];
	if (e && e.keyCode == 27) { // 按 Esc
		// 要做的事情
	}
	if (e && e.keyCode == 113) { // 按 F2
		// 要做的事情
	}
	if (e && e.keyCode == 13) { // enter 键
		doSubmit();
	}
};