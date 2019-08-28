package com.work.service.v3;

import com.github.pagehelper.PageHelper;
import com.work.api.v3.activity.*;
import com.work.api.v3.activity.vo.TbUserActivityCommentVo;
import com.work.api.v3.activity.vo.TbUserActivityVo;
import com.work.api.v3.miai.vo.DatingQueryListVo;
import com.work.common.*;
import com.work.entity.AppLoginUser;
import com.work.entity.TbUserCommonFiles;
import com.work.entity.TbUserCommonFilesExample;
import com.work.entity.dating.*;
import com.work.mapper.TbUserCommonFilesMapper;
import com.work.mapper.dating.TBUserActivityCommentMapper;
import com.work.mapper.dating.TBUserActivityMapper;
import com.work.mapper.dating.TBUserDatingInfoMapper;
import com.work.mapper.dating.TBUserRelationActivityMapper;
import com.work.mappercommon.CommonMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lx on 2017/5/4.
 */
@Service("activityService")
public class ActivityService extends BaseRequester {
    @Resource
    private TBUserActivityMapper activityMapper;

    @Resource
    private TBUserRelationActivityMapper userRelationActivityMapper;

    @Resource
    private TBUserDatingInfoMapper userDatingInfoMapper;

    @Resource
    private TBUserActivityCommentMapper activityCommentMapper;

    @Resource
    private CommonMapper commonMapper;

    @Resource
    private UserService userService;

    @Resource
    private TbUserCommonFilesMapper commonFilesMapper;

