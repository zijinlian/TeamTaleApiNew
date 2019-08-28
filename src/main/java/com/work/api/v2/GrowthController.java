package com.work.api.v2;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.GaResumeBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.TGrowthService;


/**
 * 成长档案
 * @author zhoucha
 *
 */
@RestController
@RequestMapping("app/v2/growth")
public class GrowthController {
	
	@Resource
	private TGrowthService growthService;
	
	/**
	 * 个人曲线
	 * @param request
	 * @return
	 */
	@RequestMapping("growthEmpCurve")
	@ResponseBody
	@ApiRemark("个人曲线")
	public JSONResult growthEmpCurve(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectEmpCurve(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 个人简介
	 * @param request
	 * @return
	 */
	@RequestMapping("growthInfo")
	@ResponseBody
	@ApiRemark("个人简介")
	public JSONResult growthInfo(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectInfo(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 个人荣誉
	 * @param request
	 * @return
	 */
	@RequestMapping("honor")
	@ResponseBody
	@ApiRemark("个人荣誉")
	public JSONResult honor(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectUserHonor(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 集体荣誉
	 * @param request
	 * @return
	 */
	@RequestMapping("selectEmpGrouphonor")
	@ResponseBody
	@ApiRemark("集体荣誉")
	public JSONResult selectEmpGrouphonor(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectEmpGrouphonor(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 绩效考核
	 * @param request
	 * @return
	 */
	@RequestMapping("performance")
	@ResponseBody
	@ApiRemark("绩效考核")
	public JSONResult performance(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectPerformance(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 考勤
	 * @param request
	 * @return
	 */
	@RequestMapping("attendance")
	@ResponseBody
	@ApiRemark("考勤")
	public JSONResult attendance(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectAttendance(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 技能测评
	 * @param request
	 * @return
	 */
	@RequestMapping("skills")
	@ResponseBody
	@ApiRemark("技能测评")
	public JSONResult skills(HttpServletRequest request) {
		try {

			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectSkills(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 资格证书
	 * @param request
	 * @return
	 */
	@RequestMapping("certificate")
	@ResponseBody
	@ApiRemark("资格证书")
	public JSONResult certificate(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectCertificate(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 教育培训-师资
	 * @param request
	 * @return
	 */
	@RequestMapping("trainTeachers")
	@ResponseBody
	@ApiRemark("教育培训")
	public JSONResult train(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectTrainTeachers(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 查询机构列表
	 * @param request
	 * @return
	 */
	@RequestMapping("searchOrgEmp")
	@ResponseBody
	@ApiRemark("查询机构列表")
	public JSONResult searchOrgEmp(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectOrgEmpList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 查询机构用户列表
	 * @param request
	 * @return
	 */
	@RequestMapping("selectEmpListByOrgCode")
	@ResponseBody
	@ApiRemark("查询机构用户列表")
	public JSONResult selectEmpListByOrgCode(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectEmpListByOrgCode(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

	
	/**
	 * 雷达图
	 * @param request
	 * @return
	 */
	@RequestMapping("empSource")
	@ResponseBody
	@ApiRemark("雷达图")
	public JSONResult empSource(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			GaResumeBean bean = JsonUtil.toBean(req_params, GaResumeBean.class);
			return growthService.selectEmpSource(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
}
