package com.work.entity;

import java.math.BigDecimal;

public class TDishOrderInfo {
    private String orderid;

    private String productid;

    private BigDecimal totlprice;

    private BigDecimal productnumber;

    private String name;

    private BigDecimal unitprice;
    
    private TDishExchange exchange;
    
    public TDishExchange getExchange() {
		return exchange;
	}

	public void setExchange(TDishExchange exchange) {
		this.exchange = exchange;
	}

	public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public BigDecimal getTotlprice() {
        return totlprice;
    }

    public void setTotlprice(BigDecimal totlprice) {
        this.totlprice = totlprice;
    }

    public BigDecimal getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(BigDecimal productnumber) {
        this.productnumber = productnumber;
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
}