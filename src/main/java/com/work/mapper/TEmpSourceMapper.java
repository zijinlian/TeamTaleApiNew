package com.work.mapper;

import com.work.entity.TEmpSource;
import com.work.entity.TEmpSourceExample;
import java.util.List;

public interface TEmpSourceMapper {
    int deleteByPrimaryKey(String empid);

    int insert(TEmpSource record);

    int insertSelective(TEmpSource record);

    List<TEmpSource> selectByExample(TEmpSourceExample example);

    TEmpSource selectByPrimaryKey(String empid);

    int updateByPrimaryKeySelective(TEmpSource record);

    int updateByPrimaryKey(TEmpSource record);
}