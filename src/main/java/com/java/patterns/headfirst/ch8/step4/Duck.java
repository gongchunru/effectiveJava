package com.java.patterns.headfirst.ch8.step4;

/**
 * @author gongchunru
 * @create 2018-10-11 11:44 AM
 */
public class Duck implements Comparable {
    String name;
    int weight;


    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    public int compareTo(Object object) {
        Duck otherDuck = (Duck) object;
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }
}
