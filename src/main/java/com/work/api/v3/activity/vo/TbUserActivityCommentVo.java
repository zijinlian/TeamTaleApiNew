package com.work.api.v3.activity.vo;

import cn.autually.base.AnParam;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by lx on 2017/5/5.
 */
/*TB_USER_ACTIVITY_COMMENT null*/
 public class TbUserActivityCommentVo{
     @AnParam(describe="null")
     public String id;
     @AnParam(describe="用户id")
     public String userId;
     @AnParam(describe="活动Id")
     public String activityId;
     @AnParam(describe="评论内容")
     public String commentContent;
     @AnParam(describe="评论时间")
     public String createTime;

    @AnParam(describe="图片")
    public List<String> imgs = Lists.newArrayList();

    @AnParam(describe="用户logo")
    public String userIcon;

    @AnParam(describe="用户名称")
    public String userName;

    @AnParam(describe="用户部门")
    public String userDept;

    @AnParam(describe="用户描述")
    public String userDescription;
}


