package com.work.api.v3.mylog.vo;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/3/31.
 * 日志评论对象
 */
public class LogReplyVo {
    @AnParam(describe = "主键")
    public String fdReplyId;
    @AnParam(describe = "回复人ID")
    public String fdEmpId;
    @AnParam(describe = "回复人姓名")
    public String fdEmpnme;
    @AnParam(describe = "日志ID")
    public String fdBlId;
    @AnParam(describe = "回复内容")
    public String fdReContent;
    @AnParam(describe = "回复时间")
    public String fdRepTime;
    @AnParam(describe = "回复部门")
    public String fdOrgnme;
    @AnParam(describe = "日志主题")
    public String fdBlogTitle;
    @AnParam(describe = "支持数量")
    public String fdSupCount;
    @AnParam(describe = "头像")
    public String fdHeadicon;
}
