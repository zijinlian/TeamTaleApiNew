package com.work.mapper;

import com.work.entity.TDishExchange;
import com.work.entity.TDishExchangeExample;
import java.util.List;

public interface TDishExchangeMapper {
    int deleteByPrimaryKey(String id);

    int insert(TDishExchange record);

    int insertSelective(TDishExchange record);

    List<TDishExchange> selectByExampleWithBLOBs(TDishExchangeExample example);

    List<TDishExchange> selectByExample(TDishExchangeExample example);

    TDishExchange selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TDishExchange record);

    int updateByPrimaryKeyWithBLOBs(TDishExchange record);

    int updateByPrimaryKey(TDishExchange record);
}