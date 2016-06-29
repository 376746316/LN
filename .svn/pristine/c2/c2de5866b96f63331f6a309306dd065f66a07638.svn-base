package com.chinasofti.cetp.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
@Scope("prototype")
@Controller
public class FileManagerController {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	@Autowired
	private FileUploadHelper fileUploadHelper;

	public FileUploadHelper getFileUploadHelper() {
		return fileUploadHelper;
	}

	public void setFileUploadHelper(FileUploadHelper fileUploadHelper) {
		this.fileUploadHelper = fileUploadHelper;
	}

	/**
	 * 文件上传时选择服务器资源
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("toFileManagerJsp.do")
	public String toFileManagerJsp(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "path", required = false) String sourcePath, @RequestParam(value = "fileTypeExts", required = false) String fileTypeExts, @RequestParam(value = "fileType", required = false) String fileType) {

		if (sourcePath == null || "".equals(sourcePath.trim()) || "server".equals(sourcePath.trim())) {
			sourcePath = request.getSession().getServletContext().getRealPath(File.separator) + "upload" + File.separator;
		} else if ("local".equals(sourcePath.trim())) {
			sourcePath = fileUploadHelper.getSavePath() + File.separator;
		} else if ("red5".equals(sourcePath.trim())) {
			sourcePath = fileUploadHelper.getRed5Path() + File.separator;
		}
		logger.info("当前的资源路径：" + sourcePath);
		request.setAttribute("sourcePath", sourcePath);
		if (fileTypeExts != null) {
			request.setAttribute("fileTypeExts", fileTypeExts);
		} else if (fileType != null) {
			if (!"3".equals(fileType)) {
				request.setAttribute("fileTypeExts", ReaderXmlParam.getInstance().getParam("16", fileType).getParam_name());
			}else if("3".equals(fileType)){
				request.setAttribute("fileTypeExts", "flv;mp4");
			}
		}
		return "attendance/fileManager/fileManager";
	}

	/**
	 * 选择文件管理器中的文件后
	 * 
	 * @param request
	 * @param response
	 * @param sourcePath
	 * @param resource
	 * @param fileType
	 * @throws IOException
	 */
	@RequestMapping("toUploadFileOfResource.do")
	public void toUploadFileOfResource(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "path", required = false) String sourcePath, @RequestParam(value = "resource", required = false) String resource) throws IOException {
		if (sourcePath == null || "".equals(sourcePath.trim()) || "server".equals(sourcePath.trim())) {
			sourcePath = request.getSession().getServletContext().getRealPath("\\") + "upload\\";
		} else if ("local".equals(sourcePath.trim())) {
			sourcePath = fileUploadHelper.getSavePath() + "\\";
		} else if ("red5".equals(sourcePath.trim())) {
			sourcePath = fileUploadHelper.getRed5Path() + "\\";
		}
		String newFilePath = sourcePath + resource;
		logger.info("文件路径：" + newFilePath);
		File oldFile = new File(newFilePath);
		if (oldFile.isFile()) {
			int start = oldFile.getName().lastIndexOf(".") + 1;
			FileUrl furl = new FileUrl();
			furl.setDownloadUrl(newFilePath);
			furl.setFileName(oldFile.getName());
			String temp = oldFile.getName().substring(start);
			logger.info("文件类型：" + temp);
			if ("flv".equals(temp)) {
				File flv = new File(fileUploadHelper.getRed5Path() + "\\" + System.currentTimeMillis() + ".flv");
				FileCopyUtils.copy(oldFile, flv);
				logger.info(oldFile.getName());
				logger.info(flv.getPath());
				furl.setVideoUrl(flv.getName());
			} else {
				furl.setVideoUrl(resource);
			}
			response.getWriter().write(new Gson().toJson(furl));
		}
	}

	/**
	 * 返回构造的树
	 * 
	 * @return
	 */
	@RequestMapping("toFileManagerTreeJsp.do")
	public String toFileManagerTreeJsp() {
		return "fileManager/jqueryFileTree";
	}

	@RequestMapping("getFileManagerTree.do")
	public void getFileManagerTree(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "dir", required = false) String dir, @RequestParam(value = "flag", required = false) String flag, @RequestParam(value = "fileTypeExts", required = false) String fileTypeExts) throws IOException {
		StringBuilder out = new StringBuilder();
		response.setHeader("Content-Type", "text/html; charset=utf-8");

		if (dir == null) {
			return;
		}

		if (dir.charAt(dir.length() - 1) == '\\') {
			dir = dir.substring(0, dir.length() - 1) + "/";
		} else if (dir.charAt(dir.length() - 1) != '/') {
			dir += "/";
		}
		if (new File(dir).exists()) {
			String[] files = new File(dir).list(new FileTypeFilter(fileTypeExts));
			Arrays.sort(files, String.CASE_INSENSITIVE_ORDER);
			out.append("<ul class=\"jqueryFileTree\" style=\"display: none;\">");

			// All dirs
			for (String file : files) {
				if (new File(dir, file).isDirectory()) {

					out.append("<li class=\"directory collapsed\"><a href=\"#\" rel=\"" + dir + file + "/\">" + file + "</a></li>");
				}
			}
			// All files
			for (String file : files) {
				if (!new File(dir, file).isDirectory()) {
					int dotIndex = file.lastIndexOf('.');
					String ext = dotIndex > 0 ? file.substring(dotIndex + 1) : "";
					out.append("<li class=\"file ext_" + ext + "\"><a class=\"purefile\" href=\"#\" rel=\"" + dir + file + "\">" + file + "</a></li>");

				}
			}
			out.append("</ul>");
			response.getWriter().write(out.toString());
		}
	}

}
