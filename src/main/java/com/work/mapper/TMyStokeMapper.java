package com.work.mapper;

import com.work.bean.MyStokeBean;
import com.work.entity.TMyStoke;
import com.work.entity.TMyStokeExample;

import java.util.List;
import java.util.Map;

public interface TMyStokeMapper {
    int insert(TMyStoke record);

    int insertSelective(TMyStoke record);

    List<TMyStoke> selectByExample(TMyStokeExample example);
    
    int selectUserRoleList(Map<String, Object> map);
    
    List<Map<String,Object>> selectUserList(MyStokeBean bean);

    List<TMyStoke> selectLeaderExample(Map<String, Object> leaderMap);
}