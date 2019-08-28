package com.work.mapper;

import com.work.entity.TChickStaff;
import com.work.entity.TChickStaffExample;
import java.util.List;

public interface TChickStaffMapper {
    int deleteByPrimaryKey(String fdChickStaffId);

    int insert(TChickStaff record);

    int insertSelective(TChickStaff record);

    List<TChickStaff> selectByExample(TChickStaffExample example);

    TChickStaff selectByPrimaryKey(String fdChickStaffId);

    int updateByPrimaryKeySelective(TChickStaff record);

    int updateByPrimaryKey(TChickStaff record);
}