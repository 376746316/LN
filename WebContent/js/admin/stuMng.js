//学生管理js

$(function() {
	init('');
	loadCbx_stuOrg();
	// 加载省
	loadCbx_stuProvince();

	loadCbx_stuMajor();
	loadCbx_stuClass('');
	loadCbx_stuSchool();
	loadCbx_stuType();
	loadCbx_stuTechDir();
	loadCbx_s_stuOrg();

	$('#addform').form({
		url : '',
		onSubmit : function() {
		},
		success : function(data) {
		}
	});

	$("#stumngfileupload").uploadify({
		width : 85,
		height : 24,
		queueID : 'uploadQueue	',
		multi : true,
		swf : ctx + '/images/uploadify/uploadify.swf',
		auto : false,
		uploader : ctx + '/importStuByExcel.do;jsessionid=' + sessionid,
		fileSizeLimit : '512000KB',
		fileTypeExts : '*.*',
		cancelImg : ctx + '/images/uploadify/uploadify-cancel.png',
		uploadLimit : 10,
		onUploadSuccess : function(file, data, response) {
			$.messager.alert('提示', data, 'confirm');
		},
		onQueueComplete : function(queueData) {
			$("#uploadDiv").window('close');

		},
		onClearQueue : function(queueItemCount) {
			$("#uploadDiv").window('close');
		}
	});

	$('.uploadify-button').empty();
	$('.uploadify-button').append(
			'<a name="uploadify-lb" href="javascript:void(0)">选择文件</a>');
	$('.uploadify-button').removeClass();
	$('a[name="uploadify-lb"]').linkbutton();
	$('#stumngfileupload').css('float','left');

});

// ---->>初始化DatGrid
function init(p) {
	p = encodeURI(encodeURI(p));
	$('#list_user').datagrid({
		title : '学生信息表',
		iconCls : 'icon-save',
		width : 'auto',
		height : '420',
		nowrap : false,
		striped : true,
		singleSelect : true,
		collapsible : true,
		url : ctx + '/getStuList.do' + p,
		queryParams : {
			s_stuName : $.trim($("#s_stuName").val()),
			s_stuOrg : $.trim($("#s_stuOrg").combobox('getValue'))
		},
		sortName : 'id',
		sortOrder : 'asc',
		remoteSort : false,
		idField : 'code',
		rownumbers : true,
		frozenColumns : [ [ {
			field : 'ck',
			checkbox : true
		}, {
			title : '学号',
			field : 'stuNum',
			align : 'center',
			width : 80,
			sortable : true
		} ] ],
		columns : [ [ {
			title : '基本信息',
			colspan : 8
		} ], [ {
			field : 'stuName',
			title : '姓名',
			width : 80,
			rowspan : 2,
			align : 'center',
			sortable : true,
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'stuPhone',
			title : '联系电话',
			width : 110,
			rowspan : 2,
			sortable : true,
			align : 'center',
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'stuUserid',
			title : '登录ID',
			width : 110,
			rowspan : 2,
			sortable : true,
			align : 'center',
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'stuPwd',
			title : '密码',
			width : 80,
			rowspan : 2,
			sortable : true,
			align : 'center',
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'orgName',
			title : '所属组织(学校)',
			width : 150,
			rowspan : 2,
			sortable : true,
			align : 'center',
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'className',
			title : '所属班级',
			width : 130,
			rowspan : 2,
			sortable : true,
			align : 'center',
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'stuLink',
			title : '家庭联系人',
			width : 80,
			rowspan : 2,
			sortable : true,
			align : 'center',
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'stuLinkTel',
			title : '家庭联系方式',
			width : 110,
			rowspan : 2,
			sortable : true,
			align : 'center',
			sorter : function(a, b) {
				return (a > b ? 1 : -1);
			}
		}, {
			field : 'opt',
			title : '操作',
			width : 120,
			align : 'center',
			rowspan : 4,
			formatter : function(value, rec) {
				return '<a href="javascript:openEdit();" style="text-decoration:none;">编辑</a>&nbsp;&nbsp;' + '<a href="javascript:sureDelete();" style="text-decoration:none;">删除</a>';

			}
		} ] ],
		pagination : true,
		toolbar : [ {
			id : 'btnadd',
			text : '添加学生',
			iconCls : 'icon-add',
			handler : function() {
				openAdd('add');
			}
		}, '-', {
			id : 'btnExcel',
			text : '导入Excel',
			iconCls : 'icon-print',
			handler : function() {
				$('#uploadDiv').window('open');
			}
		} ]
	});

}

