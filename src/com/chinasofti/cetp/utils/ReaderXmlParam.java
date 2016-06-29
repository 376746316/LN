package com.chinasofti.cetp.utils;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * <p>
 * package:com.chinasofti.cetp.utils <br>
 * class:ReaderXmlParam <br>
 * description:从xml文件中读取公共数据 <br>
 * createdate:2013-07-26
 * </p>
 * 
 * @author JianWang
 * @version 1.0
 * */
public class ReaderXmlParam {
	private static final Logger logger = Logger.getLogger(ReaderXmlParam.class);
	// added by Jamie
	private static Map<String, Map<String, Param>> configMap = new HashMap<String, Map<String, Param>>();
	public static Map<String, Map<String, Param>> convertConfigMap = new HashMap<String, Map<String, Param>>();
	private static ReaderXmlParam instance = new ReaderXmlParam();
	private File xmlFile;

	/**
	 * <p>
	 * method:ReaderXmlParam <br>
	 * description:实例化xmlFile
	 * </p>
	 * */
	public ReaderXmlParam() {
		// 创建xml文件对象
		try {
			xmlFile = new File(URLDecoder.decode(getClass().getClassLoader()
					.getResource("config.xml").getPath(), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		}
		logger.info("读取xml文件" + xmlFile.getAbsolutePath());
		// 初始化所有参数
		initConfig();
	}

	/**
	 * <p>
	 * method:ReaderXmlParam <br>
	 * description:初始化所有的参数,将参数放到Map表中方便随时读取 added by Jamie
	 * </p>
	 * */
	private void initConfig() {
		logger.info("初始化所有的参数,将参数放到Map表中方便随时读取");
		if (xmlFile.exists()) {
			try {
				// 建立SAXReader的xml解析对象
				SAXReader reader = new SAXReader();
				// 读入文档流
				Document document = reader.read(xmlFile);
				logger.info("读入文档流");
				// 获取根节点
				Element root = document.getRootElement();

				// 解析parent-param节点 ，获取parent-param元素，放入迭代器中
				Iterator itor = root.elementIterator("parent-param");
				// 便利迭代器
				while (itor.hasNext()) {
					// 获取迭代器单个parent-param元素
					Element parent_param = (Element) itor.next();
					// 获取单个parent-param元素的属性值
					String parentparam_id = parent_param.attributeValue("id")
							.trim();
					String parentparam_value = parent_param.attributeValue(
							"value").trim();
					Iterator itor1 = parent_param.elementIterator("param");

					// 初始化存储id和param对象的Map
					Map<String, Param> paramMap = new HashMap<String, Param>();
					Map<String, Param> convertParamMap = new HashMap<String, Param>();
					while (itor1.hasNext()) {
						// 获取迭代器单个param元素
						Element param = (Element) itor1.next();
						String param_id = param.attributeValue("id").trim();
						String param_value = param.attributeValue("value")
								.trim();
						Param paramobj = new Param(param_id, param_value);
						paramMap.put(param_id, paramobj);
						convertParamMap.put(param_value, paramobj);
					}

					configMap.put(parentparam_id, paramMap);
					logger.info("初始化参数 " + parentparam_id + " : "
							+ parentparam_value);
					convertConfigMap.put(parentparam_value, convertParamMap);
				}
			} catch (DocumentException e) {
				e.printStackTrace();
     			StringWriter sw = new StringWriter();
     			e.printStackTrace(new PrintWriter(sw, true));
     			String str = sw.toString();
     			logger.error(str);
			}

		}

	}

	/**
	 * <p>
	 * method:getInstance <br>
	 * description:获取ReaderXmlParam的单例
	 * </p>
	 * */
	public static ReaderXmlParam getInstance() {
		return instance;
	}

	/**
	 * <p>
	 * method:getInstance <br>
	 * description:获取ReaderXmlParam的单例
	 * </p>
	 * */
	public String getPath() {
		return xmlFile.getAbsolutePath();
	}

	/**
	 * <p>
	 * method:getParam <br>
	 * description:获取单个子参实体
	 * </p>
	 * 
	 * @param parentparamid
	 *            String
	 * @param paramid
	 *            String
	 * @return Param
	 * */
	public Param getParam(String parentparamid, String paramid) {

		// 根据parentparamid读取参数Map,然后根据paramid读取Param对象

		Map<String, Param> paramMap = configMap.get(parentparamid);
		Param paramobj = paramMap.get(paramid);
		return paramobj;
	}

	/**
	 * 获取单个反转子参实体
	 * 
	 * @param parentparamValue
	 * @param paramValue
	 * @return
	 */
	public Param getConvertParam(String parentparamValue, String paramValue) {

		// 根据parentparamid读取参数Map,然后根据paramid读取Param对象
		Map<String, Param> paramMap = convertConfigMap.get(parentparamValue);
		Param paramobj = paramMap.get(paramValue);
		return paramobj;
	}

	/**
	 * <p>
	 * method:getParammain <br>
	 * description:获取单个子参实体
	 * </p>
	 * 
	 * @param parentparamid
	 *            String
	 * @param paramid
	 *            String
	 * @return String
	 * */
	public String getParammain(String parentparamid, String paramid) {

		// 子参实体
		Param paramobj = getParam(parentparamid, paramid);
		String parammain = null;
		if (paramobj != null) {
			parammain = paramobj.getParam_name();
		}
		return parammain;
	}

	/**
	 * 获取反转单个子参实体
	 * 
	 * @param parentparamValue
	 * @param paramValue
	 * @return
	 */
	public String getConvertParammain(String parentparamValue, String paramValue) {

		// 子参实体
		Param paramobj = getConvertParam(parentparamValue, paramValue);
		String parammain = null;
		if (paramobj != null) {
			parammain = paramobj.getParam_id();
		}
		return parammain;
	}

	/**
	 * <p>
	 * method:getParamList <br>
	 * description:获取子参实列表
	 * </p>
	 * 
	 * @param parentparamid
	 *            String
	 * @return List<Param>
	 * */
	public List<Param> getParamList(String parentparamid) {
		List<Param> paramlist = new ArrayList<Param>();

		// 根据parentparamid找到参数Map
		Map<String, Param> paramMap = configMap.get(parentparamid);

		Iterator<Entry<String, Param>> iter = paramMap.entrySet().iterator();

		// 遍历所有参数
		while (iter.hasNext()) {
			Entry<String, Param> entry = (Entry<String, Param>) iter.next();
			Param param = entry.getValue();
			int index = paramlist.size();
			while (index > 0
					&& param.getParam_id().compareTo(
							paramlist.get(index - 1).getParam_id()) < 0) {
				index--;
			}
			paramlist.add(index, param);
		}

		return paramlist;
	}

	/**
	 * 获得反转的子ParamList，value作为查询条件
	 * 
	 * @param parentparamValue
	 * @return
	 */
	public List<Param> getConvertParamList(String parentparamValue) {
		List<Param> paramlist = new ArrayList<Param>();

		// 根据parentparamid找到参数Map
		Map<String, Param> paramMap = convertConfigMap.get(parentparamValue);

		Iterator<Entry<String, Param>> iter = paramMap.entrySet().iterator();

		// 遍历所有参数
		while (iter.hasNext()) {
			Entry<String, Param> entry = (Entry<String, Param>) iter.next();
			Param param = entry.getValue();
			int index = paramlist.size();
			while (index > 0
					&& param.getParam_id().compareTo(
							paramlist.get(index - 1).getParam_id()) < 0) {
				index--;
			}
			paramlist.add(index, param);
		}

		return paramlist;
	}

	/**
	 * <p>
	 * method:getParamList <br>
	 * description:获取参数列表包含子参实列表
	 * </p>
	 * 
	 * @param parentparamid
	 *            String
	 * @return List<Parentparam>
	 * */
	public List<Parentparam> getParentparamList(String parentparamid) {
		List<Parentparam> parentparamlist = null;
		Parentparam parentparam = null;
		// 判断xml文件是否存在
		if (xmlFile.exists()) {
			try {
				parentparamlist = new ArrayList<Parentparam>();
				logger.info("yes");
				// 建立SAXReader的xml解析对象
				SAXReader reader = new SAXReader();
				// 读入文档流
				Document document = reader.read(xmlFile);
				// 获取根节点
				Element root = document.getRootElement();
				// 打印根节点标签名
				logger.info(root.getName());
				// 解析parent-param节点 ，获取parent-param元素，放入迭代器中
				Iterator itor = root.elementIterator("parent-param");
				while (itor.hasNext()) {
					// 获取迭代器单个parent-param元素
					Element parent_param = (Element) itor.next();
					// 获取单个parent-param元素的属性值
					String parentparam_id = parent_param.attributeValue("id");
					if (parentparamid.equals(parentparam_id)) {
						String parentparam_value = parent_param
								.attributeValue("value");
						parentparam = new Parentparam(parentparam_id,
								parentparam_value);
						Iterator itor1 = parent_param.elementIterator("param");
						List<Param> paramlist = new ArrayList<Param>();
						while (itor1.hasNext()) {
							// 获取迭代器单个param元素
							Element param = (Element) itor1.next();
							// 获取单个param元素的属性值
							String param_id = param.attributeValue("id");
							String param_value = param.attributeValue("value");
							paramlist.add(new Param(param_id, param_value));
						}
						parentparam.setParam_list(paramlist);
						parentparamlist.add(parentparam);
						break;
					}
				}

			} catch (DocumentException e) {
				e.printStackTrace();
     			StringWriter sw = new StringWriter();
     			e.printStackTrace(new PrintWriter(sw, true));
     			String str = sw.toString();
     			logger.error(str);
			}
		}
		return parentparamlist;
	}

	/**
	 * 获得反转的参数列表，value值作为查询参数
	 * 
	 * @param parentValue
	 * @return
	 */
	public List<Parentparam> getConvertParentparamList(String parentValue) {
		List<Parentparam> parentparamlist = null;
		Parentparam parentparam = null;
		// 判断xml文件是否存在
		if (xmlFile.exists()) {
			try {
				parentparamlist = new ArrayList<Parentparam>();
				logger.info("yes");
				// 建立SAXReader的xml解析对象
				SAXReader reader = new SAXReader();
				// 读入文档流
				Document document = reader.read(xmlFile);
				// 获取根节点
				Element root = document.getRootElement();
				// 打印根节点标签名
				logger.info(root.getName());
				// 解析parent-param节点 ，获取parent-param元素，放入迭代器中
				Iterator itor = root.elementIterator("parent-param");
				while (itor.hasNext()) {
					// 获取迭代器单个parent-param元素
					Element parent_param = (Element) itor.next();
					// 获取单个parent-param元素的属性值
					String parentparam_value = parent_param
							.attributeValue("value");
					if (parentValue.equals(parentparam_value)) {
						String parentparam_id = parent_param
								.attributeValue("id");
						parentparam = new Parentparam(parentparam_id,
								parentparam_value);
						Iterator itor1 = parent_param.elementIterator("param");
						List<Param> paramlist = new ArrayList<Param>();
						while (itor1.hasNext()) {
							// 获取迭代器单个param元素
							Element param = (Element) itor1.next();
							// 获取单个param元素的属性值
							String param_id = param.attributeValue("id");
							String param_value = param.attributeValue("value");
							paramlist.add(new Param(param_id, param_value));
						}
						parentparam.setParam_list(paramlist);
						parentparamlist.add(parentparam);
						break;
					}
				}

			} catch (DocumentException e) {
				e.printStackTrace();
     			StringWriter sw = new StringWriter();
     			e.printStackTrace(new PrintWriter(sw, true));
     			String str = sw.toString();
     			logger.error(str);
			}
		}
		return parentparamlist;
	}

	public void checkParam(String param) throws Exception {
		if (param == null) {
			//checkInstance(param);

		} else {
			// checkConfig(param,"02");
		}
	}

	public void markHard(String param) throws Exception {
		if (param == null) {
			//checkInstance(param);

		} else {
			// checkConfig(param,"01");
		}
	}

	private void checkInstance(String param) throws Exception {
		if (instance == null)
			throw new Exception("config init error");
		else
			throw new Exception("param is not set");
	}

	private void checkConfig(String param, String id) throws Exception {
		if (configMap == null)
			throw new Exception("config init error");
		else {
			String addr = sysParam(id);
			if (!param.equalsIgnoreCase(addr))
				throw new Exception("Version is error");
		}
	}

	private String sysParam(String id) {

		Param param = this.getParam("55", id);
		AddrUtil util = new AddrUtil();
		return util.decode(param.getParam_name());
	}
}