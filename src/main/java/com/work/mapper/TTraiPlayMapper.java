package com.work.mapper;

import com.work.entity.TAlloccCase;
import com.work.entity.TTraiPlay;
import com.work.entity.TTraiPlayExample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface TTraiPlayMapper {
    int deleteByPrimaryKey(String courseid);

    int insert(TTraiPlay record);

    int insertSelective(TTraiPlay record);

    List<TTraiPlay> selectByExample(TTraiPlayExample example);

    TTraiPlay selectByPrimaryKey(String courseid);

    int updateByPrimaryKeySelective(TTraiPlay record);

    int updateByPrimaryKey(TTraiPlay record);

    /**
     *  获取报名人数限制
     * @return
     */
    Map<String ,Object> selectAlloCace(Map mapParms);


    /**
     *  获取报名成功人数
     * @return
     */
    int  selectRegertTrainNum(Map mapParms);



}