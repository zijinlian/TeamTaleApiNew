package com.work.mapper;

import com.work.entity.TDishPraise;
import com.work.entity.TDishPraiseExample;
import java.util.List;

public interface TDishPraiseMapper {
    int insert(TDishPraise record);

    int insertSelective(TDishPraise record);

    List<TDishPraise> selectByExample(TDishPraiseExample example);
    
    void deletePraise(String id);
}