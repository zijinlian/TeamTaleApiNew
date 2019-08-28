package com.work.api.v3.miai.vo;

import cn.autually.base.AnParam;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by changzhou on 2017/4/21.
 */
@AnParam(describe = "")
public class TbTalentLibstructVo {
    @AnParam(describe = "人才库ID")
    public String libId;
    @AnParam(describe = "人才库名称")
    public String libName;
    @AnParam(describe = "人才库父ID")
    public String libParentId;
    @AnParam(describe = "人才库具体描述")
    public String libDesc;
    @AnParam(describe = "人才库等级")
    public String libLevel;
    @AnParam(describe = "人才库排序")
    public BigDecimal libOrder;

    @AnParam(describe = "叶子对象集合")
    public List<TbTalentLibUserVo> list = Lists.newArrayList();
}
