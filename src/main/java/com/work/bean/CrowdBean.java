package com.work.bean;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

public class CrowdBean extends BaseRequestBean {
	
	private String empId;
	
	private String fdCfId; //众筹ID
	
	private String fdState;//众筹状态 0:众筹中,1众筹结束
	
	private String topAndHotId;//第二页开始过滤掉 top和hot的Id数据
	
	private String ids;//过滤查询的数据
	
	private List<String> listIds = Lists.newArrayList();//过滤查询的数据
	
	private String fdReleasedep;//参与众筹部门
	
	private String sql;

	private String userid;

	@Override
	public String getUserid() {
		return userid;
	}

	@Override
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFdReleasedep() {
		return fdReleasedep;
	}

	public void setFdReleasedep(String fdReleasedep) {
		this.fdReleasedep = fdReleasedep;
	}

	public String getFdCfId() {
		return fdCfId;
	}

	public void setFdCfId(String fdCfId) {
		this.fdCfId = fdCfId;
	}

	public String getFdState() {
		return fdState;
	}

	public void setFdState(String fdState) {
		this.fdState = fdState;
	}

	public String getTopAndHotId() {
		return topAndHotId;
	}

	public void setTopAndHotId(String topAndHotId) {
		this.topAndHotId = topAndHotId;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public List<String> getListIds() {
		if(StringUtils.isNotEmpty(ids)){
			listIds = Arrays.asList(ids.split(","));
		}
		return listIds;
	}

	public void setListIds(List<String> listIds) {
		this.listIds = listIds;
	}

}
