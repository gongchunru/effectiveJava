package com.java.improve.reflect;

/**
 * Created by gongchunru on 2017/3/21.
 */
public class MineRequestHandler implements RequestHandlerInterface {
    @Override
    public String handleReqeust(String string) {
        System.out.println("收到请求: "+string);
        return "结果： "+string;
    }
}
