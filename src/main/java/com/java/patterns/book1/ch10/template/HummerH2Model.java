package com.java.patterns.book1.ch10.template;

public class HummerH2Model extends HummerModel {

    private boolean alarmFlag = true; //要响喇叭

    //H2型号的悍马车鸣笛
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    //引擎轰鸣声
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

    //汽车发动
    public void start() {
        System.out.println("悍马H2发动...");
    }

    //停车
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
