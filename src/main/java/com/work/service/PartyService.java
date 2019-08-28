package com.work.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.work.entity.TGroupInfo;
import com.work.entity.TPartInfo;
import com.work.entity.TPartyIncorrupt;
import com.work.entity.TPartyInfoMember;
import net.sf.json.JSONException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.work.bean.PartyBean;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.mapper.TPartyMapper;

@Service
public class PartyService {
	
	@Resource
	private TPartyMapper partyMapper;
	
	
	/**
	 * 党务信息列表
	 * @param bean
	 * @return
	 */
	public JSONResult selectPartyList(PartyBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
//			if(StringUtils.isEmpty(bean.getPartyId())){
//				Map<String, Object> map = partyMapper.selectUserPartyId(bean);
//				if(map.get("PARTY_ID")!=null){
//					bean.setPartyId(map.get("PARTY_ID").toString());
//				}
//			}
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			if(bean!=null && bean.getPartyLevel()!=null && !bean.getPartyLevel().isEmpty())
			{
				List<Map<String, Object>> list = partyMapper.selectRootParyByLevel(bean);
				result.getBody().put("list", list);
//				System.out.print("+----------------------");
			}
			else
			{
				List<Map<String, Object>> list = partyMapper.selectPartyByPId(bean);
				result.getBody().put("list", list);
			}

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

	public JSONResult selectGroupInfoById(PartyBean bean)
	{
		JSONResult result = JSONResult.getSuccess();
		try
		{
			if(bean !=null && !bean.getPartyId().isEmpty()) {
				List<TGroupInfo> listDatas = partyMapper.selectGroupInfo(bean);
				TPartyInfoMember  partInfo = partyMapper.selectPartyInfoById(bean);
				result.getBody().put("groupInfo", listDatas);
				result.getBody().put("partInfo",partInfo);
			}
		}
		catch (JSONException je) {
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
	 * 查询党员与非党员人数
	 * @param bean
	 * @return
	 */
	public JSONResult selectPartyCount(PartyBean bean)
	{
		JSONResult result = JSONResult.getSuccess();
		try
		{
			int count = partyMapper.selectPartyCount(bean);
			int pemegInfoCount= partyMapper.selectCountOfAllPeople();
			result.getBody().put("partyCount",count);
			result.getBody().put("unPartyCount",String.valueOf(pemegInfoCount-count));
		}
		catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异z常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}

	/**
	 * @param bean
	 * @return
	 */
	public JSONResult selectPartyIncorr(PartyBean bean)
	{
		JSONResult result = JSONResult.getSuccess();
		try
		{
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<TPartyIncorrupt> listDatas = partyMapper.selectPartyIncrorrupt();
			result.getBody().put("list",listDatas);
		}
		catch (JSONException je) {
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
	 * 判断是否有子节点
	 * @param request
	 * @return
	 */
	public JSONResult selectPartyIsNode(PartyBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			List<Map<String,Object>> list = partyMapper.selectPartyIsNode(bean);
			if(list!=null && list.size()>0){
				result.getBody().put("isnode", true);
			}else{
				result.getBody().put("isnode", false);
			}
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

//	public JSONResult searchPartyLevel()
//	{
//		JSONResult result = JSONResult.getSuccess();
//		try
//		{
//			PageHelper.startPage(bean.getPage(), bean.getPageSize());
//			List<TPartyIncorrupt> listDatas = partyMapper.selectPartyIncrorrupt();
//			result.getBody().put("list",listDatas);
//		}
//		catch (JSONException je) {
//			je.printStackTrace();
//			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
//		} catch (Exception e) {
//			e.printStackTrace();
//			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
//			throw new RuntimeException("运行时出错！");
//		}
//		return result;
//	}

//	public JSONResult selectGroupInfo(PartyBean bean)
//	{
//		JSONResult result = JSONResult.getSuccess();
//		try
//		{
//			TPartInfo  partInfo = partyMapper.selectPartInfo(bean);
//			List<TGroupInfo> listGroupInfo = partyMapper.selectGroupInfo(bean);
//		}
//		catch (JSONException je) {
//			je.printStackTrace();
//			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
//		} catch (Exception e) {
//			e.printStackTrace();
//			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
//			throw new RuntimeException("运行时出错！");
//		}
//		return result;
//	}


}
