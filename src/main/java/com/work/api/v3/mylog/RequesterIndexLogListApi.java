package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.mylog.vo.IndexLogVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.MyLogService;

import java.util.Date;
import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/indexLogList", describe = "我的日志-->日志列表")
public class RequesterIndexLogListApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams{
        @AnParam(describe="登录用户ID")
        public String fdBlCreateid;
        @AnParam(describe = "类型ID")
        public String fdTypeId;
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
        public List<IndexLogVo> list = Lists.newArrayList();
        
    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.selectMyLogIndexList(req,res);
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
        long time = new Date().getTime();
        System.out.println();
        Http h = new Http("http://219.141.226.184:8060/TeamTaleApi/api/v3/indexLogList", Http.POST);
        h.addParam("params", "{" +
                 "\"fdBlCreateid\":\"6972613\"," +
                 "\"page\":\"1\"," +
                 "\"fdTypeId\":\"\"," +
                 "\"pageSize\":\"10\"" +
                 "}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
        long etime = new Date().getTime();

        System.out.println(etime-time);
    }
}

