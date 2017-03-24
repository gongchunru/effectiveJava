package com.java.improve.Patterns.Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by gongchunru on 2016/10/24.
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        int c ;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(new FileInputStream("test.txt")));

        while ((c = in.read())>0){
            System.out.println((char)c);
        }
        in.close();
    }
}
