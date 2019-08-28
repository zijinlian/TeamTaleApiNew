package com.work.entity;

import cn.autually.base.AnParam;

public class AppLoginUser {
	@AnParam(describe = "手机号")
	public String phone;
	@AnParam(describe = "token")
	public String token;
	@AnParam(describe = "姓名")
	public String name;
	@AnParam(describe = "性别（0：女，1：男）")
	public Integer sex;
	@AnParam(describe = "头像")
	public String headimg;
	@AnParam(describe = "生日")
	public String birthday;
	@AnParam(describe = "座右铭")
	public String atigraph;
	@AnParam(describe = "积分")
	public Integer integral;
	@AnParam(describe = "级别")
	public String rank;
	@AnParam(describe = "环信账号")
	public String hxusername;
	@AnParam(describe = "环信密码")
	public String hxpassword;
	@AnParam(describe = "")
	public String type;
	@AnParam(describe = "密码")
	public String password;
	@AnParam(describe = "用户ID")
	public String userid;
	@AnParam(describe = "网点id")
	public String orgid;//网点id
	@AnParam(describe = "网点名称")
	public String orgname;//网点名称
	@AnParam(describe = "二级行id")
	public String parentid;//二级行id
	@AnParam(describe = "二级行名称")
	public String parentname;//二级行名称
	@AnParam(describe = "经度")
	public String longitude;// 经度
	@AnParam(describe = "纬度")
	public String latitude;// 纬度
	@AnParam(describe = "座机")
	public String  telephone ;// 座机
}
