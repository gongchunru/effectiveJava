package com.java.patterns.book1.ch20.iterator2;

//import com.java.patterns.book1.ch20.iterator.IProject;
//import com.java.patterns.book1.ch20.iterator.Project;

/**
 * @author gongchunru
 * @create 2018-06-26 下午8:16
 */
public class Boss {
    public static void main(String[] args) {

        IProject project = new Project();

        project.add("星球大战项目ddddd", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 10000, 1000000000);


        //这边100个项目
        //这边100个项目
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }

        //遍历一下ArrayList，把所有的数据都取出
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
