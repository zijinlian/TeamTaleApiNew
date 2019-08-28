package com.work.entity;

import java.math.BigDecimal;

/**
 * Created by System_User on 2017/1/13.
 */
public class TOrderDishExemp  {

   private String baichid ;
    private String productstatus ;
    private String starttime;
    private String endtime;
    private String bitchname;
    private BigDecimal totalprice;

    public String getBaichid() {
        return baichid;
    }

    public void setBaichid(String baichid) {
        this.baichid = baichid;
    }

    public String getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(String productstatus) {
        this.productstatus = productstatus;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }



    public String getBitchname() {
        return bitchname;
    }

    public void setBitchname(String bitchname) {
        this.bitchname = bitchname;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }


}
