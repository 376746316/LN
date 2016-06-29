package com.chinasofti.cetp.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Date;

public class ObjectUtils {

	public static String objectToQueryString(Object obj) throws Exception {
		return objectToQueryString(obj, new String[] {});
	}

	public static String objectToQueryString(Object obj, String[] properties) throws Exception {
		String queryString = "";
		if (obj == null) {
			return queryString;
		}

		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		labelPD: for (PropertyDescriptor property : propertyDescriptors) {
			String key = property.getName();
			if (key.compareToIgnoreCase("class") == 0) {
				continue;
			}
			for (String prop : properties) {
				if (key.compareToIgnoreCase(prop) == 0) {
					continue labelPD;
				}
			}

			Method getter = property.getReadMethod();
			Object value = getter != null ? getter.invoke(obj) : null;

			if (value != null) {
				if (value.getClass().equals(Date.class)) {
					queryString += key + "=" + String.valueOf(((Date) value).getTime()) + "&";
				} else {
					queryString += key + "=" + URLEncoder.encode(value.toString(), "UTF-8") + "&";
				}
			}

		}
		if (queryString.length() > 0) {
			queryString = queryString.substring(0, queryString.length() - 1);
		}
		return queryString;
	}
}
