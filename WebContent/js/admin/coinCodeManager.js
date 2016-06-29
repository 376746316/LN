/**
 * 学习币发行
 * 
 * @author heyq 2014年5月21日 *
 */

var admin_coinCode_datagrid_normal; // 有效兑换码 DataGrid
var admin_coinCode_datagrid_exchange; // 已使用兑换码 DataGrid
var admin_coinCode_datagrid_expired; // 已过期兑换码 DataGrid
var generate_redeem_dialog;

// --------------------------华丽的分割线-----------------------------
$(function() {
	// 有效兑换码 DataGrid
	admin_coinCode_datagrid_normal = $('#admin_coinCode_datagrid_normal').datagrid({
		url : ctx + '/myCenter/getCoinCodeList.do',
		queryParams : {
			reStatus : 1
		},
		width : 1040,
		height : 336,
		nowrap : false,
		striped : true,
		fit : true,
		border : false,
		collapsible : true,
		singleSelect : false,
		pagination : true,
		rownumbers : true,
		fitColumns : true,
		idField : 'reId',
		frozenColumns : [ [ {
			title : '编号',
			field : 'reId',
			width : 80,
			align : 'center',
			checkbox : true,
		}, {
			field : 'reRedeemcode',
			title : '兑换码',
			align : 'center',
			width : 400
		} ] ],
		columns : [ [ {
			field : 'reCoinamount',
			title : '学习币数量',
			width : 120,
			align : 'center'
		}, {
			field : 'reCreatetime',
			title : '生成日期',
			width : 200,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.reCreatetime) {
					return row.reCreatetime.substring(0, 10);
				}
			}
		}, {
			field : 'reValidity',
			title : '有效日期',
			width : 200,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.reValidity) {
					return row.reValidity.substring(0, 10);
				}
			}
		} ] ],
		toolbar : [ {
			text : '导出',
			iconCls : 'icon-undo',
			handler : function() {
				exportRedeemCode(admin_coinCode_datagrid_normal);
			}
		}, '-', {
			text : '导出全部',
			iconCls : 'icon-undo',
			handler : function() {
				exportRedeemCodeAll(true, "", 1);
			}
		}, '-', {
			text : '删除',
			iconCls : 'icon-remove',
			handler : function() {
				deleteRedeemByReIds(admin_coinCode_datagrid_normal);
			}
		}, '-', {
			text : '解除标记',
			iconCls : 'icon-tip',
			handler : function() {
				admin_coinCode_datagrid_normal.datagrid("uncheckAll");
			}
		}, '-', {
			text : '生成兑换码',
			iconCls : 'icon-add',
			handler : function() {
				clearForm($("#generate_redeem_form"));
				generate_redeem_dialog.dialog('open');
			}
		} ],
		onLoadSuccess : function(data) {
			$('#redeem_tabs').tabs('update', {
				tab : $("#redeem_tabs").tabs("tabs")[0],
				options : {
					title : "有效兑换码[" + data.total + "]",
				}
			});
		}
	});

	// 已使用兑换码 DataGrid
	admin_coinCode_datagrid_exchange = $('#admin_coinCode_datagrid_exchange').datagrid({
		url : ctx + '/myCenter/getCoinCodeList.do',
		queryParams : {
			reStatus : 2
		},
		width : 1040,
		height : 336,
		nowrap : false,
		striped : true,
		fit : true,
		border : false,
		collapsible : true,
		singleSelect : false,
		pagination : true,
		rownumbers : true,
		fitColumns : true,
		idField : 'reId',
		frozenColumns : [ [ {
			title : '编号',
			field : 'reId',
			width : 80,
			align : 'center',
			checkbox : true,
		}, {
			field : 'reRedeemcode',
			title : '兑换码',
			align : 'center',
			width : 400
		} ] ],
		columns : [ [ {
			field : 'reCoinamount',
			title : '学习币数量',
			width : 120,
			align : 'center'
		}, {
			field : 'reCreatetime',
			title : '生成日期',
			width : 200,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.reCreatetime) {
					return row.reCreatetime.substring(0, 10);
				}
			}
		}, {
			field : 'reValidity',
			title : '有效日期',
			width : 200,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.reValidity) {
					return row.reValidity.substring(0, 10);
				}
			}
		} ] ],
		toolbar : [ {
			text : '导出',
			iconCls : 'icon-undo',
			handler : function() {
				exportRedeemCode(admin_coinCode_datagrid_exchange);
			}
		}, '-', {
			text : '导出全部',
			iconCls : 'icon-undo',
			handler : function() {
				exportRedeemCodeAll(true, "", 2);
			}
		}, '-', {
			text : '删除',
			iconCls : 'icon-remove',
			handler : function() {
				deleteRedeemByReIds(admin_coinCode_datagrid_exchange);
			}
		}, '-', {
			text : '解除标记',
			iconCls : 'icon-tip',
			handler : function() {
				admin_coinCode_datagrid_exchange.datagrid("uncheckAll");
			}
		}, '-', {
			text : '生成兑换码',
			iconCls : 'icon-add',
			handler : function() {
				clearForm($("#generate_redeem_form"));
				generate_redeem_dialog.dialog('open');
			}
		} ],
		onLoadSuccess : function(data) {
			$('#redeem_tabs').tabs('update', {
				tab : $("#redeem_tabs").tabs("tabs")[1],
				options : {
					title : "已使用兑换码[" + data.total + "]",
				}
			});
		}
	});

	// 已过期兑换码 DataGrid
	admin_coinCode_datagrid_expired = $('#admin_coinCode_datagrid_expired').datagrid({
		url : ctx + '/myCenter/getCoinCodeList.do',
		queryParams : {
			reStatus : 3
		},
		width : 1040,
		height : 336,
		nowrap : false,
		striped : true,
		fit : true,
		border : false,
		collapsible : true,
		singleSelect : false,
		pagination : true,
		rownumbers : true,
		fitColumns : true,
		idField : 'reId',
		frozenColumns : [ [ {
			title : '编号',
			field : 'reId',
			width : 80,
			align : 'center',
			checkbox : true,
		}, {
			field : 'reRedeemcode',
			title : '兑换码',
			align : 'center',
			width : 400
		} ] ],
		columns : [ [ {
			field : 'reCoinamount',
			title : '学习币数量',
			width : 120,
			align : 'center'
		}, {
			field : 'reCreatetime',
			title : '生成日期',
			width : 200,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.reCreatetime) {
					return row.reCreatetime.substring(0, 10);
				}
			}
		}, {
			field : 'reValidity',
			title : '有效日期',
			width : 200,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.reValidity) {
					return row.reValidity.substring(0, 10);
				}
			}
		} ] ],
		toolbar : [ {
			text : '导出',
			iconCls : 'icon-undo',
			handler : function() {
				exportRedeemCode(admin_coinCode_datagrid_expired);
			}
		}, '-', {
			text : '导出全部',
			iconCls : 'icon-undo',
			handler : function() {
				exportRedeemCodeAll(true, "", 3);
			}
		}, '-', {
			text : '删除',
			iconCls : 'icon-remove',
			handler : function() {
				deleteRedeemByReIds(admin_coinCode_datagrid_expired);
			}
		}, '-', {
			text : '解除标记',
			iconCls : 'icon-tip',
			handler : function() {
				admin_coinCode_datagrid_expired.datagrid("uncheckAll");
			}
		}, '-', {
			text : '生成兑换码',
			iconCls : 'icon-add',
			handler : function() {
				clearForm($("#generate_redeem_form"));
				generate_redeem_dialog.dialog('open');
			}
		} ],
		onLoadSuccess : function(data) {
			$('#redeem_tabs').tabs('update', {
				tab : $("#redeem_tabs").tabs("tabs")[2],
				options : {
					title : "已过期兑换码[" + data.total + "]",
				}
			});
		}
	});

	// 生成兑换码
	generate_redeem_dialog = $('#generate_redeem_dialog').dialog({
		title : '生成兑换码',
		width : 408,
		height : 250,
		closed : false,
		cache : false,
		modal : true,
		closed : true,
		buttons : [ {
			text : '生成',
			handler : function() {
				submitInfo();
			}
		}, {
			text : '取消',
			handler : function() {
				generate_redeem_dialog.dialog('close');
			}
		} ]
	});

});

