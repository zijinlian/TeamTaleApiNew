package com.work.mapper;

import com.work.entity.TAppUpdate;
import com.work.entity.TAppUpdateExample;
import java.util.List;

public interface TAppUpdateMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAppUpdate record);

    int insertSelective(TAppUpdate record);

    List<TAppUpdate> selectByExample(TAppUpdateExample example);

    TAppUpdate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAppUpdate record);

    int updateByPrimaryKey(TAppUpdate record);
}