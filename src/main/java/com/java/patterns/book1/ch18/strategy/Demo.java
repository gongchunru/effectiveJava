package com.java.patterns.book1.ch18.strategy;

public class Demo {
    public static void main(String[] args) {
        Strategy strategy = new OperationAdd();
        Context context = new Context(strategy);
        System.out.printf("add method: %d \n ",context.executeStrategy(5,2));

        strategy = new OperationMultiply();
        context = new Context(strategy);
        System.out.printf("Multiply method: %d \n",context.executeStrategy(5,2));

    }
}
