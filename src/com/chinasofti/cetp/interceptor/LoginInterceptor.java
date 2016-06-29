package com.chinasofti.cetp.interceptor;

import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.cetp.utils.CetpUtils;
import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.LoginRequired;

/**
 * 登录拦截器
 * 
 * @author Fly
 * 
 */
public class LoginInterceptor implements HandlerInterceptor {
	private static final Logger logger = Logger.getLogger(LoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		HandlerMethod method = (HandlerMethod) handler;
		LoginRequired loginRequired = method.getMethodAnnotation(LoginRequired.class);

		if (loginRequired != null) {
			logger.debug("method [" + method.getMethod().getName() + "], loginRequired " + loginRequired.type());
			HttpSession session = request.getSession();
			switch (loginRequired.type()) {
			case BACKGROUND:
				// 设置字符编码和ContentType
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=UTF-8");
				if (session.getAttribute(CetpUtils.SESSION_USER_ID) == null) {
					PrintWriter out = response.getWriter();
					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
					builder.append("alert(\"用户信息过期 请重新登录\");");
					builder.append("window.top.location=\"" + request.getContextPath() + "/tologin.do\"");
					builder.append("</script>");
					out.print(builder.toString());
					out.flush();
					out.close();
					return false;
				} else {
					return true;
				}
			case NORMAL:
				if (session.getAttribute(Constants.SESSIONINFO) == null) {
					String requestUri = request.getRequestURI();
					String queryString = request.getQueryString();
					queryString = (queryString != null) ? ("?" + queryString) : "";
					String redirectTo = "".endsWith(loginRequired.redirectTo()) ? requestUri + queryString : request.getContextPath() + loginRequired.redirectTo();
					request.setCharacterEncoding("UTF-8");
					response.setCharacterEncoding("UTF-8");
					PrintWriter out = response.getWriter();
					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
					builder.append("window.top.location=\"" + request.getContextPath() + "/sys.do?method=loginRedirect&redirect=" + URLEncoder.encode(redirectTo, "UTF-8") + "\";");
					builder.append("</script>");
					out.print(builder.toString());
					out.flush();
					return false;
				} else {
					return true;
				}
			default:
				break;
			}
		}
		return true;
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
