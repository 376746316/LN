<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/kkpager.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/kkpager.css" />
<div id="kkpager" style=" text-align:center; "></div>
<script type="text/javascript">
 function flashPage(param,curPage,totalPage,total,url,selector){
	//生成分页控件  
		kkpager.init({
			pagerid :'kkpager',
		    pno : curPage,
		    mode : 'click', //设置为click模式
		    //总页码  
		    total : totalPage,  
		    //总数据条数  
		    totalRecords : total,
		    isGoPage:false ,
		    isShowTotalRecords:false ,
		    //点击页码、页码输入框跳转、以及首页、下一页等按钮都会调用click
		    //适用于不刷新页面，比如ajax
		    click : function(n){		    	
		    	param.curPage=n;
				$(selector).load(url,param); 
				
		    	this.selectPage(n);
		    },
		    //getHref是在click模式下链接算法，一般不需要配置，默认代码如下
		    getHref : function(n){
		        return 'javascript:;';
		    }

		});
		kkpager.generPageHtml(); 
 }
</script>