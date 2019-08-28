package com.work.mapper;

import com.work.entity.TPubAttachrel;
import com.work.entity.TPubAttachrelExample;
import com.work.entity.TPubAttachrelKey;
import java.util.List;

public interface TPubAttachrelMapper {
    int deleteByPrimaryKey(TPubAttachrelKey key);

	int insert(TPubAttachrel record);

	int insertSelective(TPubAttachrel record);

	List<TPubAttachrel> selectByExample(TPubAttachrelExample example);

	TPubAttachrel selectByPrimaryKey(TPubAttachrelKey key);

	int updateByPrimaryKeySelective(TPubAttachrel record);

	int updateByPrimaryKey(TPubAttachrel record);

}