package com.work.mapper;

import java.util.List;
import java.util.Map;

import com.work.bean.BankCircleBean;
import com.work.bean.BankCircleImgBean;
import com.work.entity.TBankCircle;
import com.work.entity.TBankCircleExample;
import com.work.entity.TBankCircleImg;

public interface TBankCircleMapper {
    int deleteByPrimaryKey(String id);

    int insert(TBankCircle record);

    int insertSelective(TBankCircle record);
    
    List<TBankCircle> selectByExample(TBankCircleExample example);

    TBankCircle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TBankCircle record);

    int updateByPrimaryKey(TBankCircle record);
    
    String queryUnitCodeByEmpId(String empid);
    
    void saveBankCircleImg(BankCircleImgBean bean);
    
    List<TBankCircle> selectListDeptBankCircle(Map<String, Object> map);
    
    List<TBankCircleImg> selectBankCircleImgListByCId(String circleId);
    
    List<TBankCircle> selectListPublicBankCircle();
    
    List<TBankCircle> selectListHotBankCircle();
    
    List<TBankCircle> selectMyListBankCircle(BankCircleBean empId);
    
    //判断用户是否是 部门副总/二级分行副行长及以上人员
    int selectUserisDeptOrOrgManager(String empId);
    
    //判断用户是否是省行副行长及以上的人  
    int selectUserIsOrgManager(String empId);
}