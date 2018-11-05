package com.java.patterns.headfirst.ch8.step1;

/**
 * @author gongchunru
 * @create 2018-10-09 4:32 PM
 */
public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCoup();
        addSugarAndMilk();
    }


    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCoup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Pouring into cup");
    }


}
