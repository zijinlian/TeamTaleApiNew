package com.work.api.v3.suginfo.vo;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/3/30.
 */
public class SugDeptListVo {
    @AnParam(describe = "部门ID")
    public String deptId;

    @AnParam(describe = "部门名称")
    public String deptNme;

}
