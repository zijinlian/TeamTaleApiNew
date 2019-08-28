package com.work.api.v3.common;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.common.vo.CodeTableVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.CommonService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/TableCodeApi", describe = "公共接口--码表")
public class RequesterCodeTableApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "码表键（" +
                "miai_weight:体重，" +
                "miai_height:身高，" +
                "miai_age:年龄，" +
                "constellation:星座）")
        public String key;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    public class Body {
        @AnParam(describe = "")
        public List<CodeTableVo> list = Lists.newArrayList();
    }

    private CommonService commonService = getBean("commonService",CommonService.class);


    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            commonService.selectCodeTable(req,res);
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
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/TableCodeApi", Http.POST);
         h.addParam("params", "{\"key\":\"miai_weight\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

