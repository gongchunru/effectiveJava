package com.java.improve.reflect;

/**
 * Created by gongchunru on 2017/3/21.
 */
public class HomeRequestHandler implements RequestHandlerInterface {
    @Override
    public String handleReqeust(String string) {
        System.out.println("HomeRequestHandler: "+string);
        return "HomeRequestHandler: "+string;
    }
}
