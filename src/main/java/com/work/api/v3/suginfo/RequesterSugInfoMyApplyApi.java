package com.work.api.v3.suginfo;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.suginfo.vo.SugInfoMyApplyVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.TSuggestService;

import java.util.List;


/**
 * Created by changzhou on 2017/3/28.
 */
@AnController(path = "/v3/sugInfoMyApply", describe = "众筹--建议我的审批")
public class RequesterSugInfoMyApplyApi extends BaseRequester {

    @AnParam(describe = "入参")
    public Params params;

    public class Params extends PageParams {
        @AnParam(describe = "审批人角色(01:一级审批,02:二级审批)")
        public String empType;
        @AnParam(describe = "员工ID")
        public String fdLeaderEmp;
    }

    /**
     * 出参
     */
    @AnResponse
    public class Response {
        @AnParam(describe = "header")
        public Header header = new Header();
        @AnParam(describe = "body")
        public Body body = new Body();
    }

    public class Body {
        @AnParam(describe = "我的审批列表")
        public List<SugInfoMyApplyVo> list = Lists.newArrayList();
    }

    private TSuggestService suggestService = getBean("suggestService", TSuggestService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            String param = p.params.get("params");
            Params req = (Params) fromJson(param, Params.class);
            suggestService.selectMyApplyList(req, res);
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


    public static void main(String[] args) {
        //Http h = new Http("http://39.104.168.56:8080/TeamTaleApi/api/v3/sugInfoMyApply", Http.POST);
//        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/sugInfoMyApply", Http.POST);
//        h.addParam("params", "{" +
//                "\"fdLeaderEmp\":\"1186231\"," +
//                "\"empType\":\"0201\"," +
//                "\"page\":\"1\"," +
//                "\"pageSize\":\"10\"" +
//                "}");
//        System.out.println(StringTookit.JSONStringFormat(h.execute()));
        //System.out.println(new Date().getTime());
        Http h = new Http("http://localhost:8080/TeamTaleApi/app/v2/suggest/listOtherSuggest", Http.POST);
        h.addParam("params", "{\"empid\":\"1818306\",\"fdApproOrg\":\"1\",\"fdTitle\":\"\",\"orgId\":\"00007\",\"page\":\"1\",\"pageSize\":\"10\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }

}
