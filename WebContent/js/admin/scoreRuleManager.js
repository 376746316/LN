/**
 * 个人中心管理
 * 
 * @author heyq 2014年5月19日 *
 */

var admin_scoreRule_datagrid;// 积分规则列表 DataGrid
var show_scoreRule_detail;// 显示请假条明细 dialog

// --------------------------华丽的分割线-----------------------------
$(function() {
	// 积分规则列表 DataGrid
	admin_scoreRule_datagrid = $('#admin_scoreRule_datagrid').datagrid({
		url : ctx + '/myCenter/getScoreRuleList.do',
		title : '积分规则列表',
		width : 1040,
		height : 366,
		nowrap : false,
		striped : true,
		collapsible : true,
		singleSelect : true,
		pagination : true,
		rownumbers : true,
		idField : 'srId',
		frozenColumns : [ [ {
			title : '编号',
			field : 'srId',
			width : 80,
			sortable : true,
			align : 'center'
		} ] ],
		columns : [ [ {
			field : 'srName',
			title : '名称',
			align : 'center',
			width : 140
		}, {
			field : 'srCycle',
			title : '周期',
			align : 'center',
			width : 140,
			sortable : true,
			formatter : function(value, row, index) {
				if (row.srCycle == '0') {
					return '一次性';
				} else if (row.srCycle == '1') {
					return '每天';
				} else {
					return value;
				}
			}
		}, {
			field : 'srTimes',
			title : '周期内次数',
			width : 100,
			align : 'center',
			rowspan : 2
		}, {
			field : 'srScore',
			title : '单次奖励分值',
			width : 100,
			align : 'center',
			rowspan : 2
		}, {
			field : 'srFlag',
			title : '是否启用',
			width : 100,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.srFlag == '0') {
					return '禁用';
				} else if (row.srFlag == '1') {
					return '启用';
				} else {
					return value;
				}
			}
		}, {
			field : 'srRegtime',
			title : '创建时间',
			width : 180,
			align : 'center'
		}, {
			field : 'action',
			title : '操作',
			width : 144,
			align : 'center',
			formatter : function(value, row, index) {
				return "<a href='javascript:Edit(" + index + ");'>编辑</a>&nbsp;" + "<a href='javascript:deleteScoreRule(" + index + ");'>删除</a>";
			}
		} ] ]
	});

	// 编辑积分规则
	show_scoreRule_detail = $('#show_scoreRule_detail').show().dialog({
		title : '编辑积分规则',
		width : 833,
		height : 292,
		closed : false,
		cache : false,
		modal : true,
		buttons : [ {
			text : '保存',
			handler : function() {
				$.post(ctx + "/myCenter/editScoreRule.do", $('#scoreRuleInfoForm').serialize(), function(data) {
					if (data.success) {
						show_scoreRule_detail.dialog('close');
						admin_scoreRule_datagrid.datagrid('load');
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
				show_scoreRule_detail.dialog('close');
			}
		} ],
		onClose : function() {
			$('div.validatebox-tip').remove();
		}
	}).dialog('close');
});

// 编辑
function Edit(rowIndex) {
	var r = admin_scoreRule_datagrid.datagrid('getRows')[rowIndex];
	// 点击【详细】按钮时，加载本地记录
	$('#scoreRuleInfoForm').form('load', {
		srId : r.srId,
		srName : r.srName,
		srCycle : r.srCycle,
		srTimes : r.srTimes,
		srScore : r.srScore,
		srFlag : r.srFlag,
		srRegtime : r.srRegtime
	});

	// 设置只读
	$('#scoreRuleInfoForm input[name=srId]').attr({
		readonly : "readonly"
	});
	$('#scoreRuleInfoForm input[name=srRegtime]').attr({
		readonly : "readonly"
	});

	show_scoreRule_detail.dialog('open');
}

// 删除
function deleteScoreRule(rowIndex) {
	var row = admin_scoreRule_datagrid.datagrid('getRows')[rowIndex];
	$.messager.confirm('确认', '删除积分规则可能导致积分系统无法使用!请确认?', function(r) {
		if (r) {
			$.post(ctx + "/myCenter/deleteScoreRule.do", {
				srId : row.srId
			}, function(data) {
				if (data.success) {
					show_scoreRule_detail.dialog('close');
					admin_scoreRule_datagrid.datagrid('load');
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
