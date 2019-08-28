package com.work.mapper;

import com.work.entity.TTraiSign;
import com.work.entity.TTraiSignExample;
import java.util.List;

public interface TTraiSignMapper {
    int deleteByPrimaryKey(String signid);

    int insert(TTraiSign record);

    int insertSelective(TTraiSign record);

    List<TTraiSign> selectByExample(TTraiSignExample example);

    TTraiSign selectByPrimaryKey(String signid);

    int updateByPrimaryKeySelective(TTraiSign record);

    int updateByPrimaryKey(TTraiSign record);
}