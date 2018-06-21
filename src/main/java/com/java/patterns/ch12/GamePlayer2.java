package com.java.patterns.ch12;

public class GamePlayer2 implements IGamePlayer {
    private String name = "";

    //构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer2(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = _name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user + "的用户" + this.name + "登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}
