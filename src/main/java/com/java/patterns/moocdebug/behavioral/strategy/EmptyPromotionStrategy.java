package com.java.patterns.moocdebug.behavioral.strategy;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-18 19:30
 */

public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
