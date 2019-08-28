package com.work.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.work.bean.AnswerBean;
import com.work.bean.BaseRequestBean;
import com.work.bean.QuestionBean;
import com.work.entity.TExam;
import com.work.entity.TExamBemeasured;
import com.work.entity.TExamMeasurereal;
import com.work.entity.TExamMiddleleader;
import com.work.entity.TExamPerformace;
import com.work.entity.TQuestion;
import com.work.entity.TbPepmgmEmpinfo;
import com.work.mapper.TExamMapper;

@Service
public class TExamService{
	
	@Resource
	private TExamMapper examMapper;

	/**
	 * 根据用户ID查询试卷列表
	 */
	public List<TExam> selectListUserExams(BaseRequestBean requestBean) throws Exception{
		return examMapper.queryUserExams(requestBean);
	}
	
	/**
	 * 判断用户是否参加过测评  true参加过   false没参加
	 * @param bean
	 * @return
	 */
	public boolean selectUserisExam(QuestionBean bean){
		int count = examMapper.selectUserCountByExamId(bean);
		if(count > 0){//判断用户是否已经参加过测评
			return true;
		}
		return false;
	}
	
	/**
	 * 根据试卷查询考题
	 * @param paperId
	 * @return
	 */
	public List<TQuestion> selectQuestionByPaperId(String paperId){
		return examMapper.selectQuestionByPaperId(paperId);
	}
	
	public String queryOrgCodeByEmpId(String userid){
		return  examMapper.queryOrgCodeByEmpId(userid);
	}
	
	/**
	 * 新选拔任用人员民主评议表的 用户列表
	 * @param userid
	 * @return
	 */
	public List<TExamBemeasured> queryExamBemeasuredUsers(String userid){
		String orgcode = examMapper.queryOrgCodeByEmpId(userid);
		if(StringUtils.isEmpty(orgcode)){
			return null;
		}
		return examMapper.queryExamBemeasuredByOrgcode(orgcode);
	}
	
	/**
	 * 年度测评_分行管理员人员测评      |  年度测评_省行部门管理员人员测评
	 * @param bean
	 * @return
	 */
	public List<TExamPerformace> queryExamPerformaceList(QuestionBean bean){
		String orgcode = examMapper.queryExamFXFHUserOrgCode(bean);
		bean.setOrgCode(orgcode);
		List<TExamPerformace> list = examMapper.queryExamPerformaceList(bean);
		return list;
	}
	
	/**
	 * 年度测评_省行部门中层互评
	 * @return
	 */
	public List<TExamMiddleleader> queryMiddleleader(){
		return examMapper.queryMiddleleader();
	}
	
	/**
	 * 年度测评_省行行领导评价
	 * @param userid
	 * @return
	 */
	public List<TExamMeasurereal> queryMeasurerealList(String userid){
		return examMapper.queryMeasurerealList(userid);
	}
	
	public String queryEmployeeOrgName(String userid){
		return examMapper.queryEmployeeOrgName(userid);
	}
	
	public TbPepmgmEmpinfo queryEmpNamebyId(String userid){
		return examMapper.queryEmpNamebyId(userid);
	}
	
	public void addAnswerList(AnswerBean requestBean) throws Exception {
		examMapper.addAnswer(requestBean.getAnswers());
		Map<String, String> map = Maps.newHashMap();
		map.put("status", "1");
		map.put("userid", requestBean.getUserid());
		map.put("examid", requestBean.getExamId());
		examMapper.updateExamStatus(map);
	}
}
