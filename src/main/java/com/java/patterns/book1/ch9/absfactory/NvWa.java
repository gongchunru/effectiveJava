package com.java.patterns.book1.ch9.absfactory;


/**
 * Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 * （为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类。）
 *
 *
 * 有M个产品等级就应该有M个实现工厂类，在每个实现工厂中，实现不同产品族 的生产任务。
 *
 * 优点：
 *      ● 封装性，
 *      ● 产品族内的约束为非公开状态
 * 缺点：
 *     产品族扩展非常困难，
 *
 * 抽象工厂模式的使用场景定义非常简单：
 *              一个对象族（或是一组没有任何关系的对象） 都有相同的约束，则可以使用抽象工厂模式。
 */
public class NvWa {

    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        // 第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产线建立完毕，开始生产人了:

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("\n---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();

    }
}
