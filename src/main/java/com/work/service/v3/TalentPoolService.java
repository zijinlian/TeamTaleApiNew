package com.work.service.v3;

import com.work.api.v3.miai.*;
import com.work.api.v3.miai.vo.PieChartVo;
import com.work.api.v3.miai.vo.TbTalentLibUserVo;
import com.work.api.v3.miai.vo.TbTalentLibstructVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.SQLAdapter;
import com.work.entity.TbTalentLibstruct;
import com.work.entity.TbTalentLibstructExample;
import com.work.entity.TbTalentUserinfo;
import com.work.entity.TbTalentUserinfoExample;
import com.work.mapper.TbTalentLibstructMapper;
import com.work.mapper.TbTalentUserinfoMapper;
import com.work.mappercommon.CommonMapper;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人才库
 * Created by changzhou on 2017/5/4.
 */
@Service("talentPoolService")
public class TalentPoolService extends BaseRequester{

    @Resource
    private TbTalentUserinfoMapper talentUserinfoMapper;

    @Resource
    private TbTalentLibstructMapper talentLibstructMapper;

    @Resource
    private CommonMapper commonMapper;


    /**
     * @param req
     * @param res
     * @description 人才库--判断用户是否可以填写过人才信息
     */
    public void selectUserIsFill(RequesterTalentpoolIsFillApi.Params req, RequesterTalentpoolIsFillApi.Response res) {
        try {
            TbTalentUserinfoExample talentUserinfoExample = new TbTalentUserinfoExample();
            talentUserinfoExample.createCriteria().andEhrEqualTo(req.userId);
            int count = talentUserinfoMapper.countByExample(talentUserinfoExample);
            res.body.isFill = BooleanUtils.toBoolean(count);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 人才库--员工人才信息
     */
    public void selectUserTalentList(RequesterUserTalentListApi.Params req, RequesterUserTalentListApi.Response res) {
        try {
            TbTalentLibstructExample talentLibstructExample = new TbTalentLibstructExample();
            talentLibstructExample.createCriteria().andLibParentIdEqualTo("-1");
            List<TbTalentLibstruct> list = talentLibstructMapper.selectByExample(talentLibstructExample);
            for (TbTalentLibstruct tbTalentLibstruct : list) {
                TbTalentLibstructVo talentLibstructVo = new TbTalentLibstructVo();
                copy(talentLibstructVo, tbTalentLibstruct);
                TbTalentUserinfoExample talentUserinfoExample = new TbTalentUserinfoExample();
                talentUserinfoExample.createCriteria().andEhrEqualTo(req.userId).andTopCategoryIdEqualTo(tbTalentLibstruct.getLibId());
                List<TbTalentUserinfo> userinfoList = talentUserinfoMapper.selectByExample(talentUserinfoExample);
                for (TbTalentUserinfo userinfo : userinfoList) {
                    TbTalentLibUserVo userVo = new TbTalentLibUserVo();
                    copy(userVo, userinfo);
                    TbTalentLibstruct tbTalentLibstruct1 = talentLibstructMapper.selectByPrimaryKey(userinfo.getLibId());
                    userVo.libName = tbTalentLibstruct1.getLibName();
                    talentLibstructVo.list.add(userVo);
                }
                res.body.list.add(talentLibstructVo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 人才库--新增技能
     */
    public void saveUserSkill(RequesterUserAddSkillApi.Params req, RequesterUserAddSkillApi.Response res) {
        try {
            TbTalentUserinfoExample talentUserinfoExample = new TbTalentUserinfoExample();
            talentUserinfoExample.createCriteria().andEhrEqualTo(req.ehr).andLibIdEqualTo(req.libId);
            int count = talentUserinfoMapper.countByExample(talentUserinfoExample);
            if (count == 0) {
                TbTalentUserinfo userinfo = new TbTalentUserinfo();
                copy(userinfo, req);
                talentUserinfoMapper.insertSelective(userinfo);
            } else {
                res.header = getFail("你已添加了该技能,不能重复添加");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 人才库--修改技能
     */
    public void updateUserSkill(RequesterUserUpdateSkillApi.Params req, RequesterUserUpdateSkillApi.Response res) {
        try {
            TbTalentUserinfo userinfo = new TbTalentUserinfo();
            copy(userinfo, req);
            TbTalentUserinfoExample talentUserinfoExample = new TbTalentUserinfoExample();
            talentUserinfoExample.createCriteria().andEhrEqualTo(req.ehr).andLibIdEqualTo(req.libId);
            talentUserinfoMapper.updateByExampleSelective(userinfo, talentUserinfoExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 人才库--删除技能
     */
    public void deleteUserSkill(RequesterUserDeleteSkillApi.Params req, RequesterUserDeleteSkillApi.Response res) {
        try {
            TbTalentUserinfoExample talentUserinfoExample = new TbTalentUserinfoExample();
            talentUserinfoExample.createCriteria().andEhrEqualTo(req.ehr).andLibIdEqualTo(req.libId);
            talentUserinfoMapper.deleteByExample(talentUserinfoExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 人才库--饼图
     */
    public void selectUserPieChart(RequesterUserPieChartApi.Params req, RequesterUserPieChartApi.Response res) {
        try {
            String sql = "SELECT C.CTOP, TL.LIB_NAME\n" +
                    "FROM (SELECT TOP_CATEGORY_ID, COUNT(TOP_CATEGORY_ID) AS CTOP\n" +
                    "\tFROM TB_TALENT_USERINFO\n" +
                    "\tGROUP BY TOP_CATEGORY_ID\n" +
                    "\t) C\n" +
                    "\tLEFT JOIN TB_TALENT_LIBSTRUCT TL ON C.TOP_CATEGORY_ID = TL.LIB_ID\n" +
                    "WHERE TL.LIB_ID != '-1'";
            List<Map<String, Object>> list = commonMapper.selectCommonSql(new SQLAdapter(sql));
            for (Map<String, Object> stringObjectMap : list) {
                PieChartVo pieChartVo = new PieChartVo();
                pieChartVo.count = ObjectUtils.toString(stringObjectMap.get("CTOP"));
                pieChartVo.name = ObjectUtils.toString(stringObjectMap.get("LIB_NAME"));
                res.body.list.add(pieChartVo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 人才库--人才库类型列表
     */
    public void selectCategoryList(RequesterMiaiCategoryApi.Params req, RequesterMiaiCategoryApi.Response res) {
        try {
            TbTalentLibstructExample talentLibstructExample = new TbTalentLibstructExample();
            talentLibstructExample.createCriteria().andLibIdNotEqualTo("-1");
            List<TbTalentLibstruct> list = talentLibstructMapper.selectByExample(talentLibstructExample);
            copy(res.body.list, list, TbTalentLibstructVo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }
}
