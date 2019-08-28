package com.work.service;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.work.api.v3.suginfo.*;
import com.work.api.v3.suginfo.vo.SugDeptListVo;
import com.work.api.v3.suginfo.vo.SugInfoMyApplyVo;
import com.work.api.v3.suginfo.vo.SugTypeListVo;
import com.work.bean.CrowdBean;
import com.work.bean.SuggestBean;
import com.work.common.*;
import com.work.entity.*;
import com.work.mapper.*;
import com.work.mappercommon.CommonMapper;
import net.sf.json.JSONException;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by System_User on 2016/12/29.
 */
@Service("suggestService")
public class TSuggestService extends BaseRequester {

    @Resource
    private TSuggestMapper suggestMapper;

    @Resource
    private TSugInfoMapper sugInfoMapper;

    @Resource
    private TSugReplMapper sugReplMapper;

    @Resource
    private TDiscussionMapper discussionMapper;

    @Resource
    private TbPepmgmEmpinfoMapper empinfoMapper;

    @Resource
    private TbSugApproveMapper sugApproveMapper;

    @Resource
    private TSysUserinfoMapper sysUserinfoMapper;

    @Resource
    private TbSugTypeMapper sugTypeMapper;

    @Resource
    private TbOaExamDeptMapper examDeptMapper;

    @Resource
    private TExamMapper examMapper;

    @Resource
    private CommonMapper commonMapper;

    @Resource
    private TBankCircleMapper bankCircleMapper;

    @Resource
    private TbSugDetailMapper sugDetailMapper;

    @Resource
    private TbSysOrginfoEhrMapper sysOrginfoEhrMapper;


    /**
     * 获取我的建议
     *
     * @param bean
     */
    public List<Map<String, Object>> getMySuggest(SuggestBean bean) {
        PageHelper.startPage(bean.getPage(), bean.getPageSize());
        return suggestMapper.selectSuggestById(bean);
    }

    /**
     * 获取其它人的建议
     *
     * @param bean
     */
    public List<Map<String, Object>> getOtherSuggest(SuggestBean bean) {
        String orgCode = examMapper.queryDeptOrgByEmpId(bean.getEmpid());
        PageHelper.startPage(bean.getPage(), bean.getPageSize());
        bean.setOrgId(orgCode);
        return suggestMapper.selectOtherSuggestById(bean);
    }


    public List<Map<String, Object>> suggestStart(SuggestBean bean) {
        PageHelper.startPage(bean.getPage(), bean.getPageSize());
        return suggestMapper.selectSuggestStart(bean);
    }


    public List<THotSuggest> gethotSugget(SuggestBean bean) {
        PageHelper.startPage(bean.getPage(), bean.getPageSize());
        return suggestMapper.selectHotSuggest(bean);
    }

