package com.work.mapper;

import com.work.entity.TStudyTrainPraise;
import com.work.entity.TStudyTrainPraiseExample;
import java.util.List;

public interface TStudyTrainPraiseMapper {
    int deleteByPrimaryKey(Object praiseId);

    int insert(TStudyTrainPraise record);

    int insertSelective(TStudyTrainPraise record);

    List<TStudyTrainPraise> selectByExample(TStudyTrainPraiseExample example);

    TStudyTrainPraise selectByPrimaryKey(Object praiseId);

    int updateByPrimaryKeySelective(TStudyTrainPraise record);

    int updateByPrimaryKey(TStudyTrainPraise record);
}