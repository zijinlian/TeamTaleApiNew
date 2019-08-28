package com.work.api.v3.common.vo;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/5/4.
 */
public class CodeTableVo {
    @AnParam(describe = "ID主键")
    public String id;
    @AnParam(describe = "码表Key")
    public String codeKey;
    @AnParam(describe = "Key对应值")
    public String codeValue;
    @AnParam(describe = "说明")
    public String codeDesc;
}
