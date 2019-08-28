package com.work.service.v3;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.work.api.v3.mylog.*;
import com.work.api.v3.mylog.vo.*;
import com.work.common.*;
import com.work.entity.*;
import com.work.mapper.*;
import com.work.mappercommon.CommonMapper;
import net.sf.json.JSONException;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Clob;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by changzhou on 2017/3/30.
 */
@Service("myLogService")
public class MyLogService extends BaseRequester {

    @Resource
    private TbBlBlogMapper blBlogMapper;

    @Resource
    private TExamMapper examMapper;

    @Resource
    private TbBlBltypeMapper bltypeMapper;

    @Resource
    private TSysUserinfoMapper sysUserinfoMapper;

    @Resource
    private TbBlReplyMapper blReplyMapper;

    @Resource
    private TbBlSupportMapper blSupportMapper;

    @Resource
    private TbBlBlogFollowMapper followMapper;

    @Resource
    private TbPepmgmEmpinfoMapper empinfoMapper;

    @Resource
    private CommonMapper commonMapper;

    @Resource
    private TbSysOrginfoEhrMapper orginfoEhrMapper;

    @Resource
    private TBankCircleMapper bankCircleMapper;

    @Resource
    private TbPepmgmLeaderMapper pepmgmLeaderMapper;

    /**
     * @param req
     * @param res
     * @description 发布日志
     */
    public void saveMyLog(RequesterAddMyLogApi.Params req, RequesterAddMyLogApi.Response res) {
        try {
            TbBlBlog blog = new TbBlBlog();
            copy(blog, req);
            blog.setFdBlId(uuid());
            blog.setFdCreateTime(DateUtil.defaultFormat(new Date(), "yyyy-MM-dd HH:mm"));
            String orgCode = examMapper.queryOrgCodeByEmpId(req.fdBlCreateid);//机构编码
            blog.setFdOrgcde(orgCode);
            blog.setFdReadCount("0");
            blog.setFdBlSup("0");
            blog.setFdBlDiss("0");
            if (!empty(req.imgs)) {
                String[] img = req.imgs.split(",");
                for (String s : img) {
                    String img_string = "<img src=\"" + s + "\" width=\"100%\"><br>";
                    req.fdBlContent = req.fdBlContent + img_string;
                }
            }
            blog.setFdBlContent(req.fdBlContent);
            blBlogMapper.insertSelective(blog);
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }

    /**
     * @param req
     * @param res
     * @description 发布日志->日志类型
     */
    public void selectMyLogTypeList(RequesterMyLogTypeApi.Params req, RequesterMyLogTypeApi.Response res) {
        try {
            List<TbBlBltype> list = bltypeMapper.selectByExample(new TbBlBltypeExample());
            copy(res.body.list, list, MyLogTypeVo.class, this);
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 我的日志--日志列表
     */
    public void selectMyLogIndexList(RequesterIndexLogListApi.Params req, RequesterIndexLogListApi.Response res) {
        try {
            List<String> ids = Lists.newArrayList();
            TbBlBlogFollowExample followExample = new TbBlBlogFollowExample();
            followExample.createCriteria().andUserIdEqualTo(req.fdBlCreateid);
            PageHelper.startPage(1, 2000, "CREATE_TIME DESC");
            List<TbBlBlogFollow> follows = followMapper.selectByExample(followExample);
            follows.stream().forEach(tbBlBlogFollow -> {
                ids.add(tbBlBlogFollow.getFollowUesrId());
            });
            if (ids.size() > 0) {
                TbBlBlogExample blBlogExample = new TbBlBlogExample();
                blBlogExample.setOrderByClause("FD_CREATE_TIME DESC");
                TbBlBlogExample.Criteria criteria1 = blBlogExample.createCriteria();
                if (!empty(req.fdTypeId)) {
                    criteria1.andFdTypeIdEqualTo(req.fdTypeId);
                }
                criteria1.andFdBlCreateidIn(ids).andFdShowEqualTo("1");
                PageHelper.startPage(req.page, req.pageSize);
                List<TbBlBlog> list = blBlogMapper.selectByExampleWithBLOBs(blBlogExample);
                copy(res.body.list, list, IndexLogVo.class, this);
                for (IndexLogVo indexLogVo : res.body.list) {
                    //获取用户头像
                    TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(indexLogVo.fdBlCreateid);
                    if (userinfo != null) {
                        indexLogVo.fdHeadicon = userinfo.getFdHeadicon();
                    }
                    indexLogVo.dept = examMapper.queryUnitnameByEmpId(indexLogVo.fdBlCreateid);

                    //获取评论数
                    TbBlReplyExample tbBlReplyExample = new TbBlReplyExample();
                    tbBlReplyExample.createCriteria().andFdBlIdEqualTo(indexLogVo.fdBlId);
                    int fdBlDiss = blReplyMapper.countByExample(tbBlReplyExample);
                    indexLogVo.fdBlDiss = String.valueOf(fdBlDiss);
                    //获取支持数
                    TbBlSupportExample tbBlSupportExample = new TbBlSupportExample();
                    TbBlSupportExample.Criteria criteria = tbBlSupportExample.createCriteria();
                    criteria.andFdReplyIdEqualTo(indexLogVo.fdBlId);
                    int fdBlSup = blSupportMapper.countByExample(tbBlSupportExample);
                    indexLogVo.fdBlSup = String.valueOf(fdBlSup);
                    //判断用户是否支持过
                    criteria.andFdEmpidEqualTo(req.fdBlCreateid);
                    int isSup = blSupportMapper.countByExample(tbBlSupportExample);
                    indexLogVo.isSupport = BooleanUtils.toBoolean(isSup);


                    //判断是否关注该用户
                    TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
                    tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.fdBlCreateid).andFollowUesrIdEqualTo(indexLogVo.fdBlCreateid);
                    int followCount = followMapper.countByExample(tbBlBlogFollowExample);
                    indexLogVo.isFollow = followCount > 0 ? "1" : "0";
                }
            }
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 我的日志--详情评论列表
     */
    public void selectLogReplyList(RequesterLogDetailReplyListApi.Params req, RequesterLogDetailReplyListApi.Response res) {
        try {
            TbBlReplyExample tbBlReplyExample = new TbBlReplyExample();
            tbBlReplyExample.setOrderByClause("FD_REP_TIME DESC");
            tbBlReplyExample.createCriteria().andFdBlIdEqualTo(req.fdBlId);
            PageHelper.startPage(req.page, req.pageSize);
            List<TbBlReply> list = blReplyMapper.selectByExample(tbBlReplyExample);
            copy(res.body.list, list, LogReplyVo.class, this);
            for (LogReplyVo logReplyVo : res.body.list) {
                //获取用户头像
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(logReplyVo.fdEmpId);
                if (userinfo != null) {
                    logReplyVo.fdHeadicon = userinfo.getFdHeadicon();
                }
            }
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }

    /**
     * @param req
     * @param res
     * @description 我的日志--添加日志评论
     */
    public void saveLogReply(RequesterAddLogReplyApi.Params req, RequesterAddLogReplyApi.Response res) {
        try {
            TbBlReply blReply = new TbBlReply();
            copy(blReply, req);
            blReply.setFdReplyId(uuid());
            blReply.setFdRepTime(DateUtil.formatDate(new Date()));
            blReply.setFdSupCount("0");
            blReplyMapper.insertSelective(blReply);
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }

    /**
     * @param req
     * @param res
     * @description 我的日志--添加日志支持
     */
    public void saveLogSupport(RequesterAddLogSupportApi.Params req, RequesterAddLogSupportApi.Response res) {
        try {
            if (StringUtils.equals(req.type, "0")) {
                TbBlSupport blSupport = new TbBlSupport();
                copy(blSupport, req);
                blSupport.setFdSupportId(uuid());
                blSupport.setSuoDate(DateUtil.formatDate(new Date()));
                blSupportMapper.insertSelective(blSupport);
            } else if (StringUtils.equals(req.type, "1")) {
                TbBlSupportExample tbBlSupportExample = new TbBlSupportExample();
                tbBlSupportExample.createCriteria().andFdEmpidEqualTo(req.fdEmpid).andFdReplyIdEqualTo(req.fdReplyId);
                blSupportMapper.deleteByExample(tbBlSupportExample);
            }
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 我的日志--个人主页
     */
    public void selectMyLogHomeList(RequesterMyLogHomeApi.Params req, RequesterMyLogHomeApi.Response res) {
        try {
            TbBlBlogExample blBlogExample = new TbBlBlogExample();
            blBlogExample.setOrderByClause("FD_CREATE_TIME DESC");
            TbBlBlogExample.Criteria criteria1 = blBlogExample.createCriteria();
            if (empty(req.otherEmpId)) {
                criteria1.andFdBlCreateidEqualTo(req.fdEmpId);//.andFdShowEqualTo("1");
            } else {
                criteria1.andFdBlCreateidEqualTo(req.otherEmpId).andFdShowEqualTo("1");
            }
            PageHelper.startPage(req.page, req.pageSize);
            List<TbBlBlog> list = blBlogMapper.selectByExampleWithBLOBs(blBlogExample);
            copy(res.body.list, list, IndexLogVo.class, this);
            for (IndexLogVo indexLogVo : res.body.list) {
                //获取用户头像
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(indexLogVo.fdBlCreateid);
                if (userinfo != null) {
                    indexLogVo.fdHeadicon = userinfo.getFdHeadicon();
                }
                indexLogVo.dept = examMapper.queryUnitnameByEmpId(req.fdEmpId);
                //获取评论数
                TbBlReplyExample tbBlReplyExample = new TbBlReplyExample();
                tbBlReplyExample.createCriteria().andFdBlIdEqualTo(indexLogVo.fdBlId);
                int fdBlDiss = blReplyMapper.countByExample(tbBlReplyExample);
                indexLogVo.fdBlDiss = String.valueOf(fdBlDiss);
                //获取支持数
                TbBlSupportExample tbBlSupportExample = new TbBlSupportExample();
                TbBlSupportExample.Criteria criteria = tbBlSupportExample.createCriteria();
                criteria.andFdReplyIdEqualTo(indexLogVo.fdBlId);
                int fdBlSup = blSupportMapper.countByExample(tbBlSupportExample);
                indexLogVo.fdBlSup = String.valueOf(fdBlSup);
                //判断用户是否支持过
                criteria.andFdEmpidEqualTo(req.fdEmpId);
                int isSup = blSupportMapper.countByExample(tbBlSupportExample);
                indexLogVo.isSupport = BooleanUtils.toBoolean(isSup);

            }
            //获取用户
            TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(req.fdEmpId);
            if (userinfo != null) {
                res.body.headIcon = userinfo.getFdHeadicon();
                res.body.username = userinfo.getFdName();
            }
            res.body.dept = examMapper.queryUnitnameByEmpId(req.fdEmpId);
            //日志数
            int logCount = blBlogMapper.countByExample(blBlogExample);
            res.body.logCount = String.valueOf(logCount);
            //关注数
            TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
            tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.fdEmpId);
            int followCount = followMapper.countByExample(tbBlBlogFollowExample);
            res.body.followCount = String.valueOf(followCount);
            //粉丝数
            TbBlBlogFollowExample tbBlBlogFollowExample2 = new TbBlBlogFollowExample();
            tbBlBlogFollowExample2.createCriteria().andFollowUesrIdEqualTo(req.fdEmpId);
            int fansCount = followMapper.countByExample(tbBlBlogFollowExample2);
            res.body.fansCount = String.valueOf(fansCount);

        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 我的日志--添加关注
     */
    public void saveFollow(RequesterAddFollowApi.Params req, RequesterAddFollowApi.Response res) {
        try {
            //发起关注用户级别
            String userLevel = getUserLevel(req.userId);
            //被关注用户级别
            String followUesrLevel = getUserLevel(req.followUesrId);
            //判断是否是省行行长
            if (!"8474067".equals(req.userId)) {
                if (!"1".equals(followUesrLevel) && !"2".equals(followUesrLevel)) {
                    switch (userLevel) {
                        case "1":
                        case "2":
                        case "3":
                            if (!"1".equals(followUesrLevel) && !"2".equals(followUesrLevel)) {
                                res.header = getFail(Constants.PARAM_ERROR, "不能关注非直属下级员工");
                                return;
                            } else {
                                break;
                            }
                        case "4":
                        case "5":
                        case "6":
                            String sql = "SELECT FD_EMPID,FD_LEVEL FROM TB_PEPMGM_LEADER START WITH FD_PARENT_EMP='" + req.userId + "' AND FD_EMPID = '" + req.followUesrId + "' CONNECT BY PRIOR FD_EMPID=FD_PARENT_EMP";
                            List<Map<String, Object>> listuser = commonMapper.selectCommonSql(new SQLAdapter(sql));
                            if (listuser.size() == 0) {
                                res.header = getFail(Constants.PARAM_ERROR, "不能关注非直属下级员工");
                                return;
                            } else {
                                break;
                            }
                        default:
                            res.header = getFail(Constants.PARAM_ERROR, "不能关注非直属下级员工");
                            return;
                    }
                }
            }


            TbBlBlogFollow follow = new TbBlBlogFollow();
            copy(follow, req);
            follow.setGuid(uuid());
            follow.setCreateTime(DateUtil.formatDate(new Date()));
            //判断是否已经关注
            TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
            tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.userId).andFollowUesrIdEqualTo(req.followUesrId);
            int c = followMapper.countByExample(tbBlBlogFollowExample);
            if (c == 0) {
                TbBlBlogFollowExample tbBlBlogFollowExample2 = new TbBlBlogFollowExample();
                tbBlBlogFollowExample2.createCriteria().andUserIdEqualTo(req.followUesrId).andFollowUesrIdEqualTo(req.userId);
                int fc = followMapper.countByExample(tbBlBlogFollowExample2);
                if (fc > 0) {
                    follow.setIsMutualFollow("1");
                    TbBlBlogFollow follow2 = new TbBlBlogFollow();
                    follow2.setIsMutualFollow("1");
                    followMapper.updateByExampleSelective(follow2, tbBlBlogFollowExample2);
                } else {
                    follow.setIsMutualFollow("0");
                }
                followMapper.insertSelective(follow);
            }
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 我的日志--关注列表
     */
    public void selectMyFollowList(RequesterMyFollowListApi.Params req, RequesterMyFollowListApi.Response res) {
        try {
            TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
            tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.userId);
            PageHelper.startPage(req.page, req.pageSize, "CREATE_TIME DESC");
            List<TbBlBlogFollow> list = followMapper.selectByExample(tbBlBlogFollowExample);
            for (TbBlBlogFollow follow : list) {
                FollowAndFansVo followAndFansVo = new FollowAndFansVo();
                followAndFansVo.fdEmpId = follow.getFollowUesrId();
                //获取用户
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(follow.getFollowUesrId());
                if (userinfo != null) {
                    followAndFansVo.headIcon = userinfo.getFdHeadicon();
                    followAndFansVo.userName = userinfo.getFdName();
                    followAndFansVo.info = userinfo.getFdAutograph();
                }
                followAndFansVo.dept = examMapper.queryUnitnameByEmpId(follow.getFollowUesrId());
                followAndFansVo.isMutualFollow = follow.getIsMutualFollow();
                res.body.list.add(followAndFansVo);
            }
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 我的日志--粉丝列表
     */
    public void selectMyFansList(RequesterMyFansListApi.Params req, RequesterMyFansListApi.Response res) {
        try {
            TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
            tbBlBlogFollowExample.createCriteria().andFollowUesrIdEqualTo(req.userId);
            PageHelper.startPage(req.page, req.pageSize, "CREATE_TIME DESC");
            List<TbBlBlogFollow> list = followMapper.selectByExample(tbBlBlogFollowExample);
            for (TbBlBlogFollow follow : list) {
                FollowAndFansVo followAndFansVo = new FollowAndFansVo();
                followAndFansVo.fdEmpId = follow.getUserId();
                //获取用户
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(follow.getUserId());
                if (userinfo != null) {
                    followAndFansVo.headIcon = userinfo.getFdHeadicon();
                    followAndFansVo.userName = userinfo.getFdName();
                    followAndFansVo.info = userinfo.getFdAutograph();
                }
                followAndFansVo.dept = examMapper.queryUnitnameByEmpId(follow.getUserId());
                followAndFansVo.isMutualFollow = follow.getIsMutualFollow();
                res.body.list.add(followAndFansVo);
            }
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 取消关注
     */
    public void updateCancleFollow(RequesterCancleFollowListApi.Params req, RequesterCancleFollowListApi.Response res) {
        try {
            //删除自己关注的数据
            TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
            tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.userId).andFollowUesrIdEqualTo(req.followUesrId);
            followMapper.deleteByExample(tbBlBlogFollowExample);

            //取消对方互相关注状态
            TbBlBlogFollowExample tbBlBlogFollowExample2 = new TbBlBlogFollowExample();
            tbBlBlogFollowExample2.createCriteria().andUserIdEqualTo(req.followUesrId).andFollowUesrIdEqualTo(req.userId);
            TbBlBlogFollow follow = new TbBlBlogFollow();
            follow.setIsMutualFollow("0");
            followMapper.updateByExampleSelective(follow, tbBlBlogFollowExample2);
        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }

    /**
     * @param req
     * @param res
     * @description 我的日志--判断自己是否关注了别人
     */
    public void selectUserIsFollowUser(RequesterUserIsFollowApi.Params req, RequesterUserIsFollowApi.Response res) {
        try {
            //判断是否关注该用户
            TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
            tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.userId).andFollowUesrIdEqualTo(req.followUserId);
            int followCount = followMapper.countByExample(tbBlBlogFollowExample);
            if (followCount > 0) {
                res.body.isFollow = true;
            } else {
                res.body.isFollow = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }

    /**
     * @param req
     * @param res
     * @description
     */
    public void selectUserOrLogByKey(RequesterSearchLogOrUserApi.Params req, RequesterSearchLogOrUserApi.Response res) {
        try {
            //判断是否是普通员工
            //职位等级 1 非人力普通员工 2 人力资源普通员工 3 主管 4 部门正总 5 部门副总 6副行长
            String userLevel = getUserLevel(req.userId);

            if (empty(req.type)) {
                String inSql = "";
                if (req.userId.equals("8474067")) {
                    inSql = "";
                } else if ("1".equals(userLevel) || "2".equals(userLevel) || "3".equals(userLevel)) {
                    inSql = " AND TBLE.FD_LEVEL IN (1,2)";
                } else if ("4".equals(userLevel) || "5".equals(userLevel) || "6".equals(userLevel)) {
                    String sql_4_5 = "SELECT FD_EMPID FROM TB_PEPMGM_LEADER START WITH FD_PARENT_EMP='" + req.userId + "' AND FD_LEVEL > 2 CONNECT BY PRIOR FD_EMPID=FD_PARENT_EMP AND FD_LEVEL > 2";
                    List<Map<String, Object>> list = commonMapper.selectCommonSql(new SQLAdapter(sql_4_5));
                    if(list.size()>0) {
                        StringBuffer sb = new StringBuffer();
                        for (int i = 0; i < list.size(); i++) {
                            sb.append("'").append(list.get(i).get("FD_EMPID")).append("'").append(",");
                        }
                        inSql = " AND (TBLE.FD_EMPID IN ("+sb.toString().substring(0, sb.length() - 1)+") OR TBLE.FD_LEVEL IN (1,2))";
                    }else{
                        inSql = " AND TBLE.FD_LEVEL IN (1,2)";
                    }
                }
                if (!empty(req.key) && req.page == 1) {
                    String sql = "SELECT TBLE.FD_EMPID,TBPE.FD_EMPNME from TB_PEPMGM_LEADER TBLE,TB_PEPMGM_EMPINFO TBPE WHERE TBLE.FD_EMPID = TBPE.FD_EMPID ";
                    if (!empty(req.key)) {
                        sql += " and TBPE.FD_EMPNME like '%" + req.key + "%'";
                    }
                    sql += inSql;
                    List<Map<String, Object>> listuser = commonMapper.selectCommonSql(new SQLAdapter(sql));
                    for (Map<String, Object> map : listuser) {
                        SearchLogUserVo userVo = new SearchLogUserVo();
                        userVo.fdEmpId = map.get("FD_EMPID").toString();
                        //获取用户
                        TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(userVo.fdEmpId);
                        if (userinfo != null) {
                            userVo.headIcon = userinfo.getFdHeadicon();
                            userVo.userName = userinfo.getFdName();
                            userVo.info = userinfo.getFdAutograph();
                        }
                        userVo.dept = examMapper.queryUnitnameByEmpId(userVo.fdEmpId);

                        TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
                        tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.userId).andFollowUesrIdEqualTo(userVo.fdEmpId);
                        List<TbBlBlogFollow> list = followMapper.selectByExample(tbBlBlogFollowExample);
                        if (list.size() == 0) {
                            userVo.isFollow = "0";
                        } else if (StringUtils.equals("0", list.get(0).getIsMutualFollow())) {
                            userVo.isFollow = "1";
                        } else {
                            userVo.isFollow = "2";
                        }
                        res.body.listuser.add(userVo);
                    }
                }


                String sqlBlog = "SELECT * FROM TB_BL_BLOG TBB, TB_PEPMGM_LEADER TBLE where TBB.FD_BL_CREATEID = TBLE.FD_EMPID and TBB.FD_SHOW = '1' ";
                if (!empty(req.key)) {
                    sqlBlog += " and TBB.FD_BL_TITLE like '%" + req.key + "%'";
                }
                sqlBlog += inSql;

                PageHelper.startPage(req.page, req.pageSize);
                List<Map<String, Object>> list = commonMapper.selectCommonSql(new SQLAdapter(sqlBlog));

                list.stream().forEach(map -> {
                    try {
                        IndexLogVo indexLogVo = new IndexLogVo();
                        indexLogVo.fdCreateTime = ObjectUtils.toString(map.get("FD_CREATE_TIME"));
                        indexLogVo.fdBlContent = StringUtil.clobToString((Clob) map.get("FD_BL_CONTENT"));
                        indexLogVo.fdTypeNme = ObjectUtils.toString(map.get("FD_TYPE_NME"));
                        indexLogVo.fdReadCount = ObjectUtils.toString(map.get("FD_READ_COUNT"));
                        indexLogVo.fdBlTitle = ObjectUtils.toString(map.get("FD_BL_TITLE"));
                        indexLogVo.fdBlId = ObjectUtils.toString(map.get("FD_BL_ID"));
                        indexLogVo.fdEmpNme = ObjectUtils.toString(map.get("FD_EMP_NME"));
                        indexLogVo.fdBlCreateid = ObjectUtils.toString(map.get("FD_BL_CREATEID"));
                        res.body.listlog.add(indexLogVo);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                for (IndexLogVo indexLogVo : res.body.listlog) {
                    //获取用户头像
                    TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(indexLogVo.fdBlCreateid);
                    if (userinfo != null) {
                        indexLogVo.fdHeadicon = userinfo.getFdHeadicon();
                    }
                    indexLogVo.dept = examMapper.queryUnitnameByEmpId(indexLogVo.fdBlCreateid);
                    //获取评论数
                    TbBlReplyExample tbBlReplyExample = new TbBlReplyExample();
                    tbBlReplyExample.createCriteria().andFdBlIdEqualTo(indexLogVo.fdBlId);
                    int fdBlDiss = blReplyMapper.countByExample(tbBlReplyExample);
                    indexLogVo.fdBlDiss = String.valueOf(fdBlDiss);

                    //获取支持数
                    TbBlSupportExample tbBlSupportExample = new TbBlSupportExample();
                    TbBlSupportExample.Criteria criteria = tbBlSupportExample.createCriteria();
                    criteria.andFdReplyIdEqualTo(indexLogVo.fdBlId);
                    int fdBlSup = blSupportMapper.countByExample(tbBlSupportExample);
                    indexLogVo.fdBlSup = String.valueOf(fdBlSup);

                    //判断用户是否支持过
                    criteria.andFdEmpidEqualTo(req.userId);
                    int isSup = blSupportMapper.countByExample(tbBlSupportExample);
                    indexLogVo.isSupport = BooleanUtils.toBoolean(isSup);

                    //判断是否关注该用户
                    TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
                    tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.userId).andFollowUesrIdEqualTo(indexLogVo.fdBlCreateid);
                    int followCount = followMapper.countByExample(tbBlBlogFollowExample);
                    indexLogVo.isFollow = followCount > 0 ? "1" : "0";
                }
            } else {
                String inSql = "AND TBLE.FD_LEVEL IN (1,2)";
                /*if (req.userId.equals("8474067")) {
                    inSql = "";
                } else if ("1".equals(userLevel) || "2".equals(userLevel) || "3".equals(userLevel)) {
                    inSql = " AND TBLE.FD_LEVEL NOT IN (1,2)";
                } else if ("4".equals(userLevel) || "5".equals(userLevel) || "6".equals(userLevel)) {
                    inSql = "AND ((TBLE.FD_EMPID IN (SELECT FD_EMPID FROM TB_PEPMGM_LEADER START WITH FD_PARENT_EMP='" + req.userId + "' AND FD_LEVEL > 2 CONNECT BY PRIOR FD_EMPID=FD_PARENT_EMP AND FD_LEVEL > 2)) OR TBLE.FD_LEVEL IN (1,2))";
                }*/
                String stime = "";
                String etime = "";
                switch (req.type) {
                    case "1": //月
                        stime = DateUtil.getFirstDayOfMonth(DateUtil.getYear(), DateUtil.getMonth());
                        etime = DateUtil.getLastDayOfMonth(DateUtil.getYear(), DateUtil.getMonth());
                        break;
                    case "2"://季度
                        stime = DateUtil.getFirstDayOfQuarter(DateUtil.getYear(), DateUtil.getQuarterOfYear(new Date()));
                        etime = DateUtil.getLastDayOfQuarter(DateUtil.getYear(), DateUtil.getQuarterOfYear(new Date()));
                        break;
                    case "3"://年
                        stime = String.valueOf(DateUtil.getYear()) + "-01-01";
                        etime = String.valueOf(DateUtil.getYear()) + "-12-31";
                        break;
                }
                StringBuffer sql = new StringBuffer();
                stime = stime + " 00:00";
                etime = etime + " 23:59";
                sql.append("SELECT TBLE.*,SUM(REPLY_COUNT+SUPPORT_COUNT) OVER (partition by FD_BL_ID) AS CC FROM (SELECT * FROM TB_BL_BLOG TBB ");
                sql.append("LEFT JOIN (select count(FD_REPLY_ID) as REPLY_COUNT,FD_BL_ID AS ID1 from TB_BL_REPLY group by FD_BL_ID) c on c.ID1 = TBB.FD_BL_ID ");
                sql.append("LEFT JOIN (select count(FD_SUPPORT_ID) as SUPPORT_COUNT,FD_REPLY_ID AS ID2 from TB_BL_SUPPORT group by FD_REPLY_ID) c1 on c1.ID2 = TBB.FD_BL_ID ");
                sql.append("INNER JOIN TB_PEPMGM_LEADER TPL ON TBB.FD_BL_CREATEID = TPL.FD_EMPID) TBLE ");
                sql.append("WHERE FD_CREATE_TIME >= '" + stime + "' AND FD_CREATE_TIME <= '" + etime + "' and FD_SHOW = '1'");
                sql.append(inSql);
                sql.append("ORDER BY CC DESC NULLS LAST ");
                SQLAdapter sqlAdapter = new SQLAdapter(sql.toString());
                PageHelper.startPage(req.page, req.pageSize);
                List<Map<String, Object>> list = commonMapper.selectCommonSql(sqlAdapter);
                for (Map<String, Object> stringObjectMap : list) {
                    IndexLogVo indexLogVo = new IndexLogVo();
                    indexLogVo.fdCreateTime = ObjectUtils.toString(stringObjectMap.get("FD_CREATE_TIME"));
                    indexLogVo.fdBlContent = StringUtil.clobToString((Clob) stringObjectMap.get("FD_BL_CONTENT"));
                    indexLogVo.fdTypeNme = ObjectUtils.toString(stringObjectMap.get("FD_TYPE_NME"));
                    indexLogVo.fdReadCount = ObjectUtils.toString(stringObjectMap.get("FD_READ_COUNT"));
                    indexLogVo.fdBlTitle = ObjectUtils.toString(stringObjectMap.get("FD_BL_TITLE"));
                    indexLogVo.fdBlId = ObjectUtils.toString(stringObjectMap.get("FD_BL_ID"));
                    indexLogVo.fdEmpNme = ObjectUtils.toString(stringObjectMap.get("FD_EMP_NME"));
                    indexLogVo.fdBlCreateid = ObjectUtils.toString(stringObjectMap.get("FD_BL_CREATEID"));

                    //获取用户头像
                    TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(indexLogVo.fdBlCreateid);
                    if (userinfo != null) {
                        indexLogVo.fdHeadicon = userinfo.getFdHeadicon();
                    }
                    indexLogVo.dept = examMapper.queryUnitnameByEmpId(indexLogVo.fdBlCreateid);
                    //获取评论数
                    TbBlReplyExample tbBlReplyExample = new TbBlReplyExample();
                    tbBlReplyExample.createCriteria().andFdBlIdEqualTo(indexLogVo.fdBlId);
                    int fdBlDiss = blReplyMapper.countByExample(tbBlReplyExample);
                    indexLogVo.fdBlDiss = String.valueOf(fdBlDiss);

                    //获取支持数
                    TbBlSupportExample tbBlSupportExample = new TbBlSupportExample();
                    TbBlSupportExample.Criteria criteria = tbBlSupportExample.createCriteria();
                    criteria.andFdReplyIdEqualTo(indexLogVo.fdBlId);
                    int fdBlSup = blSupportMapper.countByExample(tbBlSupportExample);
                    indexLogVo.fdBlSup = String.valueOf(fdBlSup);

                    //判断用户是否支持过
                    criteria.andFdEmpidEqualTo(req.userId);
                    int isSup = blSupportMapper.countByExample(tbBlSupportExample);
                    indexLogVo.isSupport = BooleanUtils.toBoolean(isSup);

                    //判断是否关注该用户
                    TbBlBlogFollowExample tbBlBlogFollowExample = new TbBlBlogFollowExample();
                    tbBlBlogFollowExample.createCriteria().andUserIdEqualTo(req.userId).andFollowUesrIdEqualTo(indexLogVo.fdBlCreateid);
                    int followCount = followMapper.countByExample(tbBlBlogFollowExample);
                    indexLogVo.isFollow = followCount > 0 ? "1" : "0";
                    res.body.listlog.add(indexLogVo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    /**
     * @param req
     * @param res
     * @description 删除我的日志
     */
    public void deleteMyLog(RequesterDelMyLogApi.Params req, RequesterDelMyLogApi.Response res) {
        try {
            blBlogMapper.deleteByPrimaryKey(req.fdBlId);
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }


    public String getUserLevel(String empId) {
        TbPepmgmLeaderExample pepmgmLeaderExample = new TbPepmgmLeaderExample();
        pepmgmLeaderExample.createCriteria().andFdEmpidEqualTo(empId);
        List<TbPepmgmLeader> leaders = pepmgmLeaderMapper.selectByExample(pepmgmLeaderExample);
        if (leaders.size() > 0) {
            return leaders.get(0).getFdLevel().toString();
        } else {
            return null;
        }
    }

}
