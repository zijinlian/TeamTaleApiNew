package com.work.mapper;

import java.util.List;

import com.work.bean.BankCirclePariseBean;
import com.work.entity.TBankCircleParise;

public interface TBankCirclePariseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TBankCircleParise record);

    int insertSelective(TBankCircleParise record);

    TBankCircleParise selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TBankCircleParise record);

    int updateByPrimaryKey(TBankCircleParise record);
    
    List<TBankCircleParise> selectPariseByBankCircleId(String circleId);
    
    List<TBankCircleParise> selectPariseByBankCircleId2(String circleId);
    
    int selectUserIsParise(BankCirclePariseBean bean);
    
    void deleteUserPariseById(TBankCircleParise bean);
}