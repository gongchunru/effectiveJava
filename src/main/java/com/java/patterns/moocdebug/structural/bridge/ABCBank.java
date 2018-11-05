package com.java.patterns.moocdebug.structural.bridge;

/**
 * @author gongchunru
 * @create 2018-10-30 12:09 AM
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
