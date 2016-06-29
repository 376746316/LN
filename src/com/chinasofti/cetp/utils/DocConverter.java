package com.chinasofti.cetp.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.log4j.Logger;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

public class DocConverter {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	private static final int environment = 1;// 环境1：windows
	private String fileName;
	private File pdfFile;
	private File swfFile;
	private File docFile;

	public File getPdfFile() {
		return pdfFile;
	}

	public void setPdfFile(File pdfFile) {
		this.pdfFile = pdfFile;
	}

	public File getSwfFile() {
		return swfFile;
	}

	public void setSwfFile(File swfFile) {
		this.swfFile = swfFile;
	}

	public DocConverter(String fileString) throws UnsupportedEncodingException {
		ini(fileString);
	}

	public void setFile(String fileString) throws UnsupportedEncodingException {
		ini(fileString);
	}

	private void ini(String fileString) throws UnsupportedEncodingException {
		fileString = URLDecoder.decode(fileString, "utf-8");
		fileName = fileString.substring(0, fileString.lastIndexOf(".")).replace(" ", "");
		logger.info("fileString is :" + fileString);
		logger.info("filename is :" + fileName);
		docFile = new File(fileString);
		logger.info("fille size: " + docFile.length());
		logger.info("错误路径：" + fileString);
		pdfFile = new File(fileName + ".pdf");
		swfFile = new File(fileName + ".swf");
	}

	private void doc2pdf() throws Exception {
		logger.info("docfile path is :" + docFile.getAbsolutePath());
		if (docFile.exists()) {
			if (!pdfFile.exists()) {
				OpenOfficeConnection connection = new SocketOpenOfficeConnection(
						8100);
				try {
					connection.connect();
					DocumentConverter converter = new OpenOfficeDocumentConverter(
							connection);
					converter.convert(docFile, pdfFile);

					// close the connection
					connection.disconnect();
					logger.info("****pdf转换成功，PDF输出：" + pdfFile.getPath()
							+ "****");
					logger.info("****pdf size ：" + (pdfFile.length()) + "****");

				} catch (java.net.ConnectException e) {
					e.printStackTrace();
					StringWriter sw = new StringWriter();
					e.printStackTrace(new PrintWriter(sw, true));
					String str = sw.toString();
					logger.error(str);
					logger.info("****swf转换异常，openoffice服务未启动！****");
					throw e;
				} catch (com.artofsolving.jodconverter.openoffice.connection.OpenOfficeException e) {
					e.printStackTrace();
					StringWriter sw = new StringWriter();
					e.printStackTrace(new PrintWriter(sw, true));
					String str = sw.toString();
					logger.error(str);
					logger.info("****swf转换器异常，读取转换文件失败****");
					throw e;
				} catch (Exception e) {
					e.printStackTrace();
					StringWriter sw = new StringWriter();
					e.printStackTrace(new PrintWriter(sw, true));
					String str = sw.toString();
					logger.error(str);
					logger.info(e.getMessage());
					throw e;
				}
			} else {
				logger.info("****已经转换为pdf，不需要再进行转化****");
			}
		} else {
			logger.info("****swf转换器异常，需要转换的文档不存在，无法转换****");
		}
	}

