package com.java.patterns.book1.ch18.strategy;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperate(int num1, int num2) {
        return num1 - num2;
    }
}
