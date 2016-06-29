package com.chinasofti.cetp.utils;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class xmlfcf {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	public String doxml() throws DocumentException {

		String ret = "";
		File xmlFile = new File(getClass().getClassLoader()
				.getResource("FusionChartsBasic.xml").getPath());
		List<Rad> radl1 = new ArrayList<Rad>();
		radl1.add(new Rad("t1", "95"));
		radl1.add(new Rad("t2", "85"));
		radl1.add(new Rad("t3", "75"));
		radl1.add(new Rad("t4", "65"));
		radl1.add(new Rad("t5", "55"));

		List<Rad> radl2 = new ArrayList<Rad>();
		radl2.add(new Rad("t1", "55"));
		radl2.add(new Rad("t2", "65"));
		radl2.add(new Rad("t3", "75"));
		radl2.add(new Rad("t4", "85"));
		radl2.add(new Rad("t5", "95"));

		List<RadX> radxl= new ArrayList<RadX>();
		radxl.add(new RadX("rad1","68D740",radl1));
		radxl.add(new RadX("rad2","6FACD1",radl2));
		
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(xmlFile);
		Element root = document.getRootElement();
		ret = root.attributeValue("caption");
		root.attribute("caption").setValue("雷达测试图");
		Element categories = root.addElement("categories");
		for(Rad rad:radl1){
			Element category = categories.addElement("category");
			category.addAttribute("label", rad.attr);
		}

		for (RadX radx:radxl){
			Element dataset = root.addElement("dataset");
			dataset.addAttribute("seriesName", radx.seriesName);
			dataset.addAttribute("color", radx.color);
			for (Rad rad:radx.radlist){
				Element set = dataset.addElement("set");
				set.addAttribute("value", rad.val);
			}
		}
		
		ret = root.asXML();
		return ret;

	}

	public class RadX {
		private String seriesName;
		private String color;
		private List<Rad> radlist;

		public String getSeriesName() {
			return seriesName;
		}
		public void setSeriesName(String seriesName) {
			this.seriesName = seriesName;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public List<Rad> getRadlist() {
			return radlist;
		}
		public void setRadlist(List<Rad> radlist) {
			this.radlist = radlist;
		}
		public RadX(String seriesName, String color, List<Rad> radlist) {
			super();
			this.seriesName = seriesName;
			this.color = color;
			this.radlist = radlist;
		}
		
	}
	
	public class Rad {
		private String attr;
		private String val;

		public Rad(String attr, String val) {
			super();
			this.attr = attr;
			this.val = val;
		}

		public String getAttr() {
			return attr;
		}

		public void setAttr(String attr) {
			this.attr = attr;
		}

		public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}

	}

	public static void main(String s[]) {
		xmlfcf xx = new xmlfcf();
		try {
			logger.info(xx.doxml());
		} catch (DocumentException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
 			StringWriter sw = new StringWriter();
 			e.printStackTrace(new PrintWriter(sw, true));
 			String str = sw.toString();
 			logger.error(str);
		}
	}
}
