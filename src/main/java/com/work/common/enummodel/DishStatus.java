package com.work.common.enummodel;
/**
 * 食谱枚举类
 * @author zhouchang
 *
 */
public enum DishStatus {
	
	ZAOCAN("1","早餐"), ZHONGCAN("2","中餐"), WANCAN("3","晚餐") , WAIMAI("4","外卖");

	private String code;
	private String desc;

	private DishStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static String getDesc(String code) {
		for (DishStatus c : DishStatus.values()) {
			if (c.getCode().equals(code)) {
				return c.desc;
			}
		}
		return null;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
