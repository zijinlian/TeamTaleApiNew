package com.work.mapper;

import com.work.entity.TStudyTrain;
import com.work.entity.TStudyTrainExample;
import java.util.List;

public interface TStudyTrainMapper {
    int deleteByPrimaryKey(String studyId);

    int insert(TStudyTrain record);

    int insertSelective(TStudyTrain record);

    List<TStudyTrain> selectByExample(TStudyTrainExample example);

    TStudyTrain selectByPrimaryKey(String studyId);

    int updateByPrimaryKeySelective(TStudyTrain record);

    int updateByPrimaryKey(TStudyTrain record);
}