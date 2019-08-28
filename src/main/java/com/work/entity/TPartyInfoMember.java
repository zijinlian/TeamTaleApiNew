package com.work.entity;

import java.math.BigDecimal;

/**
 * Created by System_User on 2017/1/1.
 */
public class TPartyInfoMember {

     private  String party_id;
//     private String parent_party_id;
     private String party_name;
     private String party_level;
     private BigDecimal party_lea_num;
     private BigDecimal party_mid_num;
     private BigDecimal   party_lit_num;
     private String fd_empnme;
     private String duty_user_face;
     private String  party_remark;
//     private String party_category;

    public String getParty_id() {
        return party_id;
    }

    public void setParty_id(String party_id) {
        this.party_id = party_id;
    }
//
//    public String getParent_party_id() {
//        return parent_party_id;
//    }
//
//    public void setParent_party_id(String parent_party_id) {
//        this.parent_party_id = parent_party_id;
//    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public String getParty_level() {
        return party_level;
    }

    public void setParty_level(String party_level) {
        this.party_level = party_level;
    }

    public BigDecimal getParty_lea_num() {
        return party_lea_num;
    }

    public void setParty_lea_num(BigDecimal party_lea_num) {
        this.party_lea_num = party_lea_num;
    }

    public BigDecimal getParty_mid_num() {
        return party_mid_num;
    }

    public void setParty_mid_num(BigDecimal party_mid_num) {
        this.party_mid_num = party_mid_num;
    }

    public BigDecimal getParty_lit_num() {
        return party_lit_num;
    }

    public void setParty_lit_num(BigDecimal party_lit_num) {
        this.party_lit_num = party_lit_num;
    }

    public String getFd_empnme() {
        return fd_empnme;
    }

    public void setFd_empnme(String fd_empnme) {
        this.fd_empnme = fd_empnme;
    }

    public String getDuty_user_face() {
        return duty_user_face;
    }

    public void setDuty_user_face(String duty_user_face) {
        this.duty_user_face = duty_user_face;
    }

    public String getParty_remark() {
        return party_remark;
    }

    public void setParty_remark(String party_remark) {
        this.party_remark = party_remark;
    }

//    public String getParty_category() {
//        return party_category;
//    }
//
//    public void setParty_category(String party_category) {
//        this.party_category = party_category;
//    }
}
