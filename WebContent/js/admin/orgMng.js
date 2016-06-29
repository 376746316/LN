//组织管理js
$(function() {
	init('');
	/**
	 * 初始化组织信息 form表单
	 */
	$('#addform').form({
		url : '',
		onSubmit : function() {
		},
		success : function(data) {
		}
	});
});

// ---->>初始化
function init(p) {
	p = encodeURI(encodeURI(p));
	$('#list_user')
			.datagrid(
					{
						title : '组织信息表',
						iconCls : 'icon-save',
						width : 'auto',
						height : '420',
						nowrap : false,
						striped : true,
						singleSelect : true,
						url : ctx + '/getOrgList.do' + p,
						remoteSort : false,
						idField : 'orgId',
						frozenColumns : [ [ {
							title : '编号',
							field : 'orgId',
							align : 'center',
							width : 40,
							sortable : true
						}, {
							title : '组织编码',
							field : 'orgCode',
							align : 'center',
							width : 120,
							sortable : true
						} ] ],
						columns : [
								[ {
									title : '基本信息',
									colspan : 7
								} ],
								[
										{
											field : 'orgName',
											title : '组织名称',
											width : 210,
											rowspan : 2,
											align : 'center',
											sortable : true,
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'orgParentName',
											title : '所属组织',
											width : 210,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'orgParentId',
											title : '所属编号',
											hidden : true
										},
										{
											field : 'orgFlag',
											title : '组织标示',
											hidden : true
										},
										{
											field : 'orgType',
											title : '组织分类',
											hidden : true
										},
										{
											field : 'orgLinkMan',
											title : '联系人',
											width : 80,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'orgLinkTel',
											title : '联系电话',
											width : 80,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'orgMail',
											title : '电子邮件',
											width : 180,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'orgPostCode',
											title : '邮政编码',
											width : 80,
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
											width : 120,
											align : 'center',
											rowspan : 4,
											formatter : function(value, rec) {
												return '<a href="javascript:openEdit();" style="text-decoration:none;">编辑</a>&nbsp;&nbsp;'
														+ '<a href="javascript:sureDelete();" style="text-decoration:none;">删除</a>';

											}
										} ] ],
						pagination : true,
						toolbar : [ {
							id : 'btnadd',
							text : '添加组织',
							iconCls : 'icon-add',
							handler : function() {
								openAdd('add');
							}
						} ]
					});
	var p = $('#list_user').datagrid('getPager');
	$(p).pagination({});
}

/**
 * 加载 所属组织ComboBox
 */
function loadCbx_OrgParent(pid) {
	$('#ad_orgParent').combobox({
		required : false,
		panelHeight : '110px',
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getOrgParentCbox.do',
		textField : 'orgName',
		valueField : 'orgId',
		value : pid
	});
}

/**
 * 加载 组织标识 下拉框
 */
function loadOrgIdentifierCbox(pid) {
	$('#ad_orgFlag').combobox({
		required : false,
		panelHeight : 180,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getOrgIdentifierCbox.do?parentparamid=53',
		valueField : 'param_id',
		textField : 'param_name',
		value : pid
	});
}

/**
 * 加载 组织分类 下拉框
 */
function loadOrgTypeCbox(pid) {
	$('#ad_orgType').combobox({
		required : false,
		panelHeight : 180,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getOrgTypeCbox.do?parentparamid=54',
		valueField : 'param_id',
		textField : 'param_name',
		value : pid
	});
}

// 查询
function doSearch() {

	var majorName = $("#majorName").val();
	init('?majorName=' + majorName);
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
				location = ctx + "/deleteOrg.do?orgId=" + selected.orgId;
			}
		}
	});
}

// 显示添加修改窗口
function openAdd(type) {
	// 添加窗口清空form表单
	if (type == "add") {
		doReset('addform');
		loadCbx_OrgParent('');
		loadOrgIdentifierCbox('');
		loadOrgTypeCbox('');
		$('#isUpdate').val('addOrg.do');
		$('#user_add').window('open');
	}
}

// 显示修改
function openEdit() {
	var selected = $('#list_user').datagrid('getSelected');
	if (selected) {
		$('#isUpdate').val('updateOrg.do');
		$('#upd_orgId').val(selected.orgId);
		$('#addform').form('load', {
			upd_orgId : selected.orgId,
			ad_orgCode : selected.orgCode,
			ad_orgName : selected.orgName,
			ad_orgParent : selected.orgParentName,
			ad_LinkMan : selected.orgLinkMan,
			ad_LinkTel : selected.orgLinkTel,
			ad_orgSite : selected.orgSite,
			ad_orgAddress : selected.orgAddress,
			ad_orgFax : selected.orgFax,
			ad_orgPostCode : selected.orgPostCode,
			ad_orgMail : selected.orgMail
		});
		loadCbx_OrgParent(selected.orgParentId);
		loadOrgIdentifierCbox(selected.orgFlag);
		loadOrgTypeCbox(selected.orgType);
		$('#user_add').window('open');
	}
}

// 添加修改
function doAdd() {
	//调用form控件校验方法 返回true则验证通过，否则拦截表单提交
	if ($('#addform').form('validate')) {
		//验证通过
		var orgParentId = $("#ad_orgParent").combobox('getValue');
		if ($.trim(orgParentId) == "") {
			orgParentId = null;
		}
		var orgIdOnPang = $("#upd_orgId").val();
		if ($.trim(orgIdOnPang) == "") {
			orgIdOnPang = null;
		}
		var orgObj = {
			orgId : orgIdOnPang,
			orgCode : $.trim($("#ad_orgCode").val()),
			orgName : $("#ad_orgName").val(),
			orgParentId : orgParentId,
			orgFlag : $("#ad_orgFlag").combobox('getValue'),
			orgLinkMan : $("#ad_LinkMan").val(),
			orgLinkTel : $("#ad_LinkTel").val(),
			orgSite : $("#ad_orgSite").val(),
			orgAddress : $("#ad_orgAddress").val(),
			orgPostCode : $("#ad_orgPostCode").val(),
			orgFax : $("#ad_orgFax").val(),
			orgType : $("#ad_orgType").combobox('getValue'),
			orgMail : $("#ad_orgMail").val()
		};
		var param = new Object();
		param["json"] = JSON.stringify(orgObj);
		$.post(
				$('#isUpdate').val(),
				param,
				function(rsp) {
					if (rsp == "success") {
						$('#list_user').datagrid('reload');
						$('#ad_orgParent').combobox('reload',
								$('#ad_orgParent').combobox('options').url);
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
/*
 * 提示消息 slide函数
 */
function msgSlider(message) {
	$.messager.show({
		title : '操作提示',
		msg : message,
		timeout : 1500,
		showType : 'slide'
	});
}
