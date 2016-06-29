package com.chinasofti.cetp.interceptor;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.DocConverter;

/**
 * 登陆拦截器
 * 
 * @Company : ICS&S DL-ETC
 * 
 * @Author : HuangQi
 * @Version : 1.0
 * @Create : 20132013-10-8下午5:15:37 TODO :
 */
public class BackGroundInterceptor implements HandlerInterceptor {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	private List<String> excludedUrls;

	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		// 设置字符编码和ContentType
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String requestUri = request.getRequestURI();
		String queryString = request.getQueryString();
		queryString = (queryString != null) ? ("?" + queryString) : "";
		for (String url : excludedUrls) {
			if (url.endsWith(".do")) {
				if (requestUri.endsWith(url)) {
					return true;
				}
			} else {
				if ((requestUri + queryString).endsWith(url)) {
					return true;
				}
			}
		}

		HttpSession session = request.getSession();
		if (session.getAttribute(Constants.SESSIONINFO) == null) {
			PrintWriter out = response.getWriter();
			StringBuilder builder = new StringBuilder();
			builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
			builder.append("document.getElementById(\"login\").click();");
			// builder.append("window.top.location=\"towebsite.do\"");
			builder.append("</script>");
			out.print(builder.toString());
			out.flush();
			out.close();
			return false;
		} else {
			return true;
		}

	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

}
