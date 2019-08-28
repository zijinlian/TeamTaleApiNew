package com.work.mapper;

import com.work.entity.TCheckItems;
import com.work.entity.TCheckItemsExample;
import java.util.List;

public interface TCheckItemsMapper {
    int deleteByPrimaryKey(String fdItemsId);

    int insert(TCheckItems record);

    int insertSelective(TCheckItems record);

    List<TCheckItems> selectByExample(TCheckItemsExample example);

    TCheckItems selectByPrimaryKey(String fdItemsId);

    int updateByPrimaryKeySelective(TCheckItems record);

    int updateByPrimaryKey(TCheckItems record);
}