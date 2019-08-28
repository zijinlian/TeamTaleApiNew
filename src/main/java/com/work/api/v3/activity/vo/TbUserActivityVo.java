package com.work.api.v3.activity.vo;

import cn.autually.base.AnParam;

/**
 * Created by lx on 2017/5/4.
 */
/*TB_USER_ACTIVITY null*/
 public class TbUserActivityVo{
     @AnParam(describe="活动主题主键")
     public String id;
     @AnParam(describe="活动主题标题")
     public String activityTitle;
     @AnParam(describe="活动地点")
     public String activityPlace;
     @AnParam(describe="活动开始时间")
     public String activityStartdate;
     @AnParam(describe="活动结束时间")
     public String activityEnddate;
     @AnParam(describe="活动内容")
     public String activityContent;
     @AnParam(describe="活动logo地址")
     public String logoUrl;
     @AnParam(describe="发布时间")
     public String createTime;

    @AnParam(describe="发布人")
    public String createUser;

    @AnParam(describe="发布人部门")
    public String createUserDept;

     @AnParam(describe="活动状态 0:未报名 1:报名中 2:进行中 3:过期")
     public String status;

    @AnParam(describe="男人数量")
    public String manCount;

    @AnParam(describe="女人数量")
    public String womanCount;

    @AnParam(describe="总数量")
    public String allCount;

    @AnParam(describe="发布人头像")
    public String createUserIcon;
}


