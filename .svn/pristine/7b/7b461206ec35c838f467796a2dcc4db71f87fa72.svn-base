/**
 * 用户组管理
 * 
 * @author heyq 2014年5月19日 *
 */

var admin_userGrop_datagrid;// 积分规则列表 DataGrid
var show_userGrop_detail;// 显示请假条明细 dialog

// --------------------------华丽的分割线-----------------------------
$(function() {
	// 积分规则列表 DataGrid
	admin_userGrop_datagrid = $('#admin_userGrop_datagrid').datagrid({
		url : ctx + '/myCenter/getUserGropList.do',
		title : '用户组规则列表',
		width : 1040,
		height : 366,
		nowrap : false,
		striped : true,
		collapsible : true,
		singleSelect : true,
		pagination : true,
		rownumbers : true,
		idField : 'ugId',
		frozenColumns : [ [ {
			title : '编号',
			field : 'ugId',
			width : 80,
			sortable : true,
			align : 'center'
		} ] ],
		columns : [ [ {
			field : 'ugName',
			title : '用户组',
			align : 'center',
			width : 140
		}, {
			field : 'ugTopscore',
			title : '',
			align : 'center',
			width : 140,
			hidden : true
		}, {
			field : 'ugLowestscore',
			title : '',
			width : 100,
			align : 'center',
			hidden : true
		}, {
			field : 'ugScore',
			title : '积分',
			width : 100,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.ugTopscore == '-1') {
					return row.ugLowestscore + "-以上";
				}else{
					return row.ugLowestscore + "-" + row.ugTopscore;
				}
			}
		}, {
			field : 'ugCoin',
			title : '学习币',
			width : 100,
			align : 'center',
			rowspan : 2
		}, {
			field : 'ugLiveFlag',
			title : '直播',
			width : 100,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.ugLiveFlag == '0') {
					return '无';
				} else if (row.ugLiveFlag == '1') {
					return '全部';
				} else if (row.ugLiveFlag == '2') {
					return '部分';
				} else {
					return value;
				}
			}
		}, {
			field : 'ugDownloadFlag',
			title : '课程下载',
			width : 100,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.ugDownloadFlag == '0') {
					return '不可';
				} else if (row.ugDownloadFlag == '1') {
					return '全部';
				} else if (row.ugDownloadFlag == '2') {
					return '部分';
				} else {
					return value;
				}
			}
		}, {
			field : 'ugExchangeFlag',
			title : '积分兑换',
			width : 100,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.ugExchangeFlag == '0') {
					return '不可';
				} else if (row.ugExchangeFlag == '1') {
					return '可兑换';
				} else {
					return value;
				}
			}
		}, {
			field : 'ugSalonFlag',
			title : '线下沙龙',
			width : 120,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.ugSalonFlag == '0') {
					return '不可参与';
				} else if (row.ugSalonFlag == '1') {
					return '可参与';
				} else {
					return value;
				}
			}
		}, {
			field : 'action',
			title : '操作',
			width : 144,
			align : 'center',
			formatter : function(value, row, index) {
				return "<a href='javascript:Edit(" + index + ");'>编辑</a>&nbsp;" + "<a href='javascript:deleteUserGrop(" + index + ");'>删除</a>";
			}
		} ] ]
	});

	// 编辑积分规则
	show_userGrop_detail = $('#show_userGrop_detail').show().dialog({
		title : '编辑积分规则',
		width : 833,
		height : 292,
		closed : false,
		cache : false,
		modal : true,
		buttons : [ {
			text : '保存',
			handler : function() {
				$.post(ctx + "/myCenter/editUserGrop.do", $('#userGropInfoForm').serialize(), function(data) {
					if (data.success) {
						show_userGrop_detail.dialog('close');
						admin_userGrop_datagrid.datagrid('load');
					}
					$.messager.show({
						title : '操作提示',
						msg : data.msg,
						timeout : 5000,
						showType : 'slide'
					});
				}, "json");
			}
		}, {
			text : '取消',
			handler : function() {
				show_userGrop_detail.dialog('close');
			}
		} ],
		onClose : function() {
			$('div.validatebox-tip').remove();
		}
	}).dialog('close');
});

// 编辑
function Edit(rowIndex) {
	var r = admin_userGrop_datagrid.datagrid('getRows')[rowIndex];
	var ugScore;
	if (r.ugTopscore == '-1') {
		ugScore = r.ugLowestscore + "-以上";
	}else{
		ugScore = r.ugLowestscore + "-" + r.ugTopscore;
	}
	// 点击【详细】按钮时，加载本地记录
	$('#userGropInfoForm').form('load', {
		ugId : r.ugId,
		ugName : r.ugName,
		ugScore : ugScore,
		ugCoin : r.ugCoin,
		ugLiveFlag : r.ugLiveFlag,
		ugDownloadFlag : r.ugDownloadFlag,
		ugExchangeFlag : r.ugExchangeFlag,
		ugSalonFlag : r.ugSalonFlag
	});

	// 设置只读
	 $('#userGropInfoForm input[name=ugId]').attr({
		 readonly : "readonly"
	 });
	 $('#userGropInfoForm input[name=ugScore]').attr({
		 readonly : "readonly"
	 });

	show_userGrop_detail.dialog('open');
}

// 删除
function deleteUserGrop(rowIndex) {
	var row = admin_userGrop_datagrid.datagrid('getRows')[rowIndex];
	$.messager.confirm('确认', '删除积分规则可能导致积分系统无法使用!请确认?', function(r) {
		if (r) {
			$.post(ctx + "/myCenter/deleteUserGrop.do", {
				srId : row.srId
			}, function(data) {
				if (data.success) {
					show_userGrop_detail.dialog('close');
					admin_userGrop_datagrid.datagrid('load');
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
}
