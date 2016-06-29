package com.chinasofti.cetp.utils.gensee;
/**
 * 展示互动提供的用户接口 共28个
 * 
 * @author 远扬
 * @version 1.0
 */
public class GenseeInterface {

	/**
	 * 展示互动提供的接口调用站点，default：http://zker.gensee.com
	 */
	public static final String SITEURL = "http://zker.gensee.com";

	/**
	 * 展示互动提供的接口INTEGRATION，default：/integration/site
	 */
	public static final String INTEGRATION = "/integration/site";

	/**
	 * 展示互动提供的接口调用站点，default：http://dyy1464924274.vicp.cc/gensee/doc/transcode.
	 * do
	 */
	public static final String CALLBACKINTERFACE = "http://zhengdeli2015.wicp.net/gensee/doc/transcode.do";

	/**
	 * 展示互动的管理员登录，默认用户，读取配置文件
	 */
	public static final String USERNAME = "admin@zker.com";

	/**
	 * 展示互动的管理员登录默认密码
	 */
	public static final String PASSWORD = "zker123";

	/**
	 * 用户密码是否加密
	 */
	public static final Boolean SEC = false;

	/**
	 * 5.1<br/>
	 * 创建实时课堂接口。<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色。
	 */
	public static final String CREATEROOM = "/training/room/created";

	/**
	 * 5.2<br/>
	 * 根据课堂ID 修改实时课堂设置<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色。
	 */
	public static final String UPDATEROOM = "/training/room/modify";

	/**
	 * 5.3<br/>
	 * 根据课堂ID 删除实时课堂。<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色。
	 */
	public static final String DELETEROOM = "/training/room/deleted";

	/**
	 * 5.4<br/>
	 * 根据课堂ID 获取课堂详细信息。<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色。
	 */
	public static final String GETROOMINFO = "/training/room/info";

	/**
	 * 5.5<br/>
	 * 根据课堂ID 获取录制好的所有课件。<br/>
	 * 该 API要求认证用户具有组织者或管理员角色。
	 */
	public static final String GETCOURSELIST = "/training/courseware/list";

	/**
	 * 5.6<br/>
	 * 根据课件ID 获取课件的详细信息。<br/>
	 * 该 API要求认证用户具有组织者或管理员角色。
	 */
	public static final String GETCOURSEINFO = "/training/courseware/info";

	/**
	 * 5.7<br/>
	 * 根据课件ID 修改课件的基本属性。<br/>
	 * 该 API要求认证用户必须具有管理员或者组织者角色。
	 */
	public static final String UPDATECOURSE = "/training/courseware/modify";

	/**
	 * 5.8<br/>
	 * 根据课件ID 删除课件。<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色。
	 */
	public static final String DELETECOURSE = "/training/courseware/deleted";

	/**
	 * 5.9<br/>
	 * 为站点创建一位老师。在接口形式下，老师主要起到调用接口所需要的账号作用<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色。
	 */
	public static final String CREATETEACHER = "/training/teacher/created";

	/**
	 * 5.10<br/>
	 * 分页获取本站点保存的录制件数据。每页50 条数据。<br/>
	 * 在很多场合下，第三方希望能同步的录制件信息到自己的系统中。 <br/>
	 * 第三方业务系统在同步数据后可以根据自己的业务使用录制件实现课堂插播功能。<br/>
	 * 该 API要求认证用户具有管理员角色。
	 */
	public static final String SYNRECORD = "/training/record/syn";

	/**
	 * 5.11<br/>
	 * 分页获取本站点中的课件数据。每页50 条数据。<br/>
	 * 在很多场合下，第三方希望能同步的课件数据到自己的系统中。 <br/>
	 * 第三方业务系统在同步数据后可以根据自己的业务进行查询，对账等操作。 <br/>
	 * 第三方系统可以使用课件进行观看<br/>
	 * 该 API要求认证用户具有管理员角色。
	 */
	public static final String SYNCOURSE = "/training/courseware/syn";

	/**
	 * 5.12<br/>
	 * 为站点创建暖场件，供课堂使用。 <br/>
	 * 暖场指：当课堂未开始发布时候，可以让用户先观看一个暖场件。<br/>
	 * 该 API要求认证用户必须具有管理员角色角色。
	 */
	public static final String CREATEWARMUP = "/training/warmup/created";

	/**
	 * 5.13<br/>
	 * 根据暖场件ID 修改设置。<br/>
	 * 该 API要求认证用户必须具有管理员角色角色。
	 */
	public static final String UPDATEWARMUP = "/training/warmup/modify";

