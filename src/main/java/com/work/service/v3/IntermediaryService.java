package com.work.service.v3;

import com.github.pagehelper.PageHelper;
import com.work.api.v3.miai.*;
import com.work.api.v3.miai.vo.DatingQueryListVo;
import com.work.api.v3.miai.vo.TbUserIntermediaryInfoVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.UUIDGeneratorUtil;
import com.work.entity.AppLoginUser;
import com.work.entity.TbUserCommonFiles;
import com.work.entity.TbUserCommonFilesExample;
import com.work.entity.dating.*;
import com.work.mapper.TbUserCommonFilesMapper;
import com.work.mapper.dating.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lx on 2017/5/4.
 */
@Service("intermediaryService")
public class IntermediaryService extends BaseRequester {
    /**
     * 红娘mapper
     */
    @Resource
    private TbUserMarryStandardMapper userMarryStandardMapper;

    @Resource
    private TbUserDatingPublicMapper userDatingPublicMapper;

    /**
     * 求助用户和红娘关联mapper
     */
    @Resource
    private TBUserRelationIntermediayMapper userRelationIntermediayMapper;

    @Resource
    private TBUserIntermediaryRecommendMapper intermediaryRecommendMapper;

    @Resource
    private TBUserIntermediaryInfoMapper intermediaryInfoMapper;

    @Resource
    private TBUserDatingInfoMapper userDatingInfoMapper;

    @Resource
    private TbUserCommonFilesMapper userCommonFilesMapper;

    @Resource
    private UserService userService;

    @Resource
    private MiaiService miaiService;

    //推荐成功关联表mapper
    @Resource
    private TBUserRecommentSuccessMapper recommentSuccessMapper;

