package com.work.mapper;

import com.work.entity.TCmRoom;
import com.work.entity.TCmRoomExample;
import java.util.List;

public interface TCmRoomMapper {
    int deleteByPrimaryKey(String roomid);

    int insert(TCmRoom record);

    int insertSelective(TCmRoom record);

    List<TCmRoom> selectByExample(TCmRoomExample example);

    TCmRoom selectByPrimaryKey(String roomid);

    int updateByPrimaryKeySelective(TCmRoom record);

    int updateByPrimaryKey(TCmRoom record);
}