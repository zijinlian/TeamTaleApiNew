package com.work.mapper;

import com.work.entity.TTaskSuperviseDuty;
import com.work.entity.TTaskSuperviseDutyExample;
import java.util.List;

public interface TTaskSuperviseDutyMapper {
    int insert(TTaskSuperviseDuty record);

    int insertSelective(TTaskSuperviseDuty record);

    List<TTaskSuperviseDuty> selectByExample(TTaskSuperviseDutyExample example);
}