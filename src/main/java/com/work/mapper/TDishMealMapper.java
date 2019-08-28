package com.work.mapper;

import com.work.entity.TDishMeal;
import com.work.entity.TDishMealExample;
import java.util.List;

public interface TDishMealMapper {
    int deleteByPrimaryKey(String mealid);

    int insert(TDishMeal record);

    int insertSelective(TDishMeal record);

    List<TDishMeal> selectByExample(TDishMealExample example);

    TDishMeal selectByPrimaryKey(String mealid);

    int updateByPrimaryKeySelective(TDishMeal record);

    int updateByPrimaryKey(TDishMeal record);
}