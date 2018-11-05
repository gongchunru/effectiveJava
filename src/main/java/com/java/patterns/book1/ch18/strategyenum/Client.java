package com.java.patterns.book1.ch18.strategyenum;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        args[0] = "1";
        args[1] = "+";
        args[2] = "10";

        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];

        //符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        //
        System.out.println("运行结果为：" + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
    }
}
