package com.java.patterns.moocdebug.structural.bridge;

/**
 * @author gongchunru
 * @create 2018-10-30 12:05 AM
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
