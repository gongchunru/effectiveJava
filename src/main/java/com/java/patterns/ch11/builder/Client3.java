package com.java.patterns.ch11.builder;


/**
 * Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.
 * （将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。）
 */
public class Client3 {
    public static void main(String[] args) {
        Director director = new Director();

        //1万辆A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }

        //100万辆B类型的奔驰车
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }

        // 1000万辆C类型的宝马车
        for (int i = 0; i < 10000000; i++) {
            director.getCBMWModel().run();
        }
    }
}
