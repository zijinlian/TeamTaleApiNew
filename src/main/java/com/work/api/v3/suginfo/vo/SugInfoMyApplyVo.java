package com.work.api.v3.suginfo.vo;

import cn.autually.base.AnParam;

import java.math.BigDecimal;

/**
 * Created by changzhou on 2017/3/28.
 */
public class SugInfoMyApplyVo {

    @AnParam(describe = "ID")
    public String fdUuid;

    @AnParam(describe = "发起人Id")
    public String fdEmpid;

    @AnParam(describe = "发起人姓名")
    public String fdEmpNme;

    @AnParam(describe = "发起人头像")
    public String fdEmpImg;

    @AnParam(describe = "建议标题")
    public String fdTitle;

    @AnParam(describe = "建议内容")
    public String fdContent;

    @AnParam(describe = "建议类型")
    public String fdTypenme;

    @AnParam(describe = "评论数")
    public String fdDiss;

    @AnParam(describe = "点赞数")
    public String fdLike;

    @AnParam(describe = "发布时间")
    public String fdPubTime;

    @AnParam(describe = "二级建议状态 ：0 ：未审核 ；1 ：通过； 2 拒绝")
    public BigDecimal fdLeaderStatus;

    @AnParam(describe="该条建议由哪个部门反馈ID")
    public String fdApproOrg;

    @AnParam(describe="反馈部门名称")
    public String fdApproOrgnme;

    @AnParam(describe="建议流程状态1二级行审批;2省行部门审批;3省行审批;\n" +
            "4二级行部门回复;5省行部门回复;6退回个人；7点评；8全流程结束")
    public String fdSugStatus;

    @AnParam(describe="一级建议状态 ：0 ：未审核 ；1 ：通过； 2 拒绝")
    public BigDecimal fdLeaderStatusFirst;

    public String fdOrgcde;

    public String fdEmpUninme;

}
