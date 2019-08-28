package com.work.service.v3;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Maps;
import com.work.api.v3.miai.*;
import com.work.api.v3.miai.bean.DatingInfoBean;
import com.work.api.v3.miai.vo.DatingInfoVo;
import com.work.api.v3.miai.vo.DatingQueryListVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.SQLAdapter;
import com.work.entity.AppLoginUser;
import com.work.entity.TbUserCommonFiles;
import com.work.entity.TbUserCommonFilesExample;
import com.work.entity.dating.*;
import com.work.mapper.TbUserCommonFilesMapper;
import com.work.mapper.dating.TBUserDatingInfoMapper;
import com.work.mapper.dating.TbUserDatingPublicMapper;
import com.work.mapper.dating.TbUserMarryStandardMapper;
import com.work.mappercommon.CommonMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;


/**
 * 缘聚中行
 * Created by changzhou on 2017/4/21.
 */
@Service("miaiService")
public class MiaiService extends BaseRequester {

    @Resource
    private TBUserDatingInfoMapper userDatingInfoMapper;

    @Resource
    private UserService userService;

    /**
     * 红娘mapper
     */
    @Resource
    private TbUserMarryStandardMapper userMarryStandardMapper;

    @Resource
    private TbUserDatingPublicMapper userDatingPublicMapper;

    @Resource
    private TbUserCommonFilesMapper commonFilesMapper;

    @Resource
    private CommonMapper commonMapper;


