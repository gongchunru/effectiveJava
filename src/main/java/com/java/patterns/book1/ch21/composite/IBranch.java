package com.java.patterns.book1.ch21.composite;

import java.util.ArrayList;

/**
 * @author gongchunru
 * @create 2018-06-26 下午8:41
 */
public interface IBranch {

    String getInfo();

    void add(IBranch branch);

    void add(ILeaf leaf);

    ArrayList getSubordinateInfo();

}
