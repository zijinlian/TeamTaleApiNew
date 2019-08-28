package com.work.mapper;

import com.work.entity.TDishProproal;
import com.work.entity.TDishProproalExample;
import java.util.List;

public interface TDishProproalMapper {
    int deleteByPrimaryKey(String id);

    int insert(TDishProproal record);

    int insertSelective(TDishProproal record);

    List<TDishProproal> selectByExample(TDishProproalExample example);

    TDishProproal selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TDishProproal record);

    int updateByPrimaryKey(TDishProproal record);
}