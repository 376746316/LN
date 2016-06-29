package com.chinasofti.cetp.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUtils {
	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("springmvc.xml");

	public static <T> T getBean(String beanName, Class<T> cls) {
		return ctx.getBean(beanName, cls);
	}
}
