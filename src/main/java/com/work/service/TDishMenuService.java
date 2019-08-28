package com.work.service;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.work.bean.*;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.JSONResult;
import com.work.common.UUIDGeneratorUtil;
import com.work.common.enummodel.DishStatus;
import com.work.entity.*;
import com.work.mapper.*;
import net.sf.json.JSONException;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TDishMenuService {

    @Resource
    private TDishMenuMapper dishMenuMapper;

    @Resource
    private TDishPraiseMapper dishPraiseMapper;

    @Resource
    private TDishCommentMapper dishCommentMapper;

    @Resource
    private TDishBatchMapper dishBatchMapper;

    @Resource
    private TDishExchangeMapper dishExchangeMapper;

    @Resource
    private TSysUserinfoMapper sysUserinfoMapper;

    @Resource
    private TDishExempMapper dishExempMapper;

    @Resource
    private TDishOrderInfoMapper orderInfoMapper;

    @Resource
    private TDishProproalMapper proproalMapper;

    @Resource
    private TDishEmpCheckMapper checkMapper;

    @Resource
    private TDishMealMapper dishMealMapper;

    @Resource
    private TDishTakeMapper takeMapper;

    /**
     * 查询菜单列表
     *
     * @param bean
     * @return
     */
    public JSONResult selectDisMenu(DishMenuBean bean) {
        JSONResult result = JSONResult.getSuccess();
        StringBuffer px = new StringBuffer();
        if (StringUtils.isNotEmpty(bean.getPxCode()) && StringUtils.isNotEmpty(bean.getPxType())) {
            if (StringUtils.equals("0", bean.getPxCode())) {
                px.append("CLASSID ");
            } else {
                px.append("C ");
            }
            px.append(bean.getPxType());
        } else {
            px.append("C DESC");
        }
        PageHelper.startPage(bean.getPage(), bean.getPageSize(), px.toString());
        try {
            Map<String, Object> map = Maps.newHashMap();
            map.put("dishAreaName", DishStatus.getDesc(bean.getDishAreaName()));
            map.put("dishDate", DateUtil.defaultFormat(new Date()));
            map.put("dishname", bean.getKeyCode());
            List<TDishMenu> list = dishMenuMapper.selectDisMenu(map);
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
     * 详情
     *
     * @param bean
     * @return
     */
    public JSONResult selectDishDetail(DishMenuBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            Map<String, Object> map = Maps.newHashMap();
            map.put("dishid", bean.getDishid());
            map.put("dishDate", DateUtil.defaultFormat(new Date()));
            List<TDishMenu> list = dishMenuMapper.selectDisMenu(map);
            if (CollectionUtils.isEmpty(list)) {
                result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
            } else {
                TDishMenu dishMenu = list.get(0);
                String score = dishMenuMapper.selectDishScore(bean.getDishid());
                dishMenu.setScore(score);
                TDishPraiseExample praiseExample = new TDishPraiseExample();
                praiseExample.createCriteria().andEmpidEqualTo(bean.getEmpId()).andDishidEqualTo(bean.getDishid());
                List<TDishPraise> praises = dishPraiseMapper.selectByExample(praiseExample);
                dishMenu.setPraise(!CollectionUtils.sizeIsEmpty(praises));

                TDishTakeExample dishTakeExample = new TDishTakeExample();
                dishTakeExample.createCriteria()
                        .andTakedateEqualTo(DateUtil.defaultFormat(new Date()))
                        .andEmpidEqualTo(bean.getEmpId())
                        .andStatusEqualTo("1")
                        .andDishidEqualTo(bean.getDishid());
                List<TDishTake> listTakes = takeMapper.selectByExample(dishTakeExample);
                if (listTakes != null && listTakes.size() > 0) {
                    TDishTake dishTake = listTakes.get(0);
                    dishMenu.setTake(true);
                    dishMenu.setTakeId(dishTake.getId());
                } else {
                    dishMenu.setTake(false);
                }
                result.getBody().put("dish", dishMenu);
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
     * 取消预约
     *
     * @param bean
     * @return
     */
    public JSONResult deleteChangeTake(DishTakeBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            TDishTake dishTake = new TDishTake();
            dishTake.setId(bean.getId());
            dishTake.setStatus("0");
            takeMapper.updateByPrimaryKeySelective(dishTake);
            TDishCommentExample commentExample = new TDishCommentExample();
            commentExample.createCriteria().andEmpidEqualTo(bean.getEmpid()).andDishidEqualTo(bean.getDishid()).andCredateLike(DateUtil.defaultFormat(new Date()));
            List<TDishComment> listComments = dishCommentMapper.selectByExample(commentExample);
            //删除评论
            for (TDishComment tDishComment : listComments) {
                dishCommentMapper.deleteByPrimaryKey(tDishComment.getId());
            }
            //删除赞
            TDishPraiseExample dishPraiseExample = new TDishPraiseExample();
            dishPraiseExample.createCriteria().andEmpidEqualTo(bean.getEmpid()).andDishidEqualTo(bean.getDishid());
            List<TDishPraise> listPraises = dishPraiseMapper.selectByExample(dishPraiseExample);
            for (TDishPraise dishPraise : listPraises) {
                dishPraiseMapper.deletePraise(dishPraise.getId());
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
     * 评论列表
     *
     * @param bean
     * @return
     */
    public JSONResult selectDishComment(DishMenuBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            PageHelper.startPage(bean.getPage(), bean.getPageSize(), "CREDATE desc nulls last");
            TDishCommentExample commentExample = new TDishCommentExample();
            commentExample.createCriteria().andDishidEqualTo(bean.getDishid());
            List<TDishComment> list = dishCommentMapper.selectByExample(commentExample);
            for (TDishComment tDishComment : list) {
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(tDishComment.getEmpid());
                tDishComment.setFdHeadicon(userinfo.getFdHeadicon());
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
     * 评论成功
     *
     * @param bean
     * @return
     */
    public JSONResult saveComment(DishCommentBean bean) {
        JSONResult result = JSONResult.getSuccess("评论成功");
        try {
            TDishComment comment = new TDishComment();
            BeanUtils.copyProperties(comment, bean);
            comment.setId(UUIDGeneratorUtil.generate());
            comment.setCredate(DateUtil.formatDate(new Date()));
            TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getEmpid());
            if (userinfo != null) {
                comment.setEmpname(userinfo.getFdName());
            }
            dishCommentMapper.insertSelective(comment);
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
     * 添加赞
     *
     * @param bean
     * @return
     */
    public JSONResult savePraise(DishPraiseBean bean) {
        JSONResult result = JSONResult.getSuccess("点赞成功");
        try {
            TDishPraise praise = new TDishPraise();
            BeanUtils.copyProperties(praise, bean);
            praise.setId(UUIDGeneratorUtil.generate());
            TDishPraiseExample example = new TDishPraiseExample();
            example.createCriteria().andEmpidEqualTo(bean.getEmpid()).andDishidEqualTo(bean.getDishid());
            int siez = dishPraiseMapper.selectByExample(example).size();
            if (BooleanUtils.toBoolean(siez)) {
                result = JSONResult.getFail("您已点赞");
            } else {
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getEmpid());
                if (userinfo != null) {
                    praise.setEmpname(userinfo.getFdName());
                }
                praise.setPraisedate(DateUtil.defaultFormat(new Date()));
                dishPraiseMapper.insertSelective(praise);
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
     * 查询兑换列表
     *
     * @param bean
     * @return
     */
    public JSONResult selectListBatch(DishBatchBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {

            TDishExempExample dishExempExample = new TDishExempExample();
            dishExempExample.createCriteria().andEmpidEqualTo(bean.getEmpid()).andCredateLike(DateUtil.defaultFormat(new Date())).andStatusEqualTo("1");
            List<TDishExemp> listData = dishExempMapper.selectByExample(dishExempExample);
            if(listData!=null && !listData.isEmpty())
            {
                result = JSONResult.getFail(Constants.ERROE, "您当天的商品已兑换,无法再次进行兑换！");
            }
            else
            {
                TDishBatchExample dishBatchExample = new TDishBatchExample();
                dishBatchExample.setOrderByClause("ENDTIME DESC nulls last");
                dishBatchExample.createCriteria().andProductstatusEqualTo("1");
                PageHelper.startPage(1, 1);
                List<TDishBatch> list = dishBatchMapper.selectByExample(dishBatchExample);
                if (CollectionUtils.isNotEmpty(list)) {
                    TDishBatch batch = list.get(0);
                    TDishExchangeExample dishExchangeExample = new TDishExchangeExample();
                    dishExchangeExample.createCriteria().andBatchidEqualTo(batch.getBatchid());
                    List<TDishExchange> listDishExchanges = dishExchangeMapper.selectByExample(dishExchangeExample);
                    result.getBody().put("list", listDishExchanges);
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
     * 添加员工兑换
     *
     * @param bean
     * @return
     */
    public JSONResult saveOrder(DishExempBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            //判断是否有订单
            TDishExempExample dishExempExample = new TDishExempExample();
            dishExempExample.createCriteria().andEmpidEqualTo(bean.getEmpid()).andCredateLike(DateUtil.defaultFormat(new Date())).andStatusEqualTo("1");
            List<TDishExemp> list = dishExempMapper.selectByExample(dishExempExample);
            if (list != null && list.size() > 0) {
                result = JSONResult.getFail(Constants.ERROE, "当天订单已存在,无法添加");
            } else {
                TDishExemp dishExemp = new TDishExemp();
                BeanUtils.copyProperties(dishExemp, bean);
                dishExemp.setOrderid(UUIDGeneratorUtil.generate());
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getEmpid());
                dishExemp.setEmpname(userinfo.getFdName());
                dishExemp.setStatus("1");
                dishExemp.setCredate(DateUtil.defaultFormat(new Date()));
                dishExempMapper.insertSelective(dishExemp);
                for (TDishOrderInfo dishOrderInfo : bean.getOrders()) {
                    dishOrderInfo.setOrderid(dishExemp.getOrderid());
                    orderInfoMapper.insertSelective(dishOrderInfo);
                }
            }

			/*//插入订单数据
			for (DishExempBean exempBean : bean.getOrders()) {
				TDishExemp dishExemp = new TDishExemp();
				BeanUtils.copyProperties(dishExemp, exempBean);
				dishExemp.setOrderid(UUIDGeneratorUtil.generate());
				TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getEmpid());
				dishExemp.setEmpname(userinfo.getFdName());
				dishExempMapper.insertSelective(dishExemp);

				TDishOrderInfo tDishOrderInfo = new TDishOrderInfo();
				BeanUtils.copyProperties(tDishOrderInfo, exempBean);
				tDishOrderInfo.setOrderid(dishExemp.getOrderid());
				orderInfoMapper.insertSelective(tDishOrderInfo);
			}*/
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
     * 我的订单
     *
     * @param bean
     * @return
     */
    public JSONResult selectMyOrder(DishExempBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            List<TDishOrderInfo> listInfos = Lists.newArrayList();
            TDishExempExample example = new TDishExempExample();
            example.createCriteria().andEmpidEqualTo(bean.getEmpid());
            PageHelper.startPage(1, 1, "CREDATE DESC nulls last");
            List<TDishExemp> list = dishExempMapper.selectByExample(example);
            if (CollectionUtils.isNotEmpty(list)) {
                TDishExemp dishExemp = list.get(0);
                TDishOrderInfoExample orderInfoExample = new TDishOrderInfoExample();
                orderInfoExample.createCriteria().andOrderidEqualTo(dishExemp.getOrderid());
                listInfos = orderInfoMapper.selectByExample(orderInfoExample);
                for (TDishOrderInfo info : listInfos) {
                    TDishExchange exchange = dishExchangeMapper.selectByPrimaryKey(info.getProductid());
                    info.setExchange(exchange);
                }
            }
            result.getBody().put("list", listInfos);
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
     * 修改订单
     *
     * @param bean
     * @return
     */
    public JSONResult updateOrder(DishExempBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            //删除订单商品数据
            orderInfoMapper.deleteByOrderId(bean.getOrderid());
            for (TDishOrderInfo dishOrderInfo : bean.getOrders()) {
                dishOrderInfo.setOrderid(bean.getOrderid());
                orderInfoMapper.insertSelective(dishOrderInfo);
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
     * 删除订单
     *
     * @param bean
     * @return
     */
    public JSONResult deleteOrder(DishExempBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            //删除订单商品数据
            orderInfoMapper.deleteByOrderId(bean.getOrderid());
            
            TDishExemp exemp = new TDishExemp();
            exemp.setOrderid(bean.getOrderid());
            exemp.setStatus("0");
            dishExempMapper.updateByPrimaryKeySelective(exemp);
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
     * 食谱意见反馈
     *
     * @param bean
     * @return
     */
    public JSONResult saveFeedBack(DishProproalBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            TDishProproal proproal = new TDishProproal();
            BeanUtils.copyProperties(proproal, bean);
            proproal.setId(UUIDGeneratorUtil.generate());
            proproal.setCreatetime(DateUtil.formatDate(new Date()));
            proproal.setProposaltype(bean.getProposaltype());
            TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getEmpid());
            if (userinfo != null) {
                proproal.setEmpname(userinfo.getFdName());
            }
            proproalMapper.insert(proproal);
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
     * 外卖预约
     *
     * @param bean
     * @return
     */
    public JSONResult saveTake(DishTakeBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            TDishTake dishTake = new TDishTake();
            BeanUtils.copyProperties(dishTake, bean);
            dishTake.setId(UUIDGeneratorUtil.generate());
            TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(bean.getEmpid());
            if (userinfo != null) {
                dishTake.setEmpname(userinfo.getFdName());
            }
            dishTake.setStatus("1");
            dishTake.setCreatedate(DateUtil.defaultFormat(new Date()));
            dishTake.setTakedate(DateUtil.defaultFormat(new Date()));
            takeMapper.insertSelective(dishTake);
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
     * 签到
     *
     * @param bean
     * @return
     */
    public JSONResult selectUserCheck(Object bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            Map<String, Object> map = Maps.newHashMap();
            map.put("date", DateUtil.defaultFormat(new Date()));
            map.put("dishArea", "早餐");
            Integer zaocan = checkMapper.selectCheckNumCountByDate(map);
            map.put("dishArea", "中餐");
            Integer zhongcan = checkMapper.selectCheckNumCountByDate(map);
            map.put("dishArea", "晚餐");
            Integer wancan = checkMapper.selectCheckNumCountByDate(map);
            result.getBody().put("zaocanCount", String.valueOf(zaocan));
            result.getBody().put("zhongcanCount", String.valueOf(zhongcan));
            result.getBody().put("wancanCount", String.valueOf(wancan));

            TDishMealExample mealExample1 = new TDishMealExample();
            mealExample1.createCriteria().andDishareaLike("%早餐");
            List<TDishMeal> meals1 = dishMealMapper.selectByExample(mealExample1);
            for (TDishMeal tDishMeal : meals1) {
                Map<String, Object> map2 = Maps.newHashMap();
                map2.put("date", DateUtil.defaultFormat(new Date()));
                map2.put("mealId", tDishMeal.getMealid());
                Integer num = checkMapper.selectCheckNumCountByDate(map2);
                tDishMeal.setNum(String.valueOf(num));
            }
            result.getBody().put("zaocanList", meals1);

            TDishMealExample mealExample2 = new TDishMealExample();
            mealExample2.createCriteria().andDishareaLike("%中餐");
            List<TDishMeal> meals2 = dishMealMapper.selectByExample(mealExample2);
            for (TDishMeal tDishMeal : meals2) {
                Map<String, Object> map2 = Maps.newHashMap();
                map2.put("date", DateUtil.defaultFormat(new Date()));
                map2.put("mealId", tDishMeal.getMealid());
                Integer num = checkMapper.selectCheckNumCountByDate(map2);
                tDishMeal.setNum(String.valueOf(num));
            }
            result.getBody().put("zhongcanList", meals2);

            TDishMealExample mealExample3 = new TDishMealExample();
            mealExample3.createCriteria().andDishareaLike("%晚餐");
            List<TDishMeal> meals3 = dishMealMapper.selectByExample(mealExample3);
            for (TDishMeal tDishMeal : meals3) {
                Map<String, Object> map2 = Maps.newHashMap();
                map2.put("date", DateUtil.defaultFormat(new Date()));
                map2.put("mealId", tDishMeal.getMealid());
                Integer num = checkMapper.selectCheckNumCountByDate(map2);
                tDishMeal.setNum(String.valueOf(num));
            }
            result.getBody().put("wancanList", meals3);


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
     * 保存签到
     *
     * @param bean
     * @return
     */

    public JSONResult saveUserCheck(DishEmpCheckBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
        	TDishEmpCheckExample checkExample = new TDishEmpCheckExample();
        	checkExample.createCriteria().andEmpidEqualTo(bean.getEmpid()).andCheckdateEqualTo(DateUtil.defaultFormat(new Date()));
        	List<TDishEmpCheck> list = checkMapper.selectByExample(checkExample);
        	if (list != null && list.size() > 0) {
        	    for(TDishEmpCheck dishEmpCheck:list)
                {
                    checkMapper.deleteByPrimaryKey(dishEmpCheck.getId());
                }
        	}
            for (DishEmpCheckBean checkBean : bean.getChecks()) {
                TDishEmpCheck check = new TDishEmpCheck();
                BeanUtils.copyProperties(check, checkBean);
                check.setId(UUIDGeneratorUtil.generate());
                check.setCheckdate(DateUtil.defaultFormat(new Date()));
                check.setStatus("1");
                TSysUserinfo userinfo = sysUserinfoMapper.selectByPrimaryKey(checkBean.getEmpid());
                if (userinfo != null) {
                    check.setEmpname(userinfo.getFdName());
                } else {
                    check.setEmpname(checkBean.getEmpid());
                }
                checkMapper.insertSelective(check);
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
     * 签到状态
     *
     * @param bean
     * @return
     */
    public JSONResult selectCheckStatus(DishEmpCheckBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            TDishEmpCheckExample checkExample = new TDishEmpCheckExample();
            checkExample.createCriteria().andEmpidEqualTo(bean.getEmpid()).andCheckdateEqualTo(DateUtil.defaultFormat(new Date()));
            List<TDishEmpCheck> list = checkMapper.selectByExample(checkExample);
            boolean isZaocan = false;
            boolean isZhongcan = false;
            boolean isWancan = false;
            String zaocanid = "";
            String zhongcanid = "";
            String wancanid = "";
            for (TDishEmpCheck tDishEmpCheck : list) {
                TDishMealExample example = new TDishMealExample();
                if (!isZaocan) {
                    example.createCriteria().andMealidEqualTo(tDishEmpCheck.getMealid()).andDishareaLike("%早餐");
                    List<TDishMeal> listMeals = dishMealMapper.selectByExample(example);
                    if (CollectionUtils.isNotEmpty(listMeals)) {
                        zaocanid = listMeals.get(0).getMealid();
                        isZaocan = true;
                    }
                }
                if (!isZhongcan) {
                    example = new TDishMealExample();
                    example.createCriteria().andMealidEqualTo(tDishEmpCheck.getMealid()).andDishareaLike("%中餐");
                    List<TDishMeal> listMeals = dishMealMapper.selectByExample(example);
                    if (CollectionUtils.isNotEmpty(listMeals)) {
                        zhongcanid = listMeals.get(0).getMealid();
                        isZhongcan = true;
                    }
                }
                if (!isWancan) {
                    example = new TDishMealExample();
                    example.createCriteria().andMealidEqualTo(tDishEmpCheck.getMealid()).andDishareaLike("%晚餐");
                    List<TDishMeal> listMeals = dishMealMapper.selectByExample(example);
                    if (CollectionUtils.isNotEmpty(listMeals)) {
                        wancanid = listMeals.get(0).getMealid();
                        isWancan = true;
                    }
                }
            }
            result.getBody().put("isZaocan", isZaocan);
            result.getBody().put("isZhongcan", isZhongcan);
            result.getBody().put("isWancan", isWancan);
            result.getBody().put("zaocanid", zaocanid);
            result.getBody().put("zhongcanid", zhongcanid);
            result.getBody().put("wancanid", wancanid);
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
     * 取消签到时间
     *
     * @param bean
     * @return
     */
    public JSONResult deleteDishTimeById(DishEmpCheckBean bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            dishMenuMapper.deleteDishTimeById(bean);
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
    
    
    public JSONResult selectListDishBatch(DishBatchBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(), bean.getPageSize(),"STARTIME ASC");
			TDishBatchExample batchExample = new TDishBatchExample();
			batchExample.createCriteria().andProductstatusEqualTo("1")
			.andStartimeLessThanOrEqualTo(DateUtil.dateToString(new Date(), "yyyy-MM-dd HH:mm"))
			.andEndtimeGreaterThanOrEqualTo(DateUtil.dateToString(new Date(), "yyyy-MM-dd HH:mm"));
			List<TDishBatch> list = dishBatchMapper.selectByExample(batchExample);
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
    
    
    public JSONResult selectDishExChangeList(DishBatchBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
            TDishExempExample dishExempExample = new TDishExempExample();
            dishExempExample.createCriteria().andEmpidEqualTo(bean.getEmpid())
                     //.andCredateLike(DateUtil.defaultFormat(new Date())).
                    .andBatchidEqualTo(bean.getBatchid())
                    .andStatusEqualTo("1");
            List<TDishExemp> listData = dishExempMapper.selectByExample(dishExempExample);
            if(listData!=null && !listData.isEmpty())
            {
                result = JSONResult.getFail(Constants.ERROE, "该批次您已提交了订单，请在我的订单中修改！");
            }
            else {
                PageHelper.startPage(bean.getPage(), bean.getPageSize());
                TDishExchangeExample dishExchangeExample = new TDishExchangeExample();
                dishExchangeExample.createCriteria().andBatchidEqualTo(bean.getBatchid());
                List<TDishExchange> listDishExchanges = dishExchangeMapper.selectByExample(dishExchangeExample);
                result.getBody().put("list", listDishExchanges);
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
    
    public JSONResult selectEmpOrderList(DishExempBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(),bean.getPageSize(),"CREDATE desc nulls last");
			TDishExempExample dishExempExample = new TDishExempExample();
            dishExempExample.createCriteria().andEmpidEqualTo(bean.getEmpid()).andStatusEqualTo("1");
            List<TDishExemp> listData = dishExempMapper.selectByExample(dishExempExample);
            for (TDishExemp tDishExemp : listData) {
            	if(StringUtils.isNotEmpty(tDishExemp.getBatchid())){
	            	TDishBatch batch = dishBatchMapper.selectByPrimaryKey(tDishExemp.getBatchid());
	            	tDishExemp.setBatchname(batch.getBatchname());
	            	tDishExemp.setStartime(batch.getStartime());
	            	tDishExemp.setEndtime(batch.getEndtime());
            	}
            	Double d = orderInfoMapper.selectSumTotlprice(tDishExemp.getOrderid());
            	tDishExemp.setTotprice(d);
			}
            result.getBody().put("list", listData);
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
    
    
    public JSONResult selectEmpOrderDetail(DishExempBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(),bean.getPageSize());
			TDishOrderInfoExample orderInfoExample = new TDishOrderInfoExample();
            orderInfoExample.createCriteria().andOrderidEqualTo(bean.getOrderid());
            List<TDishOrderInfo> listInfos = orderInfoMapper.selectByExample(orderInfoExample);
            for (TDishOrderInfo info : listInfos) {
                TDishExchange exchange = dishExchangeMapper.selectByPrimaryKey(info.getProductid());
                info.setExchange(exchange);
            }
            result.getBody().put("list", listInfos);
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
