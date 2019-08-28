package com.work.mapper;

import com.work.entity.TCheckFinalItems;
import com.work.entity.TCheckFinalItemsExample;
import java.util.List;

public interface TCheckFinalItemsMapper {
    int deleteByPrimaryKey(String fdFinalItemsId);

    int insert(TCheckFinalItems record);

    int insertSelective(TCheckFinalItems record);

    List<TCheckFinalItems> selectByExample(TCheckFinalItemsExample example);

    TCheckFinalItems selectByPrimaryKey(String fdFinalItemsId);

    int updateByPrimaryKeySelective(TCheckFinalItems record);

    int updateByPrimaryKey(TCheckFinalItems record);
}