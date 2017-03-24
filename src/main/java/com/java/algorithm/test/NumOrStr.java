package com.java.algorithm.test;

/**
 * Created by gongchunru on 2016/11/18.
 */
public class NumOrStr {
    public static void main(String[] args) {
        System.out.println( numOrStr(315));

    }

    public static String numOrStr(int data){

        StringBuilder builder = new StringBuilder("");

        if (String.valueOf(data).indexOf("3")!=-1){//包含3
            builder.append("Fizz");
        }

        if (String.valueOf(data).indexOf("5")!=-1){
            builder.append("Buzz");

        }
        if (data%3==0){
            builder.append("Fizz");
        }
        if (data%5==0){
            builder.append("Buzz");
        }

        return builder.toString();
    }

}
