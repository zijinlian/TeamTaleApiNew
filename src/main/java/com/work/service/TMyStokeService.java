package com.work.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONException;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.work.bean.MyStokeBean;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.entity.TMyStoke;
import com.work.entity.TMyStokeExample;
import com.work.entity.TSysUserinfo;
import com.work.mapper.TMyStokeMapper;
import com.work.mapper.TSysUserinfoMapper;


/**
 * 日程
 * @author zhoucha
 *
 */
@Service
public class TMyStokeService {

	@Resource
	private TMyStokeMapper stokeMapper;
	
	@Resource
	private TSysUserinfoMapper sysUserinfoMapper;
	
	/**
	 * 根据用户ID查询日程
	 * @param bean
	 * @return
	 */
	public JSONResult selectStokeByEmpId(MyStokeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getFdEmpid());
			result.getBody().put("userinfo", userinfo);
			Map<String, Object> map = Maps.newHashMap();
			map.put("empid", bean.getFdEmpid());
			map.put("roles", "'省行行长','省行副行长','分管行长','部门经理'");
			int isManager = stokeMapper.selectUserRoleList(map);
			List<TMyStoke> list=new ArrayList<TMyStoke>();
			if(BooleanUtils.toBoolean(isManager)){
				Map<String, Object> leaderMap=Maps.newHashMap();
				leaderMap.put("empId", bean.getFdEmpid());
				leaderMap.put("fdDate", bean.getFdDate());
				list=stokeMapper.selectLeaderExample(leaderMap);
			}else{
				TMyStokeExample example = new TMyStokeExample();
				example.createCriteria().andFdEmpidEqualTo(bean.getFdEmpid()).andFdTimeLike("%"+bean.getFdDate()+"%");//.andFdDateEqualTo(bean.getFdDate());
				list= stokeMapper.selectByExample(example);
			}
			result.getBody().put("list", list);


			result.getBody().put("isManager", BooleanUtils.toBoolean(isManager));
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param bean
	 * @return
	 */
	public JSONResult selectListUser(MyStokeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			Map<String, Object> map = Maps.newHashMap();
//			map.put("empid", bean.getFdEmpid());
			List<Map<String, Object>> list = stokeMapper.selectUserList(bean);
			result.getBody().put("list", list);
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
}
