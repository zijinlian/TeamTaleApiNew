package com.work.api.v3.mylog.vo;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/3/31.
 */
public class IndexLogVo {
    @AnParam(describe = "创建时间")
    public String fdCreateTime;

    @AnParam(describe = "日志内容")
    public String fdBlContent;

    @AnParam(describe = "评论数量")
    public String fdBlDiss;

    @AnParam(describe = "支持数量")
    public String fdBlSup;

    @AnParam(describe = "类型名称")
    public String fdTypeNme;

    @AnParam(describe = "阅读数量")
    public String fdReadCount;

    @AnParam(describe = "日志标题（创建日期）")
    public String fdBlTitle;

    @AnParam(describe = "主键")
    public String fdBlId;

    @AnParam(describe = "创建人姓名")
    public String fdEmpNme;

    @AnParam(describe = "创建人ID")
    public String fdBlCreateid;

    @AnParam(describe = "头像")
    public String fdHeadicon;

    @AnParam(describe = "是否支持")
    public boolean isSupport;

    @AnParam(describe = "是否关注(0:未关注，1:已关注)")
    public String isFollow;

    @AnParam(describe = "部门名称")
    public String dept;

}
