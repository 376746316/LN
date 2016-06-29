<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

    <title>您访问的页面已不存在</title>
    <script type="text/javascript">
      function errordetail()
    {
    	if (document.getElementById("msg").style.display==''){
    		document.getElementById("msg").style.display='none';
    	}
    	else{
    		document.getElementById("msg").style.display='';
    	}
    }
    </script>
  </head>
  
<body>
   <div align="center"><img src="<%=path%>/errorpage/img/404.jpg"> </div>
   <div align="center"><a href='javascript:history.go(-1);'>返回上一面</a>
   <a href="javascript:void(0)" onClick="errordetail();">查看错误信息</a>
   </div> 
     <div align="center" id="msg" name="msg" style="display: none;">
       <%=exception%>
       </div>
</body>
</html>
