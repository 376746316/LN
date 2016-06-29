package com.chinasofti.cetp.resource.service;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import net.paoding.analysis.analyzer.PaodingAnalyzer;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.resource.dao.FulltextIndexMapper;
import com.chinasofti.cetp.resource.model.FulltextIndexWithBLOBs;

@Service
public class FulltextIndexService {

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(FulltextIndexService.class);

	@Autowired
	private FulltextIndexMapper fulltextIndexMapper;

	public FulltextIndexMapper getFulltextIndexMapper() {
		return fulltextIndexMapper;
	}

	public void setFulltextIndexMapper(FulltextIndexMapper fulltextIndexMapper) {
		this.fulltextIndexMapper = fulltextIndexMapper;
	}

	/**
	 * 分词
	 * 
	 * @param src
	 * @return
	 */
	public String Split(String src) {
		StringBuilder sb = new StringBuilder();
		Analyzer analyzer = new PaodingAnalyzer();
		StringReader reader = new StringReader(src);
		TokenStream ts = analyzer.tokenStream(src, reader);
		Token t;
		try {
			t = ts.next();
			while (t != null) {
				sb.append(t.termText() + " ");
				t = ts.next();
			}
		} catch (IOException e) {

		}
		return sb.toString();
	}

	public List<FulltextIndexWithBLOBs> buildIndex(String table, String type,
			String col_id, String col_title, String col_content,String where_conditon) {
		List<FulltextIndexWithBLOBs> list = fulltextIndexMapper.getSourceInfo(
				table, type, col_id, col_title, col_content, where_conditon);
		for (FulltextIndexWithBLOBs fulltextIndexWithBLOBs : list) {
			if (fulltextIndexWithBLOBs.getFiTitle() != null
					&& !"".equals(fulltextIndexWithBLOBs.getFiTitle())) {
				fulltextIndexWithBLOBs.setFiTIndex(Split(fulltextIndexWithBLOBs
						.getFiTitle()));
				if (fulltextIndexWithBLOBs.getFiTitle().length() > 65) {
					fulltextIndexWithBLOBs.setFiTitle(fulltextIndexWithBLOBs
							.getFiTitle().substring(0, 60) + "...");
				}
			}
			if (fulltextIndexWithBLOBs.getFiContent() != null
					&& !"".equals(fulltextIndexWithBLOBs.getFiContent())) {
				fulltextIndexWithBLOBs.setFiCIndex(Split(fulltextIndexWithBLOBs
						.getFiContent()));
				if (fulltextIndexWithBLOBs.getFiContent().length() > 150) {
					fulltextIndexWithBLOBs.setFiContent(fulltextIndexWithBLOBs
							.getFiContent().substring(0, 145) + "...");
				}
			}
		}
		int ret = fulltextIndexMapper.replace(list);
		return list;
	}

	public List<FulltextIndexWithBLOBs> search(String key, String type,
			RowBounds rowBounds) {
		return fulltextIndexMapper.search(key, type, rowBounds);
	}
	
	public Integer countBySearch(String key, String type) {
		return fulltextIndexMapper.countBySearch(key, type);
	}
}
