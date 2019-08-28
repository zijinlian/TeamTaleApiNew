package com.work.service;

import com.google.common.collect.Maps;
import com.work.bean.TaskSuperviseBean;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.JSONResult;
import com.work.common.UUIDGeneratorUtil;
import com.work.entity.TTaskRateFeedback;
import com.work.entity.TTaskRateFeedbackExample;
import com.work.entity.TTaskSupervise;
import com.work.entity.TTaskSuperviseDuty;
import com.work.entity.TTaskSuperviseDutyExample;
import com.work.entity.TTaskSuperviseExample;
import com.work.entity.TaskNotice;
import com.work.mapper.TExamMapper;
import com.work.mapper.TMyStokeMapper;
import com.work.mapper.TTaskRateFeedbackMapper;
import com.work.mapper.TTaskSuperviseDutyMapper;
import com.work.mapper.TTaskSuperviseMapper;
import com.work.mapper.TaskNoticeMapper;

import net.sf.json.JSONException;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TTaskSuperviseService {

    @Resource
    private TTaskSuperviseMapper taskSuperviseMapper;

    @Resource
    private TExamMapper examMapper;
    
    @Resource
    private TaskNoticeMapper taskNoticeMapper;
    
	@Resource
	private TMyStokeMapper stokeMapper;
	
	@Resource
	private TTaskSuperviseDutyMapper taskSuperviseDutyMapper;
	
	@Resource
	private TTaskRateFeedbackMapper taskRateFeedbackMapper;

    /**
     * 根据登录人OrgCode查询督办任务
     * @param bean
     * @return
     */
    public JSONResult selectTaskSuperviseByOrgCode(TaskSuperviseBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            String orgCode = examMapper.queryOrgCodeByEmpId(bean.getEmpId());
            
        	Map<String, Object> managermap = Maps.newHashMap();
        	managermap.put("empid", bean.getEmpId());
        	managermap.put("roles", "'省行行长','省行副行长'");
			int isManager = stokeMapper.selectUserRoleList(managermap);
			List<TTaskSupervise> list=new ArrayList<TTaskSupervise>();
            if(BooleanUtils.toBoolean(isManager)){
            	 Map<String, Object> map = Maps.newHashMap();
                 map.put("orgCode", orgCode);
                 map.put("fdTaskStatus", bean.getStatus());
                 map.put("empId", bean.getEmpId());
                 list = taskSuperviseMapper.selectTaskManger(map);
            }else{
                Map<String, Object> map = Maps.newHashMap();
                map.put("orgCode", orgCode);
                map.put("fdTaskStatus", bean.getStatus());
                map.put("empId", bean.getEmpId());
                list = taskSuperviseMapper.selectTaskSuperviseByOrgCode(map);
            }
    
            result.getBody().put("list",list);
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
     * 根据taskID查询子任务
     * @param bean
     * @return
     */
    public JSONResult selectTaskSuperviseByTaskId(TaskSuperviseBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			//TTaskSuperviseExample example = new TTaskSuperviseExample();
			//example.createCriteria().andParentIdEqualTo(bean.getTaskId());
			//List<TTaskSupervise> list = taskSuperviseMapper.selectByExample(example);
			 Map<String, Object> map = Maps.newHashMap();
		     map.put("taskId", bean.getTaskId());
		     //发布人查询
		     TTaskSupervise ts=taskSuperviseMapper.selectMajorPublish(bean.getTaskId());
		     //牵头人查询
		     TTaskSupervise firstts=taskSuperviseMapper.selectFirstPublish(bean.getTaskId());
		     List<TTaskSupervise> list = taskSuperviseMapper.selectTaskSuperviseByTaskId(map);  
//		     for(int i=0;i<list.size();i++){
//		    	 //发布人查询
//		    	 if("00".equals(list.get(i).getFdTaskType())){
//		    		 //重大任务
//		    		 TTaskSupervise ts=taskSuperviseMapper.selectMajorPublish(list.get(i).getTaskId());
//		    		 list.get(i).setFdEmpidInput(ts.getFdEmpidInput());
//		    		 list.get(i).setFdEmpnmeInpput(ts.getFdEmpnmeInpput());
//		    	 }else{
//		    		 //普通任务
//		    		 TTaskSupervise ts=taskSuperviseMapper.selectMajorPublish(list.get(i).getTaskId());
//		    		 list.get(i).setFdEmpidInput(ts.getFdEmpidInput());
//		    		 list.get(i).setFdEmpnmeInpput(ts.getFdEmpnmeInpput());
//		    	 }
//		     }
			result.getBody().put("list",list);
			result.getBody().put("publishName",ts.getFdEmpnmeInpput());
			if(ts.getFdTaskDept()!=null){
				result.getBody().put("fdTaskDept",ts.getFdTaskDept().replaceAll("辽宁", ""));
			}
			
			if(firstts!=null){
				result.getBody().put("fdFirstName",firstts.getFdEmpnmeInpput());
				result.getBody().put("fdResponsiblename",firstts.getFdResponsiblename());
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

    public JSONResult addTaskNotice(TaskSuperviseBean bean) {
        JSONResult result = JSONResult.getSuccess();
        Map<String, Object> map = Maps.newHashMap();
        map.put("taskId", bean.getTaskId());
        List<TTaskSupervise> list = taskSuperviseMapper.queryExecTask(map);
        if(list!=null&&list.size()>0){
        	TaskNotice taskNotice=new TaskNotice();
        	taskNotice.setId(UUIDGeneratorUtil.generate());
			taskNotice.setTaskId(list.get(0).getTaskId());
			taskNotice.setTaskName(list.get(0).getFdTaskName());
			taskNotice.setTaskEmpId(list.get(0).getFdEmpidInput());
			taskNotice.setTaskEmpName(list.get(0).getFdEmpnmeInpput());
			taskNotice.setTask_type(list.get(0).getFdTaskType());
			taskNotice.setTaskUrl(bean.getTaskUrl());
			taskNotice.setTaskUrlName(bean.getTaskName());
			taskNotice.setStatus("0");
			taskNotice.setCreateTime(DateUtil.formatDate(new Date()));
			taskNoticeMapper.insertNotice(taskNotice);
        }
        return result;
	}
    
	public JSONResult addCommonTaskNotice(TaskSuperviseBean bean) {
        JSONResult result = JSONResult.getSuccess();
        Map<String, Object> map = Maps.newHashMap();
        map.put("taskId", bean.getTaskId());
        List<TTaskSupervise> list = taskSuperviseMapper.queryExecTask(map);
        if(list!=null&&list.size()>0){
    		for(TTaskSupervise supervise:list){
				TaskNotice taskNotice=new TaskNotice();
				taskNotice.setId(UUIDGeneratorUtil.generate());
				taskNotice.setTaskId(supervise.getTaskId());
				taskNotice.setTaskName(supervise.getFdTaskName());
				taskNotice.setTaskEmpId(supervise.getFdResponsible());
				taskNotice.setTaskEmpName(supervise.getFdResponsiblename());
				taskNotice.setTask_type(supervise.getFdTaskType());
				taskNotice.setTaskUrl(bean.getTaskUrl());
				taskNotice.setTaskUrlName(bean.getTaskName());
				taskNotice.setStatus("0");
				taskNotice.setCreateTime(DateUtil.formatDate(new Date()));
				taskNoticeMapper.insertNotice(taskNotice);
			}
        
        }
        return result;
	}
	
	public List<TTaskSupervise> queryExecTask(String taskId){
		Map<String, Object> map = Maps.newHashMap();
        map.put("taskId", taskId);
        List<TTaskSupervise> list = taskSuperviseMapper.queryExecTask(map);
        return list;
	}
	
	/**
	 * 特大任务详情
	 * @param bean
	 * @return
	 */
	public JSONResult selectBigTaskDetail(TaskSuperviseBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TTaskSuperviseExample taskSuperviseExample = new TTaskSuperviseExample();
			taskSuperviseExample.createCriteria().andTaskIdEqualTo(bean.getTaskId());
			List<TTaskSupervise> taskSupervises = taskSuperviseMapper.selectByExample(taskSuperviseExample);
			if(taskSupervises.size()>0){
				result.getBody().put("taskSupervises", taskSupervises.get(0));
				TTaskSuperviseDutyExample superviseDutyExample = new TTaskSuperviseDutyExample();
				superviseDutyExample.createCriteria().andTaskIdEqualTo(bean.getTaskId());
				List<TTaskSuperviseDuty> listDuties = taskSuperviseDutyMapper.selectByExample(superviseDutyExample);
				result.getBody().put("listDuties", listDuties);
				TTaskRateFeedbackExample feedbackExample = new TTaskRateFeedbackExample();
				feedbackExample.createCriteria().andTaskIdEqualTo(bean.getTaskId());
				List<TTaskRateFeedback> listFeedbacks = taskRateFeedbackMapper.selectByExample(feedbackExample);
				result.getBody().put("listFeedbacks", listFeedbacks);
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
