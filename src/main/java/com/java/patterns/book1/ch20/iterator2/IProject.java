package com.java.patterns.book1.ch20.iterator2;

/**
 * @author gongchunru
 * @create 2018-06-26 下午8:04
 */
public interface IProject {
    //增加项目
    void add(String name,int num,int cost);
    // 从老板这里看到的就是项目信息
    String getProjectInfo();
    // 获得一个可以被遍历的对象
    IProjectIterator iterator();
}
