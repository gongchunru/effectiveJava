package com.java.patterns.ch9.absfactory;

public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人女性 .. ");
    }
}
