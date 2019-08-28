package com.work.entity;

import java.math.BigDecimal;

public class TDishExchange {
    private String id;

    private String batchid;

    private String name;

    private BigDecimal unitprice;

    private BigDecimal productnumber;

    private String receivetime;

    private String receiveplace;

    private String unit;

    private String descprtion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(BigDecimal productnumber) {
        this.productnumber = productnumber;
    }

    public String getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(String receivetime) {
        this.receivetime = receivetime;
    }

    public String getReceiveplace() {
        return receiveplace;
    }

    public void setReceiveplace(String receiveplace) {
        this.receiveplace = receiveplace;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescprtion() {
        return descprtion;
    }

    public void setDescprtion(String descprtion) {
        this.descprtion = descprtion;
    }
}