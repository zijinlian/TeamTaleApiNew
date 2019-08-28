package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.mylog.vo.IndexLogVo;
import com.work.api.v3.mylog.vo.SearchLogUserVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.MyLogService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/searchLogOrUser", describe = "我的日志--搜索日志或者人")
public class RequesterSearchLogOrUserApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams {
        @AnParam(describe = "搜索关键字")
        public String key;
        @AnParam(describe = "登录用户ID")
        public String userId;
        @AnParam(describe = "根据时间查询,1:月,2:季度,3:年")
        public String type;

    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {
        @AnParam(describe = "关注列表")
        public List<SearchLogUserVo> listuser = Lists.newArrayList();

        @AnParam(describe = "日志列表")
        public List<IndexLogVo> listlog = Lists.newArrayList();
    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.selectUserOrLogByKey(req,res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/searchLogOrUser", Http.POST);
        h.addParam("params", "{\"key\":\"\",\"type\":\"\",\"userId\":\"0281548\",\"page\":\"1\",\"pageSize\":\"10\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

