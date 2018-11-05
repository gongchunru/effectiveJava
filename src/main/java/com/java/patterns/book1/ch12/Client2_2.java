package com.java.patterns.book1.ch12;

import java.time.LocalDate;

public class Client2_2 {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy2("张三");

        //开始打游戏，记下时间戳
         System.out.printf("开始时间是：%s \n",LocalDate.now());

         proxy.login("张三","password");
         proxy.killBoss();
         proxy.upgrade();

        System.out.printf("结束时间：%s",LocalDate.now());
    }
}
