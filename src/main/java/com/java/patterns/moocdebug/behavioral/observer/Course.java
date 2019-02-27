package com.java.patterns.moocdebug.behavioral.observer;

import java.util.Observable;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-25 00:00
 */

public class Course extends Observable {

    private String courseName;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getClass()+" 在 "+ course.getCourseName() + "提出了" + question.getQuestionContent());
        setChanged();
        notifyObservers(question);
    }

}
