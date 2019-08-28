package com.work.api.v2;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.work.bean.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.Maps;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.TIccArchiveService;

/**
 * 内控合规
 * @author zhoucha
 *
 */

@RestController
@RequestMapping("app/v2/archives")
public class ArchivesController {
	
	@Resource
	private TIccArchiveService archiveService;

    /**
     * 展示合规题目所属部门表
     * @param
     * @return
     */
    @RequestMapping("problemDeptList")
    @ResponseBody
    @ApiRemark("合规题目所属部门")
    public JSONResult problemDeptList() {
        try {
            JSONResult jsonResult = archiveService.selectProblemDeptList();
            return jsonResult;
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
    }

	/**
	 * 内控合规列表
	 * @param request
	 * @return
	 */
	@RequestMapping("listArchive")
	@ResponseBody
	@ApiRemark("内控合规列表")
	public JSONResult listArchive(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			PageBean bean = JsonUtil.toBean(req_params, PageBean.class);
			return archiveService.selectListArchive(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	
	/**
	 * 合规测试试卷试题
	 * @param request
	 * @return
	 */
	@RequestMapping("newMath")
	@ResponseBody
	@ApiRemark("合规测试试卷试题")
	public JSONResult newMath(HttpServletRequest request) {
		try {
		/*	Object bean="";*/
            Object deptIds =  request.getAttribute("req_params");
			Map<String,String> bean = JsonUtil.toBean(deptIds, Map.class);
			return archiveService.selectListNewMath(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

    /**
     * 合规测试试卷试题
     * @param request
     * @return
     */
    @RequestMapping("maths")
    @ResponseBody
    @ApiRemark("合规测试试卷试题")
    public JSONResult maths(HttpServletRequest request) {
        try {
            Object bean = "";
//            Object req_params = request.getAttribute("req_params");
//            Object bean = JsonUtil.toBean(req_params, Object.class);
            return archiveService.selectListMath(bean);
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
    }
	
	/**
	 * 用户是否测试过
	 * @param request
	 * @return
	 */
	@RequestMapping("stafStatusByUserAndDate")
	@ResponseBody
	@ApiRemark("用户是否测试过")
	public JSONResult stafStatusByUserAndDate(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			IccStaffPaperBean bean = JsonUtil.toBean(req_params, IccStaffPaperBean.class);
			return archiveService.selectIccStafStatusByUserAndDate(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 提交答案
	 * @param request
	 * @return
	 */
	@RequestMapping("submitMath")
	@ResponseBody
	@ApiRemark("提交答案")
	public JSONResult submitMath(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			Map<String,Object> map = Maps.newHashMap();
			map.put("answers", IccStaffPaperBean.class);
			IccStaffPaperBean bean = JsonUtil.toBean(req_params, IccStaffPaperBean.class,map);
			return archiveService.saveAnswer(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

	/**
	 * 新的提交答案
	 * @param request
	 * @return
	 */
	@RequestMapping("submitMathNew")
	@ResponseBody
	@ApiRemark("提交答案")
	public JSONResult submitMathNew(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			Map<String,Object> map = Maps.newHashMap();
			map.put("answers", TbIccStaffPaperNewBean.class);
            TbIccStaffPaperNewBean bean = JsonUtil.toBean(req_params, TbIccStaffPaperNewBean.class,map);
			return archiveService.saveAnswerNew(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

	
	/**
	 * 检查监控
	 * @param request
	 * @return
	 */
	@RequestMapping("checkFinalList")
	@ResponseBody
	@ApiRemark("检查监控")
	public JSONResult checkFinalList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			IccStaffPaperBean bean = JsonUtil.toBean(req_params, IccStaffPaperBean.class);
			return archiveService.selectCheckFinalList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 检查项列表
	 * @param request
	 * @return
	 */
	@RequestMapping("checkItemList")
	@ResponseBody
	@ApiRemark("检查项列表")
	public JSONResult checkItemList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			CheckFinalItemsBean bean = JsonUtil.toBean(req_params, CheckFinalItemsBean.class);
			return archiveService.selectCheckItemList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 修改检查项
	 * @param request
	 * @return
	 */
	@RequestMapping("updateItems")
	@ResponseBody
	@ApiRemark("修改检查项")
	public JSONResult updateItems(HttpServletRequest request,@RequestParam("file") MultipartFile[] files) {
		try {
			Object req_params = request.getAttribute("req_params");
			Map<String,Object> map = Maps.newHashMap();
			map.put("items", CheckFinalItemsBean.class);
			CheckFinalListBean bean = JsonUtil.toBean(req_params, CheckFinalListBean.class,map);
			return archiveService.updateCheckItem(bean,files);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
}
