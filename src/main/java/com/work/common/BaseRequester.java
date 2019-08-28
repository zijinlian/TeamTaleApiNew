package com.work.common;

import cn.autually.base.DefaultRequester;

/**
 * Created by changzhou on 2017/3/28.
 */
public class BaseRequester extends DefaultRequester {

    public static <T> T getBean(String name,Class<T> cls){
        return (T) ApplicationUtil.getBean(name);
    }

    public static Header getSuccess() {
        Header header = new Header();
        header.status = Constants.SUCCESS;
        header.success = true;
        header.msg = "成功";
        return header;
    }

    public static Header getSuccess(String msg) {
        Header header = new Header();
        header.status = Constants.SUCCESS;
        header.success = true;
        header.msg = msg;
        return header;
    }

    public static Header getFail(String msg) {
        Header header = new Header();
        header.status = Constants.ERROE;
        header.success = false;
        header.msg = msg;
        return header;
    }

    public static Header getFail(String code,String msg) {
        Header header = new Header();
        header.status = code;
        header.success = false;
        header.msg = msg;
        return header;
    }
}
