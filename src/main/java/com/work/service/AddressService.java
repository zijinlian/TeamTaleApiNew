package com.work.service;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.work.bean.AddressBean;
import com.work.bean.OaApplyInfoFeebackBean;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.entity.TSysUserinfo;
import com.work.entity.TbOaApplyInfoFeeback;
import com.work.entity.TbPepmgmEmpinfo;
import com.work.entity.TbPepmgmEmpinfoExample;
import com.work.mapper.TSysUserinfoMapper;
import com.work.mapper.TbOaApplyInfoFeebackMapper;
import com.work.mapper.TbPepmgmEmpinfoMapper;


@Service
public class AddressService {
	
	@Resource
	private TbPepmgmEmpinfoMapper pepmgmEmpinfoMapper;
	
	@Resource
	private TbOaApplyInfoFeebackMapper applyInfoFeebackMapper;
	
	@Resource
	private TSysUserinfoMapper sysUserinfoMapper;
	
	public JSONResult selectAddressByEmpName(AddressBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(), bean.getPageSize());
			TbPepmgmEmpinfoExample empinfoExample = new TbPepmgmEmpinfoExample();
			empinfoExample.createCriteria().andFdEmpnmeLike("%"+bean.getEmpName()+"%");
			List<TbPepmgmEmpinfo> list = pepmgmEmpinfoMapper.selectByExample(empinfoExample);
			for (TbPepmgmEmpinfo tbPepmgmEmpinfo : list) {
				TSysUserinfo sysUserinfo = sysUserinfoMapper.selectByPrimaryKey(tbPepmgmEmpinfo.getFdEmpid());
				tbPepmgmEmpinfo.setFdHmphe(sysUserinfo.getFdHmaddr());
				tbPepmgmEmpinfo.setFdBizphe(sysUserinfo.getFdBizphe());
				tbPepmgmEmpinfo.setFdHeadicon(sysUserinfo.getFdHeadicon());
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
	 * 保存活动评价
	 * @param bean
	 * @return
	 */
	public JSONResult saveApplyComment(OaApplyInfoFeebackBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TbOaApplyInfoFeeback applyInfoFeeback = new TbOaApplyInfoFeeback();
			BeanUtils.copyProperties(applyInfoFeeback, bean);
			applyInfoFeebackMapper.insertSelective(applyInfoFeeback);
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
