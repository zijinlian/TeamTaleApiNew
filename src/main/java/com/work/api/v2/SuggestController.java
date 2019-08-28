package com.work.api.v2;

import cn.autually.base.Http;
import cn.autually.base.StringTookit;
import com.work.bean.SuggestBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.entity.THotSuggest;
import com.work.entity.TSugRepl;
import com.work.service.TSuggestService;
import net.sf.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by System_User on 2016/12/29.
 * 众筹力量(众筹,建议)
 */
@RestController
@RequestMapping("app/v2/suggest")
public class SuggestController {
    @Resource
    private TSuggestService suggestService;
    /**
     * 根据用户查询我的建议列表
     * @param request
     * @return
     */
    @RequestMapping(value = "listMySuggest")
    @ResponseBody
    @ApiRemark("根据用户查询我的建议列表")
    public JSONResult listMySuggest(HttpServletRequest request) {

        JSONResult result = JSONResult.getSuccess();
        try {
            Object req_params = (Object) request.getAttribute("req_params");
            SuggestBean bean = JsonUtil.toBean(req_params, SuggestBean.class);
            List<Map<String, Object>> listData=suggestService.getMySuggest(bean);
            ClobToString(listData);
            result.getBody().put("my_suggest",listData);
        }
        catch (JSONException je) {
            je.printStackTrace();
            result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
        return result;
    }


    /**
     * 根据其它人的建议列表
     * @param request
     * @return
     */
    @RequestMapping(value = "listOtherSuggest")
    @ResponseBody
    @ApiRemark("根据其它人的建议列表")
    public JSONResult listOtherSuggest(HttpServletRequest request) {

        JSONResult result = JSONResult.getSuccess();
        try {
            Object req_params = request.getAttribute("req_params");
            SuggestBean bean = JsonUtil.toBean(req_params, SuggestBean.class);
            List<Map<String,Object>> listData = suggestService.getOtherSuggest(bean);
            //把clob类型的字段转换成String
            ClobToString(listData);
            result.getBody().put("my_suggest",listData);
        }
        catch (JSONException je) {
            je.printStackTrace();
            result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
        return result;
    }

    public void ClobToString(List<Map<String,Object>> listData){
        //把clob类型的字段转换成String
        for(Map<String, Object> data:listData){
            for(String key:data.keySet()){
                if(data.get(key) instanceof Clob){
                    Clob clob  = (Clob) data.get(key);
                    try {
                        data.put(key, clob.getSubString((long)1,(int)clob.length()));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    /**
     * 建议之星
     * @param request
     * @return
     */
    @RequestMapping(value = "suggestStars")
    @ResponseBody
    @ApiRemark("建议之星")
    public JSONResult suggestStars(HttpServletRequest request) {

        JSONResult result = JSONResult.getSuccess();
        try {
            Object req_params = request.getAttribute("req_params");
            SuggestBean bean = JsonUtil.toBean(req_params, SuggestBean.class);
            List<Map<String,Object>> listData=suggestService.suggestStart(bean);
            ClobToString(listData);
            result.getBody().put("suggeststart",listData);
        }
        catch (JSONException je) {
            je.printStackTrace();
            result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
        return result;
    }


    /**
     * 热门建议
     * @param request
     * @return
     */
    @RequestMapping(value = "hotSuggest")
    @ResponseBody
    @ApiRemark("热门建议")
    public JSONResult hotSuggest(HttpServletRequest request) {

        JSONResult result = JSONResult.getSuccess();
        try {
            Object req_params = request.getAttribute("req_params");
            SuggestBean bean = JsonUtil.toBean(req_params, SuggestBean.class);
            List<THotSuggest> listData = suggestService.gethotSugget(bean);
            result.getBody().put("hotSuggest",listData);
         }
        catch (JSONException je) {
            je.printStackTrace();
            result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
        }
        return result;
    }
    
    /**
	 * 建议详情
	 * @param request
	 * @return
	 */
	@RequestMapping("sugDetail")
	@ResponseBody
	@ApiRemark("建议详情")
	public JSONResult sugDetail(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			SuggestBean bean = JsonUtil.toBean(req_params, SuggestBean.class);
			return suggestService.selectDeail(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 添加评论点赞
	 * @param request
	 * @return
	 */
	@RequestMapping("addCommentOrDiss")
	@ResponseBody
	@ApiRemark("添加评论点赞")
	public JSONResult addCommentOrDiss(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			TSugRepl bean = JsonUtil.toBean(req_params, TSugRepl.class);
			return suggestService.saveCommentDiss(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}


    public static void main(String[] args) {
        Http h = new Http("http://localhost:8080/TeamTaleApi/app/v2/suggest/listOtherSuggest", Http.POST);
        h.addParam("params", "{\"empid\":\"1818306\",\"fdApproOrg\":\"\",\"fdTitle\":\"\",\"orgId\":\"00007\",\"page\":\"2\",\"pageSize\":\"10\"}");
        System.out.println(StringTookit.JSONStringFormat(h.execute()));
    }
}
