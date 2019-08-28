package com.work.mapper;

import com.work.entity.TCheckFinalList;
import com.work.entity.TCheckFinalListExample;
import java.util.List;

public interface TCheckFinalListMapper {
    int deleteByPrimaryKey(String tbCheckFinalListId);

    int insert(TCheckFinalList record);

    int insertSelective(TCheckFinalList record);

    List<TCheckFinalList> selectByExample(TCheckFinalListExample example);

    TCheckFinalList selectByPrimaryKey(String tbCheckFinalListId);

    int updateByPrimaryKeySelective(TCheckFinalList record);

    int updateByPrimaryKey(TCheckFinalList record);
}