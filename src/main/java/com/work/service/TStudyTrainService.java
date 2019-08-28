package com.work.service;


import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.work.bean.StudyTrainBean;
import com.work.bean.StudyTrainCommentBean;
import com.work.bean.TraiEvaluateBean;
import com.work.bean.TraiRegisterBean;
import com.work.bean.TraiSignBean;
import com.work.common.*;
import com.work.entity.*;
import com.work.entity.TStudyTrainExample.Criteria;
import com.work.mapper.TExamMapper;
import com.work.mapper.TStudyTrainCommentMapper;
import com.work.mapper.TStudyTrainMapper;
import com.work.mapper.TStudyTrainTypeMapper;
import com.work.mapper.TSysUserinfoMapper;
import com.work.mapper.TTraiCourseMapper;
import com.work.mapper.TTraiEvaluateMapper;
import com.work.mapper.TTraiPlayMapper;
import com.work.mapper.TTraiRegisterMapper;
import com.work.mapper.TTraiSignMapper;
import com.work.mapper.TTraiTeacherMapper;

import net.sf.json.JSONException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhoucha on 2016/12/6.
 */
@Service
public class TStudyTrainService {

    @Resource
    private TStudyTrainMapper studyTrainMapper;

    @Resource
    private TSysUserinfoMapper sysUserinfoMapper;
    
    @Resource
    private TStudyTrainTypeMapper studyTrainTypeMapper;
    
    @Resource
    private TStudyTrainCommentMapper studyTrainCommentMapper;
    
    @Resource
    private TTraiCourseMapper traiCourseMapper;
    
    @Resource
    private TTraiPlayMapper traiPlayMapper;
    
    @Resource
    private TExamMapper examMapper;
    
    @Resource
    private TTraiRegisterMapper registerMapper;
    
    @Resource
    private TTraiSignMapper traiSignMapper;
    
    @Resource
    private TTraiEvaluateMapper traiEvaluateMapper;
    
    @Resource
    private TTraiTeacherMapper traiTeacherMapper;
    
