package com.work.api.v3.activity;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.activity.vo.TbUserActivityCommentVo;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.common.PageParams;
import com.work.service.v3.ActivityService;

import java.util.List;

import static com.work.common.BaseRequester.getBean;
import static com.work.common.BaseRequester.getFail;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/ActivityUserCommentListApi", describe = "缘聚中行--用户评论列表")
public class RequesterActivityUserCommentListApi extends DefaultRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params extends PageParams {
        @AnParam(describe = "活动id")
        public String activityId;

        @AnParam(describe = "empId")
        public String empId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    /*public class Header {
        @AnParam(describe = "接口是否调用成功")
        public boolean success;
        @AnParam(describe = "返回消息")
        public String msg;
        @AnParam(describe = "状态描述")
        public String status;
    } */

    public class Body {
        @AnParam(describe = "人员评论列表")
        public List<TbUserActivityCommentVo> list = Lists.newArrayList();
    }

    private ActivityService activityService = getBean("activityService", ActivityService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            activityService.getActivityUserCommentsList(req,res);
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
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/ActivityUserCommentListApi", Http.POST);
        h.addParam("params", "{\"page\":\"1\",\"pageSize\":\"10\"," +
                "\"activityId\":\"8a81a0e65c48d67d015c48d7d9570001\",\"empId\":\"4170122\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

