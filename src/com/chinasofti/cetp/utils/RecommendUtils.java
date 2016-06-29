package com.chinasofti.cetp.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.study.dao.SpecCourseViewMapper;
import com.chinasofti.cetp.study.model.SpecCourseView;
import com.chinasofti.cetp.study.model.SpecCourseViewExample;

public class RecommendUtils {
	private static Map<String, List<SpecCourseView>> recommendMap = new HashMap<String, List<SpecCourseView>>();
	private static Map<String, List<SpecCourseView>> recommendTypeMap = new HashMap<String, List<SpecCourseView>>();
	public static void refreshAll() {
		recommendMap.clear();
		recommendTypeMap.clear();
	}
	public static List<SpecCourseView> getRecommend(String key, Object[] params) {
		if (key == null || "".equals(key)) {
			return new ArrayList<SpecCourseView>();
		}
		if (!recommendMap.containsKey(key)) {
			// ApplicationContext ctx = new ClassPathXmlApplicationContext(
			// "springmvc.xml");
			// SpecCourseViewMapper specCourseViewMapper =
			// (SpecCourseViewMapper) ctx
			// .getBean("specCourseViewMapper");
			SpecCourseViewMapper specCourseViewMapper = BeanUtils.getBean("specCourseViewMapper", SpecCourseViewMapper.class);
			if ("study".equalsIgnoreCase(key)) {
				SpecCourseViewExample example = new SpecCourseViewExample();
				example.setOrderByClause("hitNum desc");
				example.createCriteria().andSpecStatusEqualTo("3");
				RowBounds rowBounds = new RowBounds(0, 5);
				List<SpecCourseView> list = specCourseViewMapper.selectByExampleWithBLOBs(example, rowBounds);
				recommendMap.put(key, list);
			} else if (key.startsWith("techType")) {
				Integer techTypeId = (Integer) params[0];
				List<SpecCourseView> list = specCourseViewMapper.selectRecByTechType(techTypeId);
				recommendMap.put(key, list);
			} else if (key.startsWith("prof")) {
				Integer profId = (Integer) params[0];
				List<SpecCourseView> list = specCourseViewMapper.selectByProfId(profId);
				recommendMap.put(key, list);

			}
		}
		return recommendMap.get(key);
	}

	public static List<SpecCourseView> getRecommendTypeList(String key) {
		if (key == null || "".equals(key)) {
			return new ArrayList<SpecCourseView>();
		}
		if (!recommendTypeMap.containsKey(key)) {
			SpecCourseViewMapper specCourseViewMapper = BeanUtils.getBean("specCourseViewMapper", SpecCourseViewMapper.class);
			if ("0".equalsIgnoreCase(key)) {
				List<SpecCourseView> list = specCourseViewMapper.selectRecommCourseByOterType(key);
				recommendTypeMap.put(key, list);
			} else if ("1".equalsIgnoreCase(key)) {
				List<SpecCourseView> list = specCourseViewMapper.selectRecommCourseByOterType(key);
				recommendTypeMap.put(key, list);
			} else if ("2".equalsIgnoreCase(key)) {
				List<SpecCourseView> list = specCourseViewMapper.selectRecommCourseByOterType(key);
				recommendTypeMap.put(key, list);
			} else if ("3".equalsIgnoreCase(key)) {
				List<SpecCourseView> list = specCourseViewMapper.selectRecommCourseByOterType(key);
				recommendTypeMap.put(key, list);
			}
		}
		return recommendTypeMap.get(key);
	}

}