    /**
     * @param req
     * @param res
     * @description 员工之家--活动列表
     */
    public void getActivityList(RequesterActivityListApi.Params req, RequesterActivityListApi.Response res) {
        try {
            List<TbUserActivityVo> voList = new ArrayList<>();
            PageHelper.startPage(req.page, req.pageSize);
            TBUserActivityExample activityExample = new TBUserActivityExample();
            TBUserActivityExample.Criteria ac_criteria = activityExample.createCriteria();
            List<TBUserActivity> activityList = activityMapper.selectByExampleWithBLOBs(activityExample);

            for (TBUserActivity activity : activityList) {
                AppLoginUser appLoginUser = userService.selectUserById(activity.getCreateUserEmpid());

                TbUserActivityVo vo = new TbUserActivityVo();
                copy(vo, activity);

                // get man count
                String man_sql = getCountSqlBySex(activity.getId(), "1");
                SQLAdapter sqlAdapter = new SQLAdapter(man_sql);
                List<Map<String, Object>> manList = commonMapper.selectCommonSql(sqlAdapter);

                Map manMap = manList.get(0);
                vo.manCount = manMap.get("MANCOUNT") + "";

                //get woman count
                String woman_sql = getCountSqlBySex(activity.getId(), "0");
                sqlAdapter = new SQLAdapter(woman_sql);
                List<Map<String, Object>> womanList = commonMapper.selectCommonSql(sqlAdapter);

                Map womanMap = womanList.get(0);
                vo.womanCount = womanMap.get("MANCOUNT") + "";

                vo.createUser = appLoginUser.name;
                vo.createUserDept = appLoginUser.orgname;

                voList.add(vo);
            }
            res.body.list = voList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * 拼接计算男女参加活动的人数
     *
     * @param activityId 活动id
     * @param sex        0女 1男
     * @return
     */
    private String getCountSqlBySex(String activityId, String sex) {
        String sql = "select count(*) as manCount from TB_USER_DATING_INFO\n" +
                "where USER_ID in (\n" +
                "  select DATING_USER_ID from TB_USER_RELATION_ACTIVITY where ACTIVITY_ID = '" + activityId + "' and sex='" + sex + "' )";
        return sql;
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--活动详情
     */
    public void getActivityDetail(RequesterActivityDetailApi.Params req, RequesterActivityDetailApi.Response res) {
        try {
            TbUserActivityVo vo = new TbUserActivityVo();
            TBUserActivity activity = activityMapper.selectByPrimaryKey(req.activityId);
            AppLoginUser appLoginUser = userService.selectUserById(activity.getCreateUserEmpid());
            copy(vo, activity);

            // get man count
            String man_sql = getCountSqlBySex(activity.getId(), "1");
            SQLAdapter sqlAdapter = new SQLAdapter(man_sql);
            List<Map<String, Object>> manList = commonMapper.selectCommonSql(sqlAdapter);

            Map manMap = manList.get(0);
            vo.manCount = manMap.get("MANCOUNT") + "";

            //get woman count
            String woman_sql = getCountSqlBySex(activity.getId(), "0");
            sqlAdapter = new SQLAdapter(woman_sql);
            List<Map<String, Object>> womanList = commonMapper.selectCommonSql(sqlAdapter);

            Map womanMap = womanList.get(0);
            vo.womanCount = womanMap.get("MANCOUNT") + "";

            vo.allCount = Integer.parseInt(vo.manCount) + Integer.parseInt(vo.womanCount) + "";

            vo.createUser = appLoginUser.name;
            vo.createUserDept = appLoginUser.orgname;
            vo.createUserIcon = appLoginUser.headimg != null && !"".equals(appLoginUser.headimg) ? appLoginUser.headimg : "";

            res.body.vo = vo;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * 用户是否报名过该活动
     *
     * @param req
     * @param res
     */
    public void isSignupActivity(RequesterActivityUserIsSignupApi.Params req, RequesterActivityUserIsSignupApi.Response res) {
        try {
            TBUserRelationActivityExample userRelationActivityExample = new TBUserRelationActivityExample();
            TBUserRelationActivityExample.Criteria criteria = userRelationActivityExample.createCriteria();
            criteria.andActivityIdEqualTo(req.activityId);
            criteria.andDatingUserIdEqualTo(req.empId);

            List<TBUserRelationActivity> list = userRelationActivityMapper.selectByExample(userRelationActivityExample);
            if (list != null && list.size() > 0) {
                res.body.flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * 用户取消报名活动
     *
     * @param req
     * @param res
     */
    public void cancelSignupActivity(RequesterActivityUserCancelSignupApi.Params req, RequesterActivityUserCancelSignupApi.Response res) {
        try {
            TBUserRelationActivityExample userRelationActivityExample = new TBUserRelationActivityExample();
            TBUserRelationActivityExample.Criteria criteria = userRelationActivityExample.createCriteria();
            criteria.andActivityIdEqualTo(req.activityId);
            criteria.andDatingUserIdEqualTo(req.empId);

            List<TBUserRelationActivity> list = userRelationActivityMapper.selectByExample(userRelationActivityExample);
            if (list != null && list.size() > 0) {
                for (TBUserRelationActivity rea : list) {
                    userRelationActivityMapper.deleteByPrimaryKey(rea.getId());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--活动参加人员列表
     */
    public void getActivityUserList(RequesterActivityUserListApi.Params req, RequesterActivityUserListApi.Response res) {
        try {
            List<DatingQueryListVo> datingQueryListVoList = new ArrayList<>();

            String userIdSql = "select DATING_USER_ID as userId from TB_USER_RELATION_ACTIVITY where ACTIVITY_ID = '" + req.activityId + "'";
            SQLAdapter sqlAdapter = new SQLAdapter(userIdSql);
            List<Map<String, Object>> userIdMapList = commonMapper.selectCommonSql(sqlAdapter);
            List<String> userIdList = new ArrayList<>();
            for (Map map : userIdMapList) {
                userIdList.add(map.get("USERID") + "");
            }

            TBUserDatingInfoExample userDatingInfoExample = new TBUserDatingInfoExample();
            TBUserDatingInfoExample.Criteria dating_criteria = userDatingInfoExample.createCriteria();
            if (userIdList.size() > 0) {
                dating_criteria.andUserIdIn(userIdList);

                List<TBUserDatingInfo> list = userDatingInfoMapper.selectByExample(userDatingInfoExample);
                for (TBUserDatingInfo userDatingInfo : list) {
                    DatingQueryListVo vo = new DatingQueryListVo();
                    AppLoginUser appUser = userService.selectUserById(userDatingInfo.getUserId());
                    copy(vo, userDatingInfo);

                    vo.empId = userDatingInfo.getUserId();
                    vo.empName = appUser.name;
                    vo.deptName = appUser.orgname;

                    vo.description = userDatingInfo.getSelfDescription();//自我介绍
                    vo.headicon = appUser.headimg != null & !appUser.headimg.equals("") ? appUser.headimg : "";
                    datingQueryListVoList.add(vo);

                }
                res.body.list = datingQueryListVoList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--用户活动报名
     */
    public void getActivityAddUser(RequesterActivityAddUserApi.Params req, RequesterActivityAddUserApi.Response res) {
        try {
            TBUserRelationActivity userRelationActivity = new TBUserRelationActivity();
            userRelationActivity.setId(UUIDGeneratorUtil.generate());
            userRelationActivity.setActivityId(req.activityId);
            userRelationActivity.setDatingUserId(req.empId);
            userRelationActivity.setCreateTime(DateUtil.formatDate(new Date()));
            userRelationActivityMapper.insert(userRelationActivity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--用户评论活动
     */
    @Transactional
    public void getActivityAddUserComments(RequesterActivityUserCommentApi.Params req, RequesterActivityUserCommentApi.Response res) {
        try {
            TBUserActivityComment userActivityComment = new TBUserActivityComment();
            userActivityComment.setId(UUIDGeneratorUtil.generate());
            userActivityComment.setActivityId(req.activityId);
            userActivityComment.setUserId(req.empId);
            userActivityComment.setCommentContent(req.content);
            userActivityComment.setCreateTime(DateUtil.formatDate(new Date()));

            if (req.imgs != null) {
                //插入新的数据
                for (String img : req.imgs) {
                    TbUserCommonFiles userCommonFiles = new TbUserCommonFiles();
                    userCommonFiles.setId(uuid());
                    userCommonFiles.setFilePath(img);
                    userCommonFiles.setFkId(userActivityComment.getId());
                    userCommonFiles.setCreateTime(DateUtil.formatDate(new Date()));
                    commonFilesMapper.insertSelective(userCommonFiles);
                }
            }


            activityCommentMapper.insertSelective(userActivityComment);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 员工之家--用户评论列表
     */
    public void getActivityUserCommentsList(RequesterActivityUserCommentListApi.Params req, RequesterActivityUserCommentListApi.Response res) {
        try {
            List<TbUserActivityCommentVo> voList = new ArrayList<>();

            TBUserActivityCommentExample userActivityCommentExample = new TBUserActivityCommentExample();
            userActivityCommentExample.setOrderByClause("create_time desc");
            TBUserActivityCommentExample.Criteria criteria = userActivityCommentExample.createCriteria();
            criteria.andUserIdEqualTo(req.empId);
            criteria.andActivityIdEqualTo(req.activityId);
            List<TBUserActivityComment> commentList = activityCommentMapper.selectByExample(userActivityCommentExample);

            for (TBUserActivityComment comment : commentList) {
                AppLoginUser appUser = userService.selectUserById(comment.getUserId());

                TbUserActivityCommentVo vo = new TbUserActivityCommentVo();
                copy(vo, comment);

                TbUserCommonFilesExample commonFilesExample = new TbUserCommonFilesExample();
                TbUserCommonFilesExample.Criteria files_criteria = commonFilesExample.createCriteria();
                files_criteria.andFkIdEqualTo(comment.getId());
                List<TbUserCommonFiles> filesList = commonFilesMapper.selectByExample(commonFilesExample);

                String imgs = "";
                for (TbUserCommonFiles file : filesList) {
                    //imgs = imgs+","+file.getFilePath();
                    vo.imgs.add(file.getFilePath());
                }
                //vo.imgs = imgs;
                vo.userName = appUser.name;
                vo.userDept = appUser.orgname;
                vo.userIcon = appUser.headimg;

                String sql = "SELECT SELF_DESCRIPTION from TB_USER_DATING_INFO where USER_ID = '" + comment.getUserId() + "' ";
                SQLAdapter sqlAdapter = new SQLAdapter(sql);
                List<Map<String, Object>> womanList = commonMapper.selectCommonSql(sqlAdapter);

                Map datingInfoMap = womanList.get(0);
                vo.userDescription = datingInfoMap != null && datingInfoMap.get("SELF_DESCRIPTION") != null ? datingInfoMap.get("SELF_DESCRIPTION") + "" : "";

                voList.add(vo);
            }
            res.body.list = voList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }
}
