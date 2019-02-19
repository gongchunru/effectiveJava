package com.java.patterns.moocdebug.behavioral.strategy;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-18 18:34
 */

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }


    public void execute() {
        promotionStrategy.doPromotion();
    }


}
