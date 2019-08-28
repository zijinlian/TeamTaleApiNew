package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MyLogService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/delMyLog", describe = "我的日志--删除日志")
public class RequesterDelMyLogApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "日志ID")
        public String fdBlId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {

    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.deleteMyLog(req,res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/delMyLog", Http.POST);
        h.addParam("params", "{\"fdBlId\":\"FAF5E92A735D40EC837DFA179C348ABC\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

