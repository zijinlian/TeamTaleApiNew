package com.work.mapper;

import com.work.entity.TDishBatch;
import com.work.entity.TDishBatchExample;
import java.util.List;

public interface TDishBatchMapper {
    int deleteByPrimaryKey(String batchid);

    int insert(TDishBatch record);

    int insertSelective(TDishBatch record);

    List<TDishBatch> selectByExample(TDishBatchExample example);

    TDishBatch selectByPrimaryKey(String batchid);

    int updateByPrimaryKeySelective(TDishBatch record);

    int updateByPrimaryKey(TDishBatch record);
}