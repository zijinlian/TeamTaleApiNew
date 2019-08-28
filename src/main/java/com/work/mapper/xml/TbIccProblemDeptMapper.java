package com.work.mapper.xml;

import com.work.bean.NewsBean;
import com.work.entity.TAppDailyNews;
import com.work.entity.TbIccProblemDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbIccProblemDeptMapper {
	
	List<TbIccProblemDept>  selectTbIByProDepId ();
}