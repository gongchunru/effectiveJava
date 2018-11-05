package com.java.patterns.book1.ch9.absfactory;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人男性..");
    }
}
