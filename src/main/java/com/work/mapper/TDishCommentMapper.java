package com.work.mapper;

import com.work.entity.TDishComment;
import com.work.entity.TDishCommentExample;
import java.util.List;

public interface TDishCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(TDishComment record);

    int insertSelective(TDishComment record);

    List<TDishComment> selectByExample(TDishCommentExample example);

    TDishComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TDishComment record);

    int updateByPrimaryKey(TDishComment record);
}