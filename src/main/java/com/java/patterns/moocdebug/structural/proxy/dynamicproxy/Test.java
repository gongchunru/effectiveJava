package com.java.patterns.moocdebug.structural.proxy.dynamicproxy;

import com.java.patterns.moocdebug.structural.proxy.IOrderService;
import com.java.patterns.moocdebug.structural.proxy.Order;
import com.java.patterns.moocdebug.structural.proxy.OrderServiceImpl;

/**
 * @author gongchunru
 * @create 2018-10-30 5:03 PM
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
