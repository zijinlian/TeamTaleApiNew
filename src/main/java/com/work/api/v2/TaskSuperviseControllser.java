package com.work.api.v2;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.work.bean.TaskSuperviseBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.entity.TTaskSupervise;
import com.work.service.TTaskSuperviseService;
import com.work.util.AppHttpClient;


/**
 * 任务督办
 *
 * @author zhoucha
 */

@Controller
@RequestMapping("app/v2/supervise")
public class TaskSuperviseControllser {

    @Resource
    private TTaskSuperviseService taskSuperviseService;

    /**任务督办首页
     * @param request
     * @return
     */
    @RequestMapping("superviseIndex")
    @ResponseBody
    @ApiRemark("任务督办首页")
    public JSONResult superviseIndex(HttpServletRequest request) {
        try {
            Object req_params = request.getAttribute("req_params");
            TaskSuperviseBean bean = JsonUtil.toBean(req_params, TaskSuperviseBean.class);
            return taskSuperviseService.selectTaskSuperviseByOrgCode(bean);
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
    }
    
    /**
	 * 任务督办子任务
	 * @param request
	 * @return
	 */
	@RequestMapping("superviseDetail")
	@ResponseBody
	@ApiRemark("任务督办子任务")
	public JSONResult superviseDetail(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TaskSuperviseBean bean = JsonUtil.toBean(req_params, TaskSuperviseBean.class);
			return taskSuperviseService.selectTaskSuperviseByTaskId(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	

	@RequestMapping("addTaskNotice")
    @ResponseBody
    @ApiRemark("任务督办通知")
	public JSONResult addTaskNotice(HttpServletRequest request){
		  try {
	            Object req_params = request.getAttribute("req_params");
	            TaskSuperviseBean bean = JsonUtil.toBean(req_params, TaskSuperviseBean.class);
	            JSONResult result=taskSuperviseService.addTaskNotice(bean);
	            List<TTaskSupervise> supList=taskSuperviseService.queryExecTask(bean.getTaskId());
	            final JSONArray arry=new JSONArray();
	            for(TTaskSupervise supervise:supList){
	            	  JSONObject jsonParam = new JSONObject(); 
	                  jsonParam.put("userid", supervise.getFdEmpidInput());
	                  jsonParam.put("tit", "任务督办通知");
	                  jsonParam.put("conte", supervise.getFdTaskName());
	                  jsonParam.put("msgid", supervise.getTaskId());
	                  jsonParam.put("msgtyp", "10");
	           	      arry.add(jsonParam);
	            } 
	        	new Thread(new Runnable() {
	    			public void run() {
	    				AppHttpClient.postSend(arry);
	    			}
	    		}).start();
	            return result;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
	       }
	}
	
	@RequestMapping("addCommonTaskNotice")
    @ResponseBody
    @ApiRemark("普通任务督办通知")
	public JSONResult addCommonTaskNotice(HttpServletRequest request){
		  try {
	            Object req_params = request.getAttribute("req_params");
	            TaskSuperviseBean bean = JsonUtil.toBean(req_params, TaskSuperviseBean.class);
	            JSONResult result=taskSuperviseService.addCommonTaskNotice(bean);
	            List<TTaskSupervise> supList=taskSuperviseService.queryExecTask(bean.getTaskId());
	            final JSONArray arry=new JSONArray();
	            for(TTaskSupervise supervise:supList){
	            	  JSONObject jsonParam = new JSONObject(); 
	                  jsonParam.put("userid", supervise.getFdResponsible());
	                  jsonParam.put("tit", "任务督办通知");
	                  jsonParam.put("conte", supervise.getFdTaskName());
	                  jsonParam.put("msgid", supervise.getTaskId());
	                  jsonParam.put("msgtyp", "10");
	           	      arry.add(jsonParam);
	            } 
	        	new Thread(new Runnable() {
	    			public void run() {
	    				AppHttpClient.postSend(arry);
	    			}
	    		}).start();
	            return result;
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
	       }
	}
	
	
	/**
	 * 特大任务详情
	 * @param request
	 * @return
	 */
	@RequestMapping("bigTaskDetail")
	@ResponseBody
	@ApiRemark("特大任务详情")
	public JSONResult bigTaskDetail(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TaskSuperviseBean bean = JsonUtil.toBean(req_params, TaskSuperviseBean.class);
			return taskSuperviseService.selectBigTaskDetail(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
}
