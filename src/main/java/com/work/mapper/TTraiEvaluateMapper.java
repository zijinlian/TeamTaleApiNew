package com.work.mapper;

import com.work.entity.TTraiEvaluate;
import com.work.entity.TTraiEvaluateExample;
import java.util.List;

public interface TTraiEvaluateMapper {
    int deleteByPrimaryKey(String evaluateid);

    int insert(TTraiEvaluate record);

    int insertSelective(TTraiEvaluate record);

    List<TTraiEvaluate> selectByExample(TTraiEvaluateExample example);

    TTraiEvaluate selectByPrimaryKey(String evaluateid);

    int updateByPrimaryKeySelective(TTraiEvaluate record);

    int updateByPrimaryKey(TTraiEvaluate record);
}