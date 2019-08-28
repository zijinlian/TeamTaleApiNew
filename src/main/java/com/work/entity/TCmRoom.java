package com.work.entity;

import java.math.BigDecimal;

public class TCmRoom {
    private String roomid;

    private String roomname;

    private String roomplace;

    private BigDecimal roompeople;

    private String roomequipment;

    private String status;

    private String roomlevle;

//    private String roomtypeid;
//
//    private String roomimageid;
//
//    public void setRoomtypeid(String roomtypeid)
//    {
//        this.roomtypeid = roomtypeid;
//    }
//    public String getRoomtypeid()
//    {
//        return this.roomtypeid;
//    }
//    public void setRoomimageid(String roomimageid)
//    {
//        this.roomimageid = roomimageid;
//    }
//    public String getRoomimageid()
//    {
//        return this.roomimageid;
//    }
    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomplace() {
        return roomplace;
    }

    public void setRoomplace(String roomplace) {
        this.roomplace = roomplace;
    }

    public BigDecimal getRoompeople() {
        return roompeople;
    }

    public void setRoompeople(BigDecimal roompeople) {
        this.roompeople = roompeople;
    }

    public String getRoomequipment() {
        return roomequipment;
    }

    public void setRoomequipment(String roomequipment) {
        this.roomequipment = roomequipment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoomlevle() {
        return roomlevle;
    }

    public void setRoomlevle(String roomlevle) {
        this.roomlevle = roomlevle;
    }
}