package com.work.entity;

import java.math.BigDecimal;

/**
 * Created by System_User on 2016/12/31.
 */
public class TPartInfo {

    private String party_id ;//       VARCHAR2(32) not null,
    private String parent_party_id;// VARCHAR2(32),
    private String party_name;//      VARCHAR2(100),
    private String party_level;//     VARCHAR2(20),
    private BigDecimal party_lea_num;//   NUMBER,
    private BigDecimal party_mid_num;//   NUMBER,
    private BigDecimal party_lit_num;//   NUMBER,
    private String party_duty_user;// VARCHAR2(20),
    private String duty_user_face;//  VARCHAR2(20),
    private String party_remark;//    VARCHAR2(400),
    private String party_category;//  VARCHAR2(20)

    public String getParty_id() {
        return party_id;
    }

    public void setParty_id(String party_id) {
        this.party_id = party_id;
    }

    public String getParent_party_id() {
        return parent_party_id;
    }

    public void setParent_party_id(String parent_party_id) {
        this.parent_party_id = parent_party_id;
    }

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

    public String getParty_duty_user() {
        return party_duty_user;
    }

    public void setParty_duty_user(String party_duty_user) {
        this.party_duty_user = party_duty_user;
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

    public String getParty_category() {
        return party_category;
    }

    public void setParty_category(String party_category) {
        this.party_category = party_category;
    }



}
