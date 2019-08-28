package com.work.mapper;

import com.work.entity.TIccMath;
import com.work.entity.TIccMathExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TIccMathMapper {
    int deleteByPrimaryKey(String fdMathsId);

    int insert(TIccMath record);

    int insertSelective(TIccMath record);

    List<TIccMath> selectByExample(TIccMathExample example);

    TIccMath selectByPrimaryKey(String fdMathsId);

    int updateByPrimaryKeySelective(TIccMath record);

    int updateByPrimaryKey(TIccMath record);

    List<Map<String,Object>> selectMathProblem(String mathId);

    List<Map<String,Object>> selectNewMathProblem(@Param("deptId")  String deptId);
}