package com.work.api.v2;

import java.util.Map;

import com.google.common.collect.Maps;
import com.work.bean.StudyTrainBean;
import com.work.bean.StudyTrainCommentBean;
import com.work.bean.TraiEvaluateBean;
import com.work.bean.TraiRegisterBean;
import com.work.bean.TraiSignBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.TStudyTrainService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * 学习培训
 *
 * @author zhoucha
 */
@RestController
@RequestMapping("app/v2/study")
public class StudyTrainController {

    @Resource
    private TStudyTrainService studyTrainService;

    /**
     * 添加学习培训
     * @param request
     * @return
     */
    @RequestMapping("saveEmpStudyTrain")
    @ResponseBody
    @ApiRemark("添加学习培训")
    public JSONResult saveEmpStudyTrain(HttpServletRequest request) {
        try {
            Object req_params = request.getAttribute("req_params");
            StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
            return studyTrainService.saveEmpStudyTrain(bean);
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
    }

    
    /**
	 * 修改培训
	 * @param request
	 * @return
	 */
	@RequestMapping("updateEmpStudyTrain")
	@ResponseBody
	@ApiRemark("修改培训")
	public JSONResult updateEmpStudyTrain(HttpServletRequest request,@RequestParam("file") MultipartFile file) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.updateEmpStudyTrain(bean, file);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 培训列表
	 * @param request
	 * @return
	 */
	@RequestMapping("listStudyTrain")
	@ResponseBody
	@ApiRemark("培训列表")
	public JSONResult listStudyTrain(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.selectListStudyTrain(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 我的培训
	 * @param request
	 * @return
	 */
	@RequestMapping("myStudyTrain")
	@ResponseBody
	@ApiRemark("我的培训")
	public JSONResult myStudyTrain(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.selectMyStudyTrain(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 审核列表
	 * @param request
	 * @return
	 */
	@RequestMapping("listApproval")
	@ResponseBody
	@ApiRemark("审核列表")
	public JSONResult listApproval(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.selectMyApproval(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 添加审批
	 * @param request
	 * @return
	 */
	@RequestMapping("saveApprovalStudy")
	@ResponseBody
	@ApiRemark("添加审批")
	public JSONResult saveApprovalStudy(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.updateApprovalStudy(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 学习培训类型列表
	 * @param request
	 * @return
	 */
	@RequestMapping("selectListStudyType")
	@ResponseBody
	@ApiRemark("学习培训类型列表")
	public JSONResult selectListStudyType(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			Object bean = JsonUtil.toBean(req_params, Object.class);
			return studyTrainService.selectListStudyType(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	
	/**
	 * 保存学习培训评论
	 * @param request
	 * @return
	 */
	@RequestMapping("saveStudyTrainComment")
	@ResponseBody
	@ApiRemark("保存学习培训评论")
	public JSONResult saveStudyTrainComment(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainCommentBean bean = JsonUtil.toBean(req_params, StudyTrainCommentBean.class);
			return studyTrainService.saveStudyTrainComment(bean);
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
	@RequestMapping("studyCommentList")
	@ResponseBody
	@ApiRemark("评论列表")
	public JSONResult studyCommentList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainCommentBean bean = JsonUtil.toBean(req_params, StudyTrainCommentBean.class);
			return studyTrainService.selectStudyCommentList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	
	/**
	 * 播放次数
	 * @param request
	 * @return
	 */
	@RequestMapping("studyTrainPlay")
	@ResponseBody
	@ApiRemark("播放次数")
	public JSONResult studyTrainDetail(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.updateStudyTrainPlay(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 面授首页列表
	 * @param request
	 * @return
	 */
	@RequestMapping("selectTraiCourseList")
	@ResponseBody
	@ApiRemark(" 面授首页列表")
	public JSONResult selectTraiCourseList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.selectTraiCourseList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 课程目录
	 * @param request
	 * @return
	 */
	@RequestMapping("selectTraiPlayList")
	@ResponseBody
	@ApiRemark("课程目录")
	public JSONResult selectTraiPlayList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			StudyTrainBean bean = JsonUtil.toBean(req_params, StudyTrainBean.class);
			return studyTrainService.selectTraiPlayList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 报名
	 * @param request
	 * @return
	 */
	@RequestMapping("trainPlayRegister")
	@ResponseBody
	@ApiRemark("报名")
	public JSONResult trainPlayRegister(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TraiRegisterBean bean = JsonUtil.toBean(req_params, TraiRegisterBean.class);
			return studyTrainService.savePlayRegister(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 签到状态
	 * @param request
	 * @return
	 */
	@RequestMapping("selectTrainSignStatus")
	@ResponseBody
	@ApiRemark("签到状态")
	public JSONResult selectTrainSignStatus(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TraiSignBean bean = JsonUtil.toBean(req_params, TraiSignBean.class);
			return studyTrainService.selectTrainSignStatus(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	

	/**
	 * 报名状态
	 * @param request
	 * @return
	 */
	@RequestMapping("selectTrainRegisterStatus")
	@ResponseBody
	@ApiRemark("报名状态")
	public JSONResult selectTrainRegisterStatus(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TraiRegisterBean bean = JsonUtil.toBean(req_params, TraiRegisterBean.class);
			return studyTrainService.selectTrainRegisterStatus(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 撤销报名
	 * @param request
	 * @return
	 */
	@RequestMapping("changeRegister")
	@ResponseBody
	@ApiRemark("撤销报名")
	public JSONResult changeRegister(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TraiRegisterBean bean = JsonUtil.toBean(req_params, TraiRegisterBean.class);
			return studyTrainService.updateChangeRegister(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 评论
	 * @param request
	 * @return
	 */
	@RequestMapping("trainPlayComment")
	@ResponseBody
	@ApiRemark("评论")
	public JSONResult trainPlayComment(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			Map<String, Object> map = Maps.newHashMap();
			map.put("teachers", TraiEvaluateBean.class);
			TraiEvaluateBean bean = JsonUtil.toBean(req_params, TraiEvaluateBean.class,map);
			return studyTrainService.saveTrainComment(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 判断是否可以签到
	 * @param request
	 * @return
	 */
	@RequestMapping("userIsSign")
	@ResponseBody
	@ApiRemark("判断是否可以签到")
	public JSONResult userIsSign(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TraiSignBean bean = JsonUtil.toBean(req_params, TraiSignBean.class);
			return studyTrainService.selectUserIsSign(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

}
