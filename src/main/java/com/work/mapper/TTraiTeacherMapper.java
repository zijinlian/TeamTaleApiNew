package com.work.mapper;

import com.work.entity.TTraiTeacher;
import com.work.entity.TTraiTeacherExample;
import java.util.List;

public interface TTraiTeacherMapper {
    int insert(TTraiTeacher record);

    int insertSelective(TTraiTeacher record);

    List<TTraiTeacher> selectByExample(TTraiTeacherExample example);
}