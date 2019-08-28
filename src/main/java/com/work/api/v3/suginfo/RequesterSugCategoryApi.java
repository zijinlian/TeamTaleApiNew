package com.work.api.v3.suginfo;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.suginfo.vo.SugTypeListVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.TSuggestService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/sugCategory", describe = "众筹--新增建议选择分类列表")
public class RequesterSugCategoryApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams {

    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {
        @AnParam
        public List<SugTypeListVo> list = Lists.newArrayList();
    }

    private TSuggestService suggestService = getBean("suggestService", TSuggestService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            suggestService.selectListCategory(req,res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/sugCategory", Http.POST);
        h.addParam("params", "{\"\":\"\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

