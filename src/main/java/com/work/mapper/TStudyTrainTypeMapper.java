package com.work.mapper;

import com.work.entity.TStudyTrainType;
import com.work.entity.TStudyTrainTypeExample;
import java.util.List;

public interface TStudyTrainTypeMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(TStudyTrainType record);

    int insertSelective(TStudyTrainType record);

    List<TStudyTrainType> selectByExample(TStudyTrainTypeExample example);

    TStudyTrainType selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(TStudyTrainType record);

    int updateByPrimaryKey(TStudyTrainType record);
}