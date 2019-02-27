package com.java.patterns.moocdebug.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-28 00:16
 */

public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question)arg;
        System.out.println(teacherName +"老师的"+course.getCourseName()+" 课程收到一个问题:" +question.getQuestionContent());
    }
}
