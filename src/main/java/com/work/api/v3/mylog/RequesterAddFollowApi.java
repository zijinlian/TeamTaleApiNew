package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MyLogService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/addFollow", describe = "我的日志--添加关注")
public class RequesterAddFollowApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe="发起关注用户ID")
        public String userId;
         @AnParam(describe="被关注的用户ID")
        public String followUesrId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    public class Body {
        
    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);


    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.saveFollow(req,res);
        } catch (Exception e) {
            if(e.getMessage().isEmpty()){
                res.header = getFail(Constants.SERVER_MSG);
            }else{
                res.header = getFail(e.getMessage());
            }
        } finally {
            p.sendResponse(toJson(res));
        }
    }

    /**
     *   测试方法
     **/
    public static void main(String[] args) {
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/addFollow", Http.POST);
         h.addParam("params", "{\"userId\":\"4821045\",\"followUesrId\":\"4769631\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

