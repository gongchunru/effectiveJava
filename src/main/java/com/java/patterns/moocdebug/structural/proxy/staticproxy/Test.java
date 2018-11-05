package com.java.patterns.moocdebug.structural.proxy.staticproxy;

import com.java.patterns.moocdebug.structural.proxy.Order;

/**
 * @author gongchunru
 * @create 2018-10-30 4:43 PM
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
