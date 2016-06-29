$(function() {
	createTable();
});
function createTable() {
	$('#playList_datagrid').datagrid({
		title : '成长阶段栏目',
		iconCls : 'icon-tip',
		width : '1055',
		height : '390',
		nowrap : true,
		striped : true,
		pageNumber : 1,
		collapsible : false,
		singleSelect : true,
		url : ctx + '/getAllPlayList.do',
		sortName : 'listId',
		sortOrder : 'asc',
		remoteSort : false,
		idField : 'code',
		frozenColumns : [ [ {
			title : '编号',
			field : 'listId',
			width : 70,
			sortable : true,
			align : 'center'
		} ] ],
		columns : [ [ {
			title : '基本信息',
			colspan : 4
		}, {
			field : 'opt',
			title : '操作',
			width : 120,
			align : 'center',
			rowspan : 2,
			formatter : function(value, rowDate, rowIndex) {
				var url = '<span><a href="javascript:toMngVideos();" style="text-decoration:none;">管理栏目</a>&nbsp;<a href="javascript:sureDelete();" style="text-decoration:none;">删除</a>&nbsp;<a href="javascript:toUpdate();" style="text-decoration:none;">修改</a></span>';
				return url;
			}
		} ], [ {
			field : 'listName',
			title : '名称',
			width : 200,
			align : 'center'
		}, {
			field : 'listAnthor',
			title : '作者',
			width : 80,
			align : 'center'
		}, {
			field : 'listInfo',
			title : '简介',
			width : 400,
			align : 'center'
		}, {
			field : 'listUpdatetime',
			title : '更新时间',
			width : 150,
			align : 'center'
		} ] ],
		pagination : true,
		rownumbers : true,
		toolbar : [ {
			id : 'btnadd',
			text : '添加栏目',
			iconCls : 'icon-add',
			handler : function() {
				addNewPlayList();
			}
		} ]
	});
}

function addNewPlayList() {
	location.href = ctx + "/toEditPlayList.do";
}
function toMngVideos() {
	var selected = $('#playList_datagrid').datagrid('getSelected');
	if (selected) {
		location.href = ctx + "/toMngPlayListVideos.do?listId="+selected.listId;
	}
}
// 查询
function doSearch() {
	var listName = encodeURI(encodeURI($("#listName").val()));
	var opt = $('#playList_datagrid').datagrid('options');
	opt.url = ctx + '/getAllPlayList.do?listName=' + listName;
	$('#playList_datagrid').datagrid('load');
}

// 重置
function doReset() {
	$("#listName").val("");
	var opt = $('#playList_datagrid').datagrid('options');
	opt.url = ctx + '/getAllPlayList.do';
	$('#playList_datagrid').datagrid('load');
}
// 删除直播
function sureDelete() {
	$.messager.confirm('提示', '确认删除此条数据吗?', function(r) {
		if (r) {
			var selected = $('#playList_datagrid').datagrid('getSelected');
			if (selected) {
				var parm = {
					listId : selected.listId
				};
				$.post(ctx + "/deletePlayList.do", parm, function(data) {
					$('#playList_datagrid').datagrid("reload");
					$.messager.show({
						title : "删除提示",
						timeout : 2000,
						msg : data
					});
				}).error(function() {
					$.messager.alert("提示", "系统繁忙，请刷新后重试！", "warning");
				});
			}
		}
	});
}

// 修改
function toUpdate() {
	var selected = $('#playList_datagrid').datagrid('getSelected');
	if (selected) {
		location.href = ctx + "/toEditPlayList.do?listId=" + selected.listId;
	}

}
