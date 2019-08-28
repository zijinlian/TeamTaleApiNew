package com.work.mapper;

import com.work.entity.TTeacherCount;
import com.work.entity.TTeacherCountExample;
import java.util.List;

public interface TTeacherCountMapper {
    int deleteByPrimaryKey(String id);

    int insert(TTeacherCount record);

    int insertSelective(TTeacherCount record);

    List<TTeacherCount> selectByExample(TTeacherCountExample example);

    TTeacherCount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TTeacherCount record);

    int updateByPrimaryKey(TTeacherCount record);
}