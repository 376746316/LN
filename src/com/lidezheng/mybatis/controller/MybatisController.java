package com.lidezheng.mybatis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.RequestPartServletServerHttpRequest;

import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
import com.lidezheng.Author.entity.Page;
import com.lidezheng.Author.model.Author;
import com.lidezheng.Author.model.AuthorMore;
import com.lidezheng.Blog.model.BlogMore;
import com.lidezheng.mybatis.service.MybatisService;

@Controller
public class MybatisController {
	@Autowired
	private MybatisService mybatisService;

	@RequestMapping("/QueryforSplitPaper.do")
	public String QueryforSplitPaper(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("currentPage") Integer currentPage) {
		int offset = (currentPage - 1) * 5;
		Page page = new Page();
		if (offset >= 0) {
			page.setOffset(offset);
			page.setRows(5);
			List<Author> authorList = mybatisService.QueryforSplitPaper(page);
			// 计算出总页数
			int countQueryAll = mybatisService.CountQueryAll();
			int authorListSize = authorList.size();
			int totalPage = mybatisService.CountTotalPage(countQueryAll, authorListSize);

			// 设置传送到页面的值
			request.setAttribute("authorList", authorList);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("currentPage", currentPage);
			return "splitpaper";
		} else {
			int CURRENTPAGE = 1;
			page.setOffset(0);
			page.setRows(5);
			List<Author> authorList = mybatisService.QueryforSplitPaper(page);
			// 计算出总页数
			int countQueryAll = mybatisService.CountQueryAll();
			int authorListSize = authorList.size();
			int totalPage = mybatisService.CountTotalPage(countQueryAll, authorListSize);

			// 设置传送到页面的值
			request.setAttribute("authorList", authorList);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("currentPage", CURRENTPAGE);
			return "splitpaper";
		}

	}

	@RequestMapping("/QueryforSplitPaperView.do")
	public String QueryforSplitPaperView(HttpServletRequest request, HttpServletResponse response) {
		int CURRENTPAGE = 1;
		Page page = new Page();
		page.setOffset(0);
		page.setRows(5);
		List<Author> authorList = mybatisService.QueryforSplitPaper(page);
		// 计算出总页数
		int countQueryAll = mybatisService.CountQueryAll();
		int authorListSize = authorList.size();
		int totalPage = mybatisService.CountTotalPage(countQueryAll, authorListSize);

		// 设置传送到页面的值
		request.setAttribute("authorList", authorList);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("currentPage", CURRENTPAGE);
		return "splitpaper";
	}

	@RequestMapping("getInfo.do")
	public String getInfo(HttpServletRequest request, HttpServletResponse response, String id) {
		AuthorMore authorMore = mybatisService.getInfo(id);

		// List<Blog> blogList = author.getBlogList();
		// for (Blog blog : blogList) {
		// System.out.println(blog);
		// }

		request.setAttribute("authorMore", authorMore);
		return "MybatisTest";
	}

	@RequestMapping("getinfoByBlogId.do")
	public String getinfoByBlogId(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("id") Integer id) {
		List<BlogMore> blogMorelist = mybatisService.getinfoByBlogId(id);

		// List<Blog> blogList = author.getBlogList();
		// for (Blog blog : blogList) {
		// System.out.println(blog);
		// }

		request.setAttribute("blogMorelist", blogMorelist);
		return "MybatisTest";
	}

	@RequestMapping("getInfoView.do")
	public String getInfoView() {
		return "MybatisTest";
	}

	@RequestMapping("/getinfoByBlogIdView.do")
	public String getinfoByBlogId() {
		return "MybatisTest";
	}
	
	/**
	 * 分页查询
	 * @param request
	 * @param response
	 * @param rows 每页显示记录条数
	 * @param page 当前页码
	 * @return
	 */
	@RequestMapping("/QueryforSplitPaper2.do")
	public String QueryforSplitPaper2(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "rows" ,defaultValue = "5") int rows, @RequestParam(value = "currentPage", defaultValue = "1") int currentPage) {

		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, currentPage);
		
		List<Author> authorList = mybatisService.selectByExample(null, rb);
		request.setAttribute("authorList", authorList);
		// 当前页
		request.setAttribute("currentPage", currentPage);
		// 每页显示条数
		request.setAttribute("rows", rows);
		// 总条数
		request.setAttribute("toTalCount", rb.getTotalCount());
		// 总页数
		int toTalPage = rb.getTotalCount() % rows == 0 ? rb.getTotalCount() / rows : rb.getTotalCount() / rows + 1;
		request.setAttribute("totalPage", toTalPage);
		
		return "splitpaper2";
	}
	

}
