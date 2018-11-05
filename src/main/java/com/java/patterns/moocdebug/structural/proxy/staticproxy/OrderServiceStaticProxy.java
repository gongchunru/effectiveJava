package com.java.patterns.moocdebug.structural.proxy.staticproxy;

import com.java.patterns.moocdebug.structural.proxy.IOrderService;
import com.java.patterns.moocdebug.structural.proxy.Order;
import com.java.patterns.moocdebug.structural.proxy.OrderServiceImpl;
import com.java.patterns.moocdebug.structural.proxy.db.DataSourceContextHolder;

/**
 * @author gongchunru
 * @create 2018-10-30 4:24 PM
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod(order);
        return 0;
    }

    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理beforeMethod");
    }

    private void afterMethod(Order order){
        System.out.println("静态代理 afterMethod");
    }

}
