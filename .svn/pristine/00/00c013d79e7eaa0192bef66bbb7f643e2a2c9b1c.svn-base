package com.chinasofti.cetp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.chinasofti.cetp.admin.model.Student;

public class XLSWrapper {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	public List<Student> readXls(String fileName) {
		File file = new File(fileName);
		List<Student> list = new ArrayList<Student>();
		try {
			FileInputStream fis = new FileInputStream(file);
			POIFSFileSystem fs = new POIFSFileSystem(fis);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			if (wb != null) {
				HSSFSheet sheet = wb.getSheetAt(0);
				if (sheet != null) {
					if (sheet.getFirstRowNum() != sheet.getLastRowNum()) {

						int startRow = 0;
						HSSFRow row = null;

						for (int i = startRow + 1; i <= sheet.getLastRowNum(); i++) {
							row = sheet.getRow(i);
							if (row != null) {

								Student student = new Student();
								student.setStuName(row.getCell(0).toString());
								student.setAreaCode(row.getCell(1).toString());
								list.add(student);
							}
						}
						fis.close();

					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
 			StringWriter sw = new StringWriter();
 			e.printStackTrace(new PrintWriter(sw, true));
 			String str = sw.toString();
 			logger.error(str);
		} catch (IOException e) {
			e.printStackTrace();
 			StringWriter sw = new StringWriter();
 			e.printStackTrace(new PrintWriter(sw, true));
 			String str = sw.toString();
 			logger.error(str);
		}
		return list;
	}

	public void writeXls(String[] header) {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("Sheet1");
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < header.length; i++) {
			row.createCell(i).setCellValue(header[i]);
		}

	}

}
