package com.lidezheng.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.chinasofti.cetp.gensee.model.GenseeChat;
import com.chinasofti.cetp.gensee.model.GenseeCode;
import com.chinasofti.cetp.gensee.model.GenseeCourseware;
import com.chinasofti.cetp.gensee.model.GenseeExportChat;
import com.chinasofti.cetp.gensee.model.GenseeExportHistory;
import com.chinasofti.cetp.gensee.model.GenseeExportQA;
import com.chinasofti.cetp.gensee.model.GenseeExportRollcall;
import com.chinasofti.cetp.gensee.model.GenseeExportRoomUsage;
import com.chinasofti.cetp.gensee.model.GenseeExportStudyHistory;
import com.chinasofti.cetp.gensee.model.GenseeExportVote;
import com.chinasofti.cetp.gensee.model.GenseeHistory;
import com.chinasofti.cetp.gensee.model.GenseePage;
import com.chinasofti.cetp.gensee.model.GenseeQA;
import com.chinasofti.cetp.gensee.model.GenseeRecord;
import com.chinasofti.cetp.gensee.model.GenseeRollCallUser;
import com.chinasofti.cetp.gensee.model.GenseeRollcall;
import com.chinasofti.cetp.gensee.model.GenseeRoom;
import com.chinasofti.cetp.gensee.model.GenseeRoomUsage;
import com.chinasofti.cetp.gensee.model.GenseeStudyHistory;
import com.chinasofti.cetp.gensee.model.GenseeSynCourse;
import com.chinasofti.cetp.gensee.model.GenseeSynDoc;
import com.chinasofti.cetp.gensee.model.GenseeSynRecord;
import com.chinasofti.cetp.gensee.model.GenseeTeacher;
import com.chinasofti.cetp.gensee.model.GenseeTranscode;
import com.chinasofti.cetp.gensee.model.GenseeVote;
import com.chinasofti.cetp.gensee.model.GenseeVoteOption;
import com.chinasofti.cetp.gensee.model.GenseeVoteQuestion;
import com.chinasofti.cetp.gensee.model.GenseeVoteUser;
import com.chinasofti.cetp.gensee.model.GenseeWarmup;
import com.chinasofti.cetp.utils.gensee.GenseeApiUtils;

public class GenseeTest {
	public static void main(String[] args) {
//		testCreateGenseeRoom();//测试创建课堂
//		testUpdateGenseeRoom();//测试修改课堂
//		testDeleteGenseeRoom();//测试删除课堂
//		testGetGenseeRoom();//测试获取课堂信息fKgrv1exDu  FopnX4Bqmo ce0ac7cb0a9f49d69a11f1e033efa51c
//		testgetGenseeRoomCourseList();//测试获取课堂录制下的所有课件
//		testGetCoursewareInfo();//测试获取课件的详细信息
//		testUpdateCoursewareInfo();//测试修改课件属性
//		testCreateGenseeTeacher();//测试创建老师
//		testSynRecord();//测试分页同步录制件数据
//		testSynCourseware();//测试分页同步课件数据
//		testCreateWarmup();//测试创建暖场件
//		testUpdateWarmup();//测试修改暖场件
//		testAttachWarmup();//测试为某一课堂分配暖场件
//		testDetachWarmup();//测试为某一课堂取消暖场件1839842 1924622
//		testChooseRecord();//测试选择一个或多个录制件，作为课堂开启后，客户端中的插播件使用
//		testRemoveRecord();//为课堂取消插播件
//		testExportHistory();//测试课堂参会记录
//		testExportRoomQA();//测试导出课堂Q&A记录
		testExportRoomRollcall();//测试导出课堂点名记录
//		testEexportRoomVote();//测试课堂投票调查记录
//		testDocSyn();//测试分页获取本站点保存的文档数据
//		testDocAttach();//测试选择一个服务端文档，作为课堂开启后，客户端中的文档内容使用。
//		testDocDetach();//测试为课堂取消服务端文档。即去除文档和课堂的关联关系。
//		testExportStudyHistory();//按天同步课件访问记录
//		testExportChat();//测试导出聊天记录
//		testExportRoomUsage();//测试导出某个课堂其结束时间在此区域的场次纪录
//		testTranscodeDoc();
	}
	
