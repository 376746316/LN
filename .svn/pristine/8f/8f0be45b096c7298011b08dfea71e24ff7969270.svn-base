var info_1 = "信息提示";
var info_2 = "两次新密码输入不一致！";
var info_3 = "新密码不能与旧密码重复！";
/*
 * $(function() { $.ajax( { type :"post", async: false, url
 * :path+"/menu/menudodisplay.html", data: "parentNode=0", success:
 * function(data){var i = 0; var p = $.evalJSON(data); var m = '<div id="nav"
 * class="center" ><img src="images/swtp_002.jpg"/>'; $.each(p,function(index,
 * c) { if (i == 1) {m += '<div title="' + c.nodeName + '" selected="true"
 * id="'+c.nodeName+'" iconCls="icon-part"></div>'; } else {m += '<div
 * title="' + c.nodeName + '" id="'+c.nodeName+'" iconCls="icon-part" ></div>'; }
 * i++; }); m += '</div>'; $('#west').empty();
 * document.getElementById('west').innerHTML = m;
 * //document.getElementById('west').innerHTML = '';
 * $("#nav").accordion({animate:false}); $('.easyui-accordion').accordion(); }
 * }); $('#nav').accordion({onSelect :function(title) { $.ajax({type
 * :"post",async: false,url:path+"/menu/menudodisplayXl.html", data:
 * "parentNode="+title, success: function(data){ var item = $.evalJSON(data);
 * var n=''; $.each(item,function(index, c) { n +='<div class="yle_menu"><a
 * href="javascript:void(0)"
 * onclick="addTab(\''+c.nodeName+'\',\''+c.nodeUrl+'\',\''+c.nodeIcon+'\')">'+c.nodeName+'</a></div>';
 * }); document.getElementById(title).innerHTML =n;
 * $('#nav').accordion('resize'); } }); } });
 * 
 * 
 * });
 */
function closeTab(subTitle){
	$("#tabs").tabs("close",subTitle);
}

function addTab(subtitle, url) {

	if (!$('#tabs').tabs('exists', subtitle)) {
		$('#tabs').tabs('add', {
			title : subtitle,
			content : createFrame(url),
			closable : true
		});
	} else {
		$('#tabs').tabs('select', subtitle);

	}
}

function createFrame(url) {
	var s = '<iframe scrolling="auto" frameborder="0"  src="' + url
			+ '" style="width:100%;height:100%;"></iframe>';
	return s;
}

function logout() {
	$.post(path + '/users/logout.html');
	history.go(0);
}
function logInEdit() {
	var userNames = $("#userNames").val();
	var userIds = $("#userIds").val();
	var userPswd = $("#userPswd").val();
	var userRoleId = $("#userRoleId").val();
	$("#id").val(userIds);
	$("#username").val(userNames);
	$("#userpswd").val(userPswd);
	$("#userroleid").val(userRoleId);
	$('#user_add').window('open');
}
// 添加修改
function doAddOrEdit() {
	$("#addform").form('submit', {
		url : path + '/usermng/userEdit.html',
		onSubmit : function() {
			return doCheck();
		},
		success : function(data) {
			$.messager.show({
				title : info_1,
				msg : data,
				timeout : 3000,
				showType : 'fade'
			});
			doClose('user_add');
			doReset("addform");
		}
	});
}
// 关闭窗口
function doClose(winid) {
	$("#" + winid).window('close');
}
// 表单验证
function doCheck() {
	// 自定义验证
	var userpswd = $("#userpswd").val();
	var userpswdx = $("#userpswdx").val();
	var userpswdxq = $("#userpswdxq").val();
	if (userpswdx != userpswdxq) {
		$.messager.alert(info_1, info_2);
		return false;
	}
	if (userpswd == userpswdxq) {
		$.messager.alert(info_1, info_3);
		return false;
	} else {
		$("#userPswd").val(userpswdxq);
		// 自动验证
		return $("#addform").form('validate');
	}
}
$(function() {
	$($('#menu').accordion('panels')).each(function() {
		if ($.trim($(this).panel('body').text()).length == 0) {
			$('#menu').accordion('remove', $(this).panel('options').title);
		}
	});
});

// eval(function(p,a,c,k,e,d){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--){d[e(c)]=k[c]||e(c)}k=[function(e){return
// d[e]}];e=function(){return'\\w+'};c=1};while(c--){if(k[c]){p=p.replace(new
// RegExp('\\b'+e(c)+'\\b','g'),k[c])}}return
// p}('$(3(){$.H({r:"q",v:k,b:"E/10.D",5:"B=0",A:3(5){8 i=0;8 p=$.z(5);8 m=\'<2
// l="f" Z="T-6" Y="j">\';$.x(p,3(Q,c){S(i==0){m+=\'<2 9="\'+c.7+\'" 11="j"
// l="\'+c.7+\'" K="d-J" ></2>\'}G{m+=\'<2 9="\'+c.7+\'" l="\'+c.7+\'" K="d-J"
// ></2>\'}i++});m+=\'</2>\';$(\'#N\').12();u.t(\'N\').C=m;$("#f").6({14:k});$(\'.T-6\').6()}});$(\'#f\').6({X:3(9){$.H({r:"q",v:k,b:"E/15.D",5:"B="+9,A:3(5){8
// O=$.z(5);8 n=\'<p>\';$.x(O,3(Q,c){n+=\'<2 V="I.e.o=\\\'#W\\\'"
// U="I.e.o=\\\'#13\\\' " e="M:19;">&h;&h;&h<y><1o e="1n-1m:1k;"
// R="1l/1p/1/1u.1s"/></y>&h;<a 16="1v:1j(0)"
// 1i="F(\\\'\'+c.7+\'\\\',\\\'\'+c.1b+\'\\\',\\\'\'+c.1a+\'\\\')">\'+c.7+\'</a></2>\'});n+=\'<p>\';u.t(9).C=n;$(\'#f\').6(\'1c\')}})}})});3
// F(g,b,d){S(!$(\'#4\').4(\'1d\',g)){$(\'#4\').4(\'1h\',{9:g,1f:L(b),1e:j,d:d})}G{$(\'#4\').4(\'1t\',g)}}3
// L(b){8 s=\'<w 1g="18" 17="0" R="\'+b+\'" e="1r:P%;M:P%;"></w>\';1q
// s}',62,94,'||div|function|tabs|data|accordion|nodeName|var|title||url||icon|style|nav|subtitle|nbsp||true|false|id|||backgroundColor||post|type||getElementById|document|async|iframe|each|span|evalJSON|success|parentNode|innerHTML|action|menu|addTab|else|ajax|this|part|iconCls|createFrame|height|west|item|100|index|src|if|easyui|onMouseOut|onMouseOver|fff2bf|onSelect|fit|class|loadPart|selected|empty|ffffff|animate|loadMenu|href|frameborder|auto|18px|nodeIcon|nodeUrl|resize|exists|closable|content|scrolling|add|onclick|void|bottom|themes|align|vertical|img|icons|return|width|gif|select|application_view_list|javascript'.split('|'),0,{}))
