package com.work.service.v3;

import com.work.api.v3.common.RequesterCodeTableApi;
import com.work.api.v3.common.vo.CodeTableVo;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.entity.TbCodeTable;
import com.work.entity.TbCodeTableExample;
import com.work.mapper.TbCodeTableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by changzhou on 2017/5/4.
 */
@Service("commonService")
public class CommonService extends BaseRequester {

    @Resource
    private TbCodeTableMapper codeTableMapper;

    /**
     * @param req
     * @param res
     * @description 码表数据
     */
    public void selectCodeTable(RequesterCodeTableApi.Params req, RequesterCodeTableApi.Response res) {
        try {
            TbCodeTableExample codeTableExample = new TbCodeTableExample();
            codeTableExample.createCriteria().andCodeKeyEqualTo(req.key);
            List<TbCodeTable> list = codeTableMapper.selectByExample(codeTableExample);
            copy(res.body.list,list, CodeTableVo.class,this);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }
}
