package com.java.patterns.ch16.chain2;

import com.java.patterns.ch16.chainrespons.IWomen;

import java.util.ArrayList;
import java.util.Random;

/**
 * Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
 *
 * Chain the receiving objects and pass the request along the chain until an object handles it.
 * （使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。）
 */
public class Client {
    public static void main(String[] args) {
//        随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        } //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son(); //设置请示顺序

        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
