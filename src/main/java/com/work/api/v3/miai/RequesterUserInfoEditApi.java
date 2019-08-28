package com.work.api.v3.miai;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.miai.bean.DatingInfoBean;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MiaiService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/UserInfoEditApi", describe = "缘聚中行--编辑个人相亲信息")
public class RequesterUserInfoEditApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "用户ID")
        public String userId;
        @AnParam(describe = "婚恋信息列表")
        public List<DatingInfoBean> listDating = Lists.newArrayList();
        @AnParam(describe = "个人相片（多张）")
        public List<String> imgs = Lists.newArrayList();
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

    private MiaiService miaiService = getBean("miaiService", MiaiService.class);


    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            miaiService.updateUserMiaiInfo(req,res);
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
        Http h = new Http("http://www.fangyygw.com:9094/TeamTaleApi/api/v3/UserInfoEditApi", Http.POST);
//        Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/UserInfoEditApi", Http.POST);
//        h.addParam("params", "{\"userId\":\"5611273\",\"listDating\":[{\"key\":\"height\",\"value\":\"140cm\",\"isPublic\":false,\"type\":\"1\"},{\"key\":\"weight\",\"value\":\"32kg\",\"isPublic\":false,\"type\":\"1\"},{\"key\":\"interesting\",\"value\":\"喝酒,游戏\",\"isPublic\":false,\"type\":\"1\"},{\"key\":\"characteristics\",\"value\":\"开朗\",\"isPublic\":false,\"type\":\"1\"},{\"key\":\"ismarried\",\"value\":\"已婚\",\"isPublic\":false,\"type\":\"1\"},{\"key\":\"children\",\"value\":\"140cm\",\"isPublic\":false,\"type\":\"1\"},{\"key\":\"age\",\"value\":\"21岁\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"height\",\"value\":\"146cm\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"weight\",\"value\":\"146cm\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"interesting\",\"value\":\"146cm\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"characteristics\",\"value\":\"146cm\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"ismarried\",\"value\":\"146cm\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"children\",\"value\":\"146cm\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"constellation\",\"value\":\"天秤\",\"isPublic\":true,\"type\":\"1\"}],\"imgs\":[]}");
        h.addParam("params","{\"userId\":\"4170122\",\"listDating\":[{\"key\":\"height\",\"value\":\"140\",\"isPublic\":true,\"type\":\"1\"},{\"key\":\"weight\",\"value\":\"30\",\"isPublic\":true,\"type\":\"1\"},{\"key\":\"interesting\",\"value\":\"qqq\",\"isPublic\":true,\"type\":\"1\"},{\"key\":\"characteristics\",\"value\":\"qqq\",\"isPublic\":true,\"type\":\"1\"},{\"key\":\"ismarried\",\"value\":\"0\",\"isPublic\":true,\"type\":\"1\"},{\"key\":\"children\",\"value\":\"1\",\"isPublic\":true,\"type\":\"1\"},{\"key\":\"age\",\"value\":\"18-22\",\"isPublic\":true,\"type\":\"2\"},{\"key\":\"height\",\"value\":\"140-150\",\"isPublic\":true,\"type\":\"2\"},{\"key\":\"weight\",\"value\":\"30-40\",\"isPublic\":true,\"type\":\"2\"},{\"key\":\"interesting\",\"value\":\"aaa\",\"isPublic\":false,\"type\":\"2\"},{\"key\":\"characteristics\",\"value\":\"qqq\",\"isPublic\":true,\"type\":\"2\"},{\"key\":\"ismarried\",\"value\":\"0\",\"isPublic\":true,\"type\":\"2\"},{\"key\":\"children\",\"value\":\"1\",\"isPublic\":true,\"type\":\"2\"}],\"imgs\":[]}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

