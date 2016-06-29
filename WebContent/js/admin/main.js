$(function() {
	init('');
});

function init(p) {
	$('#list_user')
			.datagrid(
					{
						title : '普通用户信息表',
						iconCls : 'icon-save',
						width : 'auto',
						height : 'auto',
						nowrap : false,
						striped : true,
						collapsible : true,
						url : ctx + '/getgriddata.do' + p,
						sortName : 'id',
						sortOrder : 'asc',
						remoteSort : false,
						idField : 'code',
						frozenColumns : [ [ {
							field : 'ck',
							checkbox : true
						}, {
							title : '编号',
							field : 'id',
							width : 70,
							sortable : true
						} ] ],
						columns : [
								[
										{
											title : '基本信息',
											colspan : 7
										}], [ {
									field : 'title',
									title : '用户名称',
									width : 100
								}, {
									field : 'authorid',
									title : '登录ID',
									width : 80,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'authorid',
									title : '密码',
									width : 80,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'authorid',
									title : '所属组织',
									width : 80,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'authorid',
									title : '昵称',
									width : 80,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'authorid',
									title : '邮箱',
									width : 160,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								} , {
									field : 'authorid',
									title : '移动电话',
									width : 80,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								},{
									field : 'opt',
									title : '操作',
									width : 120,
									align : 'center',
									rowspan : 2,
									formatter : function(value, rec) {
										return '<span style="color:red"><a href="javascript:sureDelete();" style="text-decoration:none;">删除</a></span>';
									}
								} ] ],
						pagination : true,
						rownumbers : true,
						toolbar : [ {
							id : 'btnadd',
							text : '添加用户',
							iconCls : 'icon-add',
							handler : function() {
								openAdd('add'); 
							}
						}, '-', {
							id : 'btnsave',
							text : '用户详细',
							iconCls : 'icon-search',
							handler : function() {
								 doMore(); 
							}
						} ]
					});
	var p = $('#list_user').datagrid('getPager');
	$(p).pagination({

	});
}

// 查询
function doSearch() {

	var selecttitle = $('#selecttitle').val();
	var selectauthorid = $('#selectauthorid').val();
	init('?selecttitle=' + selecttitle + '&selectauthorid=' + selectauthorid);
}

//清空表单
function doReset(fromid){
	$('#'+fromid).form('clear');

}

//关闭窗口
function doClose(winid){
	$("#"+winid).window('close');
}

//删除
function sureDelete() {
	$.messager.confirm('提示', '确认删除此条数据吗?', function(r) {
		if (r) {
			var selected = $('#list_user').datagrid('getSelected');
			if (selected) {
				location = ctx + "/deleteBlog.do?id=" + selected.id;
			}
		}
	});
}

//显示添加修改窗口
function openAdd(type){
	//添加窗口清空form表单
	if(type=="add"){
		doReset('addform');
	}else{
		//修改窗口form初始化数据
	    var rowsTemp = $('#list_table').datagrid('getSelections');
		if(rowsTemp!=null && rowsTemp.length!=1){
			$.messager.alert(info14,info20); 
			
			return false;
		}else{
			var row = $('#list_table').datagrid('getSelected');
			$('#addform').form('load', row);
		}
	}
	$('#user_add').window('open');
}
//添加修改
function doAddOrEdit(){
	var savemsg = "";
	var url = "";
	var id = $("#a_id").val();
	if(id==""){
		url=path+'/tablemng/saveTable.html';
		savemsg = info_10;
	}else{
		url=path+'/tablemng/editTable.html';
		savemsg = info_11;
	}
	$.messager.confirm(info_5,savemsg,function(r){
		if (r){
			$("#addform").form('submit',{
				url:url,
				onSubmit:function(){
					return doCheck();
				},
				success:function(data){
					var d = eval("("+data+")");
					if(d.success == "true"){
						$('#list_table').datagrid('reload');
						$('#list_table').datagrid('clearSelections');
						doClose('table_add');
						doReset("addform");
						$.messager.show( {
							title :info14,
							msg :d.message,
							timeout :3000,
							showType :'fade'
						});
					}else{
						$.messager.alert(info14,d.message);
					}
					
				}
			});
		}
	});
}

//详细信息
function doMore(){
	var rows = $('#list_user').datagrid('getSelections');
	if(rows!=null && rows.length!=1){
		$.messager.alert(info14,info20);
	}else{
		var row = $('#list_table').datagrid('getSelected');
//		$('#show_form').form('load', rows);
		$("#ddxxdh").html("桌席编号："+row.num);
		$("#ddxxzh").html("桌席名称："+row.name);
		$("#ddxxzj").html("最低消费："+row.roomleastpay);
		$("#ddxxxd").html("房间附加费："+row.roompay);
		$("#ddxxzk").html("核定人数："+row.plannum);
		$("#ddxxzkf").html("桌席状态："+row.statusName);
		$("#ddxxzt").html("桌席类别："+row.typeName);
		$('#shou_more').window('open');
	}
}

function addBlog() {
	var na = $("#id").val();
	var addr = $("#title").val();
	var code = $("#authorid").val();
	if (na == null || na == "") {
		alert("姓名不能为空！");
	} else if (addr == null || addr == "") {
		alert("地址不能为空！");
	} else if (code == null || code == "") {
		alert("邮编不能为空！");
	} else {
		$("#form1").submit();
	}
}

function append() {
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('append', {
		parent : (node ? node.target : null),
		data : [ {
			text : 'new1',
			checked : true
		}, {
			text : 'new2',
			state : 'closed',
			children : [ {
				text : 'subnew1'
			}, {
				text : 'subnew2'
			} ]
		} ]
	});
}

function remove() {
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('remove', node.target);
}

function collapse() {
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('collapse', node.target);
}

function expand() {
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('expand', node.target);
}

function showprocessorBar() {
	// 上传时显示进度条
	// 该方法被submitForm()调用
	$.get("getState.do?timestamp=" + new Date().getTime(), function(date) {
		processorBarCallBack();
	});
}

function processorBarCallBack() {
	// showprocessorBar方法的回调
	setTimeout("reshowprocessorBar()", 1000);
}

function reshowprocessorBar() {// 定时调用这个显示进度的function
	$.get("getState.do?timestamp=" + new Date().getTime(), function(data) {
		reprocessorBarCallBack(data);
	}, 'xml');
}

function reprocessorBarCallBack(returnXMLParam) {// 回调一下：）
	var returnXML = returnXMLParam;
	var percene = $(returnXML).find('percent').text()
	var showText = "进度是：" + $(returnXML).find('percent').text();
	showText = showText + "\n当前上传文件大小为："
			+ $(returnXML).find('uploadByte').text();
	showText = showText + "\n上传文件总大小为："
			+ $(returnXML).find('fileSizeByte').text();
	showText = showText + "\n当前上传文件为第：" + $(returnXML).find('fileIndex').text()
			+ "个";

	// 清空id为progr的DIV里面的数据，然后再添加
	$('#progr').empty();
	$('#progr').text(showText);

	var jidutiao = $('#jidutiao');

	// 设置进度条的长度
	if ((100 - parseInt(percene)) > 0) {
		$('#jidutiao').css('width', 100 - parseInt(percene) + "%");
	} else {
		$('#jidutiao').css('width', "100%");
	}

	setTimeout("reshowprocessorBar()", 1000);
}

var a = 0;

function file_change() {
	// 当文本域中的值改变时触发此方法
	var postfix = this.value.substring(this.value.lastIndexOf(".") + 1)
			.toUpperCase();
	// 判断扩展是否合法
	if (postfix == "JPG" || postfix == "GIF" || postfix == "PNG"
			|| postfix == "BMP" || postfix == "RAR" || postfix == "ZIP"
			|| postfix == "TXT" || postfix == "GHO" || postfix == "PDF") {
	} else {
		// 如果不合法就删除相应的file表单及br标签
		alert("您上传的文件类型不被支持，本系统只支持JPG,GIF,PNG,BMP,RAR,ZIP,TXT文件！");
		var testtest = $(this).attr('id');
		testtest = '#' + testtest;
		var sub_file = $(testtest);

		var next_a_ele = sub_file.next();// 取得a标记

		var br1_ele = $(next_a_ele).next();// 取得回车

		var br2_ele = $(br1_ele).next();// 取得回车

		$(br2_ele).remove();// 删除回车

		$(br1_ele).remove();// 删除回车

		$(next_a_ele).remove();// 删除a标签

		$(sub_file).remove();
		// 删除文本域，因为上传的文件类型出错，要删除动态创建的File表单

		return;

	}

}

function remove_file() {// 删除File表单域的方法
	// 删除表单
	var testtest = $(this).val();
	testtest = '#' + testtest;
	var sub_file = $(testtest);

	var next_a_ele = sub_file.next();// 取得a标记

	var br1_ele = $(next_a_ele).next();// 取得回车

	var br2_ele = $(br1_ele).next();// 取得回车

	$(br2_ele).remove();// 删除回车

	$(br1_ele).remove();// 删除回车

	$(next_a_ele).remove();// 删除a标签

	$(sub_file).remove();// 删除File标记

}

function f() {
	// 方法名为f的主要作用是不允许在File表单域中手动输入文件名，必须点“浏览”按钮
	return false;
}

function insertFile() {
	// 新建新的File表单
	var file_array = document.getElementsByTagName("input");

	var is_null = false;
	// 循环遍历判断是否有某一个File表单域的值为空
	for ( var i = 0; i < file_array.length; i++) {
		if (file_array[i].type == "file"
				&& file_array[i].name.substring(0, 15) == "fileUploadTools") {
			if (file_array[i].value == "") {
				alert("某一附件为空不能继续添加");
				is_null = true;
				break;

			}

		}

	}

	if (is_null) {
		return;
	}

	a++;
	// 新建file表单的基本信息
	var new_File_element = $('<input>');
	new_File_element.attr('type', 'file');
	new_File_element.attr('id', 'uploadFile' + a);
	new_File_element.attr('name', 'fileUploadTools.uploadFile');
	new_File_element.attr('size', 55);
	new_File_element.keydown(f);
	new_File_element.change(file_change);

	$('#fileForm').append(new_File_element);

	// 新建删除附件的a标签的基本信息
	var new_a_element = $('<a>');
	new_a_element.html("删除附件");
	new_a_element.attr('id', "a_" + new_File_element.name);
	new_a_element.attr('name', "a_" + new_File_element.name);
	new_a_element.val($(new_File_element).attr('id'));
	new_a_element.attr('href', "#");
	new_a_element.click(remove_file);
	$('#fileForm').append(new_a_element);

	var new_br_element = $("<br>");
	$('#fileForm').append(new_br_element);
	var new_br_element = $("<br>");
	$('#fileForm').append(new_br_element);
}

function submitForm() {
	setTimeout("showprocessorBar()", 2000);
	return true;
}