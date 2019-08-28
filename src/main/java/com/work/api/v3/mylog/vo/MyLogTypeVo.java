package com.work.api.v3.mylog.vo;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/3/31.
 */
public class MyLogTypeVo {
    @AnParam(describe = "主键")
    public String fdTypeId;
    @AnParam(describe = "类型名称")
    public String fdTypeNme;
}
