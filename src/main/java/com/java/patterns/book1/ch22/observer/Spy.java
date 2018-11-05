package com.java.patterns.book1.ch22.observer;

/**
 * @author gongchunru
 * @create 2018-06-27 下午5:59
 */
public class Spy extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true){
            if (this.type.equals("breakfast")){ //监控是否在吃饭
                // 如果韩非子在吃饭就通知李斯
                if (this.hanFeiZi.isHavingBreakfast()){
                    liSi.update("韩非子在吃饭");
                    // 重置状态，继续jiankong
                    this.hanFeiZi.setHavingBreakfast(false);
                }
            }else { // 监控是否在娱乐
                if (this.hanFeiZi.isHavingFun()){
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
