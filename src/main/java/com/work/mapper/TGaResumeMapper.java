package com.work.mapper;

import com.work.entity.TGaResume;
import com.work.entity.TGaResumeExample;
import java.util.List;

public interface TGaResumeMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGaResume record);

    int insertSelective(TGaResume record);

    List<TGaResume> selectByExample(TGaResumeExample example);

    TGaResume selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGaResume record);

    int updateByPrimaryKey(TGaResume record);
}