package com.work.mapper;

import com.work.entity.TPubAttachinfo;
import com.work.entity.TPubAttachinfoExample;
import java.util.List;

public interface TPubAttachinfoMapper {
    int deleteByPrimaryKey(String fdAttachid);

	int insert(TPubAttachinfo record);

	int insertSelective(TPubAttachinfo record);

	List<TPubAttachinfo> selectByExample(TPubAttachinfoExample example);

	TPubAttachinfo selectByPrimaryKey(String fdAttachid);

	int updateByPrimaryKeySelective(TPubAttachinfo record);

	int updateByPrimaryKey(TPubAttachinfo record);

}