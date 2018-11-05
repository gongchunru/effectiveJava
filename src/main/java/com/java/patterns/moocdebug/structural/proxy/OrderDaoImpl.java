package com.java.patterns.moocdebug.structural.proxy;

/**
 * @author gongchunru
 * @create 2018-10-30 4:21 PM
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
