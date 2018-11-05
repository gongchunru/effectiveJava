package com.java.patterns.moocdebug.structural.proxy;

/**
 * @author gongchunru
 * @create 2018-10-30 4:22 PM
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {

        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
