package com.work.mapper;

import com.work.entity.TCmApply;
import com.work.entity.TCmApplyExample;
import java.util.List;

public interface TCmApplyMapper {
    int deleteByPrimaryKey(String applyid);

    int insert(TCmApply record);

    int insertSelective(TCmApply record);

    List<TCmApply> selectByExample(TCmApplyExample example);

    TCmApply selectByPrimaryKey(String applyid);

    int updateByPrimaryKeySelective(TCmApply record);

    int updateByPrimaryKey(TCmApply record);
}