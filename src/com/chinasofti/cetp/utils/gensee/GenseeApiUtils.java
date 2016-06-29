package com.chinasofti.cetp.utils.gensee;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.chinasofti.cetp.gensee.model.GenseeCode;
import com.chinasofti.cetp.gensee.model.GenseeCourseware;
import com.chinasofti.cetp.gensee.model.GenseeExportChat;
import com.chinasofti.cetp.gensee.model.GenseeExportHistory;
import com.chinasofti.cetp.gensee.model.GenseeExportQA;
import com.chinasofti.cetp.gensee.model.GenseeExportRollcall;
import com.chinasofti.cetp.gensee.model.GenseeExportRoomUsage;
import com.chinasofti.cetp.gensee.model.GenseeExportStudyHistory;
import com.chinasofti.cetp.gensee.model.GenseeExportVote;
import com.chinasofti.cetp.gensee.model.GenseeRoom;
import com.chinasofti.cetp.gensee.model.GenseeSynCourse;
import com.chinasofti.cetp.gensee.model.GenseeSynDoc;
import com.chinasofti.cetp.gensee.model.GenseeSynRecord;
import com.chinasofti.cetp.gensee.model.GenseeTeacher;
import com.chinasofti.cetp.gensee.model.GenseeTranscode;
import com.chinasofti.cetp.gensee.model.GenseeWarmup;
import com.chinasofti.cetp.utils.Encrypt;
import com.chinasofti.cetp.utils.ObjectUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * 展示互动的API调用,接口实现中，所有需要用户名密码的接口，在未传入用户名密码的时候都将使用系统默认配置的管理员用户<br/>
 * 在传递用户密码的时候，由系统配置文件统一确认是否需要加密
 * 
 * @author 远扬
 * @version 16.1.0
 */
public class GenseeApiUtils {

	/**
	 * 请求类型
	 */
	private static final String CONTENTTYPE = "application/x-www-form-urlencoded";
	/**
	 * 日志打印
	 */
	private static final Logger logger = Logger.getLogger(GenseeApiUtils.class);

	public static class DateDeserializer implements JsonDeserializer<Date> {

