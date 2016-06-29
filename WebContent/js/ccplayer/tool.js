//页面
$(function() {
	// 获取用户信息
	$("#getuserinfo").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("userinfo_userid")) {
			return false;
		}
		fmtStr = $("input[name='userinfo_fmt']:checked").val();
		$.post("/getuserinfostr.bo", {
			apiname : $("#userinfoapi").val(),
			userid : $("#userinfo_userid").val(),
			fmt : fmtStr,
			token : $("#token").val()
		}, function(data) {
			displayResult("userinfourl", data, "userinfo", fmtStr);
		});
		
		showResponse(this);
	});
	// 获取单个视频
	$("#getvideo").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("video_userid")) {
			return false;
		}
		if (!errortips("video_videoid")) {
			return false;
		}
		
		fmtStr = $("input[name='video_fmt']:checked").val();
		$.post("/getvideostr.bo", {
			apiname : $("#getvideoapi").val(),
			userid : $("#video_userid").val(),
			token : $("#token").val(),
			fmt : fmtStr,
			videoid : $("#video_videoid").val()
		}, function(data) {
			displayResult("videourl", data, "videoinfo",fmtStr);
		});
		
		showResponse(this);
	});

	// 更新视频
	$("#updatevideo").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("updatevideo_videoid")) {
			return false;
		}
		
		fmtStr = $("input[name='updatevideo_fmt']:checked").val();
		var updatevideo_title = encodeURIComponent($("#updatevideo_title").val(), "utf-8");
		var updatevideo_tag = encodeURIComponent($("#updatevideo_tag").val(), "utf-8");
		var updatevideo_desp = encodeURIComponent($("#updatevideo_description").val(), "utf-8");
		var updatevideo_playurl = encodeURIComponent($("#updatevideo_playurl").val(), "utf-8");
		var updatevideo_imageindex = encodeURIComponent($("#updatevideo_imageindex").val(), "utf-8");
		$.post("/updatevideostr.bo", {
			apiname : $("#updatevideoapi").val(),
			token : $("#token").val(),
			videoid : $("#updatevideo_videoid").val(),
			userid : $("#updatevideo_userid").val(),
			videotitle : updatevideo_title,
			videotag : updatevideo_tag,
			videodesp : updatevideo_desp,
			categoryid : $("#updatevideo_categoryid").val(),
			playurl: updatevideo_playurl,
			imageindex : updatevideo_imageindex,
			fmt : fmtStr
		}, function(data) {
			displayResult("updatevideourl", data, "updatevideoinfo",fmtStr);
		});
		
		showResponse(this);
	});
	//删除视频
	$("#deletevideo").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("deletevideo_videoid")) {
			return false;
		}

		$(this).parent().parent().next().slideDown();
		fmtStr = $("input[name='deletevideo_fmt']:checked").val();
		$.get("/deletevideostr.bo", {
			apiname : $("#deletevideoapi").val(),
			videoid : $("#deletevideo_videoid").val(),
			userid : $("#deletevideo_userid").val(),
			token : $("#token").val(),
			fmt : fmtStr
		}, function(data) {
			displayResult("deletevideourl", data, "deletevideoinfo", fmtStr);
		});
		
		showResponse(this);
	});
	// 搜索视频
	$("#searchvideo").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("searchvideo_userid")) {
			return false;
		}
		if (!errortips("searchvideo_searchquery")) {
			return false;
		}
		if (!errortips("searchvideo_sort")) {
			return false;
		}
		fmtStr = $("input[name='searchvideo_fmt']:checked").val();
		$.post("/searchvideostr.bo", {
			apiname : $("#searchvideoapi").val(),
			token : $("#token").val(),
			userid : $("#searchvideo_userid").val(),
			searchquery : encodeURIComponent($("#searchvideo_searchquery").val(), "utf-8"),
			sort : encodeURIComponent($("#searchvideo_sort").val(), "utf-8"),
			categoryid : $("#searchvideo_categoryid").val(),
			num_per_page : $("#searchvideo_num_per_page").val(),
			page : $("#searchvideo_page").val(),
			fmt : fmtStr
		}, function(data) {
			displayResult("searchvideourl", data, "searchvideoinfo",fmtStr);
		});
		
		showResponse(this);
	});
	// 获取视频分类
	$("#videocategory").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("videocategory_userid")) {
			return false;
		}

		fmtStr = $("input[name='videocategory_fmt']:checked").val();
		$.post("/getvideocategorystr.bo", {
			apiname : $("#videocategoryapi").val(),
			userid : $("#videocategory_userid").val(),
			token : $("#token").val(),
			fmt : fmtStr
		}, function(data) {
			displayResult("videocategoryurl", data, "videocategoryinfo", fmtStr);
		});
		
		showResponse(this);
	});

	// 获取视频播放代码
	$("#getplaycode").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("videoplaycode_videoid")) {
			return false;
		}

		fmtStr = $("input[name='videoplaycode_fmt']:checked").val();
		$.post("/getplaycodestr.bo", {
			apiname : $("#videoplaycodeapi").val(),
			token : $("#token").val(),
			videoid : $("#videoplaycode_videoid").val(),
			userid : $("#videoplaycode_userid").val(),
			playerid : $("#videoplaycode_playerid").val(),
			playerwidth : $("#videoplaycode_playerwidth").val(),
			playerheight : $("#videoplaycode_playerheight").val(),
			autoplay : $("#videoplaycode_autoplay option:selected").val(),
			fmt : fmtStr
		}, function(data) {
			displayResult("playcodeurl", data, "playcodeinfo", fmtStr);
		});
		
		showResponse(this);
	});

	// 获取批量视频
	$("#getvideos").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("videos_userid")) {
			return false;
		}

		fmtStr = $("input[name='videos_fmt']:checked").val();
		$.post("/getvideosstr.bo", {
			apiname : $("#videosinfoapi").val(),
			userid : $("#videos_userid").val(),
			videoid_from : $("#videoid_from").val(),
			videoid_to : $("#videoid_to").val(),
			num_per_page : $("#videos_pagesize").val(),
			page : $("#videos_page").val(),
			fmt : fmtStr,
			token : $("#token").val()
		}, function(data) {
			displayResult("videosurl", data, "videosinfo", fmtStr);
		});
		showResponse(this);
	});
	
	// 按分类获取视频
	$("#getcategoryvideos").click(function() {
		if (!errortips("token")) {
			return false;
		}
		if (!errortips("cvideos_categoryid")) {
			return false;
		}

		fmtStr = $("input[name='cvideos_fmt']:checked").val();
		$.post("/getcategoryvideosstr.bo", {
			apiname : $("#cvideosinfoapi").val(),
			categoryid : $("#cvideos_categoryid").val(),
			num_per_page : $("#cvideos_pagesize").val(),
			page : $("#cvideos_page").val(),
			fmt : fmtStr,
			token : $("#token").val()
		}, function(data) {
			displayResult("cvideosurl", data, "cvideosinfo", fmtStr);
		});
		showResponse(this);
	});
	
	errortips = function(param) {
		var paramstr = document.getElementById(param);
		if (paramstr.value == null || paramstr.value.length == 0) {
			paramstr.focus();
			return false;
		}
		
		return true;
	};
	
	displayResult = function(requesturl, data, responseresult, fmtStr) {
		$("#" + requesturl).html(data);
		$.post("/getresult.bo", {
			url : data,
			fmt : fmtStr
		}, function(result) {
			$("#" + responseresult).html(result);
		});
	};
	showResponse = function(current){
		//显示隐藏信息字段
		$(current).next().slideDown();
		// 显示列表
		$(current).parent().parent().next().slideDown();
	};
	
	//自动变更年份
	ccYear = new Date().getFullYear();
	$("#cc_year").text(ccYear);
	
	//tool下拉列表
	$("#tabdiv > div").eq(0).fadeIn().siblings().hide();
	$("#tabdiv > div").eq(0).hide();
	$(".tabapi, .tabapi_ul").hover(function(){
		$(".tabapi_ul").stop().slideToggle(200);	
	});
	
	$(".tabapi_ul li a").click(function(){
		var index = $(".tabapi_ul li a").index(this);
		$("#tabdiv > div").eq(index).fadeIn().siblings().hide();	
	});
});