package com.work.mapper.xml;

import com.work.bean.TbIccStaffPaperNewBean;
import com.work.entity.TIccStaffPaper;
import com.work.entity.TIccStaffPaperExample;
import com.work.entity.TIccStaffPaperKey;
import com.work.entity.TbIccStaffPaperNew;

import java.util.List;

public interface TIccStaffPaperNewMapper {

//    int deleteByPrimaryKey(TIccStaffPaperKey key);
//
//    int insert(TIccStaffPaper record);

    int insertSelective(TbIccStaffPaperNew record);

    Integer selectCount(TbIccStaffPaperNewBean bean);

//    List<TIccStaffPaper> selectByExample(TIccStaffPaperExample example);
//
//    TIccStaffPaper selectByPrimaryKey(TIccStaffPaperKey key);
//
//    int updateByPrimaryKeySelective(TIccStaffPaper record);
//
//    int updateByPrimaryKey(TIccStaffPaper record);
}