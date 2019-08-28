package com.work.mapper;

import java.util.List;

import com.work.bean.NewsBean;
import com.work.entity.TAppDailyNews;

public interface TAppDailyNewsMapper {
	
	List<TAppDailyNews> selectNewsByType(NewsBean bean);
}