    /**
     * 建议详情
     *
     * @param bean
     * @return
     */
    public JSONResult selectDeail(SuggestBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            TSugInfoExample sugInfoExample = new TSugInfoExample();
            sugInfoExample.createCriteria().andFdUuidEqualTo(bean.getId());
            List<TSugInfo> list = sugInfoMapper.selectByExampleWithBLOBs(sugInfoExample);
            TSugInfo bloBs = new TSugInfo();
            if (list != null && list.size() > 0) {
                bloBs = list.get(0);
            }
            //点赞数
            Map<String, Object> map = Maps.newHashMap();
            map.put("type", 0);
            map.put("id", bean.getId());
            int likeCount = sugInfoMapper.selectCount(map);
            bloBs.setFdLike(String.valueOf(likeCount));

            //评论数
            map.put("type", 1);
            int commentCount = sugInfoMapper.selectCount(map);
            bloBs.setFdDiss(String.valueOf(commentCount));
            result.getBody().put("detail", bloBs);

            //是否为黑名单禁言了
            CrowdBean crowdBean = new CrowdBean();
            crowdBean.setUserid(bean.getEmpid());
            List<Map<String, Object>> listBlakDatas = discussionMapper.selectProhibitBean(crowdBean);
            if (listBlakDatas.isEmpty()) {
                //没有被禁言
                result.getBody().put("isProhibit", "0");
            } else {
                //禁言了
                result.getBody().put("isProhibit", "1");
            }
            PageHelper.startPage(bean.getPage(), bean.getPageSize(), "FD_TIME desc");
            //评论列表
            TSugReplExample replExample = new TSugReplExample();
            replExample.createCriteria().andFdUuidEqualTo(bean.getId());
            List<TSugRepl> listComment = sugReplMapper.selectByExampleWithBLOBs(replExample);
            for (TSugRepl tSugRepl : listComment) {
                TbPepmgmEmpinfoExample example = new TbPepmgmEmpinfoExample();
                example.createCriteria().andFdEmpidEqualTo(tSugRepl.getFdEmpId());
                List<TbPepmgmEmpinfo> empinfos = empinfoMapper.selectByExample(example);
                if (empinfos != null && empinfos.size() > 0) {
                    tSugRepl.setFdEmpnme(empinfos.get(0).getFdEmpnme());
                    tSugRepl.setFdEmpuninme(empinfos.get(0).getFdUnitnme());
                }
            }
            result.getBody().put("listComment", listComment);

			/*TSugReplExample replExample2 = new TSugReplExample();
            replExample2.createCriteria().andFdUuidEqualTo(bean.getId()).andFdEmpIdEqualTo(bean.getEmpid()).andFdOpertypeEqualTo(BigDecimal.valueOf(0));
			List<TSugRepl> likes = sugReplMapper.selectByExampleWithBLOBs(replExample2);*/
            Map<String, Object> map1 = Maps.newHashMap();
            map1.put("id", bean.getId());
            map1.put("empId", bean.getEmpid());
            int zcount = sugReplMapper.selectUserIsZ(map1);
            boolean isZ = BooleanUtils.toBoolean(zcount);
            result.getBody().put("isZ", isZ);

            TbSugApproveExample sugApproveExample = new TbSugApproveExample();
            sugApproveExample.createCriteria().andFdUuidEqualTo(bean.getId());
            List<TbSugApproveWithBLOBs> sugApproves = sugApproveMapper.selectByExampleWithBLOBs(sugApproveExample);
            result.getBody().put("listSugApproves", sugApproves);

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
     * 添加评论点赞
     *
     * @param bean
     * @return
     */
    public JSONResult saveCommentDiss(TSugRepl bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            bean.setFdReplyId(UUIDGeneratorUtil.generate());
            bean.setFdTime(DateUtil.defaultFormat(new Date(), "yyyy-MM-dd HH:mm"));
            sugReplMapper.insertSelective(bean);
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
     * 建议-我的审批
     *
     * @param req
     * @param res
     */

    public void selectMyApplyList(RequesterSugInfoMyApplyApi.Params req, RequesterSugInfoMyApplyApi.Response res) {
        try {
            String orgCode = examMapper.queryDeptOrgByEmpId(req.fdLeaderEmp);
            TSugInfoExample sugInfoExample = new TSugInfoExample();
            TSugInfoExample.Criteria criteria = sugInfoExample.createCriteria();
            if (req.empType.indexOf("01") != -1 && req.empType.indexOf("02") != -1) {
                criteria = sugInfoExample.createCriteria();
                List<String> list = Lists.newArrayList();
                list.add("1");
                list.add("2");
                criteria.andFdOrgcdeEqualTo(orgCode).andFdSugStatusIn(list);
                sugInfoExample.or(criteria);

                TSugInfoExample.Criteria criteria2 = sugInfoExample.createCriteria();
                criteria2.andFdSugStatusEqualTo("3");
                sugInfoExample.or(criteria2);
            }else if (req.empType.indexOf("01") != -1) {
                criteria.andFdOrgcdeEqualTo(orgCode);
                List<String> list = Lists.newArrayList();
                list.add("1");
                list.add("2");
                criteria.andFdSugStatusIn(list);
            } else if (req.empType.indexOf("02") != -1){
                criteria.andFdSugStatusEqualTo("3");
            }
            PageHelper.startPage(req.page, req.pageSize, "FD_LEADER_STATUS_first asc,FD_LEADER_STATUS asc, fd_pub_time desc");
            List<TSugInfo> infoList = sugInfoMapper.selectByExampleWithBLOBs(sugInfoExample);
            copy(res.body.list, infoList, SugInfoMyApplyVo.class, this);
            for (SugInfoMyApplyVo sugInfoMyApplyVo : res.body.list) {
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(sugInfoMyApplyVo.fdEmpid);
                if (userinfo != null) {
                    sugInfoMyApplyVo.fdEmpImg = userinfo.getFdHeadicon();
                }
                //点赞数
                Map<String, Object> map = Maps.newHashMap();
                map.put("type", 0);
                map.put("id", sugInfoMyApplyVo.fdUuid);
                int likeCount = sugInfoMapper.selectCount(map);
                sugInfoMyApplyVo.fdLike = String.valueOf(likeCount);

                //评论数
                map.put("type", 1);
                int commentCount = sugInfoMapper.selectCount(map);
                sugInfoMyApplyVo.fdDiss = String.valueOf(commentCount);
                sugInfoMyApplyVo.fdEmpUninme = sugInfoMyApplyVo.fdEmpUninme.replaceAll("中国银行辽宁省分行","");
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
     * 审批我的建议
     *
     * @param req
     * @param res
     */
    public void updateApplySugInfo(RequesterUserApplySugInfoApi.Params req, RequesterUserApplySugInfoApi.Response res) {
        try {
            TSugInfo sugInfo = new TSugInfo();
            copy(sugInfo, req);
            sugInfo.setFdLeaderTmie(DateUtil.formatDate(new Date()));
            sugInfoMapper.updateSugInfo(sugInfo);
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
     * 建议分类列表
     *
     * @param req
     * @param res
     */
    public void selectListCategory(RequesterSugCategoryApi.Params req, RequesterSugCategoryApi.Response res) {
        try {
            List<TbSugType> list = sugTypeMapper.selectByExample(new TbSugTypeExample());
            copy(res.body.list, list, SugTypeListVo.class, this);
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
     * 建议部门列表
     *
     * @param req
     * @param res
     */
    public void selectDeptList(RequesterSugDeptListApi.Params req, RequesterSugDeptListApi.Response res) {
        try {
            /*TbOaExamDeptExample examDeptExample = new TbOaExamDeptExample();
            examDeptExample.setOrderByClause("dept_order asc");
            List<TbOaExamDept> list = examDeptMapper.selectByExample(examDeptExample);
            for (TbOaExamDept tbOaExamDept : list) {
                if (StringUtils.isNotEmpty(tbOaExamDept.getDeptNme())) {
                    tbOaExamDept.setDeptNme(tbOaExamDept.getDeptNme().replace("中国银行辽宁省分行", ""));
                }
            }
            String sql = "select replace(t.dept_nme, '中国银行辽宁省分行', '') deptNme,\n" +
                    "       t.dept_id deptId\n" +
                    "  from tb_oa_exam_dept t\n" +
                    " inner join tb_sys_orginfo_ehr eh\n" +
                    "    on t.dept_id = eh.fd_orgcde\n" +
                    " order by t.dept_order asc";*/


            String sql = "select replace(t.dept_nme, '中国银行辽宁省分行', '') deptNme,\n" +
                    "       t.dept_id deptId\n" +
                    "  from tb_oa_exam_dept t\n" +
                    " inner join tb_sys_orginfo_ehr eh\n" +
                    "    on t.dept_id = eh.fd_orgcde\n" +
                    "    where eh.fd_orgcde not in ('TEMP1','TEMP2','TEMP3')\n" +
                    " order by t.dept_order asc";
            String sql2 = "";
            TbPepmgmEmpinfoExample example = new TbPepmgmEmpinfoExample();
            example.createCriteria().andFdEmpidEqualTo(req.empId);
            List<TbPepmgmEmpinfo> empinfos = empinfoMapper.selectByExample(example);
            if (empinfos.size() > 0 && empinfos.get(0).getFdOrgcde().equalsIgnoreCase("00007")) {
                /*sql = "select replace(t.dept_nme, '中国银行辽宁省分行', '') deptNme,\n" +
                        "       t.dept_id deptId\n" +
                        "  from tb_oa_exam_dept t\n" +
                        " inner join tb_sys_orginfo_ehr eh\n" +
                        "    on t.dept_id = eh.fd_orgcde\n" +
                        " order by t.dept_order asc";*/
            } else {
                String queryOrg = "select fd_orgcde as nodeid, fd_parent_orgcde as parentid,fd_orgnme as orgnme from TB_SYS_ORGINFO_EHR where fd_parent_orgcde = '" + empinfos.get(0).getFdDeptOrg() + "' order by fd_order asc";
                List<Map<String, Object>> list = commonMapper.selectCommonSql(new SQLAdapter(queryOrg));
                if (!list.isEmpty()) {
                    sql2 = "select org.fd_nodeid nodeid , org.fd_nodeid deptId , org.fd_parentid parentid, replace(org.fd_orgnme, '中国银行', '')  deptNme ,org.FD_ORDER porder \n" +
                            "     from tb_sys_orginfo_ehr org  where org.fd_parentid = '" + list.get(0).get("NODEID") + "' and org.fd_orgnme like '%部' start with org.fd_nodeid = 'A0007'\n" +
                            "     connect by prior org.fd_nodeid = org.fd_parentid";
                }


            }

            List<Map<String, Object>> list = commonMapper.selectCommonSql(new SQLAdapter(sql));
            if (!empty(sql2)) {
                List<Map<String, Object>> list2 = commonMapper.selectCommonSql(new SQLAdapter(sql2));
                list.addAll(list2);
            }
            list.stream().forEach(map -> {
                SugDeptListVo vo = new SugDeptListVo();
                vo.deptId = map.getOrDefault("DEPTID", "").toString();
                vo.deptNme = map.getOrDefault("DEPTNME", "").toString();
                res.body.list.add(vo);
            });
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
     * 新增我的建议
     *
     * @param req
     * @param res
     */
    public void saveSugInfo(RequesterAddSugInfoApi.Params req, RequesterAddSugInfoApi.Response res) {
        try {
            //判断是否是省行副行长及以上的人
            //boolean isM = BooleanUtils.toBoolean(bankCircleMapper.selectUserIsOrgManager(req.fdEmpid));
            String orgCode = examMapper.queryOrgCodeByEmpId(req.fdEmpid);
            String deptCode = examMapper.queryDeptOrgByEmpId(req.fdEmpid);
            TbPepmgmEmpinfoExample example = new TbPepmgmEmpinfoExample();
            example.createCriteria().andFdEmpidEqualTo(req.fdEmpid);
            List<TbPepmgmEmpinfo> empinfos = empinfoMapper.selectByExample(example);
            TSugInfo sugInfo = new TSugInfo();
            copy(sugInfo, req);
            sugInfo.setFdUuid(uuid());
            sugInfo.setFdOrgcde(deptCode);
            if (empinfos.size() > 0) {
                sugInfo.setFdEmpUninme(empinfos.get(0).getFdUnitnme().replaceAll("中国银行辽宁省分行",""));
            }
            sugInfo.setFdLeaderStatus(BigDecimal.ZERO);
            sugInfo.setFdPubTime(DateUtil.formatDate(new Date()));
            sugInfo.setFdLeaderStatusFirst(BigDecimal.ZERO);
            sugInfo.setFdReplyStatus("0");
            sugInfo.setFdCommentStatus("0");
            if ("00007".equalsIgnoreCase(orgCode)) {
                sugInfo.setFdSugStatus("2");
            } else {
                sugInfo.setFdSugStatus("1");
            }
            sugInfo.setFdSugScope("0");
            sugInfoMapper.insertSelective(sugInfo);

            //Copy一份到备份库
            TbSugDetail sugDetail = new TbSugDetail();
            copy(sugDetail, sugInfo);
            sugDetail.setUuid(uuid());
            sugDetail.setFdUuid(sugInfo.getFdUuid());
            sugDetail.setAddtime(DateUtil.defaultFormat(new Date(), "yyyy-MM-dd HH:mm"));
            sugDetailMapper.insertSelective(sugDetail);

        } catch (JSONException je) {
            je.printStackTrace();
            res.header = getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            res.header = getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
    }

    public static void main(String[] args) {
        System.out.println("0201".indexOf("02"));
    }
}
