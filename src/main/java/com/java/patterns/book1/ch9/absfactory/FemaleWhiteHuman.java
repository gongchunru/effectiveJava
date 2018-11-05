package com.java.patterns.book1.ch9.absfactory;

public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人女性 .. ");
    }
}
