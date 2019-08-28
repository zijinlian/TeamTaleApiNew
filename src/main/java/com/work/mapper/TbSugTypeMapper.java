package com.work.mapper;

import com.work.entity.TbSugType;
import com.work.entity.TbSugTypeExample;

import java.util.List;

public interface TbSugTypeMapper {
    int deleteByPrimaryKey(String fdTypeId);

    int insert(TbSugType record);

    int insertSelective(TbSugType record);

    List<TbSugType> selectByExample(TbSugTypeExample example);

    TbSugType selectByPrimaryKey(String fdTypeId);

    int updateByPrimaryKeySelective(TbSugType record);

    int updateByPrimaryKey(TbSugType record);
}