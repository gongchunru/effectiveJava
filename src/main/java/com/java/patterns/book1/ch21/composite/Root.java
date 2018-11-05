package com.java.patterns.book1.ch21.composite;

import java.util.ArrayList;

/**
 * @author gongchunru
 * @create 2018-06-26 下午8:37
 */
public class Root implements IRoot {

    private ArrayList subordinateList = new ArrayList();

    private String name = "";

    private String position = "";

    private int salary = 0;

    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水： " + this.salary;
        return info;
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }


}
