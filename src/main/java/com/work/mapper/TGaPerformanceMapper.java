package com.work.mapper;

import com.work.entity.TGaPerformance;
import com.work.entity.TGaPerformanceExample;
import java.util.List;

public interface TGaPerformanceMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGaPerformance record);

    int insertSelective(TGaPerformance record);

    List<TGaPerformance> selectByExample(TGaPerformanceExample example);

    TGaPerformance selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGaPerformance record);

    int updateByPrimaryKey(TGaPerformance record);
}