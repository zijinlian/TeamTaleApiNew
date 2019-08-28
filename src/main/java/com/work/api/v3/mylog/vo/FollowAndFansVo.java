package com.work.api.v3.mylog.vo;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/4/7.
 */
public class FollowAndFansVo {
    @AnParam(describe = "员工ID")
    public String fdEmpId;
    @AnParam(describe = "员工姓名")
    public String userName;
    @AnParam(describe = "员工头像")
    public String headIcon;
    @AnParam(describe = "部门")
    public String dept;
    @AnParam(describe = "个人简介")
    public String info;
    @AnParam(describe="是否互相关注（0:否，1:是）")
    public String isMutualFollow;

}
