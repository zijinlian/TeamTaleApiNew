package com.work.mapper;

import java.util.List;
import java.util.Map;

import com.work.bean.CrowdBean;
import com.work.entity.TDiscussion;

public interface TDiscussionMapper {
    int deleteByPrimaryKey(String fdDisId);

    int insert(TDiscussion record);

    int insertSelective(TDiscussion record);

    TDiscussion selectByPrimaryKey(String fdDisId);

    int updateByPrimaryKeySelective(TDiscussion record);

    int updateByPrimaryKey(TDiscussion record);
    
    List<TDiscussion> selectListDisByCrowId(CrowdBean bean);
    
    List<Map<String, String>> selectCrowRank();

    List<Map<String,Object>>  selectProhibitBean(CrowdBean crowdBean);
    
    void updateCommentContent(Map<String, Object> map);
    
}