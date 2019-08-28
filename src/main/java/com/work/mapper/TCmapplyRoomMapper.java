package com.work.mapper;

import com.work.bean.RoomBean;
import com.work.entity.TCmapplyRoom;
import com.work.entity.TCmapplyRoomExample;

import java.util.List;
import java.util.Map;

public interface TCmapplyRoomMapper {
    int insert(TCmapplyRoom record);

    int insertSelective(TCmapplyRoom record);

    List<TCmapplyRoom> selectByExample(TCmapplyRoomExample example);
    
    List<Map<String, Object>> selectRoomById(RoomBean bean);
    
    List<Map<String, Object>> selectRoomByEmpId(RoomBean bean);
    
    List<Map<String, Object>> selectMyRoomApproval(RoomBean bean);
    
    List<Map<String, Object>> selectManagerRoomList();
    
}