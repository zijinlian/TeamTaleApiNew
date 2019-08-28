package com.work.mapper;

import com.work.entity.TGupDiploma;
import com.work.entity.TGupDiplomaExample;
import java.util.List;

public interface TGupDiplomaMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGupDiploma record);

    int insertSelective(TGupDiploma record);

    List<TGupDiploma> selectByExample(TGupDiplomaExample example);

    TGupDiploma selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGupDiploma record);

    int updateByPrimaryKey(TGupDiploma record);
}