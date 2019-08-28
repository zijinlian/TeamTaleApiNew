package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MyLogService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/addLogSupport", describe = "我的日志--点赞（支持）")
public class RequesterAddLogSupportApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "日志ID")
        public String fdReplyId;
        @AnParam(describe = "支持人ID")
        public String fdEmpid;
        @AnParam(describe = "0:支持，1：取消支持")
        public String type;
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
            myLogService.saveLogSupport(req,res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/addLogSupport", Http.POST);
        h.addParam("params", "{\"fdReplyId\":\"1\",\"fdEmpid\":\"1\",\"type\":\"1\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

