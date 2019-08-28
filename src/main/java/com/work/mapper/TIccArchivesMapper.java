package com.work.mapper;

import com.work.entity.TIccArchives;
import com.work.entity.TIccArchivesExample;
import java.util.List;

public interface TIccArchivesMapper {
    int deleteByPrimaryKey(String fdArchivesId);

    int insert(TIccArchives record);

    int insertSelective(TIccArchives record);

    List<TIccArchives> selectByExample(TIccArchivesExample example);

    TIccArchives selectByPrimaryKey(String fdArchivesId);

    int updateByPrimaryKeySelective(TIccArchives record);

    int updateByPrimaryKey(TIccArchives record);
}