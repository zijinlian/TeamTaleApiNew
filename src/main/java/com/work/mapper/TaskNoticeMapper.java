package com.work.mapper;

import com.work.entity.TaskNotice;

public interface TaskNoticeMapper {
	
	int insertNotice(TaskNotice taskNotice);
	
	TaskNotice selectByPrimaryKey(String id);
	
	int deleteByPrimaryKey(String id);
}
