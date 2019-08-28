package com.work.mapper;

import com.work.entity.TIccStaffStatus;
import com.work.entity.TIccStaffStatusExample;
import com.work.entity.TIccStaffStatusKey;
import java.util.List;

public interface TIccStaffStatusMapper {
    int deleteByPrimaryKey(TIccStaffStatusKey key);

    int insert(TIccStaffStatus record);

    int insertSelective(TIccStaffStatus record);

    List<TIccStaffStatus> selectByExample(TIccStaffStatusExample example);

    TIccStaffStatus selectByPrimaryKey(TIccStaffStatusKey key);

    int updateByPrimaryKeySelective(TIccStaffStatus record);

    int updateByPrimaryKey(TIccStaffStatus record);
}