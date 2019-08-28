package com.work.mapper;

import com.work.entity.TTraiCourse;
import com.work.entity.TTraiCourseExample;

import java.util.List;
import java.util.Map;

public interface TTraiCourseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TTraiCourse record);

    int insertSelective(TTraiCourse record);

    List<TTraiCourse> selectByExample(TTraiCourseExample example);

    TTraiCourse selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TTraiCourse record);

    int updateByPrimaryKey(TTraiCourse record);
    
    List<Map<String, Object>> selectTraiCourseList(Map<String, Object> smap);
}