package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.mylog.vo.LogReplyVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.MyLogService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/logDetailReplyList", describe = "我的日志--详情评论列表")
public class RequesterLogDetailReplyListApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams{
        @AnParam(describe = "日志ID")
        public String fdBlId;
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
        public List<LogReplyVo> list = Lists.newArrayList();
    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.selectLogReplyList(req,res);
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
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/logDetailReplyList", Http.POST);
         h.addParam("params", "{\"fdBlId\":\"ff8080815982db44015986a1cc4a00e2\",\"page\":1,\"pageSize\":10}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

