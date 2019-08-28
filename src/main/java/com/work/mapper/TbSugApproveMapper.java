package com.work.mapper;

import com.work.entity.TbSugApprove;
import com.work.entity.TbSugApproveExample;
import com.work.entity.TbSugApproveWithBLOBs;
import java.util.List;

public interface TbSugApproveMapper {
    int insert(TbSugApproveWithBLOBs record);

    int insertSelective(TbSugApproveWithBLOBs record);

    List<TbSugApproveWithBLOBs> selectByExampleWithBLOBs(TbSugApproveExample example);

    List<TbSugApprove> selectByExample(TbSugApproveExample example);
}