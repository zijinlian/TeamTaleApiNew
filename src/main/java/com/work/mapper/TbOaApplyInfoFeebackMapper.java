package com.work.mapper;

import com.work.entity.TbOaApplyInfoFeeback;
import com.work.entity.TbOaApplyInfoFeebackExample;
import java.util.List;

public interface TbOaApplyInfoFeebackMapper {
    int insert(TbOaApplyInfoFeeback record);

	int insertSelective(TbOaApplyInfoFeeback record);

	List<TbOaApplyInfoFeeback> selectByExample(
			TbOaApplyInfoFeebackExample example);

}