package com.work.api.v3.miai.vo;

import cn.autually.base.AnParam;

/**
 * Created by lx on 2017/5/4.
 */
@AnParam(describe = "列表查询中使用的婚恋基本信息")
public class DatingQueryListVo {

    @AnParam(describe = "empId")
    public String empId;

    @AnParam(describe = "名称")
    public String empName;

    @AnParam(describe = "头像")
    public String headicon;

    @AnParam(describe = "部门")
    public String deptName;

    @AnParam(describe = "自我描述")
    public String description;

    @AnParam(describe = "年龄")
    public String age;

    @AnParam(describe = "身高")
    public String height;

    @AnParam(describe = "体重")
    public String weight;

    @AnParam(describe = "星座")
    public String constellation;

    @AnParam(describe = "首页推荐logo")
    public String indexlogo;

    @AnParam(describe = "匹配度")
    public String keyValue;
}
