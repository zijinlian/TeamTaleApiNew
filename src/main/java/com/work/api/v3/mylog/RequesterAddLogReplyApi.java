package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MyLogService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/addLogReply", describe = "我的日志--添加日志评论")
public class RequesterAddLogReplyApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "回复人ID")
        public String fdEmpId;
        @AnParam(describe = "回复人姓名")
        public String fdEmpnme;
        @AnParam(describe = "日志ID")
        public String fdBlId;
        @AnParam(describe = "回复内容")
        public String fdReContent;
        @AnParam(describe = "日志主题")
        public String fdBlogTitle;
        @AnParam(describe = "回复部门")
        public String fdOrgnme;


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
            myLogService.saveLogReply(req,res);
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
        Http h = new Http("http://localhost:8080/AddLogReplyApi", Http.POST);
        h.addParam("params", "{\"type\":\"1\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

