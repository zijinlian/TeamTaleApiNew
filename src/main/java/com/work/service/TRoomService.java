package com.work.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.work.entity.*;
import net.sf.json.JSONException;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.work.bean.CmApprovalBean;
import com.work.bean.RoomBean;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.JSONResult;
import com.work.common.UUIDGeneratorUtil;
import com.work.mapper.TCmApplyMapper;
import com.work.mapper.TCmApprovalMapper;
import com.work.mapper.TCmRoomMapper;
import com.work.mapper.TCmapplyRoomMapper;

@Service
public class TRoomService {
	
	@Resource
	private TCmRoomMapper roomMapper;
	
	@Resource
	private TCmApplyMapper applyMapper;
	
	@Resource
	private TCmapplyRoomMapper cmapplyRoomMapper;
	
	@Resource
	private TCmApprovalMapper approvalMapper;

	
	/**
	 * 根据日期查询会议
	 * @param bean
	 * @return
	 */
	public JSONResult selectRooms(RoomBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			if(StringUtils.isEmpty(bean.getDate())){
				bean.setDate(DateUtil.defaultFormat(new Date()));
			}
			TCmRoomExample roomExample = new TCmRoomExample();
			roomExample.setOrderByClause("ROOMLEVLE DESC");
			roomExample.createCriteria().andStatusNotEqualTo("0");
			List<TCmRoom> listRooms = roomMapper.selectByExample(roomExample);
			if(CollectionUtils.isEmpty(listRooms)){
				result = JSONResult.getFail("没有会议室");
			}else{
				TCmRoom cmRoom = listRooms.get(0);
				if(StringUtils.isEmpty(bean.getRoomId())){
					bean.setRoomId(cmRoom.getRoomid());
				}
				List<Map<String, Object>> listApplies = cmapplyRoomMapper.selectRoomById(bean);
				result.getBody().put("listRooms", listRooms);
				result.getBody().put("listApplies", listApplies);
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
	
	
	/**
	 * 我的会议
	 * @param bean
	 * @return
	 */
	public JSONResult selectMyRooms(RoomBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<Map<String, Object>> listApplies = cmapplyRoomMapper.selectRoomByEmpId(bean);
			result.getBody().put("listApplies", listApplies);
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
	 * 取消会议
	 * @param bean
	 * @return
	 */
	public JSONResult updateCancelRoom(RoomBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TCmApply cmApply = new TCmApply();
			cmApply.setApplyid(bean.getApplyid());
			System.out.println("applyid>>>>>>>>>>>>>>>>:"+bean.getApplyid());
			cmApply.setApplystatus("0");
			applyMapper.updateByPrimaryKeySelective(cmApply);
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
	 * 我的审批
	 * @param bean
	 * @return
	 */
	public JSONResult selectMyRoomApproval(RoomBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<Map<String, Object>> list = cmapplyRoomMapper.selectMyRoomApproval(bean);
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
	
	
	/**
	 * 审批会议
	 * @param bean
	 * @return
	 */
	public JSONResult  updateApproval(CmApprovalBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TCmApproval approval = new TCmApproval();
			approval.setId(UUIDGeneratorUtil.generate());
			approval.setApplyid(bean.getApplyid());
			approval.setApprovalcommnet(bean.getApprovalcommnet());
			approval.setFdStatus(bean.getFdStatus());
			approval.setFdHandlerid(bean.getFdHandlerid());
			approval.setFdHandlernme(bean.getFdHandlernme());
			approval.setFdHandletime(DateUtil.formatDate(new Date()));
			approvalMapper.insertSelective(approval);
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
	 * 会议管理员查看审批记录
	 * @param bean
	 * @return
	 */
	public JSONResult selectManagerRoomList(RoomBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<Map<String, Object>> list = cmapplyRoomMapper.selectManagerRoomList();
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
