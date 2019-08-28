package com.work.mapper;

import java.util.List;
import java.util.Map;

import com.work.bean.DishEmpCheckBean;
import com.work.entity.TDishMenu;

public interface TDishMenuMapper {
    int deleteByPrimaryKey(String dishid);

    int insert(TDishMenu record);

    int insertSelective(TDishMenu record);

    TDishMenu selectByPrimaryKey(String dishid);

    int updateByPrimaryKeySelective(TDishMenu record);

    int updateByPrimaryKeyWithBLOBs(TDishMenu record);

    int updateByPrimaryKey(TDishMenu record);
    
    List<TDishMenu> selectDisMenu(Map<String, Object> map);
    
    String selectDishScore(String dishid);

    void deleteDishTimeById(DishEmpCheckBean dishEmpCheckBean);

}