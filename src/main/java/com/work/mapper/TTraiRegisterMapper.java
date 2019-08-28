package com.work.mapper;

import com.work.entity.TTraiRegister;
import com.work.entity.TTraiRegisterExample;
import java.util.List;

public interface TTraiRegisterMapper {
    int deleteByPrimaryKey(String registerid);

    int insert(TTraiRegister record);

    int insertSelective(TTraiRegister record);

    List<TTraiRegister> selectByExample(TTraiRegisterExample example);

    TTraiRegister selectByPrimaryKey(String registerid);

    int updateByPrimaryKeySelective(TTraiRegister record);

    int updateByPrimaryKey(TTraiRegister record);
}