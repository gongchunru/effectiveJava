package com.java.patterns.headfirst.ch8.step2;

/**
 * @author gongchunru
 * @create 2018-10-09 11:59 PM
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
