package com.work.api.v3.miai.bean;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/5/2.
 */
@AnParam(describe = "婚恋基本信息")
public class DatingInfoBean {
    @AnParam(describe = "对应婚恋信息关键字")
    public String key;
    @AnParam(describe = "对应婚恋信息值")
    public String value;
    @AnParam(describe = "是否公开")
    public boolean isPublic;
    @AnParam(describe = "类型（1：基本信息，2：择偶标准）")
    public String type;
}
