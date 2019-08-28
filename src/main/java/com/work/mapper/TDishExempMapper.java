package com.work.mapper;

import com.work.entity.TDishExemp;
import com.work.entity.TDishExempExample;
import com.work.entity.TOrderDishExemp;

import java.util.List;

public interface TDishExempMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(TDishExemp record);

    int insertSelective(TDishExemp record);

    List<TDishExemp> selectByExample(TDishExempExample example);

    TDishExemp selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(TDishExemp record);

    int updateByPrimaryKey(TDishExemp record);

    List<TOrderDishExemp> selectOrderDishExemp(String empid);
}