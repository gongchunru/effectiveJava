package com.java.patterns.ch9.absfactory;

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
