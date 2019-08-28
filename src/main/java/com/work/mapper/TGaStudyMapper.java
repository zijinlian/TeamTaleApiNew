package com.work.mapper;

import com.work.bean.GaResumeBean;
import com.work.entity.TGaStudy;
import com.work.entity.TGaStudyExample;
import java.util.List;
import java.util.Map;

public interface TGaStudyMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGaStudy record);

    int insertSelective(TGaStudy record);

//    List<TGaStudy> selectByExample(TGaStudyExample example);
    List<Map<String,Object>> selectStudyBank(GaResumeBean example);

    List<Map<String,Object>> selectStudyBySubBank(GaResumeBean example);

    TGaStudy selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGaStudy record);

    int updateByPrimaryKey(TGaStudy record);
}