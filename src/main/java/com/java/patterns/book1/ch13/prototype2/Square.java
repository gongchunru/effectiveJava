package com.java.patterns.book1.ch13.prototype2;

public class Square extends Shape {

    public Square() {
        super.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
