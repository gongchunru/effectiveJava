package com.java.patterns.book1.ch22.observer;

/**
 * @author gongchunru
 * @create 2018-06-27 下午5:57
 */
public class LiSi implements ILiSi {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕...\n");
    }

    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }


}
