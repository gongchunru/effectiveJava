package com.java.patterns.headfirst.ch9.iterator.dinermerger;

import com.java.patterns.headfirst.ch9.menu.MenuItem;

import java.util.Iterator;

/**
 * @author gongchunru
 * @create 2018-10-11 4:56 PM
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalArgumentException("You can't remove an item util you've done at least on next()");
        }
        if (items[position - 1] != null) {
            for (int i = position -1;i<(items.length-1);i++){
                items[items.length - 1] = null;
            }
        }
    }
}
