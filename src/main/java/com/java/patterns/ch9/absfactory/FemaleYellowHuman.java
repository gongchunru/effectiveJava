package com.java.patterns.ch9.absfactory;


public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println(" 黄种女人");
    }
}
