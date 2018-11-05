package com.java.patterns.book1.ch9.absfactory;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄色人种男");
    }
}
