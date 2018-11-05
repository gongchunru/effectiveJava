package com.java.patterns.book1.ch13.prototype2;

public class Circle extends Shape {
    public Circle() {
        super.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
