package com.java.patterns.headfirst.ch8.step2;

/**
 * @author gongchunru
 * @create 2018-10-09 11:58 PM
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
