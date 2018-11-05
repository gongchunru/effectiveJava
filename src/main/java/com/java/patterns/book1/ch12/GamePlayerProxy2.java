package com.java.patterns.book1.ch12;

/**
 * 普通代理类的代理者
 */
public class GamePlayerProxy2 implements IGamePlayer {
    private IGamePlayer player = null;

    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy2(String name) {

        try {
            player = new GamePlayer2(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
        this.player.login(user, password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }
}
