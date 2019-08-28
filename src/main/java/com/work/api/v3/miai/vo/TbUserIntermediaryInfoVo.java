package com.work.api.v3.miai.vo;

import cn.autually.base.AnParam;

/**
 * Created by lx on 2017/4/26.
 */

/*TB_USER_INTERMEDIARY_INFO 红娘基本信息表*/
public class TbUserIntermediaryInfoVo {
    @AnParam(describe = "数据id")
    public String id;
    @AnParam(describe = "关联的empNo")
    public String userId;
    @AnParam(describe = "红娘自我描述")
    public String selfDescription;
    @AnParam(describe = "头像")
    public String headIcon;
    @AnParam(describe = "名称")
    public String userName;
    @AnParam(describe = "年龄")
    public String age;

    @AnParam(describe = "成功率")
    public String successScale;

    @AnParam(describe = "等级")
    public String grade;

    @AnParam(describe = "牵手数")
    public String num;

    @AnParam(describe = "推荐约会次数")
    public String recommendCount;

    @AnParam(describe = "求助用户次数")
    public String userCount;
}



