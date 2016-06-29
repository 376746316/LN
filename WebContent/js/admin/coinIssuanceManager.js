/**
 * 学习币发行
 * 
 * @author heyq 2014年5月21日 *
 */

var admin_coinIssuance_datagrid; // 用户列表 DataGrid
var edit_coin_dialog;
var rateSet_dialog; // 积分兑换比例设置

// --------------------------华丽的分割线-----------------------------
$(function() {
	// 用户列表 DataGrid
	admin_coinIssuance_datagrid = $('#admin_coinIssuance_datagrid').datagrid({
		url : ctx + '/myCenter/getStudentList.do',
		title : '用户列表',
		width : 1040,
		height : 366,
		nowrap : false,
		striped : true,
		collapsible : true,
		singleSelect : true,
		pagination : true,
		rownumbers : true,
		idField : 'stuNo',
		frozenColumns : [ [ {
			title : '编号',
			field : 'stuNo',
			width : 80,
			sortable : true,
			align : 'center',
			hidden : true
		}, {
			field : 'stuUserid',
			title : '账户',
			align : 'center',
			width : 140
		} ] ],
		columns : [ [ {
			field : 'stuNickname',
			title : '昵称',
			width : 100,
			align : 'center'
		}, {
			field : 'stuScore',
			title : '积分',
			width : 80,
			align : 'center'
		}, {
			field : 'stuCoin',
			title : '学习币',
			width : 80,
			align : 'center'
		}, {
			field : 'stuHistoryScore',
			title : '历史积分',
			width : 80,
			align : 'center'
		}, {
			field : 'stuLastlogin',
			title : '最后登录时间',
			width : 160,
			align : 'center'
		}, {
			field : 'stuRegtime',
			title : '注册时间',
			width : 160,
			align : 'center'
		}, {
			field : 'action',
			title : '操作',
			width : 184,
			align : 'center',
			formatter : function(value, row, index) {
				return "<a href='javascript:Edit(" + index + ");'>编辑</a>&nbsp;";
			}
		} ] ],
		toolbar : [ {
			iconCls : 'icon-tip',
			text : '兑换比例设置',
			handler : function() {
				rateSet_dialog.dialog('open');
			}
		} ]

	});

	// 编辑积分和学习币
	edit_coin_dialog = $('#edit_coin_dialog').dialog({
		title : '编辑信息',
		width : 330,
		height : 220,
		closed : false,
		cache : false,
		modal : true,
		closed : true,
		buttons : [ {
			text : '保存',
			iconCls : 'icon-edit',
			handler : function() {
				submitInfo();
			}
		}, {
			text : '取消',
			iconCls : 'icon-help',
			handler : function() {
				edit_coin_dialog.dialog('close');
			}
		} ]
	});
	
	// 积分兑换比例设置
	rateSet_dialog = $('#rateSet_dialog').show().dialog({
		title : '积分兑换比例设置',
		width : 430,
		height : 140,
		closed : false,
		cache : false,
		modal : true
	}).dialog('close');

});

// 提交修改信息数据
function submitInfo() {
	$.post(ctx + "/myCenter/editCoinInfo.do", $('#edit_coin_form').serialize(), function(data) {
		if (data.success) {
			edit_coin_dialog.dialog('close');
			admin_coinIssuance_datagrid.datagrid('load');
		}
		$.messager.show({
			title : '操作提示',
			msg : data.msg,
			timeout : 5000,
			showType : 'slide'
		});
	}, "json");
}

// 点击编辑
function Edit(rowIndex) {
	var r = admin_coinIssuance_datagrid.datagrid('getRows')[rowIndex];
	// 点击【详细】按钮时，加载本地记录
	$('#edit_coin_form').form('load', {
		stuNo : r.stuNo,
		stuScore : r.stuScore,
		stuCoin : r.stuCoin
	});
	$('#showStuUserid').text(r.stuUserid);
	edit_coin_dialog.dialog('open');
}

// 查询
function doSearch() {
	var stuUserid = $('#searchStudent_form input[name=stuUserid]').val();
	var stuNickname = $('#searchStudent_form input[name=stuNickname]').val();
	var param = {};
	if ($.trim(stuUserid) != "") {
		param['stuUserid'] = $.trim(stuUserid);
	}
	if ($.trim(stuNickname) != "") {
		param['stuNickname'] = $.trim(stuNickname);
	}
	admin_coinIssuance_datagrid.datagrid('load', param);
}

// 清空表单方法
function clearForm(objE) {// objE为form表单
	$(objE).find(':input').each(function() {
		switch (this.type) {
		case 'passsword':
		case 'select-multiple':
		case 'select-one':
		case 'text':
		case 'textarea':
			$(this).val('');
			break;
		case 'checkbox':
		case 'radio':
			this.checked = false;
		}
	});
	admin_coinIssuance_datagrid.datagrid('load', {});
}

// 保存设置积分兑换学习比例
function saveRateSet(){
	$.post(ctx + "/myCenter/updateRqaParamByRpId.do", $('#rateSet_form').serialize(), function(data) {
		if (data.success) {
			rateSet_dialog.dialog('close');
			$("#rpValue").numberbox('setValue', data.obj.rpValue);
		}
		$.messager.show({
			title : '操作提示',
			msg : data.msg,
			timeout : 5000,
			showType : 'slide'
		});
	}, "json");
	
}

