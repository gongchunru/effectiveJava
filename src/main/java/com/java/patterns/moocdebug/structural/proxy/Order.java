package com.java.patterns.moocdebug.structural.proxy;

/**
 * @author gongchunru
 * @create 2018-10-30 4:21 PM
 */
public class Order {
    private Object orderInfo;
    private Integer userId;


    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}
