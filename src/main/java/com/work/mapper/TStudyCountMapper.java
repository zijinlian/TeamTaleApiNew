package com.work.mapper;

import com.work.entity.TStudyCount;
import com.work.entity.TStudyCountExample;
import java.util.List;

public interface TStudyCountMapper {
    int deleteByPrimaryKey(String id);

    int insert(TStudyCount record);

    int insertSelective(TStudyCount record);

    List<TStudyCount> selectByExample(TStudyCountExample example);

    TStudyCount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TStudyCount record);

    int updateByPrimaryKey(TStudyCount record);
}