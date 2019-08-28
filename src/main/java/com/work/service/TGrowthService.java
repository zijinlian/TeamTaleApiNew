package com.work.service;

import java.util.*;

import javax.annotation.Resource;

import net.sf.json.JSONException;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.work.bean.GaResumeBean;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.entity.TEmpSource;
import com.work.entity.TEmpSourceExample;
import com.work.entity.TGaGrouphonor;
import com.work.entity.TGaGrouphonorExample;
import com.work.entity.TGaPerformance;
import com.work.entity.TGaPerformanceExample;
import com.work.entity.TGaPerhonor;
import com.work.entity.TGaPerhonorExample;
import com.work.entity.TGaResume;
import com.work.entity.TGaResumeExample;
import com.work.entity.TGaStudy;
import com.work.entity.TGaStudyExample;
import com.work.entity.TmpPepmgmEmpInfo;
import com.work.entity.TmpPepmgmEmpInfoExample;
import com.work.mapper.TBankCircleMapper;
import com.work.mapper.TEmpSourceMapper;
import com.work.mapper.TGaDiplomaMapper;
import com.work.mapper.TGaGrouphonorMapper;
import com.work.mapper.TGaPerformanceMapper;
import com.work.mapper.TGaPerhonorMapper;
import com.work.mapper.TGaResumeMapper;
import com.work.mapper.TGaSkillMapper;
import com.work.mapper.TGaStudyMapper;
import com.work.mapper.TTeacherCountMapper;
import com.work.mapper.TmpPepmgmEmpInfoMapper;

@Service
public class TGrowthService {

	@Resource
	private TGaResumeMapper resumeMapper;
	
	@Resource
	private TGaPerhonorMapper perhonorMapper;
	
	@Resource
	private TGaPerformanceMapper performanceMapper;
	
	@Resource
	private TGaSkillMapper skillMapper;
	
	@Resource
	private TGaDiplomaMapper gaDiplomaMapper;
	
	@Resource
	private TGaStudyMapper gaStudyMapper;
	
	@Resource
	private TBankCircleMapper bankCircleMapper;
	
	@Resource
	private TTeacherCountMapper teacherCountMapper;
	
	@Resource
	private TmpPepmgmEmpInfoMapper empInfoMapper;
	
	@Resource
	private TGaGrouphonorMapper grouphonorMapper;
	
	@Resource
	private TEmpSourceMapper empSourceMapper;
	
