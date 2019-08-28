package com.work.api.v3.miai.vo;

import cn.autually.base.AnParam;

/**
 * Created by lx on 2017/4/25.
 */
    /*TB_USER_DATING_INFO 用户婚恋基本信息表*/
public class TbUserDatingInfoVo {
    @AnParam(describe = "null")
    public String id;
    @AnParam(describe = "关联的user_id")
    public String userId;
    @AnParam(describe = "身高")
    public String height;
    @AnParam(describe = "体重")
    public String weight;
    @AnParam(describe = "性格特点")
    public String characteristics;
    @AnParam(describe = "是否已婚0未婚1已婚")
    public String isMarried;
    @AnParam(describe = "创建时间")
    public String createTime;
    @AnParam(describe = "修改时间")
    public String updateTime;
    @AnParam(describe = "星座")
    public String constellation;
    @AnParam(describe = "子女情况0:无,1:有")
    public String children;
    @AnParam(describe = "自我描述")
    public String selfDescription;
    @AnParam(describe = "兴趣爱好")
    public String interesting;
    @AnParam(describe = "性别 0:女 or 1:男")
    public String sex;
    @AnParam(describe = "数据状态 为逻辑删除准备")
    public String status;
    @AnParam(describe = "头像")
    public String headIcon;
    @AnParam(describe = "名称")
    public String userName;
    @AnParam(describe = "员工号")
    public String ehr;
    @AnParam(describe = "年龄")
    public String age;
    @AnParam(describe = "手机")
    public String phoneNum;
    @AnParam(describe = "座机")
    public String telNum;
    @AnParam(describe = "部门")
    public String orgname;
}


