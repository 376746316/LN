$(function() {
	init('');
});

// 列表TITLE
function init(p) {
	$('#techTypeManageList')
			.treegrid(
					{
						width : 880,
						height : 308,
						nowrap : true,
						animate : true,
						treeField : 'text',
						url : ctx + '/getCbtTechType.do' + p,
						sortName : 'id',
						sortOrder : 'asc',
						remoteSort : false,
						idField : 'id',
						columns : [ [
								{
									title : '分类ID',
									field : 'id',
									width : 80,
									align : 'right'
								},
								{
									field : 'text',
									title : '分类名称',
									width : 350
								},
								{
									field : 'attributes',
									title : '分类编码',
									width : 200,
									align : 'right',
									formatter : function(value) {
										return value.techTypeCode;
									}
								},
								{
									field : 'opt',
									title : '操作',
									width : 200,
									align : 'center',
									formatter : function(value, rec) {
										return '<span style="color:red"><a href="javascript:openAdd(false);" style="text-decoration:none;">添加子类型</a>&nbsp;&nbsp;<a href="javascript:showUpd();" style="text-decoration:none;">修改</a>&nbsp;&nbsp;<a href="javascript:showDtl();" style="text-decoration:none;">详细</a>&nbsp;&nbsp;<a href="javascript:doDel();" style="text-decoration:none;">删除</a></span>';
									}
								} ] ],
						rownumbers : true,
						toolbar : [ {
							id : 'btnadd',
							text : '新建根类型',
							iconCls : 'icon-add',
							handler : function() {
								openAdd(true);
							}
						} ],
						rowStyler : function(rd) {
							var hidList = $("#hidList").val();
							if (hidList != "null") {
								idList = $("#hidList").val().split(',');
								for ( var i = 0; i < idList.length; i++) {
									if (rd.id == idList[i]) {
										return "background:#FBfCd6";
									}
								}
							}
							return "";
						},
						onLoadSuccess : function(d) {
							var hidList = $("#hidList").val();
							if (hidList != "null") {
								idList = $("#hidList").val().split(',');
								for ( var i = 0; i < idList.length; i++) {
									if ($('#techTypeManageList').treegrid(
											'getLevel', idList[i]) > 0) {

										$('#techTypeManageList').treegrid(
												'expandTo', idList[i]);
									}

								}

							}
						}

					});

}

// 清空表单
function clearForm(searchForm) {
	$('#' + searchForm).form('clear');
}

// 关闭窗口
function doClose(winid) {
	$("#" + winid).window('close');
	$('#techTypeManageList').datagrid('load');
}

// 查询
function doSearch() {
	var name = $("#seltechtypename").val();

	if ($.trim(name).length > 0) 
	{
		name = "?seltechtypename=" + encodeURI(encodeURI(name));
		
		location = ctx+"/techTypeManagejsp.do" + name;
	}
	else
	{
		$("#hidList").val("");
		init('');
	}
}

// open 新建页面
function openAdd(pm) {
	$('#typeMngAddForm').form('clear');
	if (pm) {
		$('#insTechTypeId').val(0);
	} else {
		var selected = $('#techTypeManageList').datagrid('getSelected');
		if (selected) {
			$('#insTechTypeId').val(selected.id);
		}
	}
	var winTop = ($(window).height() - 200) * 0.5;
	if (winTop < 10) {
		winTop = 10;
	}
	var winLeft = ($(window).width() - 600) * 0.5;
	if (winLeft < 10) {
		winLeft = 10;
	}
	$('#typeMngAddDiv').window({
		top : winTop,
		left : winLeft
	});
	$('#typeMngAddDiv').window('open');
}

// open 修改页面 + 传值
function showUpd() {
	var selected = $('#techTypeManageList').datagrid('getSelected');
	if (selected) 
   {
		var param={
				techTypeId:selected.id
				,flag:1
		};
		$.post("selTypeMng.do",param,function(resp){
			var tpMsg = JSON.parse(resp);
			$("#updTechTypeId").val(tpMsg.techTypeId);
			$("#updTypeName").val(tpMsg.techTypeName);
			$("#updTypeLevel").val(tpMsg.techTypeLevel);
			$("#updTypeCode").val(tpMsg.techTypeCode);
			$("#updTypeSeq").val(tpMsg.techTypeSeq);
			$('#typeMngUpdDiv').window('open');
		});
	}
	else
	{
		alert("请选择数据");
	}
}

// open 详细页面 + 传值
function showDtl() {
	var selected = $('#techTypeManageList').datagrid('getSelected');
	if (selected) 
 {
		var param={
				techTypeId:selected.id
				,flag:1
		};
		$.post("selTypeMng.do",param,function(resp){
			var tpMsg = JSON.parse(resp);
			$("#dtlTypeName").text(tpMsg.techTypeName);
			$("#dtlTypeLevel").text(tpMsg.techTypeLevel);
			$("#dtlTypeCode").text(tpMsg.techTypeCode);
			$("#dtlTypeSeq").text(tpMsg.techTypeSeq);
			$('#typeMngDtlDiv').window('open');
		});
	}
	else
	{
		alert("请选择数据");
	}
}

// 添加提交
function doSubmitAdd() {
	if ($("#typeMngAddForm").form('validate')) {

		$("#typeMngAddForm").form('submit', {
			success : function(rsp) {
			    $('#techTypeManageList').treegrid('reload');
				$.messager.show({
					title:'操作提示',
					msg:'数据新建成功!',
					timeout:5000,
					showType:'slide'
				});
				init('');
			},
			onLoadError : function(resp) {
				$.messager.show({
					title:'操作提示',
					msg:'数据新建失败，请重新操作!',
					timeout:5000,
					showType:'slide'
				});
				$('#techTypeManageList').datagrid('reload');
			}
		});
		$('#typeMngAddDiv').window('close');
	}
}

// 修改提交
function doSubmitUpd() {
	if ($("#typeMngUpdForm").form('validate')) {
		var updTechTypeId =$("#updTechTypeId").val();
		var updTypeName = $("#updTypeName").val();
		var updTypeLevel =$("#updTypeLevel").val();
		var updTypeCode = $("#updTypeCode").val();
		var updTypeSeq = $("#updTypeSeq").val();
		$('#typeMngUpdDiv').window('close');
		var param={
				updTechTypeId:updTechTypeId
				,updTypeName:updTypeName
				,updTypeLevel:updTypeLevel
				,updTypeCode:updTypeCode
				,updTypeSeq:updTypeSeq		
		};
		$.post("updTypeMng.do",param,function(resp){
			init('');
			$.messager.show({
				title:'操作提示',
				msg:resp,
				timeout:5000,
				showType:'slide'
			});
		});
	}
}

// 删除
function doDel() {
	$.messager.confirm('提示', '确认删除此条数据吗?', function(r) {
		if (r) {
			var selected = $('#techTypeManageList').datagrid('getSelected');
			var techTypeId = selected.id;
			if (selected) {
				var param = {
					techTypeId:techTypeId
				};
				$.post("delTypeMng.do",param,function(data){
					var map = JSON.parse(data);
					alert(map.message);
					init('');
				});
			}
		}
	});
}
