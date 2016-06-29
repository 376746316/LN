<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>jQuery MENU by http://www.jb51.net</title>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$("ul.sidenav li").hover(function() {
			$(this).find("div").stop().animate({
				left : "210",
				opacity : 1
			}, "fast").css("display", "block")

		}, function() {
			$(this).find("div").stop().animate({
				left : "0",
				opacity : 0
			}, "fast")
		});

	});
</script>
<style type="text/css">
body {
	background: #FFFFFF;
	font: 10px Verdana, Arial, Helvetica, sans-serif;
	margin: 0;
	padding: 0;
}

a:focus {
	outline: none;
}

* {
	margin: 0;
	padding: 0;
}

h1 {
	font: 4.7em normal Georgia, 'Times New Roman', Times, serif;
	color: #fff;
	margin-bottom: 20px;
}

h1 small {
	font: 0.2em normal Verdana, Arial, Helvetica, sans-serif;
	text-transform: uppercase;
	letter-spacing: 1.5em;
	display: block;
	color: #fff;
}

h2 {
	font: 2em normal Georgia, 'Times New Roman', Times, serif;
}

.container {
	margin: 0 auto;
	width: 900px;
	background: #FFFFFF;
	overflow: hidden;
	padding: 20px;
}

.content {
	width: 639px;
	padding: 20px;
	margin-left: 20px;
	color: #ddd;
	font-size: 1.2em;
	float: left;
	border-left: 1px dashed #62b21d;
}

.content p {
	line-height: 1.6em;
	margin: 5px 0;
	padding: 5px 0;
}

ul.sidenav {
	float: left;
	margin: 10px 0 0;
	padding: 0;
	width: 155px;
	list-style: none;
	border-bottom: 1px solid #62b21d;
	/*  border-top: 1px solid #62b21d; */
	font-size: 1.2em;
}

ul.sidenav li {
	position: relative;
	float: left;
	margin: 0;
	padding: 0;
}

ul.sidenav li a {
	border-top: 1px solid #62b21d;
	border-left: 1px solid #62b21d;
	border-right: 1px solid #62b21d;
	padding: 10px 10px 10px 25px;
	display: block;
	color: #507A39;
	text-decoration: none;
	width: 120px;
	background: #e8f5e6 url('images/sidenav_li_a.gif') no-repeat 5px 10px;
	position: relative;
	z-index: 2;
}

ul.sidenav li a:hover {
	background-color: #ffffff;
	border-top: 1px solid #62b21d;
}

ul.sidenav li div {
	display: none;
	position: absolute;
	top: 2px;
	left: 0;
	width: 225px;
	font-size: 0.9em;
	background: url(bubble_top.gif) no-repeat right top;
}

ul.sidenav li div p {
	margin: 7px 0;
	line-height: 1.6em;
	padding: 0 5px 10px 30px;
	background: url(bubble_btm.gif) no-repeat right bottom;
}
</style>
</head>
<body>
	<div class="container">
		<ul class="sidenav">
			<li><a href="">项目选择</a></li>

			<li><a href="">项目查看</a></li>

			<li><a href="">个人任务</a></li>

			<li><a href="">项目进度查询</a>
				<div>
					<p>PMP图标进度甘特图</p>
				</div></li>

			<li><a href="">个人日志</a></li>

			<li><a href="">周报</a></li>

			<li><a href="">成果发布</a></li>

			<li><a href="">个人问题</a></li>

			<li><a href="">问卷调查</a></li>
		</ul>
	</div>
</body>
</html>
