package com.chinasofti.cetp.utils;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;

@Scope("prototype")
@Controller
public class DownloadController extends BaseController {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	@Autowired
	private FileUploadHelper fileUploadHelper;

	public FileUploadHelper getFileUploadHelper() {
		return fileUploadHelper;
	}

	public void setFileUploadHelper(FileUploadHelper fileUploadHelper) {
		this.fileUploadHelper = fileUploadHelper;
	}

	@RequestMapping("download.do")
	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		OutputStream os = null;
		try {
			String fileurl = request.getParameter("fileurl");
			// fileurl = new String(fileurl.getBytes("iso8859-1"), "UTF-8");
			fileurl = fileurl.replace("/", File.separator);
			if (fileurl.startsWith(File.separator)) {
				fileurl = fileUploadHelper.getSavePath() + fileurl;
				// fileurl = fileUploadHelper.getSavePath().replace("/", "\\") +
				// fileurl;
			}
			logger.info("下载url：" + fileurl);
			File file = new File(fileurl);
			if (!file.exists()) {
				StringBuilder builder = new StringBuilder();
				builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
				builder.append("window.top.alert('下载资源不可用!');window.history.back();");
				builder.append("</script>");
				response.getWriter().print(builder);
				return;
			}
			String filename = fileurl.substring(fileurl.lastIndexOf(File.separator) + 1);
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-disposition", "attachment; filename="
			// + filename);
			        + new String(filename.getBytes("UTF-8"), "iso8859-1"));
			FileInputStream fi = new java.io.FileInputStream(fileurl);
			bis = new BufferedInputStream(fi);
			os = response.getOutputStream();
			bos = new BufferedOutputStream(os);
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		} finally {
			if (bis != null) {
				bis.close();
			}
			if (bos != null) {
				bos.close();
			}
			if (os != null) {
				os.flush();
				os.close();
				os = null;
			}
			response.flushBuffer();
		}
	}

	/**
	 * 下载视频文件的方法
	 * 
	 * @param request
	 * @param response
	 * @param fileurl
	 *            视频文件的下载URL
	 * @throws IOException
	 */
	@RequestMapping("downloadVideoResource.do")
	public void downloadVideoResource(HttpServletRequest request, HttpServletResponse response, @RequestParam("downloadUrl") String fileurl) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		OutputStream os = null;
		try {
			// fileurl = new String(fileurl.getBytes("iso8859-1"), "UTF-8");
			// fileurl = fileurl.replace("/", "\\");
			if (fileurl.startsWith(File.separator)) {
				fileurl = fileUploadHelper.getSavePath() + fileurl;
				// fileurl = fileUploadHelper.getSavePath().replace("/", "\\") +
				// fileurl;
			} else if (fileurl.endsWith(".flv") || fileurl.endsWith(".mp4")) {
				fileurl = fileUploadHelper.getRed5Path() + File.separator + fileurl;
			} else if (fileurl.endsWith(".swf")) {
				fileurl = fileUploadHelper.getSavePath() + File.separator + fileurl;
			}
			logger.info("下载url：" + fileurl);
			File file = new File(fileurl);
			if (!file.exists()) {
				StringBuilder builder = new StringBuilder();
				builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
				builder.append("window.top.alert('下载资源不可用!');window.history.back();");
				builder.append("</script>");
				response.getWriter().print(builder);
				return;
			}
			String filename = fileurl.substring(fileurl.lastIndexOf(File.separator) + 1);
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-disposition", "attachment; filename="
			// + filename);
			        + new String(filename.getBytes("UTF-8"), "iso8859-1"));
			FileInputStream fi = new java.io.FileInputStream(fileurl);
			bis = new BufferedInputStream(fi);
			os = response.getOutputStream();
			bos = new BufferedOutputStream(os);
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		} finally {
			if (bis != null) {
				bis.close();
			}
			if (bos != null) {
				bos.close();
			}
			if (os != null) {
				os.flush();
				os.close();
				os = null;
			}
			response.flushBuffer();
		}
	}

	@RequestMapping("getThumb.do")
	public void getThumb(HttpServletRequest request, HttpServletResponse response, @RequestParam("fileurl") String fileurl, @RequestParam(value = "maxWidth", required = false) Integer maxWidth, @RequestParam(value = "maxHeight", required = false) Integer maxHeight) {
		if (fileurl.startsWith(File.separator)) {
			fileurl = fileUploadHelper.getSavePath() + fileurl;
		}
		logger.info("待生成缩略图文件url：" + fileurl);
		File file = new File(fileurl);
		try {
			BufferedImage bi = ZoomImage.createThumb(file, maxWidth, maxHeight);
			response.setContentType("image/jpeg");
			ImageIO.write(bi, "jpg", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
	}

	/**
	 * 删除上传文件
	 * 
	 * @param request
	 * @param response
	 * @param path
	 *            删除文件路径
	 * @throws IOException
	 */
	@RequestMapping("deleteUploadFile.do")
	public void deleteUploadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("path") String path) throws IOException {
		logger.info("当前要删除的文件路径:" + path);
		FileUrl url = new FileUrl();
		url.setDownloadUrl(path);
		String msg = "fail";
		try {
			fileUploadHelper.deleteFile(request, url);
			msg = "success";
		} catch (Exception e1) {
			e1.printStackTrace();
			StringWriter sw = new StringWriter();
			e1.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
		this.writeString(msg);
	}
}
