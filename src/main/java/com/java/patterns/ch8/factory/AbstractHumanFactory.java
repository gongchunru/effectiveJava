package com.java.patterns.ch8.factory;

public abstract class AbstractHumanFactory {
    abstract <T extends Human> T createHuman(Class<T> c);
}
