package com.work.mappercommon;

import com.work.common.SQLAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by changzhou on 2017/4/13.
 */
public interface CommonMapper {
    List<Map<String,Object>> selectCommonSql(SQLAdapter sqlAdapter);
}
