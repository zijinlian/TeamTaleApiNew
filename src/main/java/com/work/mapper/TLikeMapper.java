package com.work.mapper;

import java.util.List;

import com.work.bean.PraiseBean;
import com.work.entity.TLike;

public interface TLikeMapper {
    int deleteByPrimaryKey(String fdLikeId);

    int insert(TLike record);

    int insertSelective(TLike record);

    TLike selectByPrimaryKey(String fdLikeId);

    int updateByPrimaryKeySelective(TLike record);

    int updateByPrimaryKey(TLike record);
    
    List<TLike> selectUserLike(PraiseBean bean);
}