function yysearchinput(e, self) {
	var kc = e.keyCode, keycodes = [ 8, 46, 37, 38, 39, 40 ];
	if (e.shiftKey) {
		return false;
	}
	if (e.ctrlKey && (kc == 67 || kc == 86 || kc == 88 || kc == 65)) {
		var element = self;
		setTimeout(function() {
			element.value = $.trim(element.value.replace(/\D/gi, ''))
		}, 100);
		return true;
	}
	if ((kc >= 48 && kc <= 57) || (kc >= 96 && kc <= 105) || (-1 != $.inArray(kc, keycodes))) {
	} else {
		return false;
	}
}

// 提交数据
function submitInfo() {
	var sync = $("#generate_redeem_form input[name=sync]").attr("checked");
	if (checkInfo()) {
		$.post(ctx + "/myCenter/generateRedeemCode.do", $('#generate_redeem_form').serialize(), function(data) {
			if (data.success) {
				if (sync == "checked") { // 同步导出
					//console.info("同步导出");
					window.location.href = ctx + data.obj;
				}
				generate_redeem_dialog.dialog('close');
				admin_coinCode_datagrid_normal.datagrid('load');
			}
			$.messager.show({
				title : '操作提示',
				msg : data.msg,
				timeout : 5000,
				showType : 'slide'
			});
		}, "json");
	}
}

