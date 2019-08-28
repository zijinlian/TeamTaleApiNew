package com.work.api.v3.miai.vo;

import cn.autually.base.AnParam;

/**
 * Created by changzhou on 2017/4/21.
 */
@AnParam(describe = "")
public class TbTalentLibUserVo {
    @AnParam(describe = "申报人才库ID")
    public String libId;
    @AnParam(describe = "员工编号")
    public String ehr;
    @AnParam(describe = "入选此人才库优势")
    public String talentDesc;
    @AnParam(describe = "人才库类型基础库或者尖子库")
    public String talentType;
    @AnParam(describe = "顶级分类id")
    public String topCategoryId;
    @AnParam(describe = "其它类名称")
    public String otherCategoryName;
    @AnParam(describe="人才库名称")
    public String libName;
}
