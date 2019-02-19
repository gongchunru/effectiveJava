package com.java.patterns.moocdebug.behavioral.strategy;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-18 18:37
 */

public class Test {

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new FanXianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.execute();
//        promotionActivity1111.execute();
//    }


//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey,"LIJIAN")){
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        }else if (StringUtils.equals(promotionKey,"FANXIAN")){
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }
//        promotionActivity.execute();
//    }


    //工厂和策略模式配合

    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();


    }

}
