package com.work.mapper;

import com.work.entity.TbPepmgmEmpinfo;
import com.work.entity.TbPepmgmEmpinfoExample;
import java.util.List;

public interface TbPepmgmEmpinfoMapper {
    int insert(TbPepmgmEmpinfo record);

    int insertSelective(TbPepmgmEmpinfo record);

    List<TbPepmgmEmpinfo> selectByExample(TbPepmgmEmpinfoExample example);
}