		public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
			return new Date(json.getAsJsonPrimitive().getAsLong());
		}
	}

	/**
	 * 远程请求数据
	 * 
	 * @param interfase
	 *            访问展示互动的API接口
	 * @param parameters
	 *            参数字符串
	 * @param contentType
	 *            请求类型
	 * @return
	 */
	public static String postURL(String interfase, String parameters, String contentType) {
		String targetURL = GenseeInterface.SITEURL + GenseeInterface.INTEGRATION + interfase;
		URL url;
		HttpURLConnection connection = null;
		try {
			// Create connection
			url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", contentType);

			connection.setRequestProperty("Content-Length", "" + Integer.toString(parameters.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(parameters);
			wr.flush();
			wr.close();

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			return response.toString();

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {

			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	/**
	 * 5.1 为站点创建实时课堂。<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色<br/>
	 * 在输入 4个口令有值得口令不能相同，当 subject相同时也会引起冲突。同时 webJoin和clientJoin也不同同时为false,如果
	 * 设置为 false则都取默认值
	 * 
	 * @param record
	 *            直播课堂提交的表单数据
	 * @param userName
	 *            创建用户【可选，默认使用管理员】
	 * @param password
	 *            登录密码【可选，默认管理员密码】
	 * @return 用于插入数据库的本地实体类
	 * @throws Exception
	 *             转换异常
	 */
	public static GenseeRoom createGenseeRoom(GenseeRoom record, String userName, String password) throws Exception {
		if (record == null) {
			return null;
		}
		record.setCode(-1);
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (record.getSubject() == null || "".equals(record.getSubject())) {
			record.setMessage("实时课堂主题不能为空");
			return record;
		}
		if (record.getStartDate() == null || "".equals(record.getStartDate())) {
			record.setMessage("开始日期不能为空");
			return record;
		}
		String paramtes = ObjectUtils.objectToQueryString(record, new String[] { "roomDbId", "usersNo" });
		paramtes += "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.CREATEROOM, paramtes, CONTENTTYPE);
		logger.debug(responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeRoom temp = gb.create().fromJson(responseJson, GenseeRoom.class);
		if (temp == null) {
			record.setMessage("添加实时课堂失败");
			return record;
		}
		record.setCode(temp.getCode());
		if (temp.getCode() != 0) {
			record.setMessage(temp.getCode() + ":" + temp.getMessage());
			return record;
		}
		record.setId(temp.getId());
		record.setNumber(temp.getNumber());
		record.setTeacherJoinUrl(temp.getTeacherJoinUrl());
		record.setStudentJoinUrl(temp.getStudentJoinUrl());
		record.setMessage(temp.getMessage());
		return record;
	}

	/**
	 * 5.2 根据课堂ID 修改实时课堂设置。<br/>
	 * 该 API要求认证用户必须具有管理员或者组织者角色<br/>
	 * 在输入 4个口令有值得口令不能相同。同时webJoin和clientJoin 也不同同时为 false,如果设置为 false则都取默认值。
	 * 
	 * @param record
	 *            实时课堂
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode UpdateGenseeRoom(GenseeRoom record, String userName, String password) throws Exception {
		if (record == null) {
			return null;
		}
		GenseeCode code = new GenseeCode();
		code.setCode(-1);
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (record.getSubject() == null || "".equals(record.getSubject())) {
			code.setMessage("实时课堂主题不能为空");
			return code;
		}
		if (record.getStartDate() == null || "".equals(record.getStartDate())) {
			code.setMessage("开始日期不能为空");
			return code;
		}
		String paramtes = ObjectUtils.objectToQueryString(record, new String[] { "roomDbId", "usersNo" });
		paramtes += "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.UPDATEROOM, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.3 根据课堂ID 删除实时课堂。 该 API要求认证用户必须具有管理员或者组织者角色
	 * 
	 * @param roomId
	 *            课堂编号
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode deleteGenseeRoom(String roomId, String userName, String password) throws Exception {
		GenseeCode code = new GenseeCode();
		code.setCode(-1);
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (roomId == null || "".equals(roomId)) {
			code.setMessage("实时课堂主题ID不能为空");
			return code;
		}
		String paramtes = "roomId=" + roomId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.DELETEROOM, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.4 根据课堂ID 获取课堂详细信息。 该 API要求认证用户具有组织者或管理员角色
	 * 
	 * @param roomId
	 * @param userName
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public static GenseeRoom getGenseeRoom(String roomId, String userName, String password) throws Exception {
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (roomId == null || "".equals(roomId)) {
			return null;
		}
		String paramtes = "roomId=" + roomId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.GETROOMINFO, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeRoom temp = gb.create().fromJson(responseJson, GenseeRoom.class);
		return temp;
	}

	/**
	 * 5.5 根据课堂ID 获取录制好的所有课件。 该 API要求认证用户具有组织者或管理员角色。
	 * 
	 * @param roomId
	 *            课堂编号
	 * @param userName
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public static GenseeSynCourse getGenseeRoomCourseList(String roomId, String userName, String password) throws Exception {
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (roomId == null || "".equals(roomId)) {
			return null;
		}
		String paramtes = "roomId=" + roomId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.GETCOURSELIST, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		GenseeSynCourse courseList = new Gson().fromJson(responseJson, GenseeSynCourse.class);
		return courseList;
	}

	/**
	 * 5.6 根据课件ID 获取课件的详细信息。 该 API要求认证用户具有组织者或管理员角色。
	 * 
	 * @param coursewareId
	 *            课件 ID
	 * @param userName
	 *            登录名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeCourseware getCoursewareInfo(String coursewareId, String userName, String password) throws Exception {
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (coursewareId == null || "".equals(coursewareId)) {
			return null;
		}
		String paramtes = "coursewareId=" + coursewareId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.GETCOURSEINFO, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		GenseeCourseware course = new Gson().fromJson(responseJson, GenseeCourseware.class);
		return course;
	}

	/**
	 * 5.7根据课件ID 修改课件的基本属性。 该 API要求认证用户必须具有管理员或者组织者角色
	 * 
	 * @param record
	 *            课件信息
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode updateCoursewareInfo(GenseeCourseware record, String userName, String password) throws Exception {
		GenseeCode code = new GenseeCode();
		if (record == null) {
			return null;
		}
		code.setCode(-1);
		if (record.getId() == null || "".equals(record.getId())) {
			code.setMessage("课件 ID 不能为空");
			return code;
		}
		if (record.getSubject() == null || "".equals(record.getSubject())) {
			code.setMessage("课件名称 不能为空");
			return code;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = ObjectUtils.objectToQueryString(record, new String[] { "userNo", "code", "message" });
		paramtes += "&loginName=" + GenseeInterface.USERNAME + "&password=" + GenseeInterface.PASSWORD;
		logger.debug("paramtes=" + paramtes);
		String responseJson = postURL(GenseeInterface.UPDATECOURSE, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.8 根据课件ID 删除课件。 该 API要求认证用户必须具有管理员或者组织者角色。
	 * 
	 * @param coursewareId
	 *            课件 ID
	 * @param userName
	 *            登录名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode deleteCourseware(String coursewareId, String userName, String password) throws Exception {
		GenseeCode code = new GenseeCode();
		code.setCode(-1);
		if (coursewareId == null || "".equals(coursewareId)) {
			code.setMessage("课件编号不能为空，删除失败");
			return code;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "coursewareId=" + coursewareId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("paramtes=" + paramtes);
		String responseJson = postURL(GenseeInterface.DELETECOURSE, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.9 为站点创建一位老师。在接口形式下，老师主要起到调用接口所需要的账号作用。 <br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色
	 * 
	 * @param record
	 *            展示互动老师实体
	 * @return 展示互动的返回JSON实体类
	 * @throws Exception
	 */
	public static GenseeCode createGenseeTeacher(GenseeTeacher record) throws Exception {
		GenseeCode code = new GenseeCode();
		if (record == null) {
			return null;
		}
		code.setCode(-1);
		if (record.getTeacherLoginName() == null || "".equals(record.getTeacherLoginName())) {
			code.setMessage("用户登录名不能为空");
			return code;
		}
		if (record.getTeacherPassword() == null || "".equals(record.getTeacherPassword())) {
			code.setMessage("用户登录密码不能为空");
			return code;
		}
		if (record.getName() == null || "".equals(record.getName())) {
			code.setMessage("用户名不能为空");
			return code;
		}
		String password = GenseeInterface.PASSWORD;
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = ObjectUtils.objectToQueryString(record, new String[] { "genseeUserNo" });
		paramtes += "&loginName=" + GenseeInterface.USERNAME + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("paramtes=" + paramtes);
		String responseJson = postURL(GenseeInterface.CREATETEACHER, paramtes, CONTENTTYPE);
		logger.debug("responseJson:" + responseJson);
		code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.10分页获取本站点保存的录制件数据。每页50 条数据。 <br/>
	 * 在很多场合下，第三方希望能同步Gensee的录制件信息到自己的系统中。<br/>
	 * 第三方业务系统在同步数据后可以根据自己的业务使用录制件实现课堂插播功能。 <br/>
	 * 该 API要求认证用户具有管理员角色
	 * 
	 * @param pageNo指定第几页
	 *            ，默认为1
	 * @param startTime同步创建时间大于等于startTime
	 *            的录 制件
	 * @param endTime同步创建时间小于等于endTime
	 *            的录 制件
	 * @return
	 * @throws Exception
	 */
	public static GenseeSynRecord SynRecord(Integer pageNo, String startTime, String endTime) throws Exception {

		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (pageNo > 1) {
			pageNo = 1;
		}
		String paramtes = "pageNo=" + pageNo + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.SYNRECORD, paramtes, CONTENTTYPE);
		logger.debug(responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeSynRecord synRecord = gb.create().fromJson(responseJson, GenseeSynRecord.class);
		if (synRecord == null) {
			return null;
		}
		return synRecord;
	}

	/**
	 * 5.11 分页获取本站点中的课件数据。每页最大返回50条数据。 <br/>
	 * 在很多场合下，第三方希望能同步Gensee的课件数据到自己的系统中。 <br/>
	 * 第三方业务系统在同步数据后可以根据自己的业务进行查询，对账等操作。 第三方系统可以使用课件进行观看。 <br/>
	 * 该 API要求认证用户具有管理员角色。
	 * 
	 ** @param pageNo指定第几页
	 *            ，默认为1
	 * @param startTime同步创建时间大于等于startTime
	 *            的录 制件
	 * @param endTime同步创建时间小于等于endTime
	 *            的录 制件
	 * @return
	 * @throws Exception
	 */
	public static GenseeSynCourse SynCourseware(Integer pageNo, String startTime, String endTime) throws Exception {

		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (pageNo > 1) {
			pageNo = 1;
		}
		String paramtes = "pageNo=" + pageNo + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(paramtes);
		String responseJson = postURL(GenseeInterface.SYNCOURSE, paramtes, CONTENTTYPE);
		logger.debug(responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeSynCourse synCourse = gb.create().fromJson(responseJson, GenseeSynCourse.class);
		if (synCourse == null) {
			return null;
		}
		return synCourse;
	}

	/**
	 * 5.12 为站点创建暖场件，供课堂使用。 <br/>
	 * 暖场指：当课堂未开始发布时候，可以让用户先观看一个暖场件。<br/>
	 * 该 API要求认证用户必须具有管理员角色角色
	 * 
	 * @param record
	 *            暖场件实体类
	 * @return
	 * @throws Exception
	 */
	public static GenseeWarmup createWarmup(GenseeWarmup record) throws Exception {

		if (record == null) {
			return null;
		}
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		record.setCode(-1);
		if (record.getName() == null || "".equals(record.getName())) {
			record.setMessage("暖场名称 不能为空");
			return record;
		}
		if (record.getRecordId() == null || "".equals(record.getRecordId())) {
			record.setMessage("录制件ID 不能为空");
			return record;
		}
		String paramtes = ObjectUtils.objectToQueryString(record, new String[] { "userNo" });
		paramtes += "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("createWarmup().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.CREATEWARMUP, paramtes, CONTENTTYPE);
		logger.debug("createWarmup().responseJson : " + responseJson);
		GenseeWarmup result = new Gson().fromJson(responseJson, GenseeWarmup.class);
		if (result == null) {
			record.setMessage("创建暖场件失败");
			return record;
		}
		record.setCode(result.getCode());
		if (result.getCode() != 0) {
			record.setMessage(result.getCode() + ":" + result.getMessage());
			return record;
		}
		record.setId(result.getId());
		record.setMode(result.getMode());
		record.setMessage(result.getMessage());
		return record;
	}

	/**
	 * 5.13 根据暖场件ID 修改设置。 该 API要求认证用户必须具有管理员角色。
	 * 
	 * @param record
	 *            暖场件实体类
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode updateWarmup(GenseeWarmup record) throws Exception {
		if (record == null) {
			return null;
		}
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		GenseeCode code = new GenseeCode();
		code.setCode(-1);
		/*
		 * if (record.getName() == null || "".equals(record.getName())) {
		 * code.setMessage("暖场名称 不能为空"); return code; } if (record.getRecordId()
		 * == null || "".equals(record.getRecordId())) {
		 * code.setMessage("录制件ID 不能为空"); return code; }
		 */
		String paramtes = ObjectUtils.objectToQueryString(record, new String[] { "userNo" });
		paramtes += "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("updateWarmup().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.UPDATEWARMUP, paramtes, CONTENTTYPE);
		logger.debug("updateWarmup().responseJson : " + responseJson);
		code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.14 为课堂指定一个暖场件作为暖场使用。<br/>
	 * 暖场指：当课堂未开始发布时候，可以让用户先观看一个暖场件。 <br/>
	 * 该 API要求认证用户具有管理员角色
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param warmupId
	 *            作为暖场的暖场件ID。
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode attachWarmup(String roomId, String warmupId) throws Exception {
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&warmupId=" + warmupId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("attachWarmup().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.ATTACHWARMUP, paramtes, CONTENTTYPE);
		logger.debug("attachWarmup().responseJson : " + responseJson);
		GenseeCode code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.15 为课堂取消暖场。 该 API要求认证用户具有管理员角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param warmupId
	 *            作为暖场的暖场件ID。 注：当前由于课堂只有一个暖场 件，因此该参数仅作预留扩展使 用。本API不验证warmupId 是
	 *            否是原先的暖场件ID。但希望调 用方自行保证。
	 * @return
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode detachWarmup(String roomId, String warmupId) throws Exception {
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&warmupId=" + warmupId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("attachWarmup().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.DETACHWARMUP, paramtes, CONTENTTYPE);
		logger.debug("attachWarmup().responseJson : " + responseJson);
		GenseeCode code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.16<br/>
	 * 选择一个或多个录制件，作为课堂开启后，客户端中的插播件使用。请调用接口的开发方，注意过滤重复 冗余的录制件信息。 <br/>
	 * 插播：客户端进入后，可以指定某个录制件内容作为发布源，直播给所有web端用户。<br/>
	 * 该 API要求认证用户具有管理员角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param recordId
	 *            录制件 ID，作为客户端插播使用。 （可以多条数据） 注：本API不校验重复的录制件 ID。由调用方自行保证
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode chooseRecord(String roomId, List<Long> recordId) throws Exception {
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String recordIdListParam = "";
		for (Long temp : recordId) {
			recordIdListParam += "&recordId=" + temp;
		}
		String paramtes = "roomId=" + roomId + recordIdListParam + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("chooseRecord().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.CHOOSERECORD, paramtes, CONTENTTYPE);
		logger.debug("chooseRecord().responseJson : " + responseJson);
		GenseeCode code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.17<br/>
	 * 为课堂取消插播件。即去除录制件和课堂的关联关系。请调用接口的开发方，注意过滤重复冗余的录制件 ID。<br/>
	 * 该 API要求认证用户具有管理员角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param recordId
	 *            录制件 ID，作为客户端插播使用。 （可以多条数据
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode removeRecord(String roomId, List<Long> recordId) throws Exception {
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String recordIdListParam = "";
		for (Long temp : recordId) {
			recordIdListParam += "&recordId=" + temp;
		}
		String paramtes = "roomId=" + roomId + recordIdListParam + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("removeRecord().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.REMOVERECORD, paramtes, CONTENTTYPE);
		logger.debug("removeRecord().responseJson : " + responseJson);
		GenseeCode code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.18<br/>
	 * 根据开始时间和结束时间，为课堂导出加入时间在此区域的学生参课记录。<br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有访问记录。 <br/>
	 * 
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param userName
	 *            登录名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeExportHistory exportHistory(String roomId, String startTime, String endTime, String userName, String password) throws Exception {
		if (roomId == null) {
			return null;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("exportStudyHistory().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.EXPORTHISTORY, paramtes, CONTENTTYPE);
		logger.debug("exportStudyHistory().responseJson : " + responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeExportHistory exportHistory = gb.create().fromJson(responseJson, GenseeExportHistory.class);
		return exportHistory;
	}

	/**
	 * 5.19<br/>
	 * 根据开始时间和结束时间，为课堂导出学生参课过程中的Q&A 记录。<br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有 Q&A 记录。 <br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param userName
	 *            登录名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeExportQA exportRoomQA(String roomId, String startTime, String endTime, String userName, String password) throws Exception {
		if (roomId == null) {
			return null;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("exportRoomQA().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.EXPORTQA, paramtes, CONTENTTYPE);
		logger.debug("exportRoomQA().responseJson : " + responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeExportQA exportQA = gb.create().fromJson(responseJson, GenseeExportQA.class);
		return exportQA;
	}

	/**
	 * 5.20<br/>
	 * 根据开始时间和结束时间，为课堂导出点名发起时间在此区域的学生点名记录。 <br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有点名记录。 <br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param userName
	 *            登录名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeExportRollcall exportRoomRollcall(String roomId, String startTime, String endTime, String userName, String password) throws Exception {
		if (roomId == null) {
			return null;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("exportRoomRollcall().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.EXPORTROLLCALL, paramtes, CONTENTTYPE);
		logger.debug("exportRoomRollcall().responseJson : " + responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeExportRollcall exportRollcall = gb.create().fromJson(responseJson, GenseeExportRollcall.class);
		return exportRollcall;
	}

	/**
	 * 5.21<br/>
	 * 根据开始时间和结束时间，为课堂导出投票调查发起时间在此区域的学生投票调查结果。 <br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有投票记录。 <br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param userName
	 *            登录名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeExportVote exportRoomVote(String roomId, String startTime, String endTime, String userName, String password) throws Exception {
		if (roomId == null) {
			return null;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("exportRoomVote().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.EXPORTVOTE, paramtes, CONTENTTYPE);
		logger.debug("exportRoomVote().responseJson : " + responseJson);
		GenseeExportVote exportVote = new Gson().fromJson(responseJson, GenseeExportVote.class);
		return exportVote;
	}

	/**
	 * 5.22<br/>
	 * 分页获取本站点保存的文档数据。每页50条数据。 <br/>
	 * 在很多场合下，第三方希望能同步的服务端文档信息到自己的系统中。 <br/>
	 * 第三方业务系统在同步数 据后可以根据自己的业务进行查询，为课堂分配服务端文档等操作。<br/>
	 * 该 API要求认证用户具有管理员角色
	 * 
	 * @param pageNo
	 *            指定第几页，默认为1
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @return
	 * @throws Exception
	 */
	public static GenseeSynDoc docSyn(Integer pageNo, String startTime, String endTime) throws Exception {
		if (pageNo < 1) {
			pageNo = 1;
		}
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "pageNo=" + pageNo + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("docSyn().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.DOCSYN, paramtes, CONTENTTYPE);
		logger.debug("docSyn().responseJson : " + responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeSynDoc synDoc = gb.create().fromJson(responseJson, GenseeSynDoc.class);
		return synDoc;
	}

	/**
	 * 5.23<br/>
	 * 选择一个服务端文档，作为课堂开启后，客户端中的文档内容使用。<br/>
	 * 该 API要求认证用户具有管理员角色
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param docId
	 *            文档 ID
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode docAttach(String roomId, Long docId) throws Exception {
		if (roomId == null || docId == null) {
			return null;
		}
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&docId=" + docId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("docSyn().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.DOCATTACH, paramtes, CONTENTTYPE);
		logger.debug("docSyn().responseJson : " + responseJson);
		GenseeCode code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.24<br/>
	 * 为课堂取消服务端文档。即去除文档和课堂的关联关系。<br/>
	 * 该 API要求认证用户具有管理员角色
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param docId
	 *            文档 ID
	 * @return
	 * @throws Exception
	 */
	public static GenseeCode docDetach(String roomId, Long docId) throws Exception {
		if (roomId == null || docId == null) {
			return null;
		}
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&docId=" + docId + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("docSyn().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.DOCDETACH, paramtes, CONTENTTYPE);
		logger.debug("docSyn().responseJson : " + responseJson);
		GenseeCode code = new Gson().fromJson(responseJson, GenseeCode.class);
		return code;
	}

	/**
	 * 5.25<br/>
	 * 为课件导出按天同步访问记录。<br/>
	 * 该 API要求认证用户具有管理员角色
	 * 
	 * @param pageNo
	 *            页数（从1开始）
	 * @param date
	 *            开始时间
	 * @param hour
	 *            小时（0-23）不填默认为全天数据
	 * @return
	 * @throws Exception
	 */
	public static GenseeExportStudyHistory exportStudyHistory(Integer pageNo, String date, Integer hour) throws Exception {
		if (pageNo < 1) {
			pageNo = 1;
		}
		if (date == null || "".equals(date)) {
			return null;
		}
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "pageNo=" + pageNo + "&date=" + date + "&hour=" + hour + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("exportStudyHistory().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.EXPORTSTUDYHISTORY, paramtes, CONTENTTYPE);
		logger.debug("exportStudyHistory().responseJson : " + responseJson);
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(java.util.Date.class, new GenseeApiUtils.DateDeserializer()).setDateFormat(DateFormat.LONG);
		GenseeExportStudyHistory exportStudyHistory = gb.create().fromJson(responseJson, GenseeExportStudyHistory.class);
		return exportStudyHistory;
	}

	/**
	 * 5.26<br/>
	 * 根据开始时间和结束时间，导出实时课堂学生的公共聊天数据。<br/>
	 * 如果没有提供开始时间和结束时间，则找到最近结束的课堂场次，导出该场次的所有学生公共聊天记录。<br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户具有老师或管理员角色。 管理员可以操作站点内所有课堂，老师只能操作自己创建的课堂。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param startTime
	 *            聊天时间大等于开始时间
	 * @param endTime
	 *            聊天数据小等于结束时间
	 * @param userName
	 *            登录名
	 * @param password
	 *            password String
	 * @return
	 * @throws Exception
	 */
	public static GenseeExportChat exportChat(String roomId, String startTime, String endTime, String userName, String password) throws Exception {
		if (roomId == null || "".equals(roomId)) {
			return null;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("exportChat().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.EXPORTCHAT, paramtes, CONTENTTYPE);
		logger.debug("exportChat().responseJson : " + responseJson);
		GenseeExportChat exportChat = new Gson().fromJson(responseJson, GenseeExportChat.class);
		return exportChat;
	}

	/**
	 * 5.27<br/>
	 * 通过该接口上传转码第三方文档。<br/>
	 * 该 API要求认证用户必须具有管理员角色或组织者角色
	 * 
	 * @param record
	 *            转换文档
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static GenseeTranscode TranscodeDoc(GenseeTranscode record, String userName, String password) throws Exception {
		if (record == null) {
			return null;
		}
		if (userName == null || "".equals(userName)) {
			userName = GenseeInterface.USERNAME;
		}
		if (password == null || "".equals(password)) {
			password = GenseeInterface.PASSWORD;
		}
		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		if (record.getResourceUrl() == null || "".equals(record.getResourceUrl())) {
			record.setMessage("原始文档地址不能为空");
			return record;
		}
		if (record.getName() == null || "".equals(record.getName())) {
			record.setMessage("文档名称 不能为空");
			return record;
		}
		String paramtes = ObjectUtils.objectToQueryString(record, new String[] { "fileId", "userNo" });
		paramtes += "&callbackUrl=" + GenseeInterface.CALLBACKINTERFACE + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug(GenseeInterface.COURSETRANSCODE + "/paramtes=" + paramtes);
		String responseJson = postURL(GenseeInterface.COURSETRANSCODE, paramtes, CONTENTTYPE);
		logger.debug(GenseeInterface.COURSETRANSCODE + "/responseJson=" + responseJson);
		GenseeTranscode temp = new Gson().fromJson(responseJson, GenseeTranscode.class);
		if (temp == null) {
			return null;
		}
		record.setCode(temp.getCode());
		if (temp.getCode() != 0) {
			record.setMessage(temp.getCode() + ":" + temp.getMessage());
			return record;
		}
		record.setCoursewareCode(temp.getCoursewareCode());
		record.setCoursewareId(temp.getCoursewareId());
		record.setVisitUrl(temp.getVisitUrl());
		record.setMessage(temp.getMessage());
		return record;
	}

	/**
	 * 5.28<br/>
	 * 根据开始时间和结束时间，导出某个课堂其结束时间在此区域的场次纪录。<br/>
	 * 如果不提供课堂ID，则查找范围为所有课堂。<br/>
	 * 注意：开始时间和结束时间间隔不能超过7天。<br/>
	 * 该 API要求认证用户必须具有管理员角色。
	 * 
	 * @param roomId
	 *            课堂 ID
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @return
	 * @throws Exception
	 */
	public static GenseeExportRoomUsage exportRoomUsage(String roomId, String startTime, String endTime) throws Exception {
		if (roomId == null || "".equals(roomId)) {
			return null;
		}
		String userName = GenseeInterface.USERNAME;

		String password = GenseeInterface.PASSWORD;

		if (GenseeInterface.SEC) {
			password = Encrypt.md5(password);
		}
		String paramtes = "roomId=" + roomId + "&startTime=" + startTime + "&endTime=" + endTime + "&loginName=" + userName + "&password=" + password + "&sec=" + GenseeInterface.SEC;
		logger.debug("exportRoomUsage().paramtes : " + paramtes);
		String responseJson = postURL(GenseeInterface.EXPORTROOMUSAGE, paramtes, CONTENTTYPE);
		logger.debug("exportRoomUsage().responseJson : " + responseJson);
		GenseeExportRoomUsage exportRoomUsage = new Gson().fromJson(responseJson, GenseeExportRoomUsage.class);
		return exportRoomUsage;
	}
}
