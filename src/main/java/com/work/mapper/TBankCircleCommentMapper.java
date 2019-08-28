package com.work.mapper;

import java.util.List;

import com.work.entity.TBankCircleComment;

public interface TBankCircleCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(TBankCircleComment record);

    int insertSelective(TBankCircleComment record);

    TBankCircleComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TBankCircleComment record);

    int updateByPrimaryKey(TBankCircleComment record);
    
    List<TBankCircleComment> selectCommentByBankCircleId(String circleId);
    
    List<String> selectFilterKeyWork();
}