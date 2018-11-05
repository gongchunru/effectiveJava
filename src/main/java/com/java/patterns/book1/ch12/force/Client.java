package com.java.patterns.book1.ch12.force;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

//        还是不行
//        IGamePlayer proxy = new GamePlayerProxy(player);

        IGamePlayer proxy = player.getProxy();

        //开始打游戏，记下时间戳
        System.out.printf("开始时间是：%s \n",LocalDate.now());

        proxy.login("张三","password");
        proxy.killBoss();
        proxy.upgrade();

        System.out.printf("结束时间：%s",LocalDate.now());
    }
}
