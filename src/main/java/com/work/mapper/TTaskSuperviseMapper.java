package com.work.mapper;

import com.work.entity.TTaskSupervise;
import com.work.entity.TTaskSuperviseExample;

import java.util.List;
import java.util.Map;

public interface TTaskSuperviseMapper {
    int insert(TTaskSupervise record);

    int insertSelective(TTaskSupervise record);

    List<TTaskSupervise> selectByExample(TTaskSuperviseExample example);

    List<TTaskSupervise> selectTaskSuperviseByOrgCode(Map<String, Object> map);

	List<TTaskSupervise> queryExecTask(Map<String, Object> map);

	List<TTaskSupervise> selectTaskSuperviseByTaskId(Map<String, Object> map);

	TTaskSupervise selectMajorPublish(String taskId);

	TTaskSupervise selectFirstPublish(String taskId);

	List<TTaskSupervise> selectTaskManger(Map<String, Object> map);
}