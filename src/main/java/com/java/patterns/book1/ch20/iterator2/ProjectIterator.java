package com.java.patterns.book1.ch20.iterator2;

import java.util.ArrayList;

/**
 * @author gongchunru
 * @create 2018-06-26 下午8:08
 */
public class ProjectIterator implements IProjectIterator {

    //所有的项目都放在ArrayList中
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private int currentItem = 0;

    //构造函数传入projectList
    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    //判断是否还有元素，必须实现
    @Override
    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return (IProject)this.projectList.get(this.currentItem++);
    }
}
