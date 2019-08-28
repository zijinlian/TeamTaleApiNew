package com.work.api.v2;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.DishBatchBean;
import com.work.bean.DishCommentBean;
import com.work.bean.DishEmpCheckBean;
import com.work.bean.DishExempBean;
import com.work.bean.DishMenuBean;
import com.work.bean.DishPraiseBean;
import com.work.bean.DishProproalBean;
import com.work.bean.DishTakeBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.entity.TDishOrderInfo;
import com.work.service.TDishMenuService;

@RestController
@RequestMapping("app/v2/dish")
public class DishMenuController {
	
	@Resource
	private TDishMenuService dishMenuService;
	
	/**
	 * 食谱首页列表
	 * dishAreaName  早餐  or 中餐     or 晚餐  or 外卖
	 * pxCode    排序 0:类别  or 1人气 
	 * pxType    ASC or DESC
	 * @param request
	 * @return
	 */
	@RequestMapping("index")
	@ResponseBody
	@ApiRemark("食谱首页列表")
	public JSONResult index(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishMenuBean bean = JsonUtil.toBean(req_params, DishMenuBean.class);
			return dishMenuService.selectDisMenu(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 菜名详情
	 * @param request
	 * @return
	 */
	@RequestMapping("dishDetail")
	@ResponseBody
	@ApiRemark("菜名详情")
	public JSONResult dishDetail(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishMenuBean bean = JsonUtil.toBean(req_params, DishMenuBean.class);
			return dishMenuService.selectDishDetail(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 评论列表
	 * @param request
	 * @return
	 */
	@RequestMapping("dishComment")
	@ResponseBody
	@ApiRemark("评论列表")
	public JSONResult dishComment(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishMenuBean bean = JsonUtil.toBean(req_params, DishMenuBean.class);
			return dishMenuService.selectDishComment(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 添加评论
	 * @param request
	 * @return
	 */
	@RequestMapping("addComment")
	@ResponseBody
	@ApiRemark("添加评论")
	public JSONResult addComment(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishCommentBean bean = JsonUtil.toBean(req_params, DishCommentBean.class);
			return dishMenuService.saveComment(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 添加赞
	 * @param request
	 * @return
	 */
	@RequestMapping("addPraise")
	@ResponseBody
	@ApiRemark("添加赞")
	public JSONResult addPraise(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishPraiseBean bean = JsonUtil.toBean(req_params, DishPraiseBean.class);
			return dishMenuService.savePraise(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 兑换列表
	 * @param request
	 * @return
	 */
	@RequestMapping("batchList")
	@ResponseBody
	@ApiRemark("兑换列表")
	public JSONResult batchList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishBatchBean bean = JsonUtil.toBean(req_params, DishBatchBean.class);
			return dishMenuService.selectListBatch(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 添加兑换订单
	 * @param request
	 * @return
	 */
	@RequestMapping("addOrder")
	@ResponseBody
	@ApiRemark("添加兑换")
	public JSONResult addOrder(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("orders", TDishOrderInfo.class);
			DishExempBean bean = JsonUtil.toBean(req_params, DishExempBean.class,map);
			return dishMenuService.saveOrder(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 我的订单
	 * @param request
	 * @return
	 */
	@RequestMapping("myOrder")
	@ResponseBody
	@ApiRemark("我的订单")
	public JSONResult myOrder(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishExempBean bean = JsonUtil.toBean(req_params, DishExempBean.class);
			return dishMenuService.selectMyOrder(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 修改订单
	 * @param request
	 * @return
	 */
	@RequestMapping("updateOrder")
	@ResponseBody
	@ApiRemark("修改订单")
	public JSONResult updateOrder(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("orders", TDishOrderInfo.class);
			DishExempBean bean = JsonUtil.toBean(req_params, DishExempBean.class,map);
			return dishMenuService.updateOrder(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 删除订单
	 * @param request
	 * @return
	 */
	@RequestMapping("deleteOrder")
	@ResponseBody
	@ApiRemark("删除订单")
	public JSONResult deleteOrder(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishExempBean bean = JsonUtil.toBean(req_params, DishExempBean.class);
			return dishMenuService.deleteOrder(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 食谱意见反馈
	 * @param request
	 * @return
	 */
	@RequestMapping("feedback")
	@ResponseBody
	@ApiRemark("食谱意见反馈")
	public JSONResult feedback(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishProproalBean bean = JsonUtil.toBean(req_params, DishProproalBean.class);
			return dishMenuService.saveFeedBack(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 外卖预约
	 * @param request
	 * @return
	 */
	@RequestMapping("take")
	@ResponseBody
	@ApiRemark("外卖预约")
	public JSONResult take(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishTakeBean bean = JsonUtil.toBean(req_params, DishTakeBean.class);
			return dishMenuService.saveTake(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 取消预约
	 * @param request
	 * @return
	 */
	@RequestMapping("changeTake")
	@ResponseBody
	@ApiRemark("取消预约")
	public JSONResult changeTake(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishTakeBean bean = JsonUtil.toBean(req_params, DishTakeBean.class);
			return dishMenuService.deleteChangeTake(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 签到统计
	 * @param request
	 * @return
	 */
	@RequestMapping("showCheck")
	@ResponseBody
	@ApiRemark("签到统计")
	public JSONResult showCheck(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishEmpCheckBean bean = JsonUtil.toBean(req_params, DishEmpCheckBean.class);
			return dishMenuService.selectUserCheck(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 保存签到
	 * @param request
	 * @return
	 */
	@RequestMapping("saveCheck")
	@ResponseBody
	@ApiRemark("保存签到")
	public JSONResult saveCheck(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("checks", DishEmpCheckBean.class);
			DishEmpCheckBean bean = JsonUtil.toBean(req_params, DishEmpCheckBean.class,map);
			return dishMenuService.saveUserCheck(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 查询签到状态
	 * @param request
	 * @return
	 */
	@RequestMapping("checkStatus")
	@ResponseBody
	@ApiRemark("查询签到状态")
	public JSONResult checkStatus(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishEmpCheckBean bean = JsonUtil.toBean(req_params, DishEmpCheckBean.class);
			return dishMenuService.selectCheckStatus(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}


	/**
	 * 取消签到时间
	 * @param request
	 * @return
	 */
	@RequestMapping("cancelDishTime")
	@ResponseBody
	@ApiRemark("取消签到时间")
	public JSONResult cancelDishTime(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishEmpCheckBean bean = JsonUtil.toBean(req_params, DishEmpCheckBean.class);
			return dishMenuService.deleteDishTimeById(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}


	/**
	 * 查询所有有效批次信息
	 * @param request
	 * @return
	 */
	@RequestMapping("selectListDishBatch")
	@ResponseBody
	@ApiRemark("查询所有有效批次信息")
	public JSONResult selectListDishBatch(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishBatchBean bean = JsonUtil.toBean(req_params, DishBatchBean.class);
			return dishMenuService.selectListDishBatch(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 根据批次查询所有兑换列表
	 * @param request
	 * @return
	 */
	@RequestMapping("selectDishExChangeList")
	@ResponseBody
	@ApiRemark("根据批次查询所有兑换列表")
	public JSONResult selectDishExChangeList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishBatchBean bean = JsonUtil.toBean(req_params, DishBatchBean.class);
			return dishMenuService.selectDishExChangeList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 用户订单列表
	 * @param request
	 * @return
	 */
	@RequestMapping("selectEmpOrderList")
	@ResponseBody
	@ApiRemark("用户订单列表")
	public JSONResult selectEmpOrderList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishExempBean bean = JsonUtil.toBean(req_params, DishExempBean.class);
			return dishMenuService.selectEmpOrderList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 用户订单详情
	 * @param request
	 * @return
	 */
	@RequestMapping("selectEmpOrderDetail")
	@ResponseBody
	@ApiRemark("用户订单详情")
	public JSONResult selectEmpOrderDetail(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			DishExempBean bean = JsonUtil.toBean(req_params, DishExempBean.class);
			return dishMenuService.selectEmpOrderDetail(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

}