function checkInfo() {
	var generateCount = $("#generateCount").val();
	var reValidity = $("#reValidity").val();
	var reCoinamount = $("#reCoinamount").val();
	if (generateCount == "") {
		$.messager.alert('警告', '请输入生成个数!');
	} else if (reValidity == "") {
		$.messager.alert('警告', '请设置有效时间!');
	} else if (reCoinamount == "") {
		$.messager.alert('警告', '请设置学习币数量!');
	} else {
		if (generateCount < 1 || generateCount > 1000) {
			$.messager.alert('警告', '生成个数值超出设定范围!(1~1000)');
		} else if (reCoinamount < 1 || reCoinamount > 1000) {
			$.messager.alert('警告', '学习币数量值超出设定范围!(1~1000)');
		} else {
			return true;
		}
	}

}

function deleteRedeemByReIds(obj) {
	var reIds = "";
	var rows = obj.datagrid("getChecked");
	if (rows.length > 0) {
		$.messager.confirm('确认', '您确认要删除当前勾选的' + rows.length + '条记录吗?', function(r) {
			if (r) {
				for ( var int = 0; int < rows.length; int++) {
					reIds += rows[int].reId + ",";
				}
				//console.info("reIds=" + reIds);
				$.post(ctx + "/myCenter/deleteRedeemByReIds.do", {
					reIds : reIds
				}, function(data) {
					if (data.success) {
						obj.datagrid('reload');
					}
					$.messager.show({
						title : '操作提示',
						msg : data.msg,
						timeout : 5000,
						showType : 'slide'
					});
				}, "json");
			}
		});
	} else {
		$.messager.alert('提示', '没有勾选任何记录!');
	}

}

// 导出全部
function exportRedeemCodeAll(exportAll, exportReIds, reStatus) {
	$.post(ctx + "/myCenter/exportRedeemCode.do", {
		exportAll : exportAll,
		reStatus : reStatus,
		exportReIds : exportReIds
	}, function(data) {
		if (data.success) {
			window.location.href = ctx + data.obj;
		} else {
			$.messager.show({
				title : '操作提示',
				msg : data.msg,
				timeout : 5000,
				showType : 'slide'
			});
		}
	}, "json");
}

// 导出
function exportRedeemCode(obj) {
	var reIds = "";
	var rows = obj.datagrid("getChecked");
	if (rows.length > 0) {
		for ( var int = 0; int < rows.length; int++) {
			reIds += rows[int].reId + ",";
		}
		exportRedeemCodeAll(false, reIds, -1);
	} else {
		$.messager.alert('提示', '没有勾选任何记录!');
	}

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
	//admin_coinCode_datagrid.datagrid('load', {});
}
