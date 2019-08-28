package com.work.api.v3.mylog;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MyLogService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/addMyLog", describe = "我的日志--发布日志")
public class RequesterAddMyLogApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "日志标题")
        public String fdBlTitle;
        @AnParam(describe = "创建人ID")
        public String fdBlCreateid;
        @AnParam(describe = "创建时间")
        public String fdCreateTime;
        @AnParam(describe = "类型ID")
        public String fdTypeId;
        @AnParam(describe = "类型名称")
        public String fdTypeNme;
        @AnParam(describe = "创建人部门名称")
        public String fdCreateDepnme;
        @AnParam(describe = "是否公开：0：不公开；1：公开")
        public String fdShow;
        @AnParam(describe = "创建人姓名")
        public String fdEmpNme;
        @AnParam(describe = "员工机构编号")
        public String fdOrgcde;
        @AnParam(describe = "日志内容")
        public String fdBlContent;
        @AnParam(describe = "图片,多张逗号分割")
        public String imgs;

    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }


    public class Body {

    }

    private MyLogService myLogService = getBean("myLogService", MyLogService.class);


    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            myLogService.saveMyLog(req, res);
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
        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/addMyLog", Http.POST);
        h.addParam("params",
                "{\"fdBlTitle\":\"测试下日志新增\"," +
                        "\"fdBlCreateid\":\"1851491\"," +
                        "\"fdCreateTime\":\"\"," +
                        "\"fdTypeId\":\"ff8080815a659ac8015a6a0dba450385\"," +
                        "\"fdTypeNme\":\"工作日志\"," +
                        "\"fdCreateDepnme\":\"科技部\"," +
                        "\"fdShow\":\"1\"," +
                        "\"fdEmpNme\":\"梁冰\"," +
                        "\"imgs\":\"http://42.56.72.205:8090/appimgs/friend/20170102/00000000590c8d2501595de958f000df_.jpg,http://42.56.72.205:8090/appimgs/friend/20170102/00000000590c8d2501595de958f000df_.jpg\"," +
                        "\"fdOrgcde\":\"04681\"," +
                        "\"fdBlContent\":\"测试下日志新增\"" +
                        "}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

