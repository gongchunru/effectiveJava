package com.java.patterns.moocdebug.structural.bridge;

/**
 * @author gongchunru
 * @create 2018-10-30 12:08 AM
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
