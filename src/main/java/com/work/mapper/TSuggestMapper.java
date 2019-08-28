package com.work.mapper;


import com.work.bean.SuggestBean;
import com.work.entity.THotSuggest;

import java.util.List;
import java.util.Map;

public interface TSuggestMapper {

    /**
     * 获取我的建议
     * @param bean
     * @return
     */
    List<Map<String,Object>> selectSuggestById(SuggestBean bean);

    /**
     * 获取他人的建议
     * @param bean
     * @return
     */
    List<Map<String,Object>> selectOtherSuggestById(SuggestBean bean);


    List<Map<String,Object>> selectSuggestStart(SuggestBean bean);

    List<THotSuggest> selectHotSuggest(SuggestBean bean);
    
}