    /**
     * @param req
     * @param res
     * @description 员工之家--红娘列表
     */
    public void getIntermediaryList(RequesterGetIntermediaryListApi.Params req, RequesterGetIntermediaryListApi.Response res) {
        try {
            List<TbUserIntermediaryInfoVo> intermediaryVoList = new ArrayList<>();
            TBUserIntermediaryInfoExample intermediaryInfoExample = new TBUserIntermediaryInfoExample();
            TBUserIntermediaryInfoExample.Criteria criteria = intermediaryInfoExample.createCriteria();
            if (req.userName != null && !"".equals(req.userName)) {
                criteria.andUserNameLike("%" + req.userName + "%");
            }
            if (req.successScale !=null && !"".equals(req.successScale)){
                criteria.andSuccessRateLike("%"+req.successScale+"%");
            }
            PageHelper.startPage(req.page, req.pageSize);
            List<TBUserIntermediaryInfo> intermediaryInfoList = intermediaryInfoMapper.selectByExample(intermediaryInfoExample);
            for (TBUserIntermediaryInfo intermediaryInfo : intermediaryInfoList) {
                //创建一个页面对象
                TbUserIntermediaryInfoVo intermediaryVo = new TbUserIntermediaryInfoVo();
                copy(intermediaryVo, intermediaryInfo);
                AppLoginUser appLoginUser = userService.selectUserById(intermediaryInfo.getUserId());
                if (appLoginUser!=null){
                    intermediaryVo.headIcon = appLoginUser.headimg != null && !appLoginUser.headimg.equals("") ? appLoginUser.headimg : " ";
                    intermediaryVo.userName = appLoginUser.name;
                }
                intermediaryVo.num = "0";
                intermediaryVo.successScale = intermediaryInfo.getSuccessRate()+" ";
                intermediaryVo.grade = " ";
                intermediaryVoList.add(intermediaryVo);

            }
            copy(res.body.list, intermediaryVoList, TbUserIntermediaryInfoVo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * 获得红娘给求助用户推荐的用户列表
     *
     * @param req
     * @param res
     */
    public void getIntermediaryRecommendList(RequesterIntermediaryRecommendListApi.Params req, RequesterIntermediaryRecommendListApi.Response res) {
        try {
            List<DatingQueryListVo> datingQueryListVoList = new ArrayList<>();

            TBUserIntermediaryRecommendExample intermediaryRecommendExample = new TBUserIntermediaryRecommendExample();
            TBUserIntermediaryRecommendExample.Criteria re_criteria = intermediaryRecommendExample.createCriteria();
            PageHelper.startPage(req.page, req.pageSize);
            re_criteria.andDatingInfoIdEqualTo(req.userEmpId);
            re_criteria.andIntermediaryIdEqualTo(req.intermediaryEmpId);

            List<TBUserIntermediaryRecommend> recommendList = intermediaryRecommendMapper.selectByExample(intermediaryRecommendExample);
            for (TBUserIntermediaryRecommend intermediaryRecommend:recommendList){
                String recommendId = intermediaryRecommend.getRecommendUserId();

                TBUserDatingInfoExample userDatingInfoExample = new TBUserDatingInfoExample();
                TBUserDatingInfoExample.Criteria dating_criteria = userDatingInfoExample.createCriteria();
                dating_criteria.andUserIdEqualTo(recommendId);

                List<TBUserDatingInfo> list = userDatingInfoMapper.selectByExample(userDatingInfoExample);
                TBUserDatingInfo userDatingInfo = new TBUserDatingInfo();
                if (list!=null && list.size()>0){
                    userDatingInfo = list.get(0);
                }
//                copy(userDatingInfoVoList,list);
                DatingQueryListVo vo = new DatingQueryListVo();
                AppLoginUser appUser = userService.selectUserById(recommendId);
                vo.empId = recommendId;
                vo.empName = appUser.name!=null&&!appUser.name.equals("")?appUser.name:"";
                vo.deptName = appUser.orgname;
                vo.description = userDatingInfo.getSelfDescription();//自我介绍
                vo.headicon = appUser.headimg!=null && !appUser.headimg.equals("") ? appUser.headimg :"";
                vo.height = miaiService.isPublic("height",recommendId,"1")?userDatingInfo.getHeight():"";
                vo.weight = miaiService.isPublic("weight",recommendId,"1")?userDatingInfo.getWeight():"";
                vo.constellation = userDatingInfo.getConstellation()!=null && !userDatingInfo.getConstellation().equals("")?userDatingInfo.getConstellation():"";
                vo.age = String.valueOf(DateUtil.getAge(DateUtil.StringToDate(appUser.birthday, "yyyy-MM-dd")));

                datingQueryListVoList.add(vo);
            }
            res.body.list = datingQueryListVoList;


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * 获得红娘给求助用户推荐的用户列表(首页调用)
     *
     * @param req
     * @param res
     */
    public void getIntermediaryRecommendIndexList(RequesterIntermediaryRecommendIndexApi.Params req, RequesterIntermediaryRecommendIndexApi.Response res) {
        try {
            List<DatingQueryListVo> datingQueryListVoList = new ArrayList<>();

            TBUserIntermediaryRecommendExample intermediaryRecommendExample = new TBUserIntermediaryRecommendExample();
            TBUserIntermediaryRecommendExample.Criteria re_criteria = intermediaryRecommendExample.createCriteria();
            re_criteria.andDatingInfoIdEqualTo(req.userEmpId);
            PageHelper.startPage(1, 5);
            intermediaryRecommendExample.setOrderByClause("create_time desc");

            List<TBUserIntermediaryRecommend> recommendList = intermediaryRecommendMapper.selectByExample(intermediaryRecommendExample);
            for (TBUserIntermediaryRecommend intermediaryRecommend:recommendList){
                String recommendId = intermediaryRecommend.getRecommendUserId();

                TBUserDatingInfoExample userDatingInfoExample = new TBUserDatingInfoExample();
                TBUserDatingInfoExample.Criteria dating_criteria = userDatingInfoExample.createCriteria();
                dating_criteria.andUserIdEqualTo(recommendId);

                List<TBUserDatingInfo> list = userDatingInfoMapper.selectByExample(userDatingInfoExample);
                TBUserDatingInfo userDatingInfo = new TBUserDatingInfo();
                if (list!=null && list.size()>0){
                    userDatingInfo = list.get(0);
                }
//                copy(userDatingInfoVoList,list);
                DatingQueryListVo vo = new DatingQueryListVo();
                AppLoginUser appUser = userService.selectUserById(recommendId);
                vo.empId = recommendId;
                if(appUser==null){
                    continue;
                }
                vo.empName = appUser.name!=null&&!appUser.name.equals("")?appUser.name:"";
                vo.deptName = appUser.orgname;
                vo.description = userDatingInfo.getSelfDescription();//自我介绍
                vo.headicon = appUser.headimg!=null && !appUser.headimg.equals("") ? appUser.headimg :"";
                vo.height = miaiService.isPublic("height",recommendId,"1")?userDatingInfo.getHeight():"";
                vo.weight = miaiService.isPublic("weight",recommendId,"1")?userDatingInfo.getWeight():"";
                vo.constellation = userDatingInfo.getConstellation()!=null && !userDatingInfo.getConstellation().equals("")?userDatingInfo.getConstellation():"";
                vo.age = String.valueOf(DateUtil.getAge(DateUtil.StringToDate(appUser.birthday, "yyyy-MM-dd")));

                //读取公共图片表
                if (userDatingInfo.getId()!=null){
                    TbUserCommonFilesExample userCommonFilesExample = new TbUserCommonFilesExample();
                    userCommonFilesExample.createCriteria().andFkIdEqualTo(userDatingInfo.getId());
                    List<TbUserCommonFiles> fileList = userCommonFilesMapper.selectByExample(userCommonFilesExample);
                    if (fileList!=null && fileList.size()>0){
                        TbUserCommonFiles commonFile = fileList.get(0);
                        vo.indexlogo =commonFile.getFilePath();
                    }else {
                        vo.indexlogo = "";
                    }
                }else {
                    vo.indexlogo = "";
                }
                datingQueryListVoList.add(vo);
            }
            res.body.list = datingQueryListVoList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * 获得红娘详情
     *
     * @param req
     * @param res
     */
    public void getIntermediaryDetail(RequesterIntermediaryDetailApi.Params req, RequesterIntermediaryDetailApi.Response res) {
        try {
            TbUserIntermediaryInfoVo vo = new TbUserIntermediaryInfoVo();

            TBUserIntermediaryInfo intermediaryInfo = new TBUserIntermediaryInfo();
            //得到红娘表的基本信息
            TBUserIntermediaryInfoExample intermediaryInfoExample = new TBUserIntermediaryInfoExample();
            intermediaryInfoExample.createCriteria().andUserIdEqualTo(req.intermediaryEmpId);
            List<TBUserIntermediaryInfo> intermediaryInfoList = intermediaryInfoMapper.selectByExample(intermediaryInfoExample);
            if (intermediaryInfoList!=null && intermediaryInfoList.size()>0){
                intermediaryInfo = intermediaryInfoList.get(0);
            }

            AppLoginUser appUser = userService.selectUserById(req.intermediaryEmpId);
            vo.headIcon = appUser.headimg!=null?appUser.headimg:"";
            vo.userName = appUser.name;
            vo.age = String.valueOf(DateUtil.getAge(DateUtil.StringToDate(appUser.birthday, "yyyy-MM-dd")));
            vo.selfDescription = intermediaryInfo.getSelfDescription()!=null?intermediaryInfo.getSelfDescription():"";

            //获得求助改红娘的总人数
            TBUserRelationIntermediayExample example = new TBUserRelationIntermediayExample();
            TBUserRelationIntermediayExample.Criteria criteria = example.createCriteria();
            criteria.andIntermediacryIdEqualTo(req.intermediaryEmpId);
            List<TBUserRelationIntermediay> list = userRelationIntermediayMapper.selectByExample(example);
            vo.userCount = list.size()+"";

            //获得该红娘推荐的总人数
            TBUserIntermediaryRecommendExample intermediaryRecommendExample = new TBUserIntermediaryRecommendExample();
            TBUserIntermediaryRecommendExample.Criteria re_criteria = intermediaryRecommendExample.createCriteria();
            re_criteria.andIntermediaryIdEqualTo(req.intermediaryEmpId);
            List<TBUserIntermediaryRecommend> recommendList = intermediaryRecommendMapper.selectByExample(intermediaryRecommendExample);
            vo.recommendCount=recommendList.size()+"";

            //推荐成功的总次数
            TBUserRecommentSuccessExample recommentSuccessExample = new TBUserRecommentSuccessExample();
            TBUserRecommentSuccessExample.Criteria rs_criteria = recommentSuccessExample.createCriteria();
            rs_criteria.andIntermediaryIdEqualTo(req.intermediaryEmpId);
            List<TBUserRecommentSuccess> successList = recommentSuccessMapper.selectByExample(recommentSuccessExample);
            vo.num = successList.size()+"";

            NumberFormat numberFormat = NumberFormat.getInstance();
            String result = numberFormat.format((float) successList.size() / (float) list.size() * 100);
            vo.successScale = result+"%";

            res.body.vo = vo;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--用户是否求助过红娘
     */
    public void updateUserIsAskIntermediary(RequesterUserIsAskIntermediaryApi.Params req, RequesterUserIsAskIntermediaryApi.Response res) {
        try {
            TBUserRelationIntermediayExample example = new TBUserRelationIntermediayExample();
            TBUserRelationIntermediayExample.Criteria criteria = example.createCriteria();
            criteria.andDatingInfoIdEqualTo(req.userEmpId);
            criteria.andIntermediacryIdEqualTo(req.intermediaryEmpId);
            criteria.andStatusEqualTo("1");
            List<TBUserRelationIntermediay> list = userRelationIntermediayMapper.selectByExample(example);

            //如果该用户是否求助过该红娘
            if (list != null && list.size() > 0) {
                res.body.isAsked = true;
            } else {
                res.body.isAsked = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--用户求助红娘
     */
    public void updateUserAskIntermediary(RequesterUserAskIntermediaryApi.Params req, RequesterUserAskIntermediaryApi.Response res) {
        try {
            TBUserRelationIntermediayExample example = new TBUserRelationIntermediayExample();
            TBUserRelationIntermediayExample.Criteria criteria = example.createCriteria();
            criteria.andDatingInfoIdEqualTo(req.userEmpId);
            criteria.andIntermediacryIdEqualTo(req.intermediaryEmpId);
            List<TBUserRelationIntermediay> list = userRelationIntermediayMapper.selectByExample(example);

            //如果该用户曾经求助过该红娘
            if (list != null && list.size() > 0) {
                TBUserRelationIntermediay tbUserRelationIntermediay = list.get(0);
                tbUserRelationIntermediay.setStatus("1");
                tbUserRelationIntermediay.setUpdateTime(DateUtil.formatDate(new Date()));
                userRelationIntermediayMapper.updateByPrimaryKey(tbUserRelationIntermediay);
            } else {
                TBUserRelationIntermediay tbUserRelationIntermediay = new TBUserRelationIntermediay();
                tbUserRelationIntermediay.setId(UUIDGeneratorUtil.generate());
                tbUserRelationIntermediay.setDatingInfoId(req.userEmpId);
                tbUserRelationIntermediay.setIntermediacryId(req.intermediaryEmpId);
                tbUserRelationIntermediay.setStatus("1");
                tbUserRelationIntermediay.setCreateTime(DateUtil.formatDate(new Date()));
                userRelationIntermediayMapper.insert(tbUserRelationIntermediay);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--用户取消求助红娘
     */
    public void updateUserCancleAskIntermediary(RequesterUserCancelAskIntermediaryApi.Params req, RequesterUserCancelAskIntermediaryApi.Response res) {
        try {
            TBUserRelationIntermediayExample example = new TBUserRelationIntermediayExample();
            TBUserRelationIntermediayExample.Criteria criteria = example.createCriteria();
            criteria.andDatingInfoIdEqualTo(req.userEmpId);
            criteria.andIntermediacryIdEqualTo(req.intermediaryEmpId);
            List<TBUserRelationIntermediay> list = userRelationIntermediayMapper.selectByExample(example);

            //如果该用户曾经求助过该红娘
            if (list != null && list.size() > 0) {
                TBUserRelationIntermediay tbUserRelationIntermediay = list.get(0);
                tbUserRelationIntermediay.setStatus("2");
                tbUserRelationIntermediay.setUpdateTime(DateUtil.formatDate(new Date()));
                userRelationIntermediayMapper.updateByPrimaryKey(tbUserRelationIntermediay);
            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

}
