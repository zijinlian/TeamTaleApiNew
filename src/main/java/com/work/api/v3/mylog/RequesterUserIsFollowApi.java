package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MyLogService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/userIsFloow", describe = "我的日志--判断自己是否关注了别人")
public class RequesterUserIsFollowApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "登录用户ID")
        public String userId;

        @AnParam(describe = "需要判断用户ID")
        public String followUserId;

    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {
        @AnParam(describe = "是否关注")
        public boolean isFollow;

    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.selectUserIsFollowUser(req, res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/userIsFloow", Http.POST);
        h.addParam("params", "{\"userId\":\"1\",\"followUserId\":\"21\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

