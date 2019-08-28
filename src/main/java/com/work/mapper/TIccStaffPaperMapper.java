package com.work.mapper;

import com.work.entity.TIccStaffPaper;
import com.work.entity.TIccStaffPaperExample;
import com.work.entity.TIccStaffPaperKey;
import java.util.List;

public interface TIccStaffPaperMapper {
    int deleteByPrimaryKey(TIccStaffPaperKey key);

    int insert(TIccStaffPaper record);

    int insertSelective(TIccStaffPaper record);

    List<TIccStaffPaper> selectByExample(TIccStaffPaperExample example);

    TIccStaffPaper selectByPrimaryKey(TIccStaffPaperKey key);

    int updateByPrimaryKeySelective(TIccStaffPaper record);

    int updateByPrimaryKey(TIccStaffPaper record);
}