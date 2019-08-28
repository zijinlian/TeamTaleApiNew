package com.work.mapper;

import com.work.entity.TTaskRateFeedback;
import com.work.entity.TTaskRateFeedbackExample;
import java.util.List;

public interface TTaskRateFeedbackMapper {

	List<TTaskRateFeedback> selectByExample(TTaskRateFeedbackExample example);

}