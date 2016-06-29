package com.chinasofti.cetp.resource.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.resource.model.ReferenceExample;
import com.chinasofti.cetp.resource.model.ReferenceExample.Criteria;
import com.chinasofti.cetp.resource.model.ReferenceWithBLOBs;
import com.chinasofti.cetp.resource.service.ReferenceService;
import com.chinasofti.cetp.survey.model.DataGrid;
import com.chinasofti.cetp.utils.FileUploadHelper;
import com.chinasofti.cetp.utils.FileUrl;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
import com.google.gson.JsonObject;

/**
 * @author Fly
 *
 */
/**
 * @author Fly
 *
 */
/**
 * @author Fly
 * 
 */
@Scope("prototype")
@Controller
public class ReferenceController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(ReferenceController.class);
	@Autowired
	private FileUploadHelper fileUploadHelper;

	public FileUploadHelper getFileUploadHelper() {
		return fileUploadHelper;
	}

	public void setFileUploadHelper(FileUploadHelper fileUploadHelper) {
		this.fileUploadHelper = fileUploadHelper;
	}

	@Autowired
	private ReferenceService referenceService;

	public ReferenceService getReferenceService() {
		return referenceService;
	}

	public void setReferenceService(ReferenceService referenceService) {
		this.referenceService = referenceService;
	}

	@RequestMapping("/toReferenceMng.do")
	public String toReferenceMng() {
		return "resource/referenceMng";
	}

	@RequestMapping("/getReferenceList.do")
	public void getReferenceList(@RequestParam(value = "refName", required = false) String refName, @RequestParam(value = "startDate", required = false) Date startDate, @RequestParam(value = "endDate", required = false) Date endDate, @RequestParam(value = "desc", required = false) String descStr, @RequestParam("page") int page, @RequestParam("rows") int rows) {
		RowBoundsWithTotalCount rowBounds = new RowBoundsWithTotalCount(rows, page);
		ReferenceExample example = new ReferenceExample();
		Criteria crit = example.createCriteria();
		if (refName != null && !"".equals(refName)) {
			crit.andRefNameLike("%" + refName + "%");
		}
		if (startDate != null) {
			crit.andRefRegtimeGreaterThanOrEqualTo(startDate);
		}
		if (endDate != null) {
			crit.andRefRegtimeLessThanOrEqualTo(endDate);
		}
		if ("on".equals(descStr) || "1".equals(descStr)) {
			example.setOrderByClause("REF_REGTIME DESC");
		} else {
			example.setOrderByClause("REF_REGTIME ASC");
		}
		List<ReferenceWithBLOBs> list = referenceService.selectReferenceByExample(example, rowBounds);

		DataGrid dataGrid = new DataGrid();
		dataGrid.setRows(list);
		dataGrid.setTotal(rowBounds.getTotalCount());

		writeJson(dataGrid);
	}

	@RequestMapping("/addReference.do")
	public void addReference(ReferenceWithBLOBs record) {
		JsonObject rsp = new JsonObject();
		record.setRefRegtime(new Date());
		record.setRefDownloadCount(0);
		record.setRefPlayCount(0);
		record.setRefThumb("images/ckzl.png");
		if (referenceService.insertReference(record) > 0) {
			rsp.addProperty("success", true);
			rsp.addProperty("refId", record.getRefId());
			rsp.addProperty("refThumb", record.getRefThumb());
		} else {
			rsp.addProperty("success", false);
		}
		writeString(rsp.toString());
	}

	@RequestMapping("/editReference.do")
	public void editReference(ReferenceWithBLOBs record) {
		JsonObject rsp = new JsonObject();
		record.setRefRegtime(new Date());
		if (referenceService.updateReference(record) > 0) {
			rsp.addProperty("success", true);
			rsp.addProperty("refId", record.getRefId());
			rsp.addProperty("refThumb", record.getRefThumb());
		} else {
			rsp.addProperty("success", false);
		}
		writeString(rsp.toString());
	}

	@RequestMapping("/delReference.do")
	public void editReference(@RequestParam("refId") Integer refId) {
		JsonObject rsp = new JsonObject();
		if (referenceService.deleteReference(refId) > 0) {
			rsp.addProperty("success", true);
		} else {
			rsp.addProperty("success", false);
		}
		writeString(rsp.toString());
	}

	/**
	 * 上传缩略图
	 * 
	 * @param request
	 * @param response
	 * @param refId
	 */
	@RequestMapping("uploadRefThumb.do")
	public void uploadRefThumb(HttpServletRequest request, HttpServletResponse response, @RequestParam("refId") Integer refId) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy" + File.separator + "MM");
			String ymd = sdf.format(new Date());
			String path = "upload" + File.separator + ymd + File.separator + "resource" + File.separator + "reference" + File.separator + refId + File.separator;
			String savePath = request.getSession().getServletContext().getRealPath(path);

			File uploadDir = new File(savePath);
			if (!uploadDir.isDirectory()) {
				uploadDir.mkdirs();
			}

			File file = new File(uploadDir, "thumb.png");
			String url = path + file.getName();
			ImageInputStream ii = ImageIO.createImageInputStream(request.getInputStream());

			BufferedImage br = ImageIO.read(ii);
			if (!file.exists()) {
				file.createNewFile();
			}
			// 将BufferedImage变量写入文件中。
			ImageIO.write(br, "png", file);

			ReferenceWithBLOBs record = new ReferenceWithBLOBs();
			record.setRefId(refId);
			record.setRefThumb(url);
			record.setRefRegtime(new Date());

			referenceService.updateReference(record);

			response.getWriter().append("{\"status\":1,\"url\":\"" + url + "\"}");
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			try {
				response.getWriter().append("{\"status\":-2}");
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * 上传参考资料
	 * 
	 * @param request
	 * @param response
	 * @param refId
	 */
	@RequestMapping("uploadReference.do")
	public void uploadReference(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="refId",required =false,defaultValue="temp") Integer refId) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy" + File.separator + "MM");
		String ymd = sdf.format(new Date());
		String path = File.separator + ymd + File.separator + "resource" + File.separator + "reference" + File.separator + refId + File.separator;
		try {
			List<FileUrl> list = fileUploadHelper.uploadFiles(request, path, true,null);
			if (list != null && list.size() > 0) {
				ReferenceWithBLOBs record = new ReferenceWithBLOBs();
				record.setRefId(refId);
				record.setRefDownloadUrl(list.get(0).getDownloadUrl());
				record.setRefPlayUrl(list.get(0).getVideoUrl());
				record.setRefRegtime(new Date());
				referenceService.updateReference(record);
				writeString("上传成功");
			}
			writeString("上传失败");
		} catch (Exception e) {
			writeString("上传发生错误：" + e.getMessage());
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}
}
