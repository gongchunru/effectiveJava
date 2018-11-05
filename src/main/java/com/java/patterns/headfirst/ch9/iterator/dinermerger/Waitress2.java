package com.java.patterns.headfirst.ch9.iterator.dinermerger;

import com.java.patterns.headfirst.ch9.menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author gongchunru
 * @create 2018-10-18 3:31 PM
 */
public class Waitress2 {

    ArrayList menus;


    public Waitress2(ArrayList menus) {
        this.menus = menus;
    }


    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
