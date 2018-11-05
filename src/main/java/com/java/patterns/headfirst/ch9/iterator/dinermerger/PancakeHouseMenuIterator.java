package com.java.patterns.headfirst.ch9.iterator.dinermerger;

import java.util.ArrayList;

/**
 * @author gongchunru
 * @create 2018-10-11 5:07 PM
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
       if (position >= items.size()){
           return false;
       } else {
           return true;
       }
    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }
}
