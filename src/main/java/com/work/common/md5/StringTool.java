package com.work.common.md5;

public class StringTool {
	/**
	 * 作者： 谢文峰 <br/>
	 * 编码日期： 2013/4/19<br/>
	 * 功能： 将有xx,xxx号的字符串 变成 'xx','xxx'<br/>
	 * 参数注释：String  <br/>
	 * 异常：Exception <br/>
	 * 返回值： <br/>
	 * 修改人： <br/>
	 * 修改日期：<br/>
	 * 修改详情：<br/>
	 * 版本号：<br/>
	 **/
	public static String getNewString(String parameter) {
		String[] idArray = parameter.split(",");
		String id = "";
		if (idArray.length > 1) {
			// 有多个

			for (int i = 0; i < idArray.length; i++) {
				id = id + "'" + idArray[i] + "',";
			}
			return id.substring(0, id.length() - 1);
		} else {
			return "'" + parameter + "'";
		}

	}
	
	public static boolean isNotEmpty(String str) {
		boolean flag = true;
		if (null == str) {
			flag = false;
		}
		
		if (null != str && "".equals(str)) {
			flag = false;
		}
		
		if (null != str && "null".equals(str)) {
			flag = false;
		}
		
		if (null != str && "NULL".equals(str)) {
			flag = false;
		}

		return flag;

	}
	
}
