package com.java.patterns.ch9.absfactory;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人男性..");
    }
}
