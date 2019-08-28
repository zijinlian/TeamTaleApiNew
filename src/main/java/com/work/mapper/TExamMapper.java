package com.work.mapper;

import com.work.bean.BaseRequestBean;
import com.work.bean.QuestionBean;
import com.work.entity.*;

import java.util.List;
import java.util.Map;


public interface TExamMapper {
	
	List<TExam> queryUserExams(BaseRequestBean bean);
	
	Integer selectUserCountByExamId(QuestionBean bean);
	
	List<TQuestion> selectQuestionByPaperId(String paperId);
	
	List<TExamBemeasured> queryExamBemeasuredByOrgcode(String orgcode);


	/**
	 * 根据员工号查询机构编码
	 * @param userid
	 * @return
	 */
	String queryOrgCodeByEmpId(String userid);

	/**
	 * 根据员工号查询条线编码
	 * @param userid
	 * @return
	 */
	String queryDeptOrgByEmpId(String userid);

	/**
	 * 根据用户ID返回部门信息
	 * @param userid
	 * @return
	 */
	String queryUnitnameByEmpId(String userid);
	
	String queryExamFXFHUserOrgCode(QuestionBean bean);
	
	List<TExamPerformace> queryExamPerformaceList(QuestionBean bean);
	
	List<TExamMiddleleader> queryMiddleleader();
	
	List<TExamMeasurereal> queryMeasurerealList(String userid);
	
	String queryEmployeeOrgName(String userid);
	
	TbPepmgmEmpinfo queryEmpNamebyId(String userid);
	
	void addAnswer(List<TAnswers> list);
	
	void updateExamStatus(Map<String, String> map);
	
}
