package com.java.patterns.moocdebug.structural.bridge;

/**
 * @author gongchunru
 * @create 2018-10-30 12:06 AM
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        //...
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
