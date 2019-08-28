package com.work.api.v2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.AnswerBean;
import com.work.bean.PapersListBean;
import com.work.bean.QuestionBean;
import com.work.common.ApiRemark;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.common.UUIDGeneratorUtil;
import com.work.entity.TAnswers;
import com.work.entity.TExam;
import com.work.entity.TExamBemeasured;
import com.work.entity.TExamMeasurereal;
import com.work.entity.TExamMiddleleader;
import com.work.entity.TExamPerformace;
import com.work.entity.TQuestion;
import com.work.entity.TbPepmgmEmpinfo;
import com.work.service.TExamService;

/**
 * 测评
 * @author zhoucha
 *
 */

@RestController
@RequestMapping("app/v2/exam")
public class ExamController {
	
	@Resource
	private TExamService examService;

	/**
	 * 测评试卷列表
	 * @return
	 */
	@RequestMapping("listExam")
	@ResponseBody
	@ApiRemark("测评试卷列表")
	public JSONResult selectUserExam(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		PapersListBean requestBean = JsonUtil.toBean(req_params, PapersListBean.class);
		try {
			List<TExam> list = examService.selectListUserExams(requestBean);
			result.getBody().put("list", list);
			result.getBody().put("total", list.size());
			int complete = 0;//已测评数
			for (TExam exam : list) {
				if("1".equals(exam.getExamStatus())){
					complete++;
				}
			}
			result.getBody().put("complete", complete);
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	
	/**
	 * 试卷试题列表
	 * //1,选人用人_人才选拔任用工作民主评议表
	 * @return
	 */
	@RequestMapping("examQuestions1")
	@ResponseBody
	@ApiRemark("1:选人用人_人才选拔任用工作民主评议表")
	public JSONResult examQuestions_1(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
				result.getBody().put("list", list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	/**
	 * 试卷试题列表
	 * 2, 选人用人_新选拔任用人员民主评议表
	 * @return
	 */
	@RequestMapping("examQuestions2")
	@ResponseBody
	public JSONResult examQuestions_2(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
				result.getBody().put("questions", list);
				
				List<TExamBemeasured> bemeasuredList = examService.queryExamBemeasuredUsers(requestBean.getUserid());
				result.getBody().put("list", bemeasuredList);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	/**
	 * 试卷试题列表
	 * 3  年度测评_分行管理员人员测评      |  年度测评_省行部门管理员人员测评
	 * @return
	 */
	@RequestMapping("examQuestions3")
	@ResponseBody
	public JSONResult examQuestions_3(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
				result.getBody().put("questions", list);
				List<TExamPerformace> performaceList= examService.queryExamPerformaceList(requestBean);
				result.getBody().put("list", performaceList);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	/**
	 * 试卷试题列表
	 * //4,年度测评_省行部门中层互评
	 * @return
	 */
	@RequestMapping("examQuestions4")
	@ResponseBody
	public JSONResult examQuestions_4(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
				result.getBody().put("questions", list);
				
				//年度测谰中层互评  查询被测评人
				List<TExamMiddleleader> middleList = examService.queryMiddleleader();
				result.getBody().put("list", middleList);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	/**
	 * 试卷试题列表
	 * //5,年度测评_省行行领导评价
	 * @return
	 */
	@RequestMapping("examQuestions5")
	@ResponseBody
	public JSONResult examQuestions_5(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
				result.getBody().put("questions", list);
				
				List<TExamMeasurereal> measureList = examService.queryMeasurerealList(requestBean.getUserid());
				result.getBody().put("list", measureList);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	/**
	 * 试卷试题列表
	 * //6,党风廉政_二级分行领导班子落实党风廉政建设责任制及作风建设情况考核
	 * @return
	 */
	@RequestMapping("examQuestions6")
	@ResponseBody
	public JSONResult examQuestions_6(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				String orgnme = examService.queryEmployeeOrgName(requestBean.getUserid());
				result.getBody().put("orgnme", orgnme);
				
				List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
				result.getBody().put("questions", list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	/**
	 * 党风廉政_二级分行领导班子成员评价民主测评表
	 * @param request
	 * @return
	 */
	@RequestMapping("examQuestions7")//党风廉政_二级分行领导班子成员评价民主测评表
	@ResponseBody
	public JSONResult examQuestions_7(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
				result.getBody().put("questions", list);
				
				List<TExamPerformace> performaceList= examService.queryExamPerformaceList(requestBean);
				result.getBody().put("list", performaceList);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	/**
	 * 试卷试题列表
	 * //8, 选人用人_机构主要负责人履行人才选拔任用工作职责情况民主评议表
	 * @return
	 */
	@RequestMapping("examQuestions8")
	@ResponseBody
	public JSONResult examQuestions_8(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		QuestionBean requestBean = JsonUtil.toBean(req_params, QuestionBean.class);
		try {
			if(examService.selectUserisExam(requestBean)){//判断用户是否已经参加过测评
				result = JSONResult.getFail("用户已参加过该测评");
			}else{
				TbPepmgmEmpinfo pepmgmEmpinfo = examService.queryEmpNamebyId(requestBean.getUserid());
				if(pepmgmEmpinfo == null){
					result = JSONResult.getFail("找不到被测评的机构负责人，此测评无效！");
				}else{
					List<TQuestion> list = examService.selectQuestionByPaperId(requestBean.getFdPaperId());
					result.getBody().put("empinfo", pepmgmEmpinfo);
					result.getBody().put("questions", list);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
	
	
	/**
	 * 提交答案
	 * @return
	 */
	@RequestMapping("submitAnswer")
	@ResponseBody
	public JSONResult submitAnswer(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		AnswerBean bean = JsonUtil.toBean(req_params, AnswerBean.class);
		try {
			switch (bean.getModelType()) {
				case "1":
				case "6":{
					Map<String, Object> map_1 = new HashMap<String, Object>();
					map_1.put("answers", TAnswers.class);
					AnswerBean requestBean = JsonUtil.toBean(req_params, AnswerBean.class,map_1);//[{examId ,paperId ,questionId answer}] 
					if(CollectionUtils.isEmpty(requestBean.getAnswers())){
						result = JSONResult.getFail("请填写测评数据");
						break;
					}
					
					String orgcode =  examService.queryOrgCodeByEmpId(requestBean.getUserid());
					for(TAnswers ans : requestBean.getAnswers()){
					    ans.setAnswerId(UUIDGeneratorUtil.generate());
					    ans.setExamNum(bean.getUserid());
					    ans.setExamTarget(orgcode);
					}
					examService.addAnswerList(requestBean);//提交答案及修改状态
					break;
				}
				case "2":
				case "3":
				case "4":
				case "5":
				{
					Map<String, Object> map_2 = new HashMap<String, Object>();
					map_2.put("answers", TAnswers.class);
					AnswerBean requestBean = JsonUtil.toBean(req_params, AnswerBean.class,map_2);//[examid,paperid,examTarget,answer,questionId]
					if(CollectionUtils.isEmpty(requestBean.getAnswers())){
						result = JSONResult.getFail("请填写测评数据");
						break;
					}
 					
 					List<TQuestion> listQuestions = examService.selectQuestionByPaperId(requestBean.getPaperId());
					if(listQuestions == null || listQuestions.size() == 0){
						result = JSONResult.getFail("试题不存在,请联系管理员");
						break;
					}else{
						String questId = listQuestions.get(0).getQuestionId();
						for(TAnswers answers : requestBean.getAnswers()){
							answers.setAnswerId(UUIDGeneratorUtil.generate());
							answers.setExamNum(bean.getUserid());
							answers.setQuestionId(questId);
						}
						examService.addAnswerList(requestBean);//提交答案及修改状态
					}
					
					break;
				}
				case "7":{
					Map<String, Object> map_2 = new HashMap<String, Object>();
					map_2.put("answers", TAnswers.class);
					AnswerBean requestBean = JsonUtil.toBean(req_params, AnswerBean.class,map_2);//[examid,paperid,examTarget,answer,questionId]
					if(CollectionUtils.isEmpty(requestBean.getAnswers())){
						result = JSONResult.getFail("请填写测评数据");
						break;
					}
					for(TAnswers answers : requestBean.getAnswers()){
						answers.setAnswerId(UUIDGeneratorUtil.generate());
						answers.setExamNum(bean.getUserid());
					}
					examService.addAnswerList(requestBean);//提交答案及修改状态
					break;
				}
				case "8":{
					Map<String, Object> map_8 = new HashMap<String, Object>();
					map_8.put("answers", TAnswers.class);
					AnswerBean requestBean = JsonUtil.toBean(req_params, AnswerBean.class,map_8); //[examId,paperId,questionId,answer]
					if(CollectionUtils.isEmpty(requestBean.getAnswers())){
						result = JSONResult.getFail("请填写测评数据");
						break;
					}
					TbPepmgmEmpinfo pepmgmEmpinfo = examService.queryEmpNamebyId(requestBean.getUserid());
					for(TAnswers ans:requestBean.getAnswers()){
						ans.setAnswerId(UUIDGeneratorUtil.generate());
					    ans.setExamNum(requestBean.getUserid());
					    if(pepmgmEmpinfo != null){
					    	ans.setExamTarget(pepmgmEmpinfo.getFdEmpid());
					    }else{
					    	ans.setExamTarget("");
					    }
					}
					examService.addAnswerList(requestBean);//提交答案及修改状态
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
	
}