	public static void testTranscodeDoc(){
		GenseeTranscode record = new GenseeTranscode();
		record.setName("java.txt");
		record.setResourceUrl("http://zhengdeli2015.wicp.net/online/uploadtranscode/java.txt");
		try {
			GenseeTranscode genseeTranscode = GenseeApiUtils.TranscodeDoc(record, null, null);
			System.out.println("返回代码："+genseeTranscode.getCode());
			System.out.println("访问地址："+genseeTranscode.getVisitUrl());
		}catch(Exception e) {
			e.printStackTrace();
		} 
	}
	public static void testExportRoomUsage(){
		String startTime = "2015-01-01 01:01:01";
		String endTime = "2016-02-01 01:01:01";
		try {
			GenseeExportRoomUsage exportRoomUsage = GenseeApiUtils.exportRoomUsage("FopnX4Bqmo", startTime, endTime);
			List<GenseeRoomUsage> list = exportRoomUsage.getList();
			for(GenseeRoomUsage genseeRoomUsage : list){
				System.out.println(genseeRoomUsage.getEndTime());
				System.out.println(genseeRoomUsage.getId());
				System.out.println(genseeRoomUsage.getStartTime());
			}
			System.out.println("返回代码："+exportRoomUsage.getCode());
			System.out.println("返回结果："+exportRoomUsage.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void testExportChat(){
		String startTime = "2016-01-13 10:11:52";
		String endTime = "2016-01-13 10:36:36";
		try {
			GenseeExportChat chat = GenseeApiUtils.exportChat("gSLfal0kq8", startTime, endTime, null, null);
			List<GenseeChat> list = chat.getChatList();
			for(GenseeChat genseeChat : list){
				System.out.println(genseeChat.getMsg());
				System.out.println(genseeChat.getReceiver());
				System.out.println(genseeChat.getSender());
				System.out.println(genseeChat.getReceiverId());
				System.out.println(genseeChat.getSenderId());
			}
			System.out.println("返回代码："+chat.getCode());
			System.out.println("返回结果："+chat.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testExportStudyHistory(){
		String startTime = "2015-01-01 01:01:01";
		try {
			GenseeExportStudyHistory exportStudyHistory = GenseeApiUtils.exportStudyHistory(1, startTime, 23);
			List<GenseeStudyHistory> list = exportStudyHistory.getHistoryList();
			for(GenseeStudyHistory genseeStudyHistory : list){
				System.out.println("课件id："+genseeStudyHistory.getId());
				System.out.println("用户id:"+genseeStudyHistory.getUid());
				System.out.println("加入时间："+genseeStudyHistory.getStartTime());
				System.out.println("离开时间："+genseeStudyHistory.getLeaveTime());
				System.out.println("姓名："+genseeStudyHistory.getName());
				System.out.println("观看时长："+genseeStudyHistory.getDuration());
				System.out.println("IP地址："+genseeStudyHistory.getIp());
			}			
			System.out.println("当前页数："+exportStudyHistory.getPageNo());
			System.out.println("总的条目："+exportStudyHistory.getTotalCounts());
			System.out.println("总的页数："+exportStudyHistory.getTotalPages());
			System.out.println("返回代码："+exportStudyHistory.getCode());
			System.out.println("结果说明："+exportStudyHistory.getMessage());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testDocDetach(){
		try {
			GenseeCode code = GenseeApiUtils.docDetach("FopnX4Bqmo", 425522L);
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果："+code.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void testDocAttach(){
		try {
			GenseeCode code = GenseeApiUtils.docAttach("FopnX4Bqmo", 425522L);
			
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果："+code.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void testDocSyn(){
		String startTime = "2015-01-01 01:01:01";
		String endTime = "2016-02-01 01:01:01";
		GenseeSynDoc responseJson;
		try {
			responseJson = GenseeApiUtils.docSyn(1, startTime, endTime);
			System.out.println("返回字符串："+responseJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void testEexportRoomVote(){
		String startTime = "2016-01-13 10:11:52";
		String endTime = "	2016-01-13 10:36:36";
		try {
			GenseeExportVote responseJson = GenseeApiUtils.exportRoomVote("gSLfal0kq8", startTime, endTime, null, null);
			List<GenseeVote> list = responseJson.getList();
			for(GenseeVote genseeVote : list){
				System.out.println("主题："+genseeVote.getSubject());
				List<GenseeVoteQuestion> questions = genseeVote.getQuestions();
				for(GenseeVoteQuestion genseeVoteQuestion : questions){
					System.out.println("==》问题内容:"+genseeVoteQuestion.getContent());
					List<GenseeVoteOption> options = genseeVoteQuestion.getOptions();
					for(GenseeVoteOption genseeVoteOption : options){
						System.out.println("====>选择："+genseeVoteOption.getValue());
						System.out.println("====>百分比："+genseeVoteOption.getPrecentage());
						System.out.println("====>回答的结果："+genseeVoteOption.getResult());
						System.out.println("====>类型（0-单选；1-多选；2-文本）："+genseeVoteOption.getType());
						List<GenseeVoteUser> results = genseeVoteOption.getResults();
						for(GenseeVoteUser genseeVoteUser : results){
							System.out.println("======>昵称："+genseeVoteUser.getNickName());
							System.out.println("======>用户："+genseeVoteUser.getUid());
							System.out.println("======>内容："+genseeVoteUser.getContent());
						}
					}
				}
			}
			
			System.out.println("返回代码："+responseJson.getCode());
			System.out.println("结果说明："+responseJson.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testExportRoomRollcall(){
		String startTime = "2016-01-13 11:05:24";
		String endTime = "	2016-01-13 11:43:47";
		try {
			GenseeExportRollcall response = GenseeApiUtils.exportRoomRollcall("gSLfal0kq8", startTime, endTime, null, null);
			List<GenseeRollcall> rollcall = response.getRollcall();
			for(GenseeRollcall genseeRollcall : rollcall){
				System.out.println("开始点名时间：" +genseeRollcall.getStartTime());
				System.out.println("结束点名时间："+genseeRollcall.getEndTime());
				System.out.println("总数："+genseeRollcall.getTotal());
				System.out.println("缺席人数："+genseeRollcall.getAbsent());
				System.out.println("出席人数："+genseeRollcall.getPresent());
				List<GenseeRollCallUser> users = genseeRollcall.getUsers();
				for(GenseeRollCallUser callUser : users){
					System.out.println("用户ID："+callUser.getId());
					System.out.println("用户名字："+callUser.getName());
					System.out.println("该用户是否出席："+callUser.isPresent());
				}
			}
			System.out.println("返回结果代码："+response.getCode());
			System.out.println("结果说明："+response.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void testExportRoomQA(){
		String startTime = "2016-01-13 10:11:52";
		String endTime = "	2016-01-13 10:36:36";
		try {
			GenseeExportQA exportQA = GenseeApiUtils.exportRoomQA("gSLfal0kq8", startTime, endTime, null, null);
			
			List<GenseeQA> list = exportQA.getQaList();
			
			for(GenseeQA genseeQA : list){
				System.out.println("提问人UID:"+genseeQA.getSubmitter());
				System.out.println("是否发布："+genseeQA.getPublished());
				System.out.println("提问时间："+genseeQA.getSubmitTime());
				System.out.println("回答着UID："+genseeQA.getAnswerBy());
				System.out.println("提问内容："+genseeQA.getQuestion());
				System.out.println("回答内容："+genseeQA.getResponse());
			}
			System.out.println("返回代码："+exportQA.getCode());
			System.out.println("返回结果："+exportQA.getMessage());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void testExportHistory(){
		String startTime = "2015-01-01 01:01:01";
		String endTime = "2016-02-01 01:01:01";
		try {
			GenseeExportHistory exportHistory = GenseeApiUtils.exportHistory("FopnX4Bqmo", startTime, endTime, null, null);
			System.out.println("返回代码："+exportHistory.getCode());
			System.out.println("返回结果："+exportHistory.getMessage());
			List<GenseeHistory> genseeHistories = exportHistory.getHistoryList();
			
			for(GenseeHistory genseeHistory : genseeHistories){
				System.out.println("学生ID："+genseeHistory.getUid());
				System.out.println("参课昵称："+genseeHistory.getNickname());
				System.out.println("加入时间："+genseeHistory.getJoinTime());
				System.out.println("离开时间："+genseeHistory.getLeaveTime());
				System.out.println("姓名："+genseeHistory.getName());
				System.out.println("区域："+genseeHistory.getArea());
				System.out.println("IP地址："+genseeHistory.getIp());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testRemoveRecord(){
		List<Long> recordId =new ArrayList<Long>();
		recordId.add(1839842L);
		recordId.add(1924622L);
		try {
			GenseeCode code = GenseeApiUtils.removeRecord("FopnX4Bqmo", recordId);
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果："+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public	static void testChooseRecord(){
		List<Long> recordId =new ArrayList<Long>();
		recordId.add(1839842L);
		recordId.add(1924622L);
		try {
			GenseeCode code = GenseeApiUtils.chooseRecord("FopnX4Bqmo", recordId);
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果："+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testDetachWarmup(){
		try {
			GenseeCode code = GenseeApiUtils.detachWarmup("FopnX4Bqmo", "ce0ac7cb0a9f49d69a11f1e033efa51c");
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果说明："+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testAttachWarmup(){
		try {
			GenseeCode code = GenseeApiUtils.attachWarmup("FopnX4Bqmo", "ce0ac7cb0a9f49d69a11f1e033efa51c");
			
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果说明："+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void testUpdateWarmup(){
		GenseeWarmup genseeWarmup = new GenseeWarmup();
		genseeWarmup.setId("ce0ac7cb0a9f49d69a11f1e033efa51c");
		genseeWarmup.setName("20160111测试暖场件02修改");
		try {
			GenseeCode code = GenseeApiUtils.updateWarmup(genseeWarmup);
			System.out.println("返回代码："+code.getCode());
			System.out.println("结果说明"+code.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testCreateWarmup(){
		GenseeWarmup genseeWarmup = new GenseeWarmup();
		genseeWarmup.setName("20160111测试暖场件01");
		genseeWarmup.setRecordId(1924622L);
		
		try {
			GenseeWarmup genseeWarmup2 = GenseeApiUtils.createWarmup(genseeWarmup);
			System.out.println("暖场名称："+genseeWarmup2.getName());
			System.out.println("暖场件ID："+genseeWarmup2.getId());
			System.out.println("录制件ID："+genseeWarmup2.getRecordId());
			System.out.println("播放模式："+genseeWarmup2.getMode());
			System.out.println("返回结果代码："+genseeWarmup2.getCode());
			System.out.println("返回结果说明："+genseeWarmup2.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testSynCourseware(){
		int pageNo = 1;
		String startTime = "2015-01-01 01:01:01";
		String endTime = "2016-01-11 01:01:01";
		
		try {
			GenseeSynCourse course = GenseeApiUtils.SynCourseware(pageNo, startTime, endTime);
			List<GenseeCourseware> list = course.getList();
			 for(GenseeCourseware courseware : list){
				 System.out.println("课件id："+ courseware.getId());
				 System.out.println("课件主题口令："+courseware.getToken());
				 System.out.println("课件主题名称："+courseware.getSubject());
				 System.out.println("课件观看url："+courseware.getUrl());
				 System.out.println("课件所属课堂的ID："+courseware.getRoomId());
				 System.out.println("描述："+courseware.getDescription());
				 System.out.println("课件编号:"+courseware.getNumber());
				 System.out.println("资源ID："+courseware.getRecordId());
				 System.out.println("创建该课件的用户ID："+courseware.getCreator());
				 System.out.println("创建时间："+courseware.getCreatedTime());
			 }
			 
			 GenseePage genseePage =course.getPage();
			 System.out.println("当前页数："+genseePage.getPageNo());
			 System.out.println("总的页数："+genseePage.getTotalPages());
			 System.out.println("总的条数："+genseePage.getTotalCounts());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testSynRecord(){
		int pageNo = 1;
		String startTime = "2015-01-01 01:01:01";
		String endTime = "2016-01-11 01:01:01";
		try {
			GenseeSynRecord genseeSynRecord = GenseeApiUtils.SynRecord(pageNo, startTime, endTime);
			
			 List<GenseeRecord> list = genseeSynRecord.getRecordList();
			 for(GenseeRecord genseeRecord : list){
				 System.out.println("录制件ID："+genseeRecord.getId());
				 System.out.println("名称："+genseeRecord.getName());
				 System.out.println("在线录制开始时间："+genseeRecord.getRecordStartTime());
				 System.out.println("在线录制结束时间："+genseeRecord.getRecordEndTime());
				 System.out.println("创建时间："+genseeRecord.getCreatedTime());
				 System.err.println("存储大小："+genseeRecord.getSize());
				 System.out.println("直播ID："+genseeRecord.getRoomId());
				 System.out.println("录制或上传该录制件的用户"+genseeRecord.getCreator());
			 }
			 GenseePage genseePage = genseeSynRecord.getPage();
			 System.out.println("当前页数："+genseePage.getPageNo());
			 System.out.println("总的页数："+genseePage.getTotalPages());
			 System.out.println("总的条数："+genseePage.getTotalCounts());
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testCreateGenseeTeacher(){
		GenseeTeacher record = new GenseeTeacher();
		record.setName("lidzheng20160111@qq.com");
		record.setTeacherLoginName("lidzheng20160111@qq.com");
		record.setTeacherPassword("lidezheng2016");
		try {
			GenseeCode  code = GenseeApiUtils.createGenseeTeacher(record);
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果："+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testDeleteCourseware(){
		try {
			GenseeCode code = GenseeApiUtils.deleteCourseware("fKgrv1exDu", null, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testUpdateCoursewareInfo(){
		GenseeCourseware record = new GenseeCourseware();
		record.setId("fKgrv1exDu");
		record.setSubject("测试其他课程1");
		record.setToken("987654321");
		try {
			GenseeCode code = GenseeApiUtils.updateCoursewareInfo(record, null, null);
			System.out.println("返回代码："+code.getCode());
			System.out.println("返回结果说明："+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testGetCoursewareInfo(){
		try {
			GenseeCourseware courseware = GenseeApiUtils.getCoursewareInfo("fKgrv1exDu", null, null);
			System.out.println("课件ID："+courseware.getId());
			System.out.println("观看口令："+courseware.getToken());
			System.out.println("课件主题："+courseware.getSubject());
			System.out.println("所属课堂的ID："+courseware.getRoomId());
			System.out.println("课件观看的URL："+courseware.getUrl());
			System.out.println("描述："+courseware.getDescription());
			System.out.println("创建课件的用户ID："+courseware.getCreator());
			System.out.println("课件编号："+courseware.getNumber());
			System.out.println("返回结果代码："+courseware.getCode());
			System.out.println("返回结果说明："+courseware.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testgetGenseeRoomCourseList(){
		try {
			GenseeSynCourse course = GenseeApiUtils.getGenseeRoomCourseList("UZu7QFG4rQ", null, null);
			System.out.println(course);
			
			List<GenseeCourseware> list = course.getCoursewares();
			System.out.println(list);
			if(list != null){
				for(GenseeCourseware courseware : list){
					System.out.println("课件ID："+courseware.getId());
					System.out.println("编号："+courseware.getNumber());
					System.out.println("课件的URL:"+courseware.getUrl());
					System.out.println("课件名字："+courseware.getSubject());
					System.out.println("文档的截屏："+courseware.getScreenshot());
					System.out.println("资源的ID:"+courseware.getRecordId());
					System.out.println("描述:"+courseware.getDescription());
					System.out.println("课件口令："+courseware.getToken());
					System.out.println("返回代码"+courseware.getCode());
					System.out.println("结果说明："+courseware.getMessage());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void testGetGenseeRoom(){
		try {
			GenseeRoom genseeRoom = GenseeApiUtils.getGenseeRoom("FopnX4Bqmo", null, null);
			System.out.println("实时课堂ID："+genseeRoom.getId());
			System.out.println("课堂编号："+genseeRoom.getNumber());
			System.out.println("助教口令："+genseeRoom.getAssistantToken());
			System.out.println("Web端学员口令："+genseeRoom.getStudentToken());
			System.out.println("老师口令："+genseeRoom.getTeacherToken());
			System.out.println("学生客户端口令："+genseeRoom.getStudentClientToken());
			System.out.println("预期开始时间："+genseeRoom.getStartDate());
			System.out.println("是否允许web端学生加入："+genseeRoom.getWebJoin());
			System.out.println("是否允许客户端学生加入："+genseeRoom.getClientJoin());
			System.out.println("失效日期："+genseeRoom.getInvalidDate());
			System.out.println("老师和助教加入URL:"+genseeRoom.getTeacherJoinUrl());
			System.out.println("学员加入URL："+genseeRoom.getStudentJoinUrl());
			System.out.println("返回结果代码："+genseeRoom.getCode());
			System.out.println("结果说明"+genseeRoom.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testDeleteGenseeRoom(){
		try {
			GenseeCode code = GenseeApiUtils.deleteGenseeRoom("JNTJG7HdIM", null, null);
			System.out.println("返回码："+code.getCode());
			System.out.println("返回信息："+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testUpdateGenseeRoom(){
		GenseeRoom record = new GenseeRoom();
		record.setId("JNTJG7HdIM");
		record.setSubject("创建实时课堂测试四");
		record.setAssistantToken("98764452");
		record.setStartDate(new Date(System.currentTimeMillis()));
		
		try {
			GenseeCode code = GenseeApiUtils.UpdateGenseeRoom(record, null, null);
			System.out.println("返回码:"+code.getCode());
			System.out.println("返回信息:"+code.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void testCreateGenseeRoom(){
		GenseeRoom record = new GenseeRoom();
		record.setSubject("创建实时课堂测试五");
		record.setNumber("201601081015");
		record.setAssistantToken("111111");
		record.setStudentToken("222222");
		record.setTeacherToken("333333");
		record.setStudentClientToken("444444");
		record.setStartDate(new Date(System.currentTimeMillis()));
		record.setInvalidDate(new Date(System.currentTimeMillis()+10000000));
		record.setScene(0);
		record.setWebJoin("true");
		record.setClientJoin("true");
		
		try {
			GenseeRoom genseeRoom = GenseeApiUtils.createGenseeRoom(record, null, null);
			System.out.println(genseeRoom);
			System.out.println("课堂ID==>"+genseeRoom.getId());
			System.out.println("开始时间==>"+genseeRoom.getStartDate());
			System.out.println("失效时间==>"+genseeRoom.getInvalidDate());
			System.out.println("课堂类型(0:表示大讲堂;1:表示小班课;2:表示私教课)==>"+genseeRoom.getScene());
			System.out.println("学生web端口令==>"+genseeRoom.getStudentToken());
			System.out.println("学生客户端口令==>"+genseeRoom.getStudentClientToken());
			System.out.println("学生加入的URL==>"+genseeRoom.getStudentJoinUrl());
			System.out.println("助教和老师加入的URL==>"+genseeRoom.getTeacherJoinUrl());
			System.out.println("老师口令==>"+genseeRoom.getTeacherToken());
			System.out.println("助教口令==>"+genseeRoom.getAssistantToken());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
