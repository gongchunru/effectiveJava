package com.java.patterns.ch10.template;

/**
 *  Define the skeleton of an algorithm in an operation,deferring some steps to subclasses.
 *  Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 * （定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改 变一个算法的结构即可重定义该算法的某些特定步骤。）
 *
 * 优点：
 *   ● 封装不变部分，扩展可变部分
 *   ● 提取公共部分代码，便于维护
 *   ● 行为由父类控制，子类实现
 *
 * 适用场景：
 *  ● 多个子类有公有的方法，并且逻辑基本相同时。
 *  ● 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个 子类实现。
 *  ● 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通 过钩子函数（见“模板方法模式的扩展”）约束其行为。
 *
 */
public class Client {
    public static void main(String[] args) {
        HummerModel model = new HummerH1Model();
        model.run();
    }
}
