package com.work.mapper;

import com.work.bean.GaResumeBean;
import com.work.entity.TmpPepmgmEmpInfo;
import com.work.entity.TmpPepmgmEmpInfoExample;

import java.util.List;
import java.util.Map;

public interface TmpPepmgmEmpInfoMapper {
	
    int insert(TmpPepmgmEmpInfo record);

    int insertSelective(TmpPepmgmEmpInfo record);

    List<TmpPepmgmEmpInfo> selectByExample(TmpPepmgmEmpInfoExample example);
    
    List<Map<String,Object>> selectEmpCurve(GaResumeBean bean);
    
    List<Map<String,Object>> selectEmpAttendance(GaResumeBean bean);
    
    List<Map<String,Object>> selectGrowEmpListByEmpId(Map<String, String> map);
    
    List<Map<String,Object>> selectGrowEmpListByEmpId2(Map<String, String> map);
    
    List<Map<String,Object>> selectGrowEmpList(Map<String, String> map);
    
    List<Map<String,Object>> selectEmpListByOrgCode(Map<String, String> map);
    
}