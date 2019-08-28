package com.work.api.v3.miai;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.miai.vo.DatingQueryListVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.IntermediaryService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/IntermediaryRecommendIndexApi", describe = "缘聚中行--所有红娘推荐用户列表(前5条)")
public class RequesterIntermediaryRecommendIndexApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams {
        @AnParam(describe = "求助用户的empId")
        public String userEmpId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    /*public class Header {
        @AnParam(describe = "接口是否调用成功")
        public boolean success;
        @AnParam(describe = "返回消息")
        public String msg;
        @AnParam(describe = "状态描述")
        public String status;
    } */

    public class Body {
        @AnParam(describe = "推荐用户列表")
        public List<DatingQueryListVo> list = Lists.newArrayList();
    }

    private IntermediaryService intermediaryService = getBean("intermediaryService", IntermediaryService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            intermediaryService.getIntermediaryRecommendIndexList(req, res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/IntermediaryRecommendIndexApi", Http.POST);
        h.addParam("params", "{\"userEmpId\":\"4170122\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

