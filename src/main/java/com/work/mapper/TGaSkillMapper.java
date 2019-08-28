package com.work.mapper;

import com.work.bean.GaResumeBean;
import com.work.entity.TGaSkill;
import com.work.entity.TGaSkillExample;

import java.util.List;
import java.util.Map;

public interface TGaSkillMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGaSkill record);

    int insertSelective(TGaSkill record);

    List<TGaSkill> selectByExample(TGaSkillExample example);

    TGaSkill selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TGaSkill record);

    int updateByPrimaryKey(TGaSkill record);
    
  //  List<Map<String, Object>> selectSkillByEmpid(String empId);
    List<Map<String, Object>> selectSkillByEmpid(GaResumeBean bean);
}