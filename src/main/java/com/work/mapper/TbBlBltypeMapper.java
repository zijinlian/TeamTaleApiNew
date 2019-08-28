package com.work.mapper;

import com.work.entity.TbBlBltype;
import com.work.entity.TbBlBltypeExample;
import java.util.List;

public interface TbBlBltypeMapper {
    int deleteByPrimaryKey(String fdTypeId);

    int insert(TbBlBltype record);

    int insertSelective(TbBlBltype record);

    List<TbBlBltype> selectByExample(TbBlBltypeExample example);

    TbBlBltype selectByPrimaryKey(String fdTypeId);

    int updateByPrimaryKeySelective(TbBlBltype record);

    int updateByPrimaryKey(TbBlBltype record);
}