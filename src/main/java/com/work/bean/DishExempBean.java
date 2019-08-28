package com.work.bean;

import java.util.List;

import com.work.entity.TDishOrderInfo;

public class DishExempBean extends PageBean{
	
	private String orderid;

    private String empid;

    private String empname;

    private String status;
    
    private String batchid;
    
    private List<TDishOrderInfo> orders;
    
	public List<TDishOrderInfo> getOrders() {
		return orders;
	}

	public void setOrders(List<TDishOrderInfo> orders) {
		this.orders = orders;
	}
	
	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}
