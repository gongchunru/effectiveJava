package com.java.improve.ClassLoader;

/**
 * Created by gongchunru on 2016/12/2.
 */
public class Test02 {
    public static void changeEmployee(Employee employee){
        employee = new Employee();
        employee.age = 1000;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.age = 100;
        changeEmployee(employee);
        System.out.println(employee.age);
    }
}

