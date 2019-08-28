package com.work.api.v3.user;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.entity.AppLoginUser;
import com.work.service.v3.UserService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/userLogin", describe = "用户--用户登录")
public class RequesterUserLoginApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "用户ID")
        public String userid;
        @AnParam(describe = "用户密码")
        public String password;
        @AnParam(describe = "手机类型（ios or android）")
        public String phoneType;
        @AnParam(describe = "版本号")
        public String version;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body data=new Body();
    }

    public class Body {
        public AppLoginUser user = new AppLoginUser();
    }

    private UserService userService = getBean("userService",UserService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            userService.userLogin(req,res);
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
         Http h = new Http("http://39.104.168.56:8080/TeamTaleApi/api/v3/userLogin", Http.POST);
         h.addParam("params", "{\"userid\":\"8620382\",\"password\":\"000000\",\"phoneType\":\"\",\"version\":\"000000\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

