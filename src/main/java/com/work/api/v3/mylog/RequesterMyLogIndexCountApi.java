package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/MyLogIndexCountApi", describe = "我的日志--未读数")
public class RequesterMyLogIndexCountApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {

    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {
        @AnParam(describe = "未读数")
        public String count = "0";
    }


    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
        } catch (Exception e) {
            if (e.getMessage().isEmpty()) {
                res.header = getFail(Constants.SERVER_MSG);
            } else {
                res.header = getFail(e.getMessage());
            }
        } finally {
            p.sendResponse(toJson(res));
        }
    }

    /**
     * 测试方法
     **/
    public static void main(String[] args) {
        Http h = new Http("http://localhost:8080/MyLogIndexCountApi", Http.POST);
        h.addParam("params", "{\"type\":\"1\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

