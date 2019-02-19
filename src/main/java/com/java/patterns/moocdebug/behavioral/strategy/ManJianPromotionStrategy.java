package com.java.patterns.moocdebug.behavioral.strategy;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-18 18:32
 */

public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销");
    }
}
