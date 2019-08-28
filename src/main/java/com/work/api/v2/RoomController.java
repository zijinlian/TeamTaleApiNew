package com.work.api.v2;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.CmApprovalBean;
import com.work.bean.RoomBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.TRoomService;

/**
 * 会议
 * @author zhoucha
 *
 */
@RestController
@RequestMapping("app/v2/rooms")
public class RoomController {

	@Resource
	private TRoomService roomService;
	
	/**
	 * 会议首页
	 * @param request
	 * @return
	 */
	@RequestMapping("indexRoom")
	@ResponseBody
	@ApiRemark("会议首页")
	public JSONResult indexRoom(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			RoomBean bean = JsonUtil.toBean(req_params, RoomBean.class);
			return roomService.selectRooms(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 我的申请
	 * @param request
	 * @return
	 */
	@RequestMapping("myRoom")
	@ResponseBody
	@ApiRemark("我的申请")
	public JSONResult myRoom(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			RoomBean bean = JsonUtil.toBean(req_params, RoomBean.class);
			return roomService.selectMyRooms(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 取消会议
	 * @param request
	 * @return
	 */
	@RequestMapping("cancelRoom")
	@ResponseBody
	@ApiRemark("取消会议")
	public JSONResult cancelRoom(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			RoomBean bean = JsonUtil.toBean(req_params, RoomBean.class);
			return roomService.updateCancelRoom(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 我的审批
	 * @param request
	 * @return
	 */
	@RequestMapping("myApproval")
	@ResponseBody
	@ApiRemark("我的审批")
	public JSONResult myApproval(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			RoomBean bean = JsonUtil.toBean(req_params, RoomBean.class);
			return roomService.selectMyRoomApproval(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 审批会议
	 * @param request
	 * @return
	 */
	@RequestMapping("approvalRoom")
	@ResponseBody
	@ApiRemark("审批会议")
	public JSONResult approvalRoom(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			CmApprovalBean bean = JsonUtil.toBean(req_params, CmApprovalBean.class);
			System.out.print("======the handle name is :"+bean.getFdHandlernme());
			System.out.print("======the apply id  is :"+bean.getApplyid());
			return roomService.updateApproval(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 会议管理员查看审批记录
	 * @param request
	 * @return
	 */
	@RequestMapping("managerRoomLists")
	@ResponseBody
	@ApiRemark("会议管理员查看审批记录")
	public JSONResult managerRoomList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			RoomBean bean = JsonUtil.toBean(req_params, RoomBean.class);
			return roomService.selectManagerRoomList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
}
