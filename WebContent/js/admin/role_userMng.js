//角色管理js

$(function() {

});

// ---->> 保存权限分配
function doRoleUserMng() {

	var moduleList = "";
	$("[name='checkbox']:checked").each(function() {
		moduleList += $(this).attr('mdId') + "-";
	});

	var roleId = $('#loadRoleId').val();

	var param = new Object();
	param["roleId"] = roleId;
	param["moduleList"] = moduleList;

	$.post("saveRoleUser.do", param, function(rsp) {

		if (rsp == "success") {
			parent.doCloseRuu();
			parent.msgSlider('操作成功！');

		} else {
			parent.msgSlider('操作失败！');
		}
	}).error(function() {
		msgSlider('操作失败！');
	});
	
}


// 添加
function doAdd() {

	var classObj = {

		roleName : $("#a_roleName").val(),
		roleIntro : $("#a_roleIntro").val()

	};

	var param = new Object();
	param["json"] = JSON.stringify(classObj);

	$.post($('#isUpdate').val(), param, function(rsp) {

		if (rsp == "success") {

			$('#list_user').datagrid('reload');
			msgSlider('操作成功！');
		} else {
			msgSlider('操作失败！');
		}
	}).error(function() {
		msgSlider('操作失败！');
	});
	$('#user_add').window('close');
}

// 清空表单
function doReset(fromid) {
	$('#' + fromid).form('clear');

}

// 关闭窗口
function doClose(winid) {
	$("#" + winid).window('close');
}

function msgSlider(message) {
	$.messager.show({
		title : '操作提示',
		msg : message,
		timeout : 1500,
		showType : 'slide'
	});
}
