package com.java.patterns.ch9.absfactory;

public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println(" 黑人女性 ");
    }
}
