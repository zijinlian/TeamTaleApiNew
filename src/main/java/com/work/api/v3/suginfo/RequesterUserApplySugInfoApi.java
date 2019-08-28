package com.work.api.v3.suginfo;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.TSuggestService;

import java.math.BigDecimal;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/userApplySugInfo", describe = "众筹--审批我的建议")
public class RequesterUserApplySugInfoApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "建议ID")
        public String fdUuid;
        @AnParam(describe = "审批人ID")
        public String fdLeaderEmp;
        @AnParam(describe = "1 ：通过； 2 拒绝")
        public BigDecimal fdLeaderStatus;
        @AnParam(describe = "审批意见")
        public String fdLeaderMark;
        @AnParam(describe="审批该条建议的领导人姓名")
        public String fdLeaderEmpnme;
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
    private TSuggestService suggestService = getBean("suggestService", TSuggestService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            suggestService.updateApplySugInfo(req,res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/userApplySugInfo", Http.POST);
        h.addParam("params", "{\n" +
                "  \"fdLeaderEmp\" : \"1818306\",\n" +
                "  \"fdUuid\" : \"75835EC9C5BA4AE89C9E3969F15373DD\",\n" +
                "  \"fdLeaderEmpnme\" : \"测试\",\n" +
                "  \"fdLeaderMark\" : \"反反复复\",\n" +
                "  \"fdLeaderStatus\" : 1\n" +
                "}"
        );
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