	@SuppressWarnings("unused")
	private void pdf2swf() throws Exception {
		Runtime r = Runtime.getRuntime();
		String pdf2swfPath = ReaderXmlParam.getInstance()
				.getParam("52", "pdf2swfPath").getParam_name();
		String command = ReaderXmlParam.getInstance().getParam("52", "command")
				.getParam_name();
		String viewer = ReaderXmlParam.getInstance().getParam("52", "viewer")
				.getParam_name();
		if (!swfFile.exists()) {
			if (pdfFile.exists()) {
				if (environment == 1) {// windows环境处理
					try {
						Process p1 = r
								.exec(new File(pdf2swfPath, "pdf2swf.exe")
										.getAbsolutePath()
										+ " \""
										+ pdfFile.getPath()
										+ "\" -o \""
										+ swfFile.getPath() + "\" " + command);
						logger.info(loadStream(p1.getInputStream()));
						logger.info(loadStream(p1.getErrorStream()));
						p1.waitFor();
						// Process p2 = r.exec(new File(pdf2swfPath,
						// "swfcombine.exe").getAbsolutePath()
						// + " \""
						// + viewer
						// + "\"  viewport=\""
						// + swfFile.getPath()
						// + "\" -o \""
						// + swfFile.getPath() + "\"");
						// logger.info(loadStream(p2.getInputStream()));
						// logger.info(loadStream(p2.getErrorStream()));
						logger.info("****swf转换完成，文件输出：" + swfFile.getPath()
								+ "****");
					} catch (Exception e) {
						e.printStackTrace();
						StringWriter sw = new StringWriter();
						e.printStackTrace(new PrintWriter(sw, true));
						String str = sw.toString();
						logger.error(str);
						logger.info(e.getMessage());
						throw e;
					}
				} else if (environment == 2) {// linux环境处理
					try {
						command = "-s languagedir=/home/etc/etc/xpdf-chinese-simplified -s flashversion=9";

						String cmds = pdf2swfPath+" -o "
								+ swfFile.getPath() + " -T -z -t "
								+ pdfFile.getPath() + " " + command;
						System.out.println(cmds);
						Process ps = Runtime.getRuntime().exec(cmds);
						// Process p2 = r.exec("swfcombine" + " \"" + viewer
						// + "\"  viewport=\"" + swfFile.getPath()
						// + "\" -o \"" + swfFile.getPath() + "\"");
						// p2.waitFor();
						logger.info("loadStream success:"
								+ loadStream(ps.getInputStream()));
						logger.info("loadStream error:"
								+ loadStream(ps.getErrorStream()));

						logger.info("swf file boolean " + swfFile.exists());
						logger.info("****swf转换完成，文件输出：" + swfFile.getPath()
								+ "****");
					} catch (Exception e) {
						e.printStackTrace();
						StringWriter sw = new StringWriter();
						e.printStackTrace(new PrintWriter(sw, true));
						String str = sw.toString();
						logger.error(str);
						logger.info(e.getMessage());
						throw e;
					}
				}
			} else {
				logger.info("****pdf不存在，无法转换****");
			}
		} else {
			logger.info("****swf已存在不需要转换****");
		}
	}

	static String loadStream(InputStream in) throws IOException {
		int ptr = 0;
		in = new BufferedInputStream(in);
		StringBuffer buffer = new StringBuffer();
		while ((ptr = in.read()) != -1) {
			buffer.append((char) ptr);
		}
		return buffer.toString();
	}

	public boolean conver() {
		if (swfFile.exists()) {
			logger.info("****swf转换器开始工作，该文件已经转换为swf****");
			return true;
		}
		if (environment == 1) {
			logger.info("****swf转换器开始工作，当前设置运行环境windows****");
		} else {
			logger.info("****swf转换器开始工作，当前设置运行环境linux****");
		}
		try {
			doc2pdf();
			pdf2swf();
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			logger.info(e.getMessage());
			return false;
		}
		if (swfFile.exists()) {
			return true;
		} else {
			return false;
		}
	}

	// /* * 返回文件路径 * @param s */
	public String getswfPath() {
		if (swfFile.exists()) {
			String tempString = swfFile.getPath();
			tempString = tempString.replaceAll("\\\\", "/");
			return tempString;
		} else {
			return "";
		}
	}

	// /* * 设置输出路径 */
	public void setOutputPath(String outputPath) {
		logger.info("输出路径设置：：：：" + outputPath);
		if (!outputPath.equals("")) {
			String realName = fileName.substring(fileName.lastIndexOf("/"),
					fileName.lastIndexOf("."));
			if (outputPath.charAt(outputPath.length()) == '/') {
				swfFile = new File(outputPath + realName + ".swf");
			} else {
				swfFile = new File(outputPath + realName + ".swf");
			}
		}
	}

	public static void main(String s[]) throws UnsupportedEncodingException {
		DocConverter d = new DocConverter(
				"/home/etc/uploadfiles/2014/06/resource/project/27/Doc/CETP-Online-数据字典V1.0(1).docx");
		d.conver();
		logger.info(d.getswfPath());
		File f = d.getSwfFile();
		logger.info(f.getName());
	}

}
