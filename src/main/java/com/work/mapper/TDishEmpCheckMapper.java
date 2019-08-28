package com.work.mapper;

import com.work.entity.TDishEmpCheck;
import com.work.entity.TDishEmpCheckExample;

import java.util.List;
import java.util.Map;

public interface TDishEmpCheckMapper {
    int deleteByPrimaryKey(String id);

    int insert(TDishEmpCheck record);

    int insertSelective(TDishEmpCheck record);

    List<TDishEmpCheck> selectByExample(TDishEmpCheckExample example);

    TDishEmpCheck selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TDishEmpCheck record);

    int updateByPrimaryKey(TDishEmpCheck record);
    
    Integer selectCheckNumCountByDate(Map<String, Object> map);

//    int  checkIsHaveBitchOrder();

}