package com.java.patterns.book1.ch8.factory;


/**
 * Define an interface for creating an object,
 * but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 * （定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。）
 */
public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
         AbstractHumanFactory YinYangLu = new HumanFactory();
        //女娲第一次造人，火候不足，于是白人产生了
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //女娲第二次造人，火候过足，于是黑人产生了
         System.out.println("\n--造出的第二批人是黑色人种--");
         Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
         blackHuman.getColor(); blackHuman.talk();

         //第三次造人，火候刚刚好，于是黄色人种产生了
         System.out.println("\n--造出的第三批人是黄色人种--");
         Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
         yellowHuman.getColor(); yellowHuman.talk();
    }
}
