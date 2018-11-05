package com.java.patterns.headfirst.ch8.step2;

/**
 *
 * 模版方法定义了一个算法步骤，并允许子类为一个或者多个步骤提供实现
 * @author gongchunru
 * @create 2018-10-09 11:55 PM
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    public void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();


    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();
}
