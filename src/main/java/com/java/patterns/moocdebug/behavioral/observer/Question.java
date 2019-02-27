package com.java.patterns.moocdebug.behavioral.observer;

/**
 * @Description
 * @Author gongchunru
 * @Date 2019-02-28 00:16
 */

public class Question {
    private String userName;

    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
