package com.java.patterns.book1.ch22.observer;

/**
 * @author gongchunru
 * @create 2018-06-27 下午5:39
 */
public class HanFeiZi implements IHanFeiZi {

    private boolean isHavingBreakfast = false;

    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.isHavingBreakfast =true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.isHavingFun = true;
    }


    public boolean isHavingBreakfast(){
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
