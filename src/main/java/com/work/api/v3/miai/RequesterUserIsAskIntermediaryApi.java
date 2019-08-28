package com.work.api.v3.miai;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.IntermediaryService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/UserIsAskIntermediaryApi", describe = "缘聚中行--用户是否求助红娘")
public class RequesterUserIsAskIntermediaryApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "红娘empId")
        public String intermediaryEmpId;
        @AnParam(describe = "求助empId")
        public String userEmpId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    public class Body {
        @AnParam(describe = "是否求助红娘")
        public boolean isAsked = false;
    }

    private IntermediaryService intermediaryService = getBean("intermediaryService", IntermediaryService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            intermediaryService.updateUserIsAskIntermediary(req,res);
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
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/UserIsAskIntermediaryApi", Http.POST);
        h.addParam("params", "{\"intermediaryEmpId\":\"1703607\",\"userEmpId\":\"1818306\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

