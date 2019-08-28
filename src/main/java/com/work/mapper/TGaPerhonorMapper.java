package com.work.mapper;

import com.work.entity.TGaPerhonor;
import com.work.entity.TGaPerhonorExample;
import java.util.List;

public interface TGaPerhonorMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGaPerhonor record);

    int insertSelective(TGaPerhonor record);

    List<TGaPerhonor> selectByExample(TGaPerhonorExample example);

    TGaPerhonor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGaPerhonor record);

    int updateByPrimaryKey(TGaPerhonor record);
}