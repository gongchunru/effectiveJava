package com.java.patterns.book1.ch8.factory;

public abstract class AbstractHumanFactory {
    abstract <T extends Human> T createHuman(Class<T> c);
}
