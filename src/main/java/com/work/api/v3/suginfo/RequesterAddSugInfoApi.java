package com.work.api.v3.suginfo;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.TSuggestService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/addSugInfo", describe = "众筹--发布建议")
public class RequesterAddSugInfoApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe="发起人ID")
        public String fdEmpid;

        @AnParam(describe="发起人姓名")
        public String fdEmpNme;

        @AnParam(describe="建议内容")
        public String fdContent;

        @AnParam(describe="建议标题")
        public String fdTitle;

        @AnParam(describe="该条建议反馈部门ID")
        public String fdApproOrg;

        @AnParam(describe="反馈部门名称")
        public String fdApproOrgnme;

        @AnParam(describe="类型名称")
        public String fdTypenme;

        @AnParam(describe="发起建议类型")
        public String fdSugTypid;

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

    private TSuggestService suggestService = getBean("suggestService", TSuggestService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            suggestService.saveSugInfo(req,res);
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
     *   测试方法
     **/

    public static void main(String[] args) {
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/addSugInfo", Http.POST);
         h.addParam("params",
                 "{\"fdApproOrg\":\"04807\"," +
                         "\"fdApproOrgnme\":\"金融机构部\"," +
                         "\"fdContent\":\"aksdhajgjshdfgajdsf\"," +
                         "\"fdEmpNme\":\"温冰洋\",\"fdEmpid\":\"1818306\"," +
                         "\"fdSugTypid\":\"ff80808159162c460159164106350003\"," +
                         "\"fdTitle\":\"20180904测试一次\"," +
                         "\"fdTypenme\":\"品牌服务\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

