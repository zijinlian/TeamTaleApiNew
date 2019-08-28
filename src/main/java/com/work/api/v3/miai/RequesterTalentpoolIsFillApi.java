package com.work.api.v3.miai;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.TalentPoolService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/userIsFill", describe = "人才库--判断是否填写过人才库")
public class RequesterTalentpoolIsFillApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "用户ID")
        public String userId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    public class Body {
        @AnParam(describe = "是否填写过人才信息")
        public boolean isFill = false;
    }

    private TalentPoolService talentPoolService = getBean("talentPoolService", TalentPoolService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            talentPoolService.selectUserIsFill(req,res);
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
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/userIsFill", Http.POST);
         h.addParam("params", "{\"userId\":\"1\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

