package com.work.api.v3.miai;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MiaiService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/UserIsEditApi", describe = "缘聚中行--判断用户是否填写了个人信息")
public class RequesterUserIsEditApi extends BaseRequester {

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
        @AnParam(describe = "是否填写过信息，或者是否审核通过（0：已填写审批通过 1：未填写 2：审批未通过 3:审核未通过）")
        public String isFill;
    }

    private MiaiService miaiService = getBean("miaiService", MiaiService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            miaiService.selectUserIsEdit(req,res);
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
         Http h = new Http("http://218.25.172.94:8091/TeamTaleApi/api/v3/UserIsEditApi", Http.POST);
         h.addParam("params", "{\"userId\":\"1818306\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

