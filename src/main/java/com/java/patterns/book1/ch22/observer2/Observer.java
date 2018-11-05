package com.java.patterns.book1.ch22.observer2;

/**
 * @author gongchunru
 * @create 2018-06-27 下午6:57
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
