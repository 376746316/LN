//角色 权限管理js

$(function() {
	init('');

});

// ---->>初始化DataGrid
function init(p) {
	p = encodeURI(encodeURI(p));
	$('#list_user')
			.datagrid(
					{
						title : '角色信息表' + '(本页面仅为超级管理员用户可见)',
						iconCls : 'icon-save',
						width : 'auto',
						height : '420',
						nowrap : false,
						striped : true,
						singleSelect : true,
						collapsible : true,
						url : ctx + '/getRoleList.do' + p,
						sortName : 'id',
						sortOrder : 'asc',
						remoteSort : false,
						idField : 'code',

						frozenColumns : [ [

						{
							title : '角色编号',
							field : 'roleId',
							align : 'center',
							width : 70,
							sortable : true
						} ] ],
						columns : [
								[ {
									title : '角色信息列表',
									colspan : 3
								} ],
								[
										{
											field : 'roleName',
											title : '角色名称',
											width : 110,
											rowspan : 2,
											align : 'center',
											sortable : true,
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'roleIntro',
											title : '角色介绍',
											width : 180,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'opt',
											title : '操作',
											width : 380,
											align : 'center',
											rowspan : 4,
											formatter : function(value, rec) {
												return '<a href="javascript:doModule();" style="text-decoration:none;">角色->权限分配</a>&nbsp; &nbsp;'
														+ '<a href="javascript:doUser();" style="text-decoration:none;">角色->用户分配</a>&nbsp; &nbsp;'
														+ '<a href="javascript:sureDelete();" style="text-decoration:none;">删除</a>';
											}
										} ] ],
						pagination : true,
						toolbar : [ {
							id : 'btnadd',
							text : '添加角色',
							iconCls : 'icon-add',
							handler : function() {
								openAdd('add');
							}
						}]
					});
	var p = $('#list_user').datagrid('getPager');
	$(p).pagination({});
}

// ---->> 1,加载模块功能checkbox
function doModule() {

	var selected = $('#list_user').datagrid('getSelected');
	
	if(selected){
		$('#role_moduleDiv').empty();
		$('#role_moduleDiv').append(
				'<iframe id="frameRoleModule" src="'
				+ 'loadModule.do?roleId='
				+ selected.roleId
				+ '&roleName='
				+ encodeURI(encodeURI(selected.roleName))
				+ '" style="width: 100%; height: 100%; float: left; overflow: hidden; border: none; color: transparent;"></iframe>');
	}
	
	
	var winTop = ($(window).height() - 400) * 0.5;
	if (winTop < 10) {
		winTop = 10;
	}
	var winLeft = ($(window).width() - 600) * 0.5;
	if (winLeft < 10) {
		winLeft = 10;
	}
	
	$('#ss_').window('move', {
		top : winTop,
		left : winLeft
	});
	
	$('#ss_').window('open');
}

// ---->> 角色用户分配
function doUser() {
	
	var selected = $('#list_user').datagrid('getSelected');
	
	if(selected){
		$('#role_userDiv').empty();
		$('#role_userDiv').append(
				'<iframe id="frameRoleModule" src="'
				+ 'loadNoRoleUser.do?roleId='
				+ selected.roleId
				+ '&roleName='
				+ encodeURI(encodeURI(selected.roleName))
				+ '" style="width: 100%; height: 100%; float: left; overflow: hidden; border: none; color: transparent;"></iframe>');
	}
	
	var winTop = ($(window).height() - 400) * 0.5;
	if (winTop < 10) {
		winTop = 10;
	}
	var winLeft = ($(window).width() - 600) * 0.5;
	if (winLeft < 10) {
		winLeft = 10;
	}
	
	$('#uu_').window('move', {
		top : winTop,
		left : winLeft
	});
	
	$('#uu_').window('open');
}

// 清空表单
function doReset(fromid) {
	$('#' + fromid).form('clear');

}

// 关闭窗口
function doClose(winid) {
	$("#" + winid).window('close');
}

// 删除
function sureDelete() {
	$.messager.confirm('提示', '确认删除此条数据吗?', function(r) {
		if (r) {
			var selected = $('#list_user').datagrid('getSelected');
			if (selected) {
				location = ctx + "/deleteRole.do?roleId=" + selected.roleId;
			}
		}
	});
}

// 显示添加
function openAdd(type) {
	// 添加窗口清空form表单
	if (type == "add") {
		doReset('addform');
		$('#isUpdate').val('addRole.do');
		var winTop = ($(window).height() - 400) * 0.5;
		if (winTop < 10) {
			winTop = 10;
		}
		var winLeft = ($(window).width() - 600) * 0.5;
		if (winLeft < 10) {
			winLeft = 10;
		}
		
		$('#user_add').window('move', {
			top : winTop,
			left : winLeft
		});
		
		$('#user_add').window('open');
	}
}

// 显示修改
function openEdit() {
	var selected = $('#list_user').datagrid('getSelected');
	if (selected) {

		$('#isUpdate').val('updateClass.do');

		$('#addform').form('load', selected);
		$('#user_add').window('open');

	}
}

// ---->> 保存权限分配
function doRoleMng() {
	
	var moduleList = "";
	$("[name='checkbox'][checked]").each(function() {
		moduleList += $(this).attr('mdId') + "-";
	});

	var roleId = $('#list_user').datagrid('getSelected').roleId;

	var param = new Object();
	param["roleId"] = roleId;
	param["moduleList"] = moduleList;

	$.post("doRoleMng.do", param, function(rsp) {

		if (rsp == "success") {

			$('#list_user').datagrid('reload');
			msgSlider('操作成功！');
		} else {
			msgSlider('操作失败！');
		}
	}).error(function() {
		msgSlider('操作失败！');
	});
	
	$('#role_module_mng').window('close');
	
}

//
function doCloseRmm(){
	$('#ss_').window('close');
}
function doCloseRuu(){
	$('#uu_').window('close');
}


// 添加
function doAdd() {
	if($('#addform').form('validate')){
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
}

function msgSlider(message) {
	$.messager.show({
		title : '操作提示',
		msg : message,
		timeout : 1500,
		showType : 'slide'
	});
}
