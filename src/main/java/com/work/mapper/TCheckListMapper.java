package com.work.mapper;

import com.work.entity.TCheckList;
import com.work.entity.TCheckListExample;
import java.util.List;

public interface TCheckListMapper {
    int deleteByPrimaryKey(String tbListId);

    int insert(TCheckList record);

    int insertSelective(TCheckList record);

    List<TCheckList> selectByExample(TCheckListExample example);

    TCheckList selectByPrimaryKey(String tbListId);

    int updateByPrimaryKeySelective(TCheckList record);

    int updateByPrimaryKey(TCheckList record);
}