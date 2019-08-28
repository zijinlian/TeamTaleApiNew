package com.work.api.v3.miai;

import cn.autually.base.*;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.Header;
import com.work.service.v3.TalentPoolService;

/**
 * Created by fangzhen on 2016/11/28.
 */
@AnController(path = "/v3/UserAddSkill", describe = "人才库--新增技能")
public class RequesterUserAddSkillApi extends BaseRequester {

    @AnParam(describe = " ")
    public Params params;

    public class Params {
        @AnParam(describe = "申报人才库ID")
        public String libId;
        @AnParam(describe = "员工编号")
        public String ehr;
        @AnParam(describe = "入选此人才库优势")
        public String talentDesc;
        @AnParam(describe = "人才库类型基础库或者尖子库(1:尖子，0：非尖子)")
        public String talentType;
        @AnParam(describe = "父分类id")
        public String topCategoryId;
    }

    @AnResponse
    public class Response {
        @AnParam(describe = " ")
        public Header header=new Header();
        @AnParam(describe = " ")
        public Body body=new Body();
    }

    public class Body {
        
    }

    private TalentPoolService talentPoolService = getBean("talentPoolService", TalentPoolService.class);

    @AnRequestMapping
    public void execute(JXRequest p) {
        Response res = new Response();
        try {
            Params req = (Params) fromJson(p.params.get("params"), Params.class);
            talentPoolService.saveUserSkill(req,res);
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
         Http h = new Http("http://localhost:8080/UserAddSkillApi", Http.POST);
         h.addParam("params", "{\"type\":\"1\"}");
         System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}

