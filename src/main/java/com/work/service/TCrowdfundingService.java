package com.work.service;

import com.github.pagehelper.PageHelper;
import com.work.bean.CrowdBean;
import com.work.bean.DiscussionBean;
import com.work.bean.PraiseBean;
import com.work.common.DateUtil;
import com.work.common.UUIDGeneratorUtil;
import com.work.entity.TCrowdfunding;
import com.work.entity.TDiscussion;
import com.work.entity.TLike;
import com.work.entity.TSysUserinfo;
import com.work.mapper.TCrowdfundingMapper;
import com.work.mapper.TDiscussionMapper;
import com.work.mapper.TLikeMapper;
import com.work.mapper.TSysUserinfoMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public class TCrowdfundingService {
	
	@Resource
	private TCrowdfundingMapper crowdfundingMapper;
	
	@Resource
	private TDiscussionMapper discussionMapper;
	
	@Resource
	private TSysUserinfoMapper userinfoMapper;
	
	@Resource
	private TLikeMapper likeMapper;
	
	@Resource
	private TBankCircleService bankCircleService;
	
	
	
	/**
	 * 查询众筹根据置顶排序
	 * @param bean
	 * @return
	 */
	public List<TCrowdfunding> selectCrowdfundingByStateOrderByTop(CrowdBean bean){
		PageHelper.startPage(bean.getPage(), bean.getPageSize(),"CC.FD_TOP DESC NULLS LAST, CC.FD_STARTTIME DESC NULLS LAST");
		List<TCrowdfunding> alllist = crowdfundingMapper.selectCrowdfundingByTop(bean);
		/*List<TCrowdfunding> toplist = crowdfundingMapper.selectCrowdfundingByTop(bean);
		for (TCrowdfunding tCrowdfunding : toplist) {
			bean.getListIds().add(tCrowdfunding.getFdCfId());
		}
		List<TCrowdfunding> hotlist = crowdfundingMapper.selectCrowdfundingByHot(bean);
		bean.setListIds(new ArrayList<String>());
		List<TCrowdfunding> alllist = ListUtils.sum(toplist, hotlist);*/
		return alllist;
	}
	
	/**
	 * 热门众筹
	 * @param bean
	 * @return
	 */
	public List<TCrowdfunding> selectCrowdfundingByHot(CrowdBean bean){
		PageHelper.startPage(bean.getPage() ,bean.getPageSize());
		List<TCrowdfunding> list = crowdfundingMapper.selectCrowdfundingByHot(bean);
		return list;
	}
	
	/**
	 * 根据ID查询众筹
	 * @param bean
	 * @return
	 */
	public TCrowdfunding selectCrowdById(CrowdBean bean){
		return crowdfundingMapper.selectByPrimaryKey(bean.getFdCfId());
	}


	/**
	 * 根据ID查询众筹带有抽奖
	 * @param bean
	 * @return
	 */
	public TCrowdfunding selectCrowdBycj(CrowdBean bean){
		return crowdfundingMapper.selectCrowdBycj(bean.getFdCfId());
	}

	/**
	 * 根据众筹ID查询评论列表
	 * @param bean
	 * @return
	 */
	public List<TDiscussion> selectListDisByCrowId(CrowdBean bean){
		PageHelper.startPage(bean.getPage(), bean.getPageSize(), "FD_ANSWERTIME DESC");
		return discussionMapper.selectListDisByCrowId(bean);
	}

	public  List<Map<String, Object>>  selectProHibitBean(CrowdBean bean){
		return discussionMapper.selectProhibitBean(bean);
	}
	
	/**
	 * 添加众筹评论
	 */
	public void saveDiscussion(DiscussionBean bean){
		TSysUserinfo userinfo = userinfoMapper.selectByPrimaryKey(bean.getUserid());
		TCrowdfunding crowdfunding = crowdfundingMapper.selectByPrimaryKey(bean.getFdCfId());
		String orgname = crowdfundingMapper.queryUnitnmeByEmpId(bean.getUserid());
		TDiscussion discussion = new TDiscussion();
		discussion.setFdDisId(UUIDGeneratorUtil.generate());
		discussion.setFdEmpid(bean.getUserid());
		discussion.setFdEmpnme(userinfo.getFdName());
		discussion.setFdCfId(bean.getFdCfId());
		//discussion.setFdContent(bean.getContent());
		discussion.setFdContent(bankCircleService.filterComment(bean.getContent()));
		discussion.setFdAnswertime(DateUtil.defaultFormat(new Date(), "yyyy-MM-dd HH:mm"));
		discussion.setFdAcceptState("0");
		discussion.setFdLikeCount("0");
		discussion.setFdOrgnme(orgname);
		discussion.setFdCfThrem(crowdfunding.getFdTheme());
		discussionMapper.insertSelective(discussion);
		//过滤关键字存储过程
		/*Map<String, Object> map = Maps.newHashMap();
		map.put("P_IN_DATA", DateUtil.defaultFormat(new Date(), "yyyyMMdd"));
		discussionMapper.updateCommentContent(map);*/
		
		
		
		
		Integer commentNum = Integer.valueOf(StringUtils.defaultIfEmpty(crowdfunding.getFdDisCount(), "0"));
		TCrowdfunding up_crowdfunding = new TCrowdfunding();
		up_crowdfunding.setFdCfId(bean.getFdCfId());
		up_crowdfunding.setFdDisCount(String.valueOf(commentNum+1));
		up_crowdfunding.setFdTop(null);
		crowdfundingMapper.updateByPrimaryKeySelective(up_crowdfunding);
		
	}
	
	/**
	 * 根据众筹排行榜
	 * @param bean
	 * @return
	 */
	public List<Map<String,String>> selectListDisRankByCrowId(CrowdBean bean){
		PageHelper.startPage(bean.getPage(), bean.getPageSize());
		return discussionMapper.selectCrowRank();
	}
	
	/**
	 * 保存用户赞
	 */
	public void saveLike(TLike like){
		like.setFdLikeId(UUIDGeneratorUtil.generate());
		likeMapper.insert(like);
	}
	
	/**
	 * 判断用户是否已经点赞
	 * @param bean
	 * @return
	 */
	public boolean selectUserIsLike(PraiseBean bean){
		List<TLike> list = likeMapper.selectUserLike(bean);
		if(CollectionUtils.isEmpty(list)){
			return false;
		}else{
			return true;
		}
	}
	
	/**
	 * 评论点赞数+1
	 * @param id
	 */
	public void updateDisLike(String id){
		TDiscussion discussion = discussionMapper.selectByPrimaryKey(id);
		Integer count = Integer.valueOf(StringUtils.defaultIfEmpty(discussion.getFdLikeCount(), "0"));
		discussion.setFdLikeCount(String.valueOf(count+1));
		discussionMapper.updateByPrimaryKeySelective(discussion);
	}
	
	/**
	 * 众筹点赞数+1
	 * @param id
	 */
	public void updateCrowLike(String id){
		TCrowdfunding crowdfunding = crowdfundingMapper.selectByPrimaryKey(id);
		Integer count = Integer.valueOf(StringUtils.defaultIfEmpty(crowdfunding.getFdLikecount(), "0"));
		crowdfunding.setFdLikecount(String.valueOf(count+1));
		crowdfunding.setFdTop(null);
		crowdfundingMapper.updateByPrimaryKeySelective(crowdfunding);
	}

	/**
	 *  众筹评论数
	 * @param bean
	 * @return
	 */
	public int selectDissCount(DiscussionBean bean)
	{
		if(null==bean) return 0;
		return crowdfundingMapper.selectDissCountById(bean);
	}
	
}
