package com.chinasofti.cetp.resource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.resource.dao.CollectVideoMapper;
import com.chinasofti.cetp.resource.dao.CommentVideoMapper;
import com.chinasofti.cetp.resource.dao.ListVideoMapper;
import com.chinasofti.cetp.resource.dao.PlayListMapper;
import com.chinasofti.cetp.resource.dao.VideoMapper;
import com.chinasofti.cetp.resource.dao.VideoUrlMapper;
import com.chinasofti.cetp.resource.model.CollectVideo;
import com.chinasofti.cetp.resource.model.CollectVideoKey;
import com.chinasofti.cetp.resource.model.CommentVideo;
import com.chinasofti.cetp.resource.model.CommentVideoExample;
import com.chinasofti.cetp.resource.model.CommentVideoKey;
import com.chinasofti.cetp.resource.model.PlayListWithVideo;
import com.chinasofti.cetp.resource.model.VideoUrl;
import com.chinasofti.cetp.resource.model.VideoUrlExample;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;

@Service("playerService")
public class PlayerService {
	@Autowired
	private VideoMapper videoMapper;
	@Autowired
	private PlayListMapper playListMapper;
	@Autowired
	private ListVideoMapper listVideoMapper;
	@Autowired
	private VideoUrlMapper videoUrlMapper;
	@Autowired
	private CommentVideoMapper commentVideoMapper;
	@Autowired
	private CollectVideoMapper collectVideoMapper;

	public CommentVideoMapper getCommentVideoMapper() {
		return commentVideoMapper;
	}

	public void setCommentVideoMapper(CommentVideoMapper commentVideoMapper) {
		this.commentVideoMapper = commentVideoMapper;
	}

	public CollectVideoMapper getCollectVideoMapper() {
		return collectVideoMapper;
	}

	public void setCollectVideoMapper(CollectVideoMapper collectVideoMapper) {
		this.collectVideoMapper = collectVideoMapper;
	}

	public PlayListMapper getPlayListMapper() {
		return playListMapper;
	}

	public void setPlayListMapper(PlayListMapper playListMapper) {
		this.playListMapper = playListMapper;
	}

	public ListVideoMapper getListVideoMapper() {
		return listVideoMapper;
	}

	public void setListVideoMapper(ListVideoMapper listVideoMapper) {
		this.listVideoMapper = listVideoMapper;
	}

	public VideoUrlMapper getVideoUrlMapper() {
		return videoUrlMapper;
	}

	public void setVideoUrlMapper(VideoUrlMapper videoUrlMapper) {
		this.videoUrlMapper = videoUrlMapper;
	}

	public VideoMapper getVideoMapper() {
		return videoMapper;
	}

	public void setVideoMapper(VideoMapper videoMapper) {
		this.videoMapper = videoMapper;
	}

	public VideoWithBLOBs selectVideoByParimaryKey(Integer vId) {
		VideoWithBLOBs video = videoMapper.selectByPrimaryKey(vId);
		return video;
	}

	/**
	 * 返回播放列表
	 * 
	 * @param listId
	 * @return
	 */
	public PlayListWithVideo selectPListById(Integer listId) {
		PlayListWithVideo pList = playListMapper.selectPlayListWithVideoByPrimaryKey(listId);
		return pList;
	}

	public VideoUrl selectVideoUrlBy(String seq, Integer vId) {
		VideoUrlExample example = new VideoUrlExample();
		example.createCriteria().andVuVIdEqualTo(vId).andVuTypeEqualTo(seq);
		List<VideoUrl> list = videoUrlMapper.selectByExampleWithBLOBs(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	public void updateVideo(VideoWithBLOBs video) {
		videoMapper.updateByPrimaryKeySelective(video);
	}

	/**
	 * 获取视频推荐统计
	 * 
	 * @param vId
	 *            视频编号
	 * @return
	 */
	public Integer selectRecommendCount(Integer vId) {
		CommentVideoExample example = new CommentVideoExample();
		example.createCriteria().andCommvFlagEqualTo("1").andCommvVIdEqualTo(vId);
		return commentVideoMapper.countByExample(example);
	}

	/**
	 * 获取不推荐视频统计
	 * 
	 * @param vId
	 *            视频编号
	 * @return
	 */
	public Integer selectNotRecommendCount(Integer vId) {
		CommentVideoExample example = new CommentVideoExample();
		example.createCriteria().andCommvFlagEqualTo("0").andCommvVIdEqualTo(vId);
		return commentVideoMapper.countByExample(example);
	}

	/**
	 * 查询学生对视频的评价
	 * 
	 * @param key
	 * @return
	 */
	public CommentVideo selectCommvByKey(CommentVideoKey key) {
		return commentVideoMapper.selectByPrimaryKey(key);
	}

	/**
	 * 添加学生推荐视频
	 * @param cv
	 */
	public void addCommVideoVideo(CommentVideo cv) {
		commentVideoMapper.insertSelective(cv);
	}

	/**
	 * 更新学生推荐视频
	 * @param cv
	 */
	public void updateCommVideoVideo(CommentVideo cv) {
		commentVideoMapper.updateByPrimaryKeySelective(cv);
	}

	/**
	 * 查询学生是否收藏视频
	 * 
	 * @param key
	 * @return 已收藏返回true，否则false
	 */
	public boolean selectCollvByKey(CollectVideoKey key) {
		if (collectVideoMapper.selectByPrimaryKey(key) != null) {
			return true;
		}
		return false;
	}

	/**
	 * 收藏视频
	 * 
	 * @param cv
	 */
	public void collectVideo(CollectVideo cv) {
		collectVideoMapper.insertSelective(cv);
	}

	/**
	 * 取消收藏视频
	 * 
	 * @param key
	 */
	public void cancelCollectVideo(CollectVideoKey key) {
		collectVideoMapper.deleteByPrimaryKey(key);
	}
}