	/**
	 * 5.14<br/>
	 * 为课堂指定一个暖场件作为暖场使用。<br/>
	 * 暖场指：当课堂未开始发布时候，可以让用户先观看一个暖场件。 <br/>
	 * 该 API要求认证用户具有管理员角色。
	 */
	public static final String ATTACHWARMUP = "/training/warmup/attach";
	/**
	 * 5.15<br/>
	 * 为课堂取消暖场。<br/>
	 * 该 API要求认证用户具有管理员角色。
	 */
	public static final String DETACHWARMUP = "/training/warmup/detach";

	/**
	 * 5.16<br/>
	 * 选择一个或多个录制件，作为课堂开启后，客户端中的插播件使用。请调用接口的开发方，注意过滤重复 冗余的录制件信息。 <br/>
	 * 插播：客户端进入后，可以指定某个录制件内容作为发布源，直播给所有web端用户。<br/>
	 * 该 API要求认证用户具有管理员角色。
	 */
	public static final String CHOOSERECORD = "/training/record/choose";

	/**
	 * 5.17<br/>
	 * 为课堂取消插播件。即去除录制件和课堂的关联关系。请调用接口的开发方，注意过滤重复冗余的录制件 ID。<br/>
	 * 该 API要求认证用户具有管理员角色。
	 */
	public static final String REMOVERECORD = "/training/record/remove";

	/**
	 * 5.18<br/>
	 * 根据开始时间和结束时间，为课堂导出加入时间在此区域的学生参课记录。<br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有访问记录。 <br/>
	 * 
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 */
	public static final String EXPORTHISTORY = "/training/export/history";

	/**
	 * 5.19<br/>
	 * 根据开始时间和结束时间，为课堂导出学生参课过程中的Q&A 记录。<br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有 Q&A 记录。 <br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 */
	public static final String EXPORTQA = "/training/export/qa";

	/**
	 * 5.20<br/>
	 * 根据开始时间和结束时间，为课堂导出点名发起时间在此区域的学生点名记录。 <br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有点名记录。 <br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 */
	public static final String EXPORTROLLCALL = "/training/export/rollcall";

	/**
	 * 5.21<br/>
	 * 根据开始时间和结束时间，为课堂导出投票调查发起时间在此区域的学生投票调查结果。 <br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有投票记录。 <br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 */
	public static final String EXPORTVOTE = "/training/export/vote";

	/**
	 * 5.22<br/>
	 * 分页获取本站点保存的文档数据。每页50条数据。 <br/>
	 * 在很多场合下，第三方希望能同步的服务端文档信息到自己的系统中。 <br/>
	 * 第三方业务系统在同步数 据后可以根据自己的业务进行查询，为课堂分配服务端文档等操作。<br/>
	 * 该 API要求认证用户具有管理员角色
	 */
	public static final String DOCSYN = "/training/doc/syn";

	/**
	 * 5.23<br/>
	 * 选择一个服务端文档，作为课堂开启后，客户端中的文档内容使用。<br/>
	 * 该 API要求认证用户具有管理员角色
	 */
	public static final String DOCATTACH = "/training/doc/attach";

	/**
	 * 5.24<br/>
	 * 为课堂取消服务端文档。即去除文档和课堂的关联关系。<br/>
	 * 该 API要求认证用户具有管理员角色
	 */
	public static final String DOCDETACH = "/training/doc/detach";

	/**
	 * 5.25<br/>
	 * 为课件导出按天同步访问记录。<br/>
	 * 该 API要求认证用户具有管理员角色
	 */
	public static final String EXPORTSTUDYHISTORY = "/training/export/study/history";

	/**
	 * 5.26<br/>
	 * 根据开始时间和结束时间，导出实时课堂学生的公共聊天数据。<br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有学生公共聊天记录。<br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师或管理员角色。 管理员可以操作站点内所有课堂，老师只能操作自己创建的课堂。
	 */
	public static final String EXPORTCHAT = "/training/export/chat";

	/**
	 * 5.27<br/>
	 * 通过该接口上传转码第三方文档。<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色
	 */
	public static final String COURSETRANSCODE = "/training/courseware/transcode";

	/**
	 * 5.28<br/>
	 * 根据开始时间和结束时间，导出某个课堂其结束时间在此区域的场次纪录。<br/>
	 * 如果不提供课堂ID，则查找范围为所有课堂。<br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户必须具有管理员角色。
	 */
	public static final String EXPORTROOMUSAGE = "/training/export/room/usage";

}
