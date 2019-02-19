package com.java.patterns.moocdebug.behavioral.strategy;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-18 18:32
 */

public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
