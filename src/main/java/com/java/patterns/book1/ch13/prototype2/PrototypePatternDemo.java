package com.java.patterns.book1.ch13.prototype2;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("shape : "+ clonedShape.getType());



    }
}
