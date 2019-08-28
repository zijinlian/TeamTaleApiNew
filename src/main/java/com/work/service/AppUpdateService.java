package com.work.service;

import java.util.Date;

import javax.annotation.Resource;

import net.sf.json.JSONException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.work.bean.VersionUpdateBean;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.JSONResult;
import com.work.entity.TAppUpdate;
import com.work.mapper.TAppUpdateMapper;

@Service
public class AppUpdateService {
	
	@Resource
	private TAppUpdateMapper appUpdateMapper;
	
	public JSONResult selectAppIsUpdate(VersionUpdateBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TAppUpdate appUpdate = appUpdateMapper.selectByPrimaryKey("bank");
			String[] dbVersion = StringUtils.split(appUpdate.getAndroidVersion(),".");
			if(StringUtils.equals("android", bean.getPhoneType())){
				String[] appVersion = StringUtils.split(bean.getVersion(),".");
				if(appVersion.length != dbVersion.length){
					result = JSONResult.getFail(Constants.PARAM_ERROR, "版本号错误");
				}else{
					if(StringUtils.equals(bean.getVersion(), appUpdate.getAndroidVersion())){//判断是否与数据库版本相同
						result.getBody().put("isUpdate", false);
					}else{
						result.getBody().put("isUpdate", true);
					}
					for (int i = 0; i < appVersion.length; i++) {
						String appv = appVersion[i];
						String dbv = dbVersion[i];
						if(!StringUtils.equals(appv, dbv) && i != appVersion.length - 1){//判断是否需要强制更新
							result.getBody().put("isMandatoryUpdate",true);
							break;
						}else{
							result.getBody().put("isMandatoryUpdate",false);
						}
					}
					result.getBody().put("update", appUpdate);
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
	 * 上传APP文件
	 * @param bean
	 * @return
	 */
	public JSONResult saveUploadApp(VersionUpdateBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			//String appUrl = HttpUploadFile.uploadToImageServer(file);
			TAppUpdate appUpdate = new TAppUpdate();
			appUpdate.setId("bank");
			if(StringUtils.equals("android", bean.getPhoneType())){
				appUpdate.setAndroidUrl(bean.getAndroidUrl());
				appUpdate.setAndroidContent(bean.getAndroidContent());
				appUpdate.setAndroidDateTime(DateUtil.defaultFormat(new Date()));
				appUpdate.setAndroidVersion(bean.getAndroidVersion());
			}else{
				appUpdate.setIosUrl(bean.getIosUrl());
				appUpdate.setIosContent(bean.getIosContent());
				appUpdate.setIosDateTime(DateUtil.defaultFormat(new Date()));
				appUpdate.setIosVersion(bean.getIosVersion());
			}
			appUpdateMapper.updateByPrimaryKeySelective(appUpdate);
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
