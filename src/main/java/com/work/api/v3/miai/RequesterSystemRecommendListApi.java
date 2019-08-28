package com.work.api.v3.miai;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.miai.vo.DatingQueryListVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.MiaiService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/SystemRecommendListApi", describe = "缘聚中行--系统推荐列表")
public class RequesterSystemRecommendListApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams{
        @AnParam(describe = "用户的empId")
        public String empId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {
        @AnParam(describe = "推荐用户列表")
        public List<DatingQueryListVo> list = Lists.newArrayList();
    }

    private MiaiService miaiService = getBean("miaiService", MiaiService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            miaiService.selectSystemRecommendList(req,res);
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
        //Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/SystemRecommendListApi", Http.POST);
        Http h = new Http("http://218.25.172.94:8091/TeamTaleApi/api/v3/SystemRecommendListApi", Http.POST);
        h.addParam("params", "{\"empId\":\"1818306\",\"page\":\"1\",\"pageSize\":\"10\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

