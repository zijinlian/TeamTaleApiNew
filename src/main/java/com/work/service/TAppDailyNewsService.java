package com.work.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.work.bean.NewsBean;
import com.work.entity.TAppDailyNews;
import com.work.mapper.TAppDailyNewsMapper;

@Service
public class TAppDailyNewsService {
	
	@Resource
	private TAppDailyNewsMapper appDailyNewsMapper;
	
	public List<TAppDailyNews> selectNewsByType(NewsBean bean){
		return appDailyNewsMapper.selectNewsByType(bean);
	}
	
}
