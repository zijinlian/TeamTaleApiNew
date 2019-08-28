package com.work.mapper;

import com.work.entity.TDishTake;
import com.work.entity.TDishTakeExample;

import java.util.List;

public interface TDishTakeMapper {
    int deleteByPrimaryKey(String id);

    int insert(TDishTake record);

    int insertSelective(TDishTake record);

    List<TDishTake> selectByExample(TDishTakeExample example);

    TDishTake selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TDishTake record);

    int updateByPrimaryKey(TDishTake record);
}