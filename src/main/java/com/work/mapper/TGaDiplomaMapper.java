package com.work.mapper;

import com.work.bean.GaResumeBean;
import com.work.entity.TGaDiploma;
import com.work.entity.TGaDiplomaExample;

import java.util.List;
import java.util.Map;

public interface TGaDiplomaMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGaDiploma record);

    int insertSelective(TGaDiploma record);

    List<TGaDiploma> selectByExample(TGaDiplomaExample example);

    TGaDiploma selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGaDiploma record);

    int updateByPrimaryKey(TGaDiploma record);
    
    List<Map<String, Object>> selectGaDipLomaByEmpId(GaResumeBean record);
}