    /**
     * 添加学习培训
     *
     * @param bean
     * @return
     */
    public JSONResult saveEmpStudyTrain(StudyTrainBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
        	String deptCode = examMapper.queryDeptOrgByEmpId(bean.getEmpId());
            TStudyTrain studyTrain = new TStudyTrain();
            BeanUtils.copyProperties(studyTrain, bean);
            studyTrain.setStudyId(UUIDGeneratorUtil.generate());
            TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getEmpId());
            if (userinfo != null) {
                studyTrain.setEmpName(userinfo.getFdName());
            }
            studyTrain.setFdDeptOrg(deptCode);
            studyTrain.setCreateTime(DateUtil.defaultFormat(new Date()));
            studyTrainMapper.insertSelective(studyTrain);
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
     * 修改培训
     * @param bean
     * @return
     */
    public JSONResult updateEmpStudyTrain(StudyTrainBean bean, MultipartFile file) {
		JSONResult result = JSONResult.getSuccess();
		try {
			 TStudyTrain studyTrain = new TStudyTrain();
	         BeanUtils.copyProperties(studyTrain, bean);
	         if (file != null && !file.isEmpty()) {
	        	 String vadioUrl = HttpUploadFile.uploadToImageServer(file);
	             studyTrain.setVadioUrl(vadioUrl);
	         }
	         studyTrainMapper.updateByPrimaryKeySelective(studyTrain);
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
     * 培训列表
     * @param bean
     * @return
     */
    public JSONResult selectListStudyTrain(StudyTrainBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TStudyTrainExample example = new TStudyTrainExample();
			example.setOrderByClause("CREATE_TIME DESC");
			Criteria criteria = example.createCriteria();
			criteria.andApprovalDeptStatusEqualTo("2");
			criteria.andApprovalProStatusEqualTo("2");
			if(StringUtils.isNotEmpty(bean.getTypeCode())){
				criteria.andTypeCodeEqualTo(bean.getTypeCode());
			}
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<TStudyTrain> list = studyTrainMapper.selectByExample(example);
			for (TStudyTrain tStudyTrain : list) {
				String unitname = examMapper.queryUnitnameByEmpId(tStudyTrain.getEmpId());
				tStudyTrain.setUnitName(unitname);
			}
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
     * 我的培训
     * @param bean
     * @return
     */
    public JSONResult selectMyStudyTrain(StudyTrainBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TStudyTrainExample example = new TStudyTrainExample();
			example.setOrderByClause("CREATE_TIME DESC");
			example.createCriteria().andEmpIdEqualTo(bean.getEmpId());
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<TStudyTrain> list = studyTrainMapper.selectByExample(example);
			for (TStudyTrain tStudyTrain : list) {
				String unitname = examMapper.queryUnitnameByEmpId(tStudyTrain.getEmpId());
				tStudyTrain.setUnitName(unitname);
			}
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
     * 我的审核
     * @param bean
     * @return
     */
    public JSONResult selectMyApproval(StudyTrainBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			List<TStudyTrain> list = Lists.newArrayList();
			//String orgCode = examMapper.queryOrgCodeByEmpId(bean.getEmpId());
			String deptCode = examMapper.queryDeptOrgByEmpId(bean.getEmpId());//条线编号
			TStudyTrainExample example = new TStudyTrainExample();
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			if(StringUtils.equals(bean.getModeltype(), "03")){//省行审批
				example.setOrderByClause("CREATE_TIME DESC");
//				example.createCriteria().andFdDeptOrgEqualTo(deptCode).andApprovalDeptStatusEqualTo("2").andApprovalProStatusEqualTo("1");
				example.createCriteria().andApprovalDeptStatusEqualTo("2").andApprovalProStatusEqualTo("1");
				PageHelper.startPage(bean.getPage(), bean.getPageSize());
				list = studyTrainMapper.selectByExample(example);
			}else if(StringUtils.equals(bean.getModeltype(), "01")||StringUtils.equals(bean.getModeltype(), "02")){//一级审批
				example.setOrderByClause("CREATE_TIME DESC");
				example.createCriteria().andFdDeptOrgEqualTo(deptCode).andApprovalDeptStatusEqualTo("1");
				PageHelper.startPage(bean.getPage(), bean.getPageSize());
				list = studyTrainMapper.selectByExample(example);
			}
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
     * 审核
     * @param bean
     * @return
     */
    public JSONResult updateApprovalStudy(StudyTrainBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			//String orgCode = examMapper.queryOrgCodeByEmpId(bean.getEmpId());
			TStudyTrain studyTrain = new TStudyTrain();
			BeanUtils.copyProperties(studyTrain, bean);
			studyTrain.setEmpId(null);
			if(StringUtils.equals(bean.getModeltype(), "03")){//省行审批
				if(StringUtils.equals(bean.getStatus(), "1")){//同意
					studyTrain.setApprovalProStatus("2");
				}else{
					studyTrain.setApprovalProStatus("3");
				}
				studyTrain.setApprProEmpid(bean.getEmpId());
			}else{//部门审批
				if(StringUtils.equals(bean.getStatus(), "1")){//同意
					studyTrain.setApprovalDeptStatus("2");
				}else{
					studyTrain.setApprovalDeptStatus("3");
				}
				studyTrain.setApprDeptEmpid(bean.getEmpId());
			}
			studyTrainMapper.updateByPrimaryKeySelective(studyTrain);
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
     * 学习培训类型列表
     * @param bean
     * @return
     */
    public JSONResult selectListStudyType(Object bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TStudyTrainTypeExample example = new TStudyTrainTypeExample();
			List<TStudyTrainType> list = studyTrainTypeMapper.selectByExample(example);
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
     * 评论
     * @param bean
     * @return
     */
    public JSONResult saveStudyTrainComment(StudyTrainCommentBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			//判断是否评论过
			TStudyTrainCommentExample commentExample = new TStudyTrainCommentExample();
			commentExample.createCriteria().andEmpIdEqualTo(bean.getEmpId()).andStudyIdEqualTo(bean.getStudyId());
			List<TStudyTrainComment> list = studyTrainCommentMapper.selectByExample(commentExample);
			if(list!=null&&list.size()>0){
				result = JSONResult.getFail(Constants.ERROE, "不能重复评论");
			}else{
				TStudyTrainComment comment = new TStudyTrainComment();
				BeanUtils.copyProperties(comment, bean);
				comment.setCommentId(UUIDGeneratorUtil.generate());
				comment.setCreateTime(DateUtil.formatDate(new Date()));
				TStudyTrain studyTrain = studyTrainMapper.selectByPrimaryKey(bean.getStudyId());
				TStudyTrain up_studyTrain = new TStudyTrain();
				up_studyTrain.setStudyId(bean.getStudyId());
				up_studyTrain.setCommentCount(String.valueOf(Integer.valueOf(studyTrain.getCommentCount())+1));
				studyTrainCommentMapper.insertSelective(comment);
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
     * 评论列表
     * @param bean
     * @return
     */
    public JSONResult selectStudyCommentList(StudyTrainCommentBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TStudyTrainCommentExample commentExample = new TStudyTrainCommentExample();
			commentExample.setOrderByClause("CREATE_TIME DESC");
			commentExample.createCriteria().andStudyIdEqualTo(bean.getStudyId());
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<TStudyTrainComment> list = studyTrainCommentMapper.selectByExample(commentExample);
			for (TStudyTrainComment tStudyTrainComment : list) {
				TSysUserinfo  userinfo = sysUserinfoMapper.selectByPrimaryKey(tStudyTrainComment.getEmpId());
				tStudyTrainComment.setFdName(userinfo.getFdName());
				tStudyTrainComment.setFdHeadicon(userinfo.getFdHeadicon());
			}
			result.getBody().put("comments", list);
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
     * 修改播放次数
     * @param bean
     * @return
     */
    public JSONResult updateStudyTrainPlay(StudyTrainBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TStudyTrain studyTrain = studyTrainMapper.selectByPrimaryKey(bean.getStudyId());
			TStudyTrain up_studyTrain = new TStudyTrain();
			up_studyTrain.setStudyId(bean.getStudyId());
			up_studyTrain.setPlayCount(String.valueOf(Integer.valueOf(studyTrain.getPlayCount())+1));
			studyTrainMapper.updateByPrimaryKeySelective(up_studyTrain);
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
     * 面授列表
     * @param bean
     * @return
     */
    public JSONResult selectTraiCourseList(StudyTrainBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			Map<String, Object> smap = Maps.newHashMap();
			smap.put("empId", bean.getEmpId());
			smap.put("status", bean.getStatus());
			List<Map<String, Object>> list = traiCourseMapper.selectTraiCourseList(smap);
			for (Map<String, Object> map : list) {
				String id = String.valueOf(map.get("ID"));//课程ID
				TTraiPlayExample example = new TTraiPlayExample();
				example.createCriteria().andIdEqualTo(id);
				List<TTraiPlay> listPlan = traiPlayMapper.selectByExample(example);//根据课程查询课节列表
				List<String> values = Lists.newArrayList();
				for (TTraiPlay tTraiPlay : listPlan) {
					if(StringUtils.isNotEmpty(tTraiPlay.getTeacherid())){
						values.add(tTraiPlay.getTeacherid());
					}
				}
				/*TTraiTeacherExample teacherExample = new TTraiTeacherExample();
				teacherExample.setDistinct(true);
				teacherExample.createCriteria().andTeacheridIn(values);
				List<TTraiTeacher> listTeachers = traiTeacherMapper.selectByExample(teacherExample);
				for (TTraiTeacher tTraiTeacher : listTeachers) {
					TSysUserinfo  userinfo = sysUserinfoMapper.selectByPrimaryKey(tTraiTeacher.getTeacherempid());
					if(userinfo!=null){
						tTraiTeacher.setFdHeadicon(userinfo.getFdHeadicon());
					}else{
						tTraiTeacher.setFdHeadicon("");
					}
				}*/
				map.put("listPlan", listPlan);
				/*if(map.get("TEACHERID")!=null){
					String[] tids = StringUtils.split(String.valueOf(map.get("TEACHERID")));
					List<String> values = Arrays.asList(tids);
					TTraiTeacherExample teacherExample = new TTraiTeacherExample();
					teacherExample.setDistinct(true);
					teacherExample.createCriteria().andTeacheridIn(values);
					List<TTraiTeacher> listTeachers = traiTeacherMapper.selectByExample(teacherExample);
					for (TTraiTeacher tTraiTeacher : listTeachers) {
						TSysUserinfo  userinfo = sysUserinfoMapper.selectByPrimaryKey(tTraiTeacher.getTeacherempid());
						if(userinfo!=null){
							tTraiTeacher.setFdHeadicon(userinfo.getFdHeadicon());
						}else{
							tTraiTeacher.setFdHeadicon("");
						}
					}
					map.put("LISTTEACHERS", listTeachers);
				}*/
			}
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
     * 课节安排
     * @param bean
     * @return
     */
    public JSONResult selectTraiPlayList(StudyTrainBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TTraiPlayExample example = new TTraiPlayExample();
			example.createCriteria().andIdEqualTo(bean.getId());
			List<TTraiPlay> list = traiPlayMapper.selectByExample(example);
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
     * 报名
     * @param bean
     * @return
     */
    public JSONResult savePlayRegister(TraiRegisterBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TTraiRegister register = new TTraiRegister();
			BeanUtils.copyProperties(register, bean);
			register.setRegisterid(UUIDGeneratorUtil.generate());
			register.setRegisterstatus("1");
			String orgCode = examMapper.queryOrgCodeByEmpId(bean.getEmployeeid());
			String deptCode = examMapper.queryDeptOrgByEmpId(bean.getEmployeeid());
			register.setEmporgcode(orgCode);
			if(StringUtils.equals(orgCode, "00007")){
				register.setRegistertype("2");
				register.setApprovetype("2");
			}else{
				register.setRegistertype("1");
				register.setApprovetype("1");
			}
			register.setDeptcode(deptCode);
			register.setEvaluatestatus("0");

			//获取报名限制人数
			Map paramMap=new HashMap();
			paramMap.put("id",bean.getId());
			paramMap.put("deptCode",deptCode);

			int cunmum =0;
			Map<String,Object>    alloCaceMap = traiPlayMapper.selectAlloCace(paramMap);
//			System.out.print(">>>>>>>>>>>>>>>>>>."+alloCaceMap.containsKey("studynum"));
			if(alloCaceMap.get("studynum") instanceof  BigDecimal)
			{
				BigDecimal decimal = (BigDecimal) alloCaceMap.get("studynum");

				cunmum= decimal.intValue();
			}

			//获取已报名人数
			int   regeterNum = traiPlayMapper.selectRegertTrainNum(paramMap);
			System.out.print("==============================the num is "+cunmum  +"===study num is "+regeterNum+"=========\n");

			if(regeterNum<cunmum)
			{
				registerMapper.insertSelective(register);
				result.getBody().put("isRegeter","0");
			}
			else
			{
			   result.getBody().put("isRegeter","1");
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
     * 判断用户是否签到
     * @param bean
     * @return
     */
    public JSONResult selectTrainSignStatus(TraiSignBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TTraiSignExample example = new TTraiSignExample();
			example.createCriteria().andSignidEqualTo(bean.getSignid()).andCourseidEqualTo(bean.getCourseid());
			List<TTraiSign> list = traiSignMapper.selectByExample(example);
			if(list.size()>0){
				result.getBody().put("isSign", true);
			}else{
				result.getBody().put("isSign", false);
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
     * 判断用户是否报名
     * @param bean
     * @return
     */
    public JSONResult selectTrainRegisterStatus(TraiRegisterBean bean) {
    	JSONResult result = JSONResult.getSuccess();
    	try {
    		TTraiRegisterExample example = new TTraiRegisterExample();
    		example.createCriteria().andEmployeeidEqualTo(bean.getEmployeeid()).andIdEqualTo(bean.getId());
    		List<TTraiRegister> list = registerMapper.selectByExample(example);
    		if(list.size()>0){
				result.getBody().put("isRegister", true);
			}else{
				result.getBody().put("isRegister", false);
			}

			result.getBody().put("register",list.isEmpty()?null:list.get(0));

    		TTraiRegisterExample example2 = new TTraiRegisterExample();
    		example2.createCriteria().andEmployeeidEqualTo(bean.getEmployeeid()).andIdEqualTo(bean.getId()).andEvaluatestatusEqualTo("1");
    		List<TTraiRegister> list2 = registerMapper.selectByExample(example2);
    		if(list2.size()>0){
				result.getBody().put("isComment", true);
			}else{
				result.getBody().put("isComment", false);
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
     * 撤销报名
     * @param bean
     * @return
     */
    public JSONResult updateChangeRegister(TraiRegisterBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TTraiRegister register = registerMapper.selectByPrimaryKey(bean.getRegisterid());
			if(StringUtils.equals(register.getRegistertype(),"2")){//省行报名
				if(StringUtils.equals(register.getRegisterstatus(), "1") && StringUtils.equals(register.getApprovetype(),"2")){
					registerMapper.deleteByPrimaryKey(bean.getRegisterid());
				}else{
					result = JSONResult.getFail("无法取消报名");
				}
			}else{
				if(StringUtils.equals(register.getRegisterstatus(), "1") && StringUtils.equals(register.getApprovetype(),"1")){
					registerMapper.deleteByPrimaryKey(bean.getRegisterid());
				}else{
					result = JSONResult.getFail("无法取消报名");
				}
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
     * 评论
     * @param bean
     * @return
     */
    public JSONResult saveTrainComment(TraiEvaluateBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			for (TraiEvaluateBean evaluateBean : bean.getTeachers()) {
				TTraiEvaluate evaluate = new TTraiEvaluate();
				BeanUtils.copyProperties(evaluate, bean);
				evaluate.setEvaluateid(UUIDGeneratorUtil.generate());
				evaluate.setTeacherid(evaluateBean.getTeacherid());
				evaluate.setTeachname(evaluateBean.getTeachname());
				evaluate.setScore(evaluateBean.getScore());
				evaluate.setEvaluatecontent(evaluateBean.getEvaluatecontent());
				evaluate.setPlanId(evaluateBean.getPlanId());
				traiEvaluateMapper.insertSelective(evaluate);
			}
			TTraiRegisterExample example = new TTraiRegisterExample();
			example.createCriteria().andIdEqualTo(bean.getId()).andEmployeeidEqualTo(bean.getEmployeeid());
			List<TTraiRegister> list = registerMapper.selectByExample(example);
			for (TTraiRegister tTraiRegister : list) {
				TTraiRegister register = new TTraiRegister();
				register.setRegisterid(tTraiRegister.getRegisterid());
				register.setEvaluatestatus("1");
				registerMapper.updateByPrimaryKeySelective(register);
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
     * 判断是否可以签到
     * @param bean
     * @return
     */
    public JSONResult selectUserIsSign(TraiSignBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TTraiRegisterExample example = new TTraiRegisterExample();
    		example.createCriteria().andEmployeeidEqualTo(bean.getEmployeeid()).andIdEqualTo(bean.getId());
    		List<TTraiRegister> list = registerMapper.selectByExample(example);
    		if(list.size()==0){
    			result = JSONResult.getFail("未报名,无法签到");
    		}else{
    			TTraiRegister register = list.get(0);
    			TTraiPlay traiPlay = traiPlayMapper.selectByPrimaryKey(bean.getCourseid());
    			Date d1 = DateUtil.StringToDate(traiPlay.getEndtime(), "yyyy-MM-dd HH:mm");
    			Date d2 = DateUtil.StringToDate(DateUtil.defaultFormat(new Date(),"yyyy-MM-dd HH:mm"),"yyyy-MM-dd HH:mm");

    			if(d2.getTime() > d1.getTime()){
    				result = JSONResult.getFail("可节已结束,无法签到");
    			}else{
    				if(!StringUtils.equals(register.getRegisterstatus(), "2")){
    					result = JSONResult.getFail("报名审核未通过,无法签到");
    				}
    			}
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
}
