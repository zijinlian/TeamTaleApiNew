package com.work.mapper;

import com.work.entity.TDishOrderInfo;
import com.work.entity.TDishOrderInfoExample;
import java.util.List;

public interface TDishOrderInfoMapper {
    int insert(TDishOrderInfo record);

    int insertSelective(TDishOrderInfo record);

    List<TDishOrderInfo> selectByExample(TDishOrderInfoExample example);
    
    void deleteByOrderId(String orderId);
    
    double selectSumTotlprice(String orderId);
}