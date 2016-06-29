package com.chinasofti.cetp.resource.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.resource.dao.ListVideoMapper;
import com.chinasofti.cetp.resource.dao.PlayListMapper;
import com.chinasofti.cetp.resource.dao.VideoMapper;
import com.chinasofti.cetp.resource.model.ListVideo;
import com.chinasofti.cetp.resource.model.ListVideoExample;
import com.chinasofti.cetp.resource.model.ListVideoWithBLOBs;
import com.chinasofti.cetp.resource.model.PlayList;
import com.chinasofti.cetp.resource.model.PlayListExample;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;

@Service("playListService")
public class PlayListService {

	@Autowired
	private VideoMapper videoMapper;

	@Autowired
	private PlayListMapper playListMapper;

	@Autowired
	private ListVideoMapper listVideoMapper;

	public VideoMapper getVideoMapper() {
		return videoMapper;
	}

	public void setVideoMapper(VideoMapper videoMapper) {
		this.videoMapper = videoMapper;
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

	public PlayList selectPlayListById(Integer listId) {
		return playListMapper.selectByPrimaryKey(listId);
	}

	public void addPlayList(PlayList pl) {
		playListMapper.insertSelective(pl);
	}

	public void deletePlayList(Integer listId) {
		playListMapper.deleteByPrimaryKey(listId);
	}

	public void updatePlayList(PlayList pl) {
		playListMapper.updateByPrimaryKeySelective(pl);
	}

	public VideoWithBLOBs selectVideoById(Integer vId) {
		return videoMapper.selectByPrimaryKey(vId);
	}

	public int addVideo(VideoWithBLOBs video) {
		int rows = videoMapper.insertSelective(video);
		if (rows > 0) {
			return video.getvId();
		} else {
			return -1;
		}
	}

	public List<VideoWithBLOBs> selectVideoList(Integer listId, RowBounds rb) {
		return null;
	}

	public List<PlayList> selectPlayList(PlayListExample e, RowBounds rb) {
		List<PlayList> list = playListMapper.selectByExampleWithBLOBs(e, rb);
		if (list.size() > 0) {
			return list;
		} else {
			return null;
		}
	}

	public List<ListVideo> selectListVideo(ListVideoExample e) {
		List<ListVideo> list = listVideoMapper.selectByExample(e);
		if (list.size() > 0) {
			return list;
		} else {
			return null;
		}
	}

	public List<ListVideoWithBLOBs> selectVideoListByListId(HashMap<String, Object> map, RowBounds rb) {
		List<ListVideoWithBLOBs> list = videoMapper.selectVideoListByListId(map, rb);
		return list;
	}

	public List<VideoWithBLOBs> getAllVideosNotByListId(HashMap<String, Object> map, RowBounds rb) {
		List<VideoWithBLOBs> list = videoMapper.selectVideoListNotByListId(map, rb);
		return list;
	}

	public void addListVideo(ListVideo lv) {
		listVideoMapper.insertSelective(lv);
	}

	public void updateListVideo(ListVideo lv) {
		listVideoMapper.updateByPrimaryKeySelective(lv);
	}

	public void deleteListVideoById(Integer lvId) {
		listVideoMapper.deleteByPrimaryKey(lvId);
	}

	public ListVideo selectListVideoById(Integer lvId) {
		return listVideoMapper.selectByPrimaryKey(lvId);
	}

	public List<ListVideo> selectListVideo(ListVideo lv) {
		ListVideoExample example = new ListVideoExample();
		example.createCriteria().andLvListIdEqualTo(lv.getLvListId()).andLvVideoIdEqualTo(lv.getLvVideoId());
		List<ListVideo> list = listVideoMapper.selectByExample(example);
		if (list.size() > 0) {
			return list;
		} else {
			return null;
		}
	}

}