    /**
     * @param req
     * @param res
     * @description 缘聚中行--用户详情
     */
    public void getDatingUserInfo(RequesterUserDatingInfoApi.Params req, RequesterUserDatingInfoApi.Response res) {
        try {
            //用户基本信息
            AppLoginUser loginUser = userService.selectUserById(req.userId);
            res.body.userid = loginUser.userid;
            res.body.birthday = loginUser.birthday;
            res.body.dept = loginUser.orgname;
            res.body.headimg = loginUser.headimg;
            res.body.name = loginUser.name;
            res.body.phone = loginUser.phone;
            res.body.sex = loginUser.sex;
            res.body.telephone = loginUser.telephone;

            //婚恋信息
            TBUserDatingInfoExample userDatingInfoExample = new TBUserDatingInfoExample();
            userDatingInfoExample.createCriteria().andUserIdEqualTo(req.userId);
            List<TBUserDatingInfo> list = userDatingInfoMapper.selectByExample(userDatingInfoExample);
            if (list.size() > 0) {
                TBUserDatingInfo datingInfo = list.get(0);
                DatingInfoVo heightVo = getDatingVo("height", datingInfo.getHeight(), datingInfo.getId(),"1");
                res.body.datingInfolist.add(heightVo);

                DatingInfoVo weightVo = getDatingVo("weight", datingInfo.getWeight(), datingInfo.getId(),"1");
                res.body.datingInfolist.add(weightVo);

                DatingInfoVo interestingVo = getDatingVo("interesting", datingInfo.getInteresting(), datingInfo.getId(),"1");
                res.body.datingInfolist.add(interestingVo);

                DatingInfoVo characteristicsVo = getDatingVo("characteristics", datingInfo.getCharacteristics(), datingInfo.getId(),"1");
                res.body.datingInfolist.add(characteristicsVo);

                DatingInfoVo ismarriedVo = getDatingVo("ismarried", datingInfo.getIsMarried(), datingInfo.getId(),"1");
                res.body.datingInfolist.add(ismarriedVo);

                DatingInfoVo childrenVo = getDatingVo("children", datingInfo.getChildren(), datingInfo.getId(),"1");
                res.body.datingInfolist.add(childrenVo);

                TbUserCommonFilesExample userCommonFilesExample = new TbUserCommonFilesExample();
                userCommonFilesExample.createCriteria().andFkIdEqualTo(datingInfo.getId());
                List<TbUserCommonFiles> list1 = commonFilesMapper.selectByExample(userCommonFilesExample);
                for (TbUserCommonFiles userCommonFiles : list1) {
                    res.body.imgs.add(userCommonFiles.getFilePath());
                }

            }

            //择偶标准
            TbUserMarryStandardExample userMarryStandardExample = new TbUserMarryStandardExample();
            userMarryStandardExample.createCriteria().andUserIdEqualTo(req.userId);
            List<TbUserMarryStandard> standardList = userMarryStandardMapper.selectByExample(userMarryStandardExample);
            if (standardList.size() > 0) {
                TbUserMarryStandard userMarryStandard = standardList.get(0);

                DatingInfoVo ageVo = getDatingVo("age", userMarryStandard.getAge(), userMarryStandard.getId(),"2");
                res.body.marryStandardlist.add(ageVo);

                DatingInfoVo heightVo = getDatingVo("height", userMarryStandard.getHeight(), userMarryStandard.getId(),"2");
                res.body.marryStandardlist.add(heightVo);

                DatingInfoVo weightVo = getDatingVo("weight", userMarryStandard.getWeight(), userMarryStandard.getId(),"2");
                res.body.marryStandardlist.add(weightVo);

                DatingInfoVo interestingVo = getDatingVo("interesting", userMarryStandard.getInteresting(), userMarryStandard.getId(),"2");
                res.body.marryStandardlist.add(interestingVo);

                DatingInfoVo characteristicsVo = getDatingVo("characteristics", userMarryStandard.getCharacteristics(), userMarryStandard.getId(),"2");
                res.body.marryStandardlist.add(characteristicsVo);

                DatingInfoVo ismarriedVo = getDatingVo("ismarried", userMarryStandard.getIsMarried(), userMarryStandard.getId(),"2");
                res.body.marryStandardlist.add(ismarriedVo);

                DatingInfoVo childrenVo = getDatingVo("children", userMarryStandard.getChildren(), userMarryStandard.getId(),"2");
                res.body.marryStandardlist.add(childrenVo);

            }


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }


    /**
     * @param req
     * @param res
     * @description 缘聚中行--发现列表
     */
    public void selectDiscoveryList(RequesterDiscoveryListApi.Params req, RequesterDiscoveryListApi.Response res) {
        try {
            AppLoginUser appLoginUser = userService.selectUserById(req.userId);
            String[] height = null;
            if(!empty(req.height))
                height = req.height.split("-");

            String[] weight = null;
            if(!empty(req.weight))
                weight = req.weight.split("-");

            String[] age = null;
            String age1 = "";
            String age2 = "";
            if(!empty(req.age)) {
                age = req.age.split("-");
                age1 = DateUtil.dateToString(DateUtil.getYear(new Date(), -Integer.valueOf(age[0])), "yyyy-MM-dd");
                age2 = DateUtil.dateToString(DateUtil.getYear(new Date(), -Integer.valueOf(age[1])), "yyyy-MM-dd");
            }

            String sex = "1";
            if (1 == appLoginUser.sex) {
                sex = "0";
            }

            TBUserDatingInfoExample userDatingInfoExample = new TBUserDatingInfoExample();
            TBUserDatingInfoExample.Criteria criteria = userDatingInfoExample.createCriteria();
            criteria.andStatusEqualTo("02").andSexEqualTo(sex);
            if(height!=null){
                criteria.andHeightBetween(height[0], height[1]);
            }
            if(weight!=null){
                criteria.andWeightBetween(weight[0], weight[1]);
            }
            if(age!=null){
                criteria.andBirthdayGreaterThanOrEqualTo(age2).andBirthdayLessThanOrEqualTo(age1);
            }
            if(!empty(req.constellation)){
                criteria.andConstellationEqualTo(req.constellation);
            }

            PageHelper.startPage(req.page, req.pageSize);
            List<TBUserDatingInfo> userDatingInfoList = userDatingInfoMapper.selectByExample(userDatingInfoExample);
            for (TBUserDatingInfo userDatingInfo : userDatingInfoList) {
                AppLoginUser user = userService.selectUserById(userDatingInfo.getUserId());
                DatingQueryListVo datingQueryListVo = new DatingQueryListVo();
                datingQueryListVo.empId = userDatingInfo.getUserId();
                datingQueryListVo.empName = user.name;
                datingQueryListVo.headicon = user.headimg;
                datingQueryListVo.description = user.atigraph;
                datingQueryListVo.deptName = user.orgname;
                if(!empty(userDatingInfo.getBirthday())) {
                    int age3 = DateUtil.getAge(DateUtil.StringToDate(user.birthday, "yyyy-MM-dd"));
                    datingQueryListVo.age = String.valueOf(age3);//isPublic("age", userDatingInfo.getId(), "1") ? String.valueOf(age3) : "";
                }else{
                    datingQueryListVo.age = "";
                }
                datingQueryListVo.height = isPublic("height", userDatingInfo.getId(),"1") ? userDatingInfo.getHeight() : "";
                datingQueryListVo.weight = isPublic("weight", userDatingInfo.getId(),"1") ? userDatingInfo.getWeight() : "";
                datingQueryListVo.constellation = isPublic("constellation", userDatingInfo.getId(),"1") ? userDatingInfo.getConstellation() : "";

                TbUserCommonFilesExample userCommonFilesExample = new TbUserCommonFilesExample();
                userCommonFilesExample.createCriteria().andFkIdEqualTo(userDatingInfo.getId());
                List<TbUserCommonFiles> userCommonFileslist = commonFilesMapper.selectByExample(userCommonFilesExample);
                if (userCommonFileslist.size() > 0) {
                    datingQueryListVo.indexlogo = userCommonFileslist.get(0).getFilePath();
                }
                res.body.list.add(datingQueryListVo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * @param req
     * @param res
     * @description 缘聚中行--判断用户是否填写了个人信息
     */
    public void selectUserIsEdit(RequesterUserIsEditApi.Params req, RequesterUserIsEditApi.Response res) {
        try {
            TBUserDatingInfoExample userDatingInfoExample = new TBUserDatingInfoExample();
            userDatingInfoExample.createCriteria().andUserIdEqualTo(req.userId).andStatusNotEqualTo("04");
            List<TBUserDatingInfo> count = userDatingInfoMapper.selectByExample(userDatingInfoExample);
            if(count.size()==0){
                //0：已填写审批通过 1：未填写 2：未审核 3：审核未通过
                res.body.isFill = "1";
            }else{
                TBUserDatingInfo userDatingInfo = count.get(0);
                if("02".equals(userDatingInfo.getStatus())){
                    res.body.isFill = "0";
                } else if("01".equals(userDatingInfo.getStatus())){
                    res.body.isFill = "2";
                }else if("03".equals(userDatingInfo.getStatus())){
                    res.body.isFill = "3";
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
     * @description 缘聚中行--编辑个人相亲信息
     */
    public void updateUserMiaiInfo(RequesterUserInfoEditApi.Params req, RequesterUserInfoEditApi.Response res) {
        try {
            AppLoginUser appLoginUser = userService.selectUserById(req.userId);

            //判断婚恋基本信息是否有数据
            TBUserDatingInfoExample userDatingInfoExample = new TBUserDatingInfoExample();
            userDatingInfoExample.createCriteria().andUserIdEqualTo(req.userId);
            List<TBUserDatingInfo> listdating = userDatingInfoMapper.selectByExample(userDatingInfoExample);
            if (listdating.size() > 0) {  //基本信息
                TBUserDatingInfo userDatingInfo = listdating.get(0);
                userDatingInfo = (TBUserDatingInfo) getBeanInfo(null, userDatingInfo, req.listDating, "1").get("userDatingInfo");
                userDatingInfo.setBirthday(appLoginUser.birthday);
                userDatingInfo.setSelfDescription(appLoginUser.atigraph);
                userDatingInfo.setSex(String.valueOf(appLoginUser.sex));
                userDatingInfo.setUpdateTime(DateUtil.formatDate(new Date()));
                userDatingInfo.setStatus("01");//审批中
                userDatingInfoMapper.updateByPrimaryKeySelective(userDatingInfo);
                saveUserDatingPublic(req.listDating, userDatingInfo.getId());
                //后面添加图片逻辑

                //先删除原有的数据
                TbUserCommonFilesExample userCommonFilesExample = new TbUserCommonFilesExample();
                userCommonFilesExample.createCriteria().andFkIdEqualTo(userDatingInfo.getId());
                commonFilesMapper.deleteByExample(userCommonFilesExample);

                //插入新的数据
                for (String img : req.imgs) {
                    TbUserCommonFiles userCommonFiles = new TbUserCommonFiles();
                    userCommonFiles.setId(uuid());
                    userCommonFiles.setFilePath(img);
                    userCommonFiles.setFkId(userDatingInfo.getId());
                    userCommonFiles.setCreateTime(DateUtil.formatDate(new Date()));
                    commonFilesMapper.insertSelective(userCommonFiles);
                }

            } else {
                TBUserDatingInfo userDatingInfo = new TBUserDatingInfo();
                userDatingInfo.setId(uuid());
                userDatingInfo.setUserId(req.userId);
                userDatingInfo.setBirthday(appLoginUser.birthday);
                userDatingInfo.setSex(String.valueOf(appLoginUser.sex));
                userDatingInfo.setCreateTime(DateUtil.formatDate(new Date()));
                userDatingInfo.setSelfDescription(appLoginUser.atigraph);
                userDatingInfo.setStatus("01");//审批中
                userDatingInfo = (TBUserDatingInfo) getBeanInfo(null, userDatingInfo, req.listDating, "1").get("userDatingInfo");
                userDatingInfoMapper.insertSelective(userDatingInfo);
                saveUserDatingPublic(req.listDating, userDatingInfo.getId());
                //后面添加图片逻辑
                for (String img : req.imgs) {
                    TbUserCommonFiles userCommonFiles = new TbUserCommonFiles();
                    userCommonFiles.setId(uuid());
                    userCommonFiles.setFilePath(img);
                    userCommonFiles.setFkId(userDatingInfo.getId());
                    userCommonFiles.setCreateTime(DateUtil.formatDate(new Date()));
                    commonFilesMapper.insertSelective(userCommonFiles);
                }

            }

            //判断择偶信息是否已有数据
            TbUserMarryStandardExample userMarryStandardExample = new TbUserMarryStandardExample();
            userMarryStandardExample.createCriteria().andUserIdEqualTo(req.userId);
            List<TbUserMarryStandard> list = userMarryStandardMapper.selectByExample(userMarryStandardExample);
            if (list.size() > 0) {  //择偶标准
                TbUserMarryStandard userMarryStandard = list.get(0);
                userMarryStandard = (TbUserMarryStandard) getBeanInfo(userMarryStandard, null, req.listDating, "2").get("userMarryStandard");
                userMarryStandardMapper.updateByPrimaryKeySelective(userMarryStandard);
                saveUserDatingPublic(req.listDating, userMarryStandard.getId());
            } else {
                TbUserMarryStandard userMarryStandard = new TbUserMarryStandard();
                userMarryStandard.setId(uuid());
                userMarryStandard.setUserId(req.userId);
                userMarryStandard = (TbUserMarryStandard) getBeanInfo(userMarryStandard, null, req.listDating, "2").get("userMarryStandard");
                userMarryStandardMapper.insertSelective(userMarryStandard);
                saveUserDatingPublic(req.listDating, userMarryStandard.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

    /**
     * 添加信息是否公开关联表
     *
     * @param listDating
     * @param id
     */
    public void saveUserDatingPublic(List<DatingInfoBean> listDating, String id) {
        TbUserDatingPublicExample userDatingPublicExample = new TbUserDatingPublicExample();
        userDatingPublicExample.createCriteria().andRecordIdEqualTo(id);
        userDatingPublicMapper.deleteByExample(userDatingPublicExample);
        listDating.stream().forEach(bean -> {
            TbUserDatingPublic datingPublic = new TbUserDatingPublic();
            datingPublic.setId(uuid());
            datingPublic.setCreateTime(DateUtil.formatDate(new Date()));
            datingPublic.setpKey(bean.key);
            datingPublic.setpValue(bean.isPublic ? "0" : "1");
            datingPublic.setRecordId(id);
            datingPublic.setRecordType(bean.type);
            userDatingPublicMapper.insertSelective(datingPublic);
        });
    }

    /**
     * 封装择偶标准对象
     *
     * @param userMarryStandard
     * @param listDating
     * @return
     */
    public Map<String, Object> getBeanInfo(TbUserMarryStandard userMarryStandard, TBUserDatingInfo userDatingInfo, List<DatingInfoBean> listDating, String type) {
        DatingInfoBean heightBean = getDatingInfoBean(listDating, "height", type);
        if (userMarryStandard != null)
            userMarryStandard.setHeight(heightBean.value);//身高
        if (userDatingInfo != null)
            userDatingInfo.setHeight(heightBean.value);

        if(type.equals("2")){
            DatingInfoBean ageBean = getDatingInfoBean(listDating, "age", type);
            if (userMarryStandard != null)
                userMarryStandard.setAge(ageBean.value);//年龄
        }


        DatingInfoBean characteristicsBean = getDatingInfoBean(listDating, "characteristics", type);
        if (userMarryStandard != null)
            userMarryStandard.setCharacteristics(characteristicsBean.value);//性格特点
        if (userDatingInfo != null)
            userDatingInfo.setCharacteristics(characteristicsBean.value);

        DatingInfoBean childrenBean = getDatingInfoBean(listDating, "children", type);
        if (userMarryStandard != null)
            userMarryStandard.setChildren(childrenBean.value);//子女情况
        if (userDatingInfo != null)
            userDatingInfo.setChildren(childrenBean.value);

        if (type.equals("1")) {
            DatingInfoBean constellationBean = getDatingInfoBean(listDating, "constellation", type);
            if (userDatingInfo != null)
                userDatingInfo.setConstellation(constellationBean.value);
        }

        DatingInfoBean interestingBean = getDatingInfoBean(listDating, "interesting", type);
        if (userMarryStandard != null)
            userMarryStandard.setInteresting(interestingBean.value);//兴趣爱好
        if (userDatingInfo != null)
            userDatingInfo.setInteresting(interestingBean.value);

        DatingInfoBean ismarriedBean = getDatingInfoBean(listDating, "ismarried", type);
        if (userMarryStandard != null)
            userMarryStandard.setIsMarried(ismarriedBean.value);//婚姻状态
        if (userDatingInfo != null)
            userDatingInfo.setIsMarried(ismarriedBean.value);

        DatingInfoBean weightBean = getDatingInfoBean(listDating, "weight", type);
        if (userMarryStandard != null)
            userMarryStandard.setWeight(weightBean.value);//体重
        if (userDatingInfo != null)
            userDatingInfo.setWeight(weightBean.value);

        Map<String, Object> map = Maps.newHashMap();
        map.put("userMarryStandard", userMarryStandard);
        map.put("userDatingInfo", userDatingInfo);
        return map;
    }

    /**
     * 根据Key Type查询相亲信息数据
     *
     * @param listDating
     * @param key
     * @param type
     * @return
     */
    public DatingInfoBean getDatingInfoBean(List<DatingInfoBean> listDating, String key, String type) {
        Optional<DatingInfoBean> datingInfoBean = listDating.stream().
                filter(bean -> key.equals(bean.key)).
                filter(bean -> type.equals(bean.type)).
                findFirst();
        if (datingInfoBean != null) {
            if (datingInfoBean.isPresent()){
                return datingInfoBean.get();
            }else{
                return new DatingInfoBean();
            }

        } else {
            return new DatingInfoBean();
        }
    }

    /**
     * 根据键判断值是否公开
     *
     * @param key
     * @param id
     * @return
     */
    public boolean isPublic(String key, String id,String type) {
        TbUserDatingPublicExample userDatingPublicExample = new TbUserDatingPublicExample();
        userDatingPublicExample.createCriteria().andRecordIdEqualTo(id).andPKeyEqualTo(key).andRecordTypeEqualTo(type);
        List<TbUserDatingPublic> list = userDatingPublicMapper.selectByExample(userDatingPublicExample);
        if (list.size() > 0) {
            TbUserDatingPublic userDatingPublic = list.get(0);
            if (userDatingPublic.getpValue()!=null && userDatingPublic.getpValue().equals("0")) {
                return true;
            }
        }
        return false;
    }

    /**
     * 封装详情返回的对象
     *
     * @param key
     * @param value
     * @param id
     * @return
     */
    public DatingInfoVo getDatingVo(String key, String value, String id,String type) {
        DatingInfoVo heightVo = new DatingInfoVo();
        heightVo.key = key;
        heightVo.value = value;
        heightVo.isPublic = isPublic(key, id,type);
        heightVo.type = type;
        return heightVo;
    }

    /**
     * @param req
     * @param res
     * @description 缘聚中行--系统推荐
     */
    public void selectSystemRecommendList(RequesterSystemRecommendListApi.Params req, RequesterSystemRecommendListApi.Response res) {
        try {
            List<DatingQueryListVo> datingQueryListVoList = new ArrayList<>();

            AppLoginUser appLoginUser = userService.selectUserById(req.empId);
            //判断择偶信息是否已有数据
            TbUserMarryStandardExample userMarryStandardExample = new TbUserMarryStandardExample();
            userMarryStandardExample.createCriteria().andUserIdEqualTo(req.empId);
            List<TbUserMarryStandard> list = userMarryStandardMapper.selectByExample(userMarryStandardExample);
            if (list.size() > 0) {  //择偶标准
                TbUserMarryStandard userMarryStandard = list.get(0);
                String[] height = userMarryStandard.getHeight().split("-");
                String[] weight = userMarryStandard.getWeight().split("-");
                String[] age = userMarryStandard.getAge().split("-");
                String children = userMarryStandard.getChildren();
                String married = userMarryStandard.getIsMarried();
                String sex = "0";
                if (0 == appLoginUser.sex) {
                    sex = "1";
                }
                //1997
                //String age1 = DateUtil.dateToString(DateUtil.getYear(new Date(), -Integer.valueOf(age[0])), "yyyy-MM-dd");
                //1987
                //String age2 = DateUtil.dateToString(DateUtil.getYear(new Date(), -Integer.valueOf(age[1])), "yyyy-MM-dd");
                String sql = "select * from (select * from TB_USER_DATING_INFO order by dbms_random.value) where sex = '"+sex+"' and rownum <= 10";
                List<Map<String,Object>> userDatingInfoList = commonMapper.selectCommonSql(new SQLAdapter(sql));
                for (Map<String,Object> map : userDatingInfoList) { //计算匹配度
                    //System.out.println(toJson(map));
                    Integer keyValue = 0;
                    String heightMap = ObjectUtils.toString(map.get("HEIGHT"),"0");
                    String weightMap = ObjectUtils.toString(map.get("WEIGHT"),"0");
                    String ageMap = ObjectUtils.toString(map.get("BIRTHDAY"),"");

                    String childrenMap = ObjectUtils.toString(map.get("CHILDREN"),"0");
                    String marriedMap = ObjectUtils.toString(map.get("MARRIED"),"0");
                    //System.out.println("heightMap:"+heightMap);
                    //System.out.println("height[0]:"+height[0]);
                    //System.out.println("height[0]:"+height[1]);
                    if(Integer.valueOf(height[0])<=Integer.valueOf(heightMap)&&Integer.valueOf(height[1])>=Integer.valueOf(heightMap)){
                        keyValue = keyValue + 20;
                    }
//                    System.out.println("weightMap:"+weightMap);
//                    System.out.println("weight[0]:"+weight[0]);
//                    System.out.println("weight[0]:"+weight[1]);
                    if(Integer.valueOf(weight[0])<=Integer.valueOf(weightMap)&&Integer.valueOf(weight[1])>=Integer.valueOf(weightMap)){
                        keyValue = keyValue + 20;
                    }
                    //System.out.println("ageMap:"+ageMap);
                    if(!empty(ageMap)) {
                        int ageDate = DateUtil.getAge(DateUtil.StringToDate(ageMap,"yyyy-MM-dd"));
//                        System.out.println("ageDate:"+ageDate);
//                        System.out.println("age[0]:"+age[0]);
//                        System.out.println("age[0]:"+age[1]);
                        if (Integer.valueOf(age[0]) <= ageDate && Integer.valueOf(age[1]) >= ageDate) {
                            keyValue = keyValue + 20;
                        }
                    }
//                    System.out.println("childrenMap:"+childrenMap);
//                    System.out.println("children:"+children);
                    if(childrenMap.equals(children)){
                        keyValue = keyValue + 20;
                    }
//                    System.out.println("marriedMap:"+marriedMap);
//                    System.out.println("married:"+married);
                    if(marriedMap.equals(married)){
                        keyValue = keyValue + 20;
                    }
                    map.put("keyValue",keyValue);
                    //System.out.println(keyValue);
                }
                userDatingInfoList.sort((dating1,dating2)->String.valueOf(dating2.get("keyValue")).compareTo(String.valueOf(dating1.get("keyValue"))));
                for (Map<String, Object> stringObjectMap : userDatingInfoList) {
                    //System.out.println(toJson(stringObjectMap));
                    AppLoginUser user = userService.selectUserById(ObjectUtils.toString(stringObjectMap.get("USER_ID")));
                    DatingQueryListVo datingQueryListVo = new DatingQueryListVo();
                    datingQueryListVo.empId = user.userid;
                    datingQueryListVo.empName = user.name;
                    datingQueryListVo.headicon = user.headimg;
                    datingQueryListVo.description = user.atigraph;
                    datingQueryListVo.deptName = user.orgname;
                    datingQueryListVo.keyValue = ObjectUtils.toString(stringObjectMap.get("keyValue"));

                    Integer age3 = 0;
                    //System.out.println("bir:"+ObjectUtils.toString(stringObjectMap.get("BIRTHDAY")));
                    age3 = DateUtil.getAge(DateUtil.StringToDate(user.birthday, DateUtil.formatYMD));
                    datingQueryListVo.age = String.valueOf(age3);//isPublic("age", ObjectUtils.toString(stringObjectMap.get("ID")),"1") ? String.valueOf(age3) : "";
                    datingQueryListVo.height = isPublic("height", ObjectUtils.toString(stringObjectMap.get("ID")),"1") ? ObjectUtils.toString(stringObjectMap.get("HEIGHT")) : "";
                    datingQueryListVo.weight = isPublic("weight", ObjectUtils.toString(stringObjectMap.get("ID")),"1") ? ObjectUtils.toString(stringObjectMap.get("WEIGHT")) : "";
                    datingQueryListVo.constellation = isPublic("constellation", ObjectUtils.toString(stringObjectMap.get("ID")),"1") ? ObjectUtils.toString(stringObjectMap.get("CONSTELLATION")) : "";

                    TbUserCommonFilesExample userCommonFilesExample = new TbUserCommonFilesExample();
                    userCommonFilesExample.createCriteria().andFkIdEqualTo(ObjectUtils.toString(stringObjectMap.get("ID")));
                    List<TbUserCommonFiles> userCommonFileslist = commonFilesMapper.selectByExample(userCommonFilesExample);
                    if (userCommonFileslist.size() > 0) {
                        datingQueryListVo.indexlogo = userCommonFileslist.get(0).getFilePath();
                    }
                    datingQueryListVoList.add(datingQueryListVo);
                }
            }
            res.body.list = datingQueryListVoList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }
}
