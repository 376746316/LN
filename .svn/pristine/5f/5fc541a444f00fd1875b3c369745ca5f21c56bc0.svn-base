package com.chinasofti.cetp.resource.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.resource.model.FulltextIndexWithBLOBs;
import com.chinasofti.cetp.resource.service.FulltextIndexService;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
@Scope("prototype")
@Controller
public class FulltextIndexController extends BaseController {

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(FulltextIndexController.class);

	@Autowired
	private FulltextIndexService fulltextIndexService;

	public FulltextIndexService getFulltextIndexService() {
		return fulltextIndexService;
	}

	public void setFulltextIndexService(FulltextIndexService fulltextIndexService) {
		this.fulltextIndexService = fulltextIndexService;
	}

	@RequestMapping("buildSearchIndex.do")
	public void buildSearchIndex() {
		List<FulltextIndexWithBLOBs> list =new ArrayList<FulltextIndexWithBLOBs>();
		list.addAll(fulltextIndexService.buildIndex(
				"tp_spec_course", "1", "SPEC_ID", "SPEC_NAME", "SPEC_INTRO",null));
		list.addAll(fulltextIndexService.buildIndex(
				"tp_pro", "2", "PRO_ID", "PRO_NAME", "PRO_INTRO","PRO_OWNER_FLAG = 1"));
		list.addAll(fulltextIndexService.buildIndex(
				"tp_live", "3", "LIVE_ID", "LIVE_NAME", "LIVE_INTRO","LIVE_STATUS = '3' OR LIVE_STATUS = '4' "));
				
				
		writeJson(list);
	}

	@RequestMapping("search.do")
	public String search(@RequestParam("key") String key, @RequestParam(value = "type", required = false) String type, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "rows", required = false, defaultValue = "10") Integer rows) {
		this.request.setAttribute("key", key);
		key = fulltextIndexService.Split(key);
		RowBoundsWithTotalCount rowBounds = new RowBoundsWithTotalCount(rows, page);
		type = "0".equals(type) ? null : type;
		List<FulltextIndexWithBLOBs> list = fulltextIndexService.search(key, type, rowBounds);
		for (Integer i = 1; i < 4; i++) {
			if (i.toString().equals(type)) {
				this.request.setAttribute("count" + i.toString(), rowBounds.getTotalCount());
			} else {
				this.request.setAttribute("count" + i.toString(), fulltextIndexService.countBySearch(key, i.toString()));
			}

		}
		this.request.setAttribute("list", list);
		this.request.setAttribute("pno", page);
		this.request.setAttribute("type", type);
		this.request.setAttribute("total", Double.valueOf(Math.ceil(rowBounds.getTotalCount() / (double) rows)).intValue());
		this.request.setAttribute("totalRecords", rowBounds.getTotalCount());
		return "search";
	}
}
