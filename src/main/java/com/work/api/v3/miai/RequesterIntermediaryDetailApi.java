package com.work.api.v3.miai;

import cn.autually.base.*;
import com.work.api.v3.miai.vo.TbUserIntermediaryInfoVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.IntermediaryService;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/IntermediaryDetailApi", describe = "缘聚中行--红娘推荐记录")
public class RequesterIntermediaryDetailApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "红娘用户的empId")
        public String intermediaryEmpId;
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
        @AnParam(describe = "详情信息")
        public TbUserIntermediaryInfoVo vo = new TbUserIntermediaryInfoVo();
    }

    private IntermediaryService intermediaryService = getBean("intermediaryService", IntermediaryService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            intermediaryService.getIntermediaryDetail(req,res);
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
         Http h = new Http("http://localhost:8080/TeamTaleApi/api/v3/IntermediaryDetailApi", Http.POST);
         h.addParam("params", "{\"intermediaryEmpId\":\"1703607\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

