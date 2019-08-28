package com.work.api.v3.miai;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.miai.vo.TbUserIntermediaryInfoVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.IntermediaryService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/GetIntermediaryList", describe = "缘聚中行--红娘列表")
public class RequesterGetIntermediaryListApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams{
        @AnParam(describe = "用户名称")
        public String userName;
        @AnParam(describe = "成功率")
        public String successScale;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    public class Body {
        @AnParam(describe = "红娘列表")
        public List<TbUserIntermediaryInfoVo> list = Lists.newArrayList();
    }

    private IntermediaryService intermediaryService = getBean("intermediaryService", IntermediaryService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            intermediaryService.getIntermediaryList(req,res);
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
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/GetIntermediaryList", Http.POST);
//        Http h = new Http("http://www.fangyygw.com:9094/TeamTaleApi/api/v3/GetIntermediaryList", Http.POST);
//        h.addParam("params", "{\"userName\":\"文\",\"page\":\"1\",\"pageSize\":\"10\"}");
        h.addParam("params", "{\"page\":\"1\",\"pageSize\":\"10\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

