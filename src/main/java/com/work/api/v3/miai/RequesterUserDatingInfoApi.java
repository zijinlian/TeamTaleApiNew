package com.work.api.v3.miai;

import cn.autually.base.*;
import com.google.common.collect.Lists;
import com.work.api.v3.miai.vo.DatingInfoVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.MiaiService;

import java.util.List;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/UserDatingInfo", describe = "缘聚中行--用户详情")
public class RequesterUserDatingInfoApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "用户ID")
        public String userId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header = new Header();
        @AnParam(describe = " ")
        public Body body = new Body();
    }

    public class Body {
        @AnParam(describe = "用户ID")
        public String userid;
        @AnParam(describe = "手机号")
        public String phone;
        @AnParam(describe = "姓名")
        public String name;
        @AnParam(describe = "性别")
        public Integer sex;
        @AnParam(describe = "头像")
        public String headimg;
        @AnParam(describe = "生日")
        public String birthday;
        @AnParam(describe = "座机")
        public String  telephone;
        @AnParam(describe = "部门")
        public String  dept;

        @AnParam(describe = "婚恋信息数据列表")
        public List<DatingInfoVo> datingInfolist = Lists.newArrayList();

        @AnParam(describe = "择偶信息数据列表")
        public List<DatingInfoVo> marryStandardlist = Lists.newArrayList();

        @AnParam(describe = "个人照片")
        public List<String> imgs = Lists.newArrayList();


    }


    private MiaiService miaiService = getBean("miaiService", MiaiService.class);


    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            miaiService.getDatingUserInfo(req, res);
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
//        Http h = new Http("http://www.fangyygw.com:9094/TeamTaleApi/api/v3/UserDatingInfo", Http.POST);
        Http h = new Http("http://www.fangyygw.com:9094/TeamTaleApi/api/v3/UserDatingInfo", Http.POST);
        h.addParam("params", "{\"userId\":\"4170122\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

