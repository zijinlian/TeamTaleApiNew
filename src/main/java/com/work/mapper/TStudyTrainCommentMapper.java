package com.work.mapper;

import com.work.entity.TStudyTrainComment;
import com.work.entity.TStudyTrainCommentExample;
import java.util.List;

public interface TStudyTrainCommentMapper {
    int deleteByPrimaryKey(Object commentId);

    int insert(TStudyTrainComment record);

    int insertSelective(TStudyTrainComment record);

    List<TStudyTrainComment> selectByExample(TStudyTrainCommentExample example);

    TStudyTrainComment selectByPrimaryKey(Object commentId);

    int updateByPrimaryKeySelective(TStudyTrainComment record);

    int updateByPrimaryKey(TStudyTrainComment record);
}