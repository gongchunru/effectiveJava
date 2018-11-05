package com.java.patterns.moocdebug.creational.prototype;

/**
 * @author gongchunru
 * @create 2018-10-14 10:01 AM
 */
public class Test {
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setContent("初始化模版");

        for (int i = 0; i < 10; i++) {
            mail.setName("name:"+i);
            mail.setEmailAddress("name:"+i+"@xxx.com");
            mail.setContent("恭喜中奖了");
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
