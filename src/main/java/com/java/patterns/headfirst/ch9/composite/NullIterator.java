package com.java.patterns.headfirst.ch9.composite;

import java.util.Iterator;

/**
 * @author gongchunru
 * @create 2018-10-31 11:52 AM
 */
public class NullIterator implements Iterator {



    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
