package com.work.mapper;

import com.work.bean.SuggestBean;
import com.work.entity.TSugRepl;
import com.work.entity.TSugReplExample;

import java.util.List;
import java.util.Map;

public interface TSugReplMapper {
    int insert(TSugRepl record);

    int insertSelective(TSugRepl record);

    List<TSugRepl> selectByExampleWithBLOBs(TSugReplExample example);

    List<TSugRepl> selectByExampleWithBLOBsByBean(SuggestBean bean);

    List<TSugRepl> selectByExample(TSugReplExample example);
    
    int selectUserIsZ(Map<String, Object> map);
}