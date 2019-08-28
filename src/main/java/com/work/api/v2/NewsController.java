package com.work.api.v2;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.NewsBean;
import com.work.common.ApiRemark;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.entity.TAppDailyNews;
import com.work.service.TAppDailyNewsService;


/**
 * 新闻
 * @author zhoucha
 *
 */
@RestController
@RequestMapping("app/v2/news")
public class NewsController {
	
	@Resource
	private TAppDailyNewsService appDailyNewsService;

	/**
	 * 根据类型查询每日简报列表
	 * 6:他山之石
	 * 7:党建文化
	 * @return
	 */
	@RequestMapping("listNews")
	@ResponseBody
	@ApiRemark("根据类型查询每日简报列表")
	public JSONResult selectUserExam(HttpServletRequest request){
		JSONResult result = JSONResult.getSuccess();
		Object req_params = request.getAttribute("req_params");
		NewsBean requestBean = JsonUtil.toBean(req_params, NewsBean.class);
		try {
			List<TAppDailyNews> list = appDailyNewsService.selectNewsByType(requestBean);
			result.getBody().put("list", list);
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail();
		}
		return result;
	}
}
