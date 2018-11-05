package com.java.patterns.book1.ch19.adapter3;

import java.util.List;

public class LogAdapter implements LogDbOpeApi {
    private LogFileOperateApi adaptee;

    public LogAdapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogBean logbean) {
        // TODO Auto-generated method stub
        List<LogBean> list = adaptee.readLogFile();
        list.add(logbean);
        adaptee.writeLogFile(list);
    }
}
