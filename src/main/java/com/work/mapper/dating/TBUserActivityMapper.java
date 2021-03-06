package com.work.mapper.dating;

import com.work.entity.dating.TBUserActivity;
import com.work.entity.dating.TBUserActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBUserActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int countByExample(TBUserActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int deleteByExample(TBUserActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int insert(TBUserActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int insertSelective(TBUserActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    List<TBUserActivity> selectByExampleWithBLOBs(TBUserActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    List<TBUserActivity> selectByExample(TBUserActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    TBUserActivity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int updateByExampleSelective(@Param("record") TBUserActivity record, @Param("example") TBUserActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") TBUserActivity record, @Param("example") TBUserActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int updateByExample(@Param("record") TBUserActivity record, @Param("example") TBUserActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int updateByPrimaryKeySelective(TBUserActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(TBUserActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_ACTIVITY
     *
     * @mbggenerated Thu May 04 17:34:59 CST 2017
     */
    int updateByPrimaryKey(TBUserActivity record);
}