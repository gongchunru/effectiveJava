package com.java.patterns.book1.ch12.dynamic;


import com.java.patterns.book1.ch12.GamePlayer;
import com.java.patterns.book1.ch12.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("张三");

        InvocationHandler handler = new GamePlayIH(player);

        ClassLoader cl = player.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class}, handler);

        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();

        System.out.printf("结束时间：%s \n",LocalDate.now());

    }
}