	/**
	 * 成长曲线
	 * @param bean
	 * @return
	 */
	public JSONResult selectEmpCurve(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			boolean isM = BooleanUtils.toBoolean(bankCircleMapper.selectUserIsOrgManager(bean.getEmpid()));
			List<Map<String,Object>> list = empInfoMapper.selectEmpCurve(bean);
			result.getBody().put("list", list);
			//返回状态判断是否是省行领导
			result.getBody().put("isM", isM);
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
	 * 个人简介
	 * @param bean
	 * @return
	 */
	public JSONResult selectInfo(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TmpPepmgmEmpInfoExample empInfoExample = new TmpPepmgmEmpInfoExample();
			empInfoExample.createCriteria().andFdEmpidEqualTo(bean.getEmpid());
			List<TmpPepmgmEmpInfo> listEmpInfos = empInfoMapper.selectByExample(empInfoExample);
			if(CollectionUtils.isEmpty(listEmpInfos)){
				result = JSONResult.getFail("用户数据不存在");
			}else{
				TmpPepmgmEmpInfo empInfo = listEmpInfos.get(0);
				result.getBody().put("empInfo", empInfo);
				TGaResumeExample resumeExample = new TGaResumeExample();
				resumeExample.setOrderByClause("INPUTDATE DESC");
				resumeExample.createCriteria().andEmpidEqualTo(bean.getEmpid());
				List<TGaResume> listGaResumes = resumeMapper.selectByExample(resumeExample);
				result.getBody().put("listGaResumes", listGaResumes);
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
	 * 个人荣誉
	 * @param bean
	 * @return
	 */
	public JSONResult selectUserHonor(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TGaPerhonorExample example = new TGaPerhonorExample();
			example.createCriteria().andEmpidEqualTo(bean.getEmpid());
			PageHelper.startPage(bean.getPage(), bean.getPageSize(),"INPUTDATE DESC");
			List<TGaPerhonor> list = perhonorMapper.selectByExample(example);
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
	 * 集体荣誉
	 * @param bean
	 * @return
	 */
	public JSONResult selectEmpGrouphonor(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TGaGrouphonorExample example = new TGaGrouphonorExample();
			example.createCriteria().andEmpidEqualTo(bean.getEmpid());
			List<TGaGrouphonor> list = grouphonorMapper.selectByExample(example);
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
	 * 绩效考核
	 * @param bean
	 * @return
	 */
	public JSONResult selectPerformance(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TGaPerformanceExample example = new TGaPerformanceExample();
			example.createCriteria().andEmpidEqualTo(bean.getEmpid());
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<TGaPerformance> list = performanceMapper.selectByExample(example);
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
	 * 考勤
	 * @param bean
	 * @return
	 */
	public JSONResult selectAttendance(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			List<Map<String,Object>> list = empInfoMapper.selectEmpAttendance(bean);
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
	 * 技能测评
	 * @param bean
	 * @return
	 */
	public JSONResult selectSkills(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {

			List<Map<String,Object>> list = skillMapper.selectSkillByEmpid(bean);
			result.getBody().put("list", list);
			/*TGaSkillExample  example =new TGaSkillExample();
			example.createCriteria().andEmpidEqualTo(bean.getEmpid());
			PageHelper.startPage(bean.getPage(), bean.getPageSize(),"INPUTDATE DESC");
			List<TGaSkill> list = skillMapper.selectByExample(example);
			result.getBody().put("list", list);*/

		/*	PageHelper.startPage(bean.getPage(), bean.getPageSize(),"SKILLLEVEL desc");
			List<Map<String, Object>> list = skillMapper.selectSkillByEmpid(bean.getEmpid());
			result.getBody().put("list", list);*/
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
	 * 资格证书
	 * @param bean
	 * @return
	 */
	public JSONResult selectCertificate(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			/*TGaDiplomaExample example = new TGaDiplomaExample();
			example.createCriteria().andEmpidEqualTo(bean.getEmpid());
			PageHelper.startPage(bean.getPage(), bean.getPageSize());*/
			bean.setDiplomasource("01");
			List<Map<String,Object>> list_01 = gaDiplomaMapper.selectGaDipLomaByEmpId(bean);
			result.getBody().put("list_01", list_01);
			
			bean.setDiplomasource("02");
			List<Map<String,Object>> list_02 = gaDiplomaMapper.selectGaDipLomaByEmpId(bean);
			result.getBody().put("list_02", list_02);
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
	 * 教育培训-师资
	 * @param bean
	 * @return
	 */
	public JSONResult selectTrainTeachers(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
//			TGaStudyExample studyExample = new TGaStudyExample();
//			studyExample.createCriteria().andEmpidEqualTo(bean.getEmpid());
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			//List<TGaStudy> list = gaStudyMapper.selectByExample(studyExample);
//			List<Map<String,Object>> listDatas = new ArrayList<>();
			List<Map<String,Object>> listInDatas = gaStudyMapper.selectStudyBank(bean);
			List<Map<String,Object>> listOutData = gaStudyMapper.selectStudyBySubBank(bean);
			result.getBody().put("list_in",listInDatas);
			result.getBody().put("list_out",listOutData);
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
	 * 查询架构用户
	 * @param bean
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public JSONResult selectOrgEmpList(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			//判断是否是省行副行长及以上的人
			boolean isM = BooleanUtils.toBoolean(bankCircleMapper.selectUserIsOrgManager(bean.getEmpid()));
			List<Map<String,Object>> list = Lists.newArrayList();
			List<Map<String,Object>> list2 = Lists.newArrayList();
			Map<String, String> map = Maps.newHashMap();
			if(StringUtils.isEmpty(bean.getCode())&&StringUtils.isEmpty(bean.getCode2())){
				map.put("empid", bean.getEmpid());
				map.put("code", "A0007");
				list = empInfoMapper.selectGrowEmpListByEmpId(map);
				list2 = empInfoMapper.selectGrowEmpListByEmpId2(map);
				list = ListUtils.sum(list, list2);
			}else{
				if(isM){//省行
					map.put("code", bean.getCode());
					list = empInfoMapper.selectGrowEmpList(map);
				}else{//二级行
					map.put("code", bean.getCode2());
					list = empInfoMapper.selectGrowEmpList(map);
				}
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
	 * 根据机构号查询员工列表
	 * @param bean
	 * @return
	 */
	public JSONResult selectEmpListByOrgCode(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			List<Map<String, Object>> list = Lists.newArrayList();
			Map<String, String> map = Maps.newHashMap();
			if(StringUtils.isNotEmpty(bean.getCode())){
				List<String> lables = Arrays.asList(StringUtils.split(bean.getCode(),","));
				List<String> b = Lists.newArrayList();
				for (String string : lables) {
					b.add("'"+string+"'"); 
				}
				if(CollectionUtils.isNotEmpty(b)){
					String sql = StringUtils.join(b,",");
					map.put("sql", sql);
					list = empInfoMapper.selectEmpListByOrgCode(map);
				}
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
	 * 雷达图
	 * @param bean
	 * @return
	 */
	public JSONResult selectEmpSource(GaResumeBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			
			TEmpSourceExample empSourceExample = new TEmpSourceExample();
			empSourceExample.setOrderByClause("UPDATEDATE DESC");
			empSourceExample.createCriteria().andEmpidEqualTo(bean.getEmpid());
			List<TEmpSource> list = empSourceMapper.selectByExample(empSourceExample);
			TEmpSource empSource = new TEmpSource();
			if(CollectionUtils.isNotEmpty(list)){
				empSource = list.get(0);
			}
			result.getBody().put("empSource", empSource);
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
