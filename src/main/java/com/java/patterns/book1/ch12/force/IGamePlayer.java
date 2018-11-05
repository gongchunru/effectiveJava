package com.java.patterns.book1.ch12.force;

public interface IGamePlayer {

    //登录游戏
    void login(String user, String password);

    //杀怪，网络游戏的主要特色
    void killBoss();

    //升级
    void upgrade();

    //每个人都可以找一下自己的代理
    IGamePlayer getProxy();
}
