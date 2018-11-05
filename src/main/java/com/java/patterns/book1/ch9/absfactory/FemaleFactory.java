package com.java.patterns.book1.ch9.absfactory;

public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return  new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
