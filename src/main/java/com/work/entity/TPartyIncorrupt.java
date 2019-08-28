package com.work.entity;

import java.math.BigDecimal;

/**
 * Created by System_User on 2017/1/2.
 */
public class TPartyIncorrupt {

    private String fd_id;
    private String fd_nm;
    private String fd_content;
    private String fd_pubtime;
    private String fd_pubemp;
    private BigDecimal fd_big_type;
    private String fd_attachid_rel;
    private BigDecimal fd_sub_type;
    private String fd_orgcde;

    public String getFd_id() {
        return fd_id;
    }

    public void setFd_id(String fd_id) {
        this.fd_id = fd_id;
    }

    public String getFd_nm() {
        return fd_nm;
    }

    public void setFd_nm(String fd_nm) {
        this.fd_nm = fd_nm;
    }

    public String getFd_content() {
        return fd_content;
    }

    public void setFd_content(String fd_content) {
        this.fd_content = fd_content;
    }

    public String getFd_pubtime() {
        return fd_pubtime;
    }

    public void setFd_pubtime(String fd_pubtime) {
        this.fd_pubtime = fd_pubtime;
    }

    public String getFd_pubemp() {
        return fd_pubemp;
    }

    public void setFd_pubemp(String fd_pubemp) {
        this.fd_pubemp = fd_pubemp;
    }

    public BigDecimal getFd_big_type() {
        return fd_big_type;
    }

    public void setFd_big_type(BigDecimal fd_big_type) {
        this.fd_big_type = fd_big_type;
    }

    public String getFd_attachid_rel() {
        return fd_attachid_rel;
    }

    public void setFd_attachid_rel(String fd_attachid_rel) {
        this.fd_attachid_rel = fd_attachid_rel;
    }

    public BigDecimal getFd_sub_type() {
        return fd_sub_type;
    }

    public void setFd_sub_type(BigDecimal fd_sub_type) {
        this.fd_sub_type = fd_sub_type;
    }

    public String getFd_orgcde() {
        return fd_orgcde;
    }

    public void setFd_orgcde(String fd_orgcde) {
        this.fd_orgcde = fd_orgcde;
    }
}
