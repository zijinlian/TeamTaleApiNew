package com.work.common;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/3/28.
 */
public class PageParams {

    @AnParam(
            describe = "页数"
    )
    public Integer page = 0;
    @AnParam(
            describe = "每页大小"
    )
    public Integer pageSize = 10;

    public PageParams() {
    }
}
