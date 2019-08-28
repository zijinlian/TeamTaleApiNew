package com.work.mapper;

import com.work.entity.TGaGrouphonor;
import com.work.entity.TGaGrouphonorExample;
import java.util.List;

public interface TGaGrouphonorMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGaGrouphonor record);

    int insertSelective(TGaGrouphonor record);

    List<TGaGrouphonor> selectByExample(TGaGrouphonorExample example);

    TGaGrouphonor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGaGrouphonor record);

    int updateByPrimaryKey(TGaGrouphonor record);
}