// 查询
function doSearch() {
	var opts = $('#list_user').datagrid('options');

	opts.queryParams = {
		s_stuName : s_stuName = $("#s_stuName").val(),
		s_stuOrg : $('#s_stuOrg').combobox('getValue')
	};

	$('#list_user').datagrid('load');

}

// ---->> 所属组织
function loadCbx_stuOrg() {
	$('#stuOrgid').combobox({
		// required : true,
		panelHeight : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getStuOrgIdCbox.do',
		textField : 'orgName',
		valueField : 'orgId',
		onChange : function(newV, oldV) {
			$('#stuSchoolId').combobox('select', '');
			loadCbx_stuClass('?orgId=' + newV);
		}
	});
}

// ---->> 所属学校
function loadCbx_stuSchool() {
	$('#stuSchoolId').combobox({
		// required : true,
		panelHeight : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getStuOrgIdCbox.do',
		textField : 'orgName',
		valueField : 'orgId',
		onChange : function(newV, oldV) {
			$('#stuOrgid').combobox('select', '');
			loadCbx_stuClass('?orgId=' + newV);
		}
	});
}
// ---->> 学生班级
function loadCbx_stuClass(orgId) {

	$('#stuClassId').combobox({
		// required : true,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getStuClassCbx.do' + orgId,
		valueField : 'classId',
		textField : 'className'
	});
}

function loadCbx_s_stuOrg() {

	$('#s_stuOrg').combobox({
		// required : true,
		panelHeight : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getStuOrgIdCbox.do',
		textField : 'orgName',
		valueField : 'orgId'
	});
}

// ---->>所属省
function loadCbx_stuProvince() {

	$('#s_province').combobox({
		// required : true,
		panelHeight : 210,
		editable : false,
		missingMessage : '请选择一个地区',
		url : ctx + '/getStuProvince.do',
		textField : 'areaName',
		valueField : 'areaCode',
		onChange : loadCbx_stuArea
	});
}

// ---->> 所属地区
function loadCbx_stuArea(newValue, oldValue) {

	var parentId = $("#s_province").combobox('getValue');

	$('#areaCode').combobox({
		// required : true,
		panelHeight : 210,
		editable : false,
		missingMessage : '请选择一个地区',
		url : ctx + '/getStuAreaCbox.do?parentId=' + parentId,
		textField : 'areaName',
		valueField : 'areaCode'
	});
}
// ---->> 学生性质
function loadCbx_stuType() {

	$('#stuType').combobox({
		// required : true,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getStuTypeCbx.do?parentparamid=12',
		valueField : 'param_id',
		textField : 'param_name'
	});
}
// ---->> 学生技术方向 from xml
function loadCbx_stuTechDir() {

	$('#stuTechDirect').combobox({
		// required : true,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getStuTechDirCbx.do?parentparamid=6',
		valueField : 'param_id',
		textField : 'param_name'
	});
}

// ---->> 学生专业
function loadCbx_stuMajor() {

	$('#stuMajor').combobox({
		// required : true,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getStuMajorCbx.do',
		valueField : 'majorCode',
		textField : 'majorName'
	});
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
				location = ctx + "/deleteStu.do?stuNo=" + selected.stuNo;
			}
		}
	});
}

// 显示添加
function openAdd(type) {
	// 添加窗口清空form表单
	if (type == "add") {
		doReset('addform');
		$('#isUpdate').val('addStu.do');
		$('#stuUserid').validatebox({
			required : true,
			validType : "remote['toValidStuUserId.do','userId']",
			invalidMessage : '登录ID已存在或非法（允许字母数字下划线，允许6-16字节）'
		});
		$('#stuUserid').removeAttr('disabled');
		$('#user_add').window('open');
	}
}

// 显示修改
function openEdit() {
	var selected = $('#list_user').datagrid('getSelected');
	if (selected) {
		$('#isUpdate').val('updateStu.do');
		$('#stuUserid').validatebox({
			required : true,
			validType : null
		});
		$('#stuUserid').attr('disabled', 'disabled');
		$('#addform').form('load', selected);

		$('#s_province').combobox('select', selected.provinceCode);
		$('#areaCode').combobox('select', selected.areaCode);

		$('#user_add').window('open');
	}
}
// 添加
function doAdd() {
	if ($('#addform').form('validate')) {
		// 入园时间
		var stuJoinBase = $("#stuJoinBase").datebox('getValue');
		if ($.trim(stuJoinBase) == "") {
			stuJoinBase = null;
		}
		// 入学时间
		var stuEnrol = $("#stuEnrol").datebox('getValue');
		if ($.trim(stuEnrol) == "") {
			stuEnrol = null;
		}
		// 毕业时间
		var stuGradeuate = $("#stuGradeuate").datebox('getValue');
		if ($.trim(stuGradeuate) == "") {
			stuGradeuate = null;
		}
		var stuBirth = $("#stuBirth").datebox('getValue');
		if ($.trim(stuBirth) == "") {
			stuBirth = null;
		}
		var stuNo = $("#stuNo").val();
		if ($.trim(stuNo) == "") {
			stuNo = null;
		}
		var stuNum = $("#stuNum").val();
		if ($.trim(stuNum) == "") {
			stuNum = null;
		}
		var stuOrgid = $("#stuOrgid").combobox('getValue');
		if ($.trim(stuOrgid) == "") {
			stuOrgid = null;
		}
		var stuName = $("#stuName").val();
		if ($.trim(stuName) == "") {
			stuName = null;
		}
		var stuUserid = $("#stuUserid").val();
		if ($.trim(stuUserid) == "") {
			stuUserid = null;
		}
		var stuPwd = $("#stuPwd").val();
		if ($.trim(stuPwd) == "") {
			stuPwd = null;
		}
		var stuNickname = $("#stuNickname").val();
		if ($.trim(stuNickname) == "") {
			stuNickname = null;
		}
		var stuMobile = $("#stuMobile").val();
		if ($.trim(stuMobile) == "") {
			stuMobile = null;
		}
		var stuPhone = $("#stuPhone").val();
		if ($.trim(stuPhone) == "") {
			stuPhone = null;
		}
		var stuMail = $("#stuMail").val();
		if ($.trim(stuMail) == "") {
			stuMail = null;
		}
		var stuQq = $("#stuQq").val();
		if ($.trim(stuQq) == "") {
			stuQq = null;
		}
		var stuGrpQq = $("#stuGrpQq").val();
		if ($.trim(stuGrpQq) == "") {
			stuGrpQq = null;
		}
		var stuSex = $("#stuSex").combobox('getValue');
		if ($.trim(stuSex) == "") {
			stuSex = null;
		}
		var stuTitle = $("#stuTitle").val();
		if ($.trim(stuTitle) == "") {
			stuTitle = null;
		}
		var stuAddress = $("#stuAddress").val();
		if ($.trim(stuAddress) == "") {
			stuAddress = null;
		}
		var stuPostcode = $("#stuPostcode").val();
		if ($.trim(stuPostcode) == "") {
			stuPostcode = null;
		}
		var stuIsLeader = $("#stuIsLeader").combobox('getValue');
		if ($.trim(stuIsLeader) == "") {
			stuIsLeader = null;
		}
		var stuEduLevel = $("#stuEduLevel").combobox('getValue');
		if ($.trim(stuEduLevel) == "") {
			stuEduLevel = null;
		}
		var stuIdcard = $("#stuIdcard").val();
		if ($.trim(stuIdcard) == "") {
			stuIdcard = null;
		}
		var stuMajor = $("#stuMajor").combobox('getValue');
		if ($.trim(stuMajor) == "") {
			stuMajor = null;
		}
		var stuClassId = $("#stuClassId").combobox('getValue');
		if ($.trim(stuClassId) == "") {
			stuClassId = null;
		}
		var areaCode = $("#areaCode").combobox('getValue');
		if ($.trim(areaCode) == "") {
			areaCode = null;
		}
		var stuSchoolId = $("#stuSchoolId").combobox('getValue');
		if ($.trim(stuSchoolId) == "") {
			stuSchoolId = null;
		}
		var stuPolitic = $("#stuPolitic").combobox('getValue');
		if ($.trim(stuPolitic) == "") {
			stuPolitic = null;
		}
		var stuTechDirect = $("#stuTechDirect").combobox('getValue');
		if ($.trim(stuTechDirect) == "") {
			stuTechDirect = null;
		}
		var stuType = $("#stuType").combobox('getValue');
		if ($.trim(stuType) == "") {
			stuType = null;
		}
		var stuGrade = $("#stuGrade").val();
		if ($.trim(stuGrade) == "") {
			stuGrade = null;
		}
		var stuLink = $("#stuLink").val();
		if ($.trim(stuLink) == "") {
			stuLink = null;
		}
		var stuLinkTel = $("#stuLinkTel").val();
		if ($.trim(stuLinkTel) == "") {
			stuLinkTel = null;
		}
		var stuCycle = $("#stuCycle").val();
		if ($.trim(stuCycle) == "") {
			stuCycle = null;
		}
		var stuTimeCard = $("#stuTimeCard").val();
		if ($.trim(stuTimeCard) == "") {
			stuTimeCard = null;
		}
		var stuHobby = $("#stuHobby").val();
		if ($.trim(stuHobby) == "") {
			stuHobby = null;
		}
		var stuMark = $("#stuMark").val();
		if ($.trim(stuMark) == "") {
			stuMark = null;
		}
		var stuTrain = $("#stuTrain").val();
		if ($.trim(stuTrain) == "") {
			stuTrain = null;
		}
		var stuObj = {
			stuNo : stuNo,
			stuNum : stuNum,
			stuOrgid : stuOrgid,
			stuName : stuName,
			stuUserid : stuUserid,
			stuPwd : stuPwd,
			stuNickname : stuNickname,
			stuMobile : stuMobile,
			stuPhone : stuPhone,
			stuMail : stuMail,
			stuQq : stuQq,
			stuGrpQq : stuGrpQq,
			stuSex : stuSex,
			stuTitle : stuTitle,
			stuAddress : stuAddress,
			stuPostcode : stuPostcode,
			stuIsLeader : stuIsLeader,
			stuEduLevel : stuEduLevel,
			stuIdcard : stuIdcard,
			stuMajor : stuMajor,
			stuClassId : stuClassId,
			areaCode : areaCode,
			stuSchoolId : stuSchoolId,
			stuGrade : stuGrade,
			stuPolitic : stuPolitic,
			stuTechDirect : stuTechDirect,
			stuLink : stuLink,
			stuLinkTel : stuLinkTel,
			stuEnrol : stuEnrol,
			stuJoinBase : stuJoinBase,
			stuGradeuate : stuGradeuate,
			stuBirth : stuBirth,
			stuCycle : stuCycle,
			stuTimeCard : stuTimeCard,
			stuHobby : stuHobby,
			stuType : stuType,
			stuMark : stuMark,
			stuTrain : stuTrain
		};

		var param = new Object();
		param["json"] = JSON.stringify(stuObj);

		$.post($('#isUpdate').val(), param, function(rsp) {
			if (rsp == "success") {
				msgSlider('操作成功！');

				$('#list_user').datagrid('clearSelections');
				$('#list_user').datagrid('reload');
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

function getRootPath() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
	// projectName = ctx;
	return (localhostPaht + projectName);
}

function uploadify() {
	$("#stumngfileupload").uploadify({
		'height' : 28,
		'width' : 80,
		'buttonText' : '上传excel',
		'swf' : getRootPath() + '/images/uploadify/uploadify.swf?ver=' + Math.random(),
		'uploader' : getRootPath() + '/importStuByExcel.do;jsessionid=' + sessionid,
		'auto' : false,
		'fileSizeLimit' : '512000KB',
		'fileTypeExts' : '*.xls;*.xls;',
		'cancelImg' : ctx + '/images/uploadify/uploadify-cancel.png',
		'uploadLimit' : 345,
		'onUploadStart' : function(file) {

		},
		'onUploadSuccess' : function(file, data, response) {

		},
		'onUploadComplete' : function() {

		}
	});
}

// ---- >> 下载学生信息模板
function doDownLoad() {

	location = 'upload/demo.xlsx';
}

// ----->> 导入信息
function doEnter() {

	$('#uploadDiv').window('open');
}

$.extend($.fn.validatebox.defaults.rules, {
	minLength : { // 判断最小长度
		validator : function(value, param) {
			return value.length >= param[0];
		},
		message : '最少输入 {0} 个字符。'
	},
	length : {
		validator : function(value, param) {
			var len = $.trim(value).length;
			return len >= param[0] && len <= param[1];
		},
		message : "输入内容长度必须介于{0}和{1}之间."
	},
	phone : {// 验证电话号码
		validator : function(value) {
			return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value);
		},
		message : '格式不正确,请使用下面格式:020-88888888'
	},
	mobile : {// 验证手机号码
		validator : function(value) {
			return /^(13|15|18)\d{9}$/i.test(value);
		},
		message : '手机号码格式不正确'
	},
	idcard : {// 验证身份证
		validator : function(value) {
			return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
		},
		message : '身份证号码格式不正确'
	},
	intOrFloat : {// 验证整数或小数
		validator : function(value) {
			return /^\d+(\.\d+)?$/i.test(value);
		},
		message : '请输入数字，并确保格式正确'
	},
	currency : {// 验证货币
		validator : function(value) {
			return /^\d+(\.\d+)?$/i.test(value);
		},
		message : '货币格式不正确'
	},
	qq : {// 验证QQ,从10000开始
		validator : function(value) {
			return /^[1-9]\d{4,9}$/i.test(value);
		},
		message : 'QQ号码格式不正确'
	},
	integer : {// 验证整数
		validator : function(value) {
			return /^[+]?[1-9]+\d*$/i.test(value);
		},
		message : '请输入整数'
	},
	chinese : {// 验证中文
		validator : function(value) {
			return /^[\u0391-\uFFE5]+$/i.test(value);
		},
		message : '请输入中文'
	},
	english : {// 验证英语
		validator : function(value) {
			return /^[A-Za-z]+$/i.test(value);
		},
		message : '请输入英文'
	},
	unnormal : {// 验证是否包含空格和非法字符
		validator : function(value) {
			return /.+/i.test(value);
		},
		message : '输入值不能为空和包含其他非法字符'
	},
	username : {// 验证用户名
		validator : function(value) {
			return /^[a-zA-Z][a-zA-Z0-9_]{5,15}$/i.test(value);
		},
		message : '用户名不合法（字母开头，允许6-16字节，允许字母数字下划线）'
	},
	faxno : {// 验证传真
		validator : function(value) {
			// return /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[
			// ]){1,12})+$/i.test(value);
			return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value);
		},
		message : '传真号码不正确'
	},
	zip : {// 验证邮政编码
		validator : function(value) {
			return /^[1-9]\d{5}$/i.test(value);
		},
		message : '邮政编码格式不正确'
	},
	ip : {// 验证IP地址
		validator : function(value) {
			return /d+.d+.d+.d+/i.test(value);
		},
		message : 'IP地址格式不正确'
	},
	name : {// 验证姓名，可以是中文或英文
		validator : function(value) {
			return /^[\u0391-\uFFE5]+$/i.test(value) | /^\w+[\w\s]+\w+$/i.test(value);
		},
		message : '请输入姓名'
	},
	carNo : {
		validator : function(value) {
			return /^[\u4E00-\u9FA5][\da-zA-Z]{6}$/.test(value);
		},
		message : '车牌号码无效（例：粤J12350）'
	},
	carenergin : {
		validator : function(value) {
			return /^[a-zA-Z0-9]{16}$/.test(value);
		},
		message : '发动机型号无效(例：FG6H012345654584)'
	},
	email : {
		validator : function(value) {
			return /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value);
		},
		message : '请输入有效的电子邮件账号(例：abc@126.com)'
	},
	msn : {
		validator : function(value) {
			return /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value);
		},
		message : '请输入有效的msn账号(例：abc@hotnail(msn/live).com)'
	},
	same : {
		validator : function(value, param) {
			if ($("#" + param[0]).val() != "" && value != "") {
				return $("#" + param[0]).val() == value;
			} else {
				return true;
			}
		},
		message : '两次输入的密码不一致！'
	}
});
