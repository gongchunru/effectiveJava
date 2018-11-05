package com.java.patterns.moocdebug.structural.composite;

/**
 * @author gongchunru
 * @create 2018-10-29 5:50 PM
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("windows课程",11);

        CatalogComponent javaCourseCataLog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCataLog.add(mmallCourse1);
        javaCourseCataLog.add(mmallCourse2);
        javaCourseCataLog.add(designPattern);



        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCataLog);

        imoocMainCourseCatalog.print();





    }
}
