package com.java.patterns.headfirst.ch8.step1;

/**
 * @author gongchunru
 * @create 2018-10-09 4:35 PM
 */
public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }


    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }


}
