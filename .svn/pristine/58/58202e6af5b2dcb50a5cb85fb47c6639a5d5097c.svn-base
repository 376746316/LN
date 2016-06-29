package com.chinasofti.cetp.core.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.utils.mail.MailSenderInfo;
import com.chinasofti.cetp.utils.mail.SimpleMailSender;
import com.chinasofti.cetp.utils.PropertiesUtil;

/**
 * Email 服务层
 * 
 * @author heyuqiang
 * 
 */
@Service
public class EmailService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(EmailService.class);

	private static String mailServerHost = PropertiesUtil.getProperty("/config.properties", "mail.mailServerHost");
	private static String mailServerPort = PropertiesUtil.getProperty("/config.properties", "mail.mailServerPort");
	private Boolean isValidate = true;
	private static String userName = PropertiesUtil.getProperty("/config.properties", "mail.userName");
	private static String password = PropertiesUtil.getProperty("/config.properties", "mail.password");
	private static String fromAddress = PropertiesUtil.getProperty("/config.properties", "mail.fromAddress");
	//private static String subject = PropertiesUtil.getProperty("/config.properties", "mail.subject");

	/**
	 * 发送邮件
	 * 
	 * @param toAddress
	 *            邮件目标地址
	 * @param htmlMessage
	 *            邮件内容
	 * @return true-发送成功，false-发送失败
	 */
	@SuppressWarnings("static-access")
	public Boolean sendEmail(String toAddress, String htmlMessage, String subject) {
		Boolean flag = false;
		// 设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost(mailServerHost);
		mailInfo.setMailServerPort(mailServerPort);
		mailInfo.setValidate(isValidate);
		mailInfo.setUserName(userName); // 用户名
		mailInfo.setPassword(password);// 您的邮箱密码
		mailInfo.setFromAddress(fromAddress);
		mailInfo.setToAddress(toAddress);
		mailInfo.setSubject(subject);// 标题内容
		mailInfo.setContent(htmlMessage);// 文本内容
		// 发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		try {
			// sms.sendTextMail(mailInfo);// 发送文体格式
			logger.info("系统正在向【 " + toAddress + " 】邮箱发出安全验证信息......");
			sms.sendHtmlMail(mailInfo);// 发送html格式
			flag = true; // 发送成功
			logger.info("验证信息已成功发送到【 " + toAddress + " 】邮箱。");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("邮件发送失败:" + e.getMessage());
		}

		return flag;
	}
	
	/**
	 * 找回密码成功后发送邮件提醒
	 * 
	 * @param mail
	 *            目标邮件加密邮件
	 * @param verifyCode
	 *            验证码
	 * @return
	 */
	public String getFindPwdMessage(String mail, String verifyCode) {

		// 获取当前时间
		SimpleDateFormat sf = new SimpleDateFormat("M月d日");
		String currentTime = sf.format(new Date());

		StringBuffer theMessage = new StringBuffer();
		theMessage.append("<div id=\"mailContentContainer\" class=\"qmbox qm_con_body_content\">");
		theMessage.append("<p>亲爱的用户：</p>");
		theMessage.append("<p>您好！</p>");
		theMessage.append("<p>用户[<font color=\"red\"><b>" + mail + "</b></font>] 在<span style=\"border-bottom:1px dashed #ccc;\" t=\"5\" times=\"\">" + currentTime + "</span>向<font color=\"red\"><b>宅客学院安全中心</b></font>申请通过该邮箱获取<font color=\"red\">宅客学院安全中心帐号安全验证码</font>。</p>");
		theMessage.append("<p>请将本次宅客学院安全中心帐号安全验证码填入页面对应的输入框中，继续完成您的操作。</p>");
		theMessage.append("<p>您本次帐号安全验证码为：<font color=\"red\"><b>" + verifyCode + "</b></font></p>");
		theMessage.append("<p>宅客学院安全中心帐号安全验证码有效时间为10分钟，连续输错5次将被停止验证功能1小时。</p>");
		theMessage.append("<br>");
		theMessage.append("<p>温馨提示：</p>");
		theMessage.append("<p>1、宅客学院安全中心统一邮箱为<b><a href=\"mailto:" + fromAddress + "\" target=\"_blank\">" + fromAddress + "</a></b> ，请注意邮件发送者，谨防假冒！</p>");
		theMessage.append("<p>2、本邮件为系统自动发出，请勿回复。</p>");
		theMessage.append("<p>感谢您使用宅客学院培训平台服务，有任何问题您都可以登录 <a href=\"http://www.zhaikexueyuan.com\" target=\"_blank\">http://www.zhaikexueyuan.com</a>与我们的客服中心联系！</p>");
		theMessage.append("</div>");

		return theMessage.toString();
	}

	/**
	 * 激活账号发送邮件提醒
	 * 
	 * @param stuUserid
	 *            用户登录名
	 * @param activateURL
	 *            激活链接ULR
	 * @return
	 */
	public String getActivateAccountMessage(String stuUserid, String activateURL) {
		// 获取当前时间
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sf.format(new Date());

		StringBuffer theMessage = new StringBuffer();
		theMessage.append("<div id=\"mailContentContainer\" class=\"qmbox qm_con_body_content\">");
		theMessage.append("<p>亲爱的用户：</p>");
		theMessage.append("<p>您好！</p>");
		theMessage.append("<p>您于" + currentTime + "注册宅客学院账号 [<font color=\"red\"><b>" + stuUserid + "</b></font>]点击以下链接，即可激活该帐号：</p>");
		theMessage.append("<p><a href=\"" + activateURL + "\" target=\"_blank\">" + activateURL + "</a></p>");
		theMessage.append("<p style=\"margin:0px;padding:0px;line-height:24px;font-size:12px;color:#979797;font-family:arial,sans-serif;\">(如果您无法点击此链接，请将它复制到浏览器地址栏后访问)</p>");
		theMessage.append("<br>");
		theMessage.append("<p>温馨提示：</p>");
		theMessage.append("<p>1、为了保障您帐号的安全性，请在 48小时内完成激活，此链接将在您激活过一次后失效！</p>");
		theMessage.append("<p>2、登录“宅客学院”，免费学习案例驱动课程，畅享社区乐趣，享受项目实训、就业求职、在线答疑等定制服务……</p>");
		theMessage.append("</div>");

		return theMessage.toString();

	}

	
	/**
	 * 用户修改密码成功后发送邮件提醒
	 * 
	 * @param userName
	 *            用户登录名
	 * @return
	 */
	public String getUpdatePwdMessage(String userName) {

		// 获取当前时间
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sf.format(new Date());

		StringBuffer theMessage = new StringBuffer();
		theMessage.append("<div id=\"mailContentContainer\" class=\"qmbox qm_con_body_content\">");
		theMessage.append("<p>亲爱的用户：</p>");
		theMessage.append("<p>您好！</p>");
		theMessage.append("<p>系统监测到您的帐号[<font color=\"red\"><b>" + userName + "</b></font>] 在<span style=\"border-bottom:1px dashed #ccc;\" t=\"5\" times=\"\">" + currentTime + "</span>修改了密码。</p>");
		theMessage.append("<p> 如非本人操作，请及时  <a href=\"http://www.zhaikexueyuan.com\" target=\"_blank\">修改密码</a> 并查看帐号的安全性。</p>");
		theMessage.append("<br>");
		theMessage.append("<p>温馨提示：</p>");
		theMessage.append("<p>1、宅客学院安全中心统一邮箱为<b><a href=\"mailto:" + fromAddress + "\" target=\"_blank\">" + fromAddress + "</a></b> ，请注意邮件发送者，谨防假冒！</p>");
		theMessage.append("<p>2、本邮件为系统自动发出，请勿回复。</p>");
		theMessage.append("<p>感谢您使用宅客学院培训平台服务，有任何问题您都可以登录 <a href=\"http://www.zhaikexueyuan.com\" target=\"_blank\">http://www.zhaikexueyuan.com</a>与我们的客服中心联系！</p>");
		theMessage.append("</div>");

		return theMessage.toString();
	}

}
