package com.work.api.v3.suginfo;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.suginfo.vo.SugDeptListVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.TSuggestService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/sugDeptList", describe = "众筹--新增建议选择部门列表")
public class RequesterSugDeptListApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams{
        @AnParam(describe = "员工号")
        public String empId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    public class Body {
        @AnParam
        public List<SugDeptListVo> list = Lists.newArrayList();
    }

    private TSuggestService suggestService = getBean("suggestService", TSuggestService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            suggestService.selectDeptList(req,res);
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
        /*Http h = new Http("http://localhost:8080/TeamTaleApi/app/v2/suggest/sugDetail", Http.POST);
        h.addParam("params", "{" +
                "\"empid\":\"1818306\"," +
                "\"id\":\"2c98442c65889148016588c2d046000f\"," +
                "\"page\":\"1\"," +
                "\"pageSize\":\"10\"" +
                "}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));*/
        Http h = new Http("http://localhost:8080/TeamTaleApi/app/v2/suggest/listMySuggest", Http.POST);
        h.addParam("params", "{" +
                "\"empid\":\"3638468\"," +
                "\"orgId\":\"04708\"," +
                "\"page\":\"1\"," +
                "\"pageSize\":\"10\"" +
                "}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

