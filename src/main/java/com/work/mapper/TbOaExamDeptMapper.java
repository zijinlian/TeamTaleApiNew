package com.work.mapper;

import com.work.entity.TbOaExamDept;
import com.work.entity.TbOaExamDeptExample;

import java.util.List;

public interface TbOaExamDeptMapper {
    int deleteByPrimaryKey(String deptId);

    int insert(TbOaExamDept record);

    int insertSelective(TbOaExamDept record);

    List<TbOaExamDept> selectByExample(TbOaExamDeptExample example);

    TbOaExamDept selectByPrimaryKey(String deptId);

    int updateByPrimaryKeySelective(TbOaExamDept record);

    int updateByPrimaryKey(TbOaExamDept record);
}