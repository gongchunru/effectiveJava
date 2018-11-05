package com.java.patterns.moocdebug.creational.prototype;

/**
 * @author gongchunru
 * @create 2018-10-14 9:56 AM
 */
public class Mail {

    private String name;
    private String emailAddress;
    private String content;


    public Mail() {
        System.out.println("Mail Class Construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
