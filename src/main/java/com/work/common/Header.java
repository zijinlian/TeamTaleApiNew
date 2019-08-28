package com.work.common;

import cn.autually.base.AnParam;

/**
 * Created by zhoucha on 2017/1/18.
 */
public class Header {
    @AnParam(describe = "接口是否调用成功")
    public boolean success = true;
    @AnParam(describe = "返回消息")
    public String msg = "成功";
    @AnParam(describe = "状态描述")
    public String status = Constants.SUCCESS;


}