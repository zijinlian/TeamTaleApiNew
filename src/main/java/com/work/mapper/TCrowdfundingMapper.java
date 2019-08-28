package com.work.mapper;

import java.util.List;

import com.work.bean.CrowdBean;
import com.work.bean.DiscussionBean;
import com.work.entity.TCrowdfunding;

public interface TCrowdfundingMapper {
	
    int deleteByPrimaryKey(String fdCfId);

    int insert(TCrowdfunding record);

    int insertSelective(TCrowdfunding record);

    TCrowdfunding selectByPrimaryKey(String fdCfId);

     TCrowdfunding selectCrowdBycj(String fdCfId);

    int updateByPrimaryKeySelective(TCrowdfunding record);

    int updateByPrimaryKey(TCrowdfunding record);
    
    List<TCrowdfunding> selectCrowdfundingByState(CrowdBean bean);
    
    List<TCrowdfunding> selectCrowdfundingByTop(CrowdBean bean);
    
    List<TCrowdfunding> selectCrowdfundingByHot(CrowdBean bean);
    
    String selectUserDeptCode(String userid);
    
    String queryUnitnmeByEmpId(String userid);

    int selectDissCountById(DiscussionBean bean);
    
}