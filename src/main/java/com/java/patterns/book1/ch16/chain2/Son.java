package com.java.patterns.book1.ch16.chain2;

import com.java.patterns.book1.ch16.chainrespons.IWomen;

public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");

        System.out.println(women.getRequest());

        System.out.println("儿子的答复是：同意\n");
    }
}
