package com.java.improve.ClassLoader;

/**
 * Created by gongchunru on 2016/12/2.
 */
public class Example {

        String str = new String("good");

        char[] ch = { 'a', 'b', 'c' };

        public static void main(String args[]) {

            Example ex = new Example();

            ex.change(ex.str, ex.ch);

            System.out.print(ex.str + " and ");

            System.out.print(ex.ch);
//            System.out.println(str1);

        }

        public void change(String str, char ch[]) {

            str = "test ok";

            ch[0] = 'g';

        }
}
