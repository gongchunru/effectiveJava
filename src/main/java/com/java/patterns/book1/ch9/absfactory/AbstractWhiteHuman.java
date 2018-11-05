package com.java.patterns.book1.ch9.absfactory;

public abstract class AbstractWhiteHuman implements Human {

    //白色人种的皮肤颜色是白色的
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    //白色人种讲话
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }
}
