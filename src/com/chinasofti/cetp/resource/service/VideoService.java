package com.chinasofti.cetp.resource.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.resource.dao.VideoMapper;
import com.chinasofti.cetp.resource.dao.VideoUrlMapper;
import com.chinasofti.cetp.resource.model.VideoExample;
import com.chinasofti.cetp.resource.model.VideoUrl;
import com.chinasofti.cetp.resource.model.VideoUrlExample;
import com.chinasofti.cetp.resource.model.VideoWithBLOBs;
import com.chinasofti.cetp.study.dao.SubCoursewareMapper;
import com.chinasofti.cetp.study.model.SubCourseware;

@Service("videoService")
public class VideoService {

	@Autowired
	private VideoMapper videoMapper;

	@Autowired
	private SubCoursewareMapper subCoursewareMapper;

	@Autowired
	private VideoUrlMapper videoUrlMapper;

	public VideoUrlMapper getVideoUrlMapper() {
		return videoUrlMapper;
	}

	public void setVideoUrlMapper(VideoUrlMapper videoUrlMapper) {
		this.videoUrlMapper = videoUrlMapper;
	}

	public SubCoursewareMapper getSubCoursewareMapper() {
		return subCoursewareMapper;
	}

	public void setSubCoursewareMapper(SubCoursewareMapper subCoursewareMapper) {
		this.subCoursewareMapper = subCoursewareMapper;
	}

	public VideoMapper getVideoMapper() {
		return videoMapper;
	}

	public void setVideoMapper(VideoMapper videoMapper) {
		this.videoMapper = videoMapper;
	}

	/**
	 * 插入视频
	 * 
	 * @param video
	 *            视频
	 * @return 视频编号
	 */
	public Integer addVideo(VideoWithBLOBs video) {
		int rows = videoMapper.insertSelective(video);
		if (rows > 0) {
			return video.getvId();
		} else {
			return -1;
		}
	}

	/**
	 * 通过主键删除视频信息
	 * 
	 * @param vId
	 *            视频编号
	 */
	public void deleteVideo(Integer vId) {
		videoMapper.deleteByPrimaryKey(vId);
	}

	/**
	 * 修改视频信息
	 * 
	 * @param video
	 *            视频
	 */
	public void updateVideo(VideoWithBLOBs video) {
		videoMapper.updateByPrimaryKeySelective(video);
	}

	/**
	 * 查询当前编号的视频信息
	 * 
	 * @param vId
	 *            视频编号
	 * @return 视频
	 */
	public VideoWithBLOBs selectVideoByParimaryKey(Integer vId) {
		return videoMapper.selectByPrimaryKey(vId);
	}

	/**
	 * 查询当前条件下的视频
	 * 
	 * @param e
	 *            查询条件
	 * @return 视频集合
	 */
	public List<VideoWithBLOBs> selectVideoByExample(VideoExample e, RowBounds rb) {
		List<VideoWithBLOBs> list = videoMapper.selectByExampleWithBLOBs(e, rb);
		for (VideoWithBLOBs videoWithBLOBs : list) {
			switch (videoWithBLOBs.getvType().charAt(0)) {
			case '1':
				videoWithBLOBs.setvType("奇艺高清");
				break;
			case '2':
				videoWithBLOBs.setvType("CC云视频");
				break;
			case '3':
				videoWithBLOBs.setvType("系统资源视频");
				break;
			case '4':
				videoWithBLOBs.setvType("服务器资源视频");
				break;

			default:
				videoWithBLOBs.setvType("未知位置");
				break;
			}
		}
		return list;
	}

	public List<VideoWithBLOBs> selectByExampleWithBLOBsList(HashMap<String, Object> map, RowBounds rb) {
		List<VideoWithBLOBs> list = videoMapper.selectByExampleWithBLOBsList(map, rb);
		for (VideoWithBLOBs videoWithBLOBs : list) {
			switch (videoWithBLOBs.getvType().charAt(0)) {
			case '1':
				videoWithBLOBs.setvType("奇艺高清");
				break;
			case '2':
				videoWithBLOBs.setvType("CC云视频");
				break;
			case '3':
				videoWithBLOBs.setvType("系统资源视频");
				break;
			case '4':
				videoWithBLOBs.setvType("服务器资源视频");
				break;

			default:
				videoWithBLOBs.setvType("未知位置");
				break;
			}
		}
		return list;
	}

	public SubCourseware selectSubCoursewareById(Integer scId) {
		return subCoursewareMapper.selectByPrimaryKey(scId);
	}

	public void updateScById(SubCourseware sc) {
		subCoursewareMapper.updateByPrimaryKeySelective(sc);
	}

	public void addVideoUrl(VideoUrl vu) {
		videoUrlMapper.insertSelective(vu);
	}

	public void updateVideoUrl(VideoUrl vu) {
		videoUrlMapper.updateByPrimaryKeySelective(vu);
	}

	public List<VideoUrl> selectVideoUrlBy(Integer vId, String type) {
		VideoUrlExample example = new VideoUrlExample();
		example.createCriteria().andVuVIdEqualTo(vId).andVuTypeEqualTo(type);
		List<VideoUrl> list = videoUrlMapper.selectByExample(example);
		if (list.size() > 0) {
			return list;
		} else {
			return null;
		}
	}

	public void deleteByMap(Integer vId, String type) {
		videoUrlMapper.deleteByMap(vId, type);
	}
}
