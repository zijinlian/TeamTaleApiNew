package com.work.mapper;

import com.work.entity.TSysUserinfo;

public interface TSysUserinfoMapper {
    int deleteByPrimaryKey(String fdUsername);

	int insert(TSysUserinfo record);

	int insertSelective(TSysUserinfo record);

	TSysUserinfo selectByPrimaryKey(String fdUsername);

	int updateByPrimaryKeySelective(TSysUserinfo record);

	int updateByPrimaryKey(TSysUserinfo record);
}