package com.java.improve.Patterns.builderPattern.builder01;

/**
 * Created by gongchunru
 * Date：2017/7/21.
 * Time：14:44
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Person02 person02 = new Person02.Person02Builder().setNewCity("beijing").setNewFirstName("hhh").createPerson02();
        System.out.println(person02.toString());
    }
}
