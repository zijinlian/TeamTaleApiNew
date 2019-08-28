package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.mylog.vo.IndexLogVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.MyLogService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/myLogHome", describe = "我的日志--个人主页")
public class RequesterMyLogHomeApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams {
        @AnParam(describe = "登录用户ID")
        public String fdEmpId;
        @AnParam(describe = "点击头像查询的用户ID")
        public String otherEmpId;

    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {
        @AnParam(describe = "姓名")
        public String username;
        @AnParam(describe = "头像")
        public String headIcon;
        @AnParam(describe = "部门")
        public String dept;
        @AnParam(describe = "日志数")
        public String logCount;
        @AnParam(describe = "关注数")
        public String followCount;
        @AnParam(describe = "粉丝数")
        public String fansCount;
        @AnParam
        public List<IndexLogVo> list = Lists.newArrayList();
    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.selectMyLogHomeList(req, res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/myLogHome", Http.POST);
        h.addParam("params", "{" +
                "\"fdEmpId\":\"1818306\"," +
                "\"otherEmpId\":\"\"," +
                "\"page\":\"1\"," +
                "\"pageSize\":\"10\"" +
                "}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

