package com.chinasofti.cetp.utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 文件上传通用类
 * 
 * @author dyy
 * 
 */
public class FileUploadHelper {
	private static final Logger logger = Logger.getLogger(FileUploadHelper.class);

	/**
	 * 文件的文档存储位置
	 */
	private String savePath;
	/**
	 * red5服务器的媒体流路劲
	 */
	private String red5Path;
	/**
	 * 临时文件夹
	 */
	private String tempPath;
	
	/**
	 * red5的流媒体路径
	 */
	private String red5Rtmp;
	
	/**
	 * Red5服务器地址
	 */
	private String red5Host;
	
	public String getRed5Host() {
    	return red5Host;
    }

	public void setRed5Host(String red5Host) {
    	this.red5Host = red5Host;
    }

	public String getRed5Rtmp() {
    	return red5Rtmp;
    }

	public void setRed5Rtmp(String red5Rtmp) {
    	this.red5Rtmp = red5Rtmp;
    }

	public String getTempPath() {
		return tempPath;
	}

	public void setTempPath(String tempPath) {
		this.tempPath = tempPath;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String getRed5Path() {
		return red5Path;
	}

	public void setRed5Path(String red5Path) {
		this.red5Path = red5Path;
	}

	/**
	 * 文件上传的方法
	 * 
	 * @param request
	 *            请求对象
	 * @param path
	 *            “\”开始，“\”结束的文件存储路径
	 * @param flag
	 *            是否需要进行文档转换播放
	 * @param red5StreamsPath
	 *            当前资源在red5服务器上的地址
	 * @return 当前的文件名集合
	 * @throws ServletException
	 * @throws IOException
	 */
	public List<FileUrl> uploadFiles(HttpServletRequest request, String path, boolean flag, String red5StreamsPath) throws ServletException, IOException {
		String oldPath = path;
		// 解析请求对象
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		// 用于返回上传文件类的集合
		List<FileUrl> fileList = new ArrayList<FileUrl>();
		// 上传文件类
		FileUrl fileUrl = new FileUrl();
		// 接收请求中上传的对象
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();

		// 配置服务器地址
		String serverPath = request.getSession().getServletContext().getRealPath(File.separator + "upload" + path);
		logger.info("服务器地址：" + serverPath);
		File tempFile = new File(serverPath);
		if (!tempFile.exists()) {
			tempFile.mkdirs();
		}
		// 重新设置当前的完整的文件存储路径
		path = this.getSavePath() + path;
		logger.info("当前的文件路径！" + path);
		// 按照当前的存储路径创建文件夹
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}

		String fileName = null;
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf = entity.getValue();
			fileName = mf.getOriginalFilename();
			// 设置当前的文件上传工具类
			fileUrl.setFileName(fileName);
			fileUrl.setDownloadUrl(oldPath + fileName);
			File uploadFile = new File(path + fileName);
			logger.info("文件路径：" + path + fileName);
			try {
				// 将需要上传的文件拷贝到了当前的路径下
				FileCopyUtils.copy(mf.getBytes(), uploadFile);
				// fileName = fileName.toLowerCase();
				if (flag) {
					if (fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("doc") || fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("ppt") || fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("pdf") || fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("docx") || fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("xls") || fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("xlsx")) {
						logger.info("filename is 文件开始转换！" + fileName);
						DocConverter doc = new DocConverter(path + fileName);
						logger.info("文件开始转换！");
						logger.info("文件路径：" + path);
						doc.conver();
						// 在服务器资源路径下，创建一个flash文件
						File swf = new File(serverPath + File.separator + doc.getSwfFile().getName());
						logger.info("当前的服务器上flash：" + swf.getPath());
						// 拷贝转换成功的flash文件
						FileCopyUtils.copy(doc.getSwfFile(), swf);
						// 删除临时的pdf文件和swf文件
						if (!fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("pdf")) {
							doc.getPdfFile().delete();
						}
						doc.getSwfFile().delete();
						fileUrl.setVideoUrl(oldPath + swf.getName());
					} else if (fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("flv") || fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("mp4")) {
						if (red5StreamsPath == null) {
							red5StreamsPath = oldPath;
						}
						File flvDir = new File(this.getRed5Path() + red5StreamsPath);
						if (!flvDir.exists()) {
							flvDir.mkdirs();
						}
						File flv = new File(this.getRed5Path() + red5StreamsPath + fileName);
						FileCopyUtils.copy(uploadFile, flv);
						logger.info("当前的flv存放路径：" + flv.getPath());
						fileUrl.setVideoUrl(red5StreamsPath + fileName);
					} else if (fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("wmv") || fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("swf")) {
						File temp = new File(serverPath + File.separator + fileName);
						FileCopyUtils.copy(uploadFile, temp);
						fileUrl.setVideoUrl(oldPath + temp.getName());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
				StringWriter sw = new StringWriter();
				e.printStackTrace(new PrintWriter(sw, true));
				String str = sw.toString();
				logger.error(str);
			}
			fileList.add(fileUrl);
		}
		return fileList;
	}

	public void deleteFile(HttpServletRequest request, FileUrl fileUrl) throws Exception {
		String url = request.getSession().getServletContext().getRealPath("");
		if (fileUrl.getDownloadUrl().indexOf(url) != -1) {
			throw new Exception("对不起，当前数据中含有服务器资源，您不能删除！");
		}
		String downloadFile = this.getSavePath() + fileUrl.getDownloadUrl();
		if (!new File(downloadFile).delete()) {
			//throw new Exception("下载数据损坏，请联系管理员！");
		}
		logger.info("要删除的下载文件：" + downloadFile);
		if (fileUrl.getVideoUrl() != null && (!"".equals(fileUrl.getVideoUrl()))) {
			String videoUrl;

			if (fileUrl.getVideoUrl().substring(fileUrl.getVideoUrl().lastIndexOf(".") + 1).equalsIgnoreCase("flv")||fileUrl.getVideoUrl().substring(fileUrl.getVideoUrl().lastIndexOf(".") + 1).equalsIgnoreCase("mp4")) {
				videoUrl = this.red5Path + fileUrl.getVideoUrl();
			} else {
				videoUrl = request.getSession().getServletContext().getRealPath(File.separator + "upload" + fileUrl.getVideoUrl());
			}

			if (!new File(videoUrl).delete()) {
				throw new Exception("视频文件损坏，请联系管理员！");
			}

			logger.info("要删除的视频文件：" + videoUrl);
		}

	}

	/**
	 * 拷贝文件到目标文件下
	 * 
	 * @param oldPath
	 *            原路径
	 * @param newPath
	 *            新路径
	 * @param newName
	 *            新文件名
	 * @param delOld
	 *            是否删除原有文件
	 * @throws IOException
	 */
	public void fileCopy(String oldPath, String newPath, String newName, boolean delOld) throws IOException {
		if (oldPath == null) {
			throw new IOException("请传入正确的源文件地址");
		}
		if (newPath == null) {
			throw new IOException("请传入正确的目标文件地址");
		}
		File oldFile = new File(this.savePath + oldPath);
		File newFile = new File(this.savePath + newPath);
		System.out.println("oldFile:" + oldFile.getAbsolutePath());
		System.out.println("newFile:" + newFile.getAbsolutePath());
		if (!newFile.exists()) {
			newFile.mkdirs();
		}
		if (newName == null || "".equals(newName)) {
			newName = oldFile.getName();
		}
		newFile = new File(newFile.getAbsolutePath() + File.separator + newName);
		FileCopyUtils.copy(oldFile, newFile);
		if (delOld) {
			oldFile.delete();
		}
	}
}
