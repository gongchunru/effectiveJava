package com.java.patterns.headfirst.ch8.step4;

import java.util.Arrays;

/**
 * 这是一个排序鸭子的程序
 *
 * @author gongchunru
 * @create 2018-10-11 2:24 PM
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before Sorting:");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\nAfter sorting");
        display(ducks);


    }


    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }

}
