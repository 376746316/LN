<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>

<script type="text/javascript">
	//专业选课
	function show1() {

		location = "toSpecCourseNotChoiseed.do";
	}
	//普通选课
	function show2() {

		location = "toCourseNotChoiseed.do";
	}
	//在修专业课
	function show3() {

		location = "toOnStudySpecCourseList.do";
	}
	//普通在修
	function show4() {

		location = "toOnStudyCourseList.do";
	}
	//已修专业课
	function show5() {

		location = "toSpecCourseFinish.do";
	}

	//已修普通课
	function show6() {

		location = "toFinishedCourseForStu.do";
	}
	//直播课堂
	function show7() {

		location = "toStudentChoiseLivePlayerList.do";
	}
	//在线答疑
	function show8() {

		location = "toOnlineQuestionList.do";
	}
	//实时答疑
	function show9() {

		location = "toTimeDialog.do";
	}
</script>
</head>
<body>
	<div id="aa" class="easyui-accordion"
		style="width: 150px; height: 470px;">

		<div title="学习菜单" iconCls="icon-print" selected="true"
			style="padding: 10px; height: 420px">
			<a href="#" class="easyui-linkbutton" iconCls="icon-search"
				style="margin-top: 5px;" onclick="javascript:show1()">专业课选课</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-search"
				style="margin-top: 5px" onclick="javascript:show2()">普通课选课</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-ok"
				style="margin-top: 5px" onclick="javascript:show3()">在修专业课</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-ok"
				style="margin-top: 5px" onclick="javascript:show4()">在修普通课</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-print"
				style="margin-top: 5px" onclick="javascript:show5()">已修专业课</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-print"
				style="margin-top: 5px" onclick="javascript:show6()">已修普通课</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-tip"
				style="margin-top: 5px" onclick="javascript:show7()">直播课堂&nbsp;&nbsp;</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-help"
				style="margin-top: 5px" onclick="javascript:show8()">在线答疑&nbsp;&nbsp;</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-help"
				style="margin-top: 5px" onclick="javascript:show9()">实时答疑&nbsp;&nbsp;</a>
		</div>

	</div>
</body>
</html>