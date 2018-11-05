package com.java.patterns.headfirst.ch9.iterator.dinermerger;

import com.java.patterns.headfirst.ch9.menu.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author gongchunru
 * @create 2018-10-16 11:52 AM
 */
public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItems);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
