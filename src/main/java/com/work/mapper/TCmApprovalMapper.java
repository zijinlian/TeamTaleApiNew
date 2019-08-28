package com.work.mapper;

import com.work.entity.TCmApproval;
import com.work.entity.TCmApprovalExample;
import java.util.List;

public interface TCmApprovalMapper {
    int deleteByPrimaryKey(String id);

    int insert(TCmApproval record);

    int insertSelective(TCmApproval record);

    List<TCmApproval> selectByExample(TCmApprovalExample example);

    TCmApproval selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TCmApproval record);

    int updateByPrimaryKey(TCmApproval record);
}