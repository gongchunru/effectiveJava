package com.java.patterns.ch10.template;

public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true; //要响喇叭

    //H1型号的悍马车鸣笛
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    //引擎轰鸣声
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

    //汽车发动
    public void start() {
        System.out.println("悍马H1发动...");
    }

    //停车
    public void stop() {
        System.out.println("悍马H1停车...");
    }


    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }


}
