package com.java.patterns.book1.ch19.adapter3;

import java.util.ArrayList;
import java.util.List;

public class LogClient {
    public static void main(String[] args) {
        LogBean logbean = new LogBean();
        logbean.setLogId("1");
        logbean.setOpeUserId("michael");
        List<LogBean> list = new ArrayList<LogBean>();
        LogFileOperateApi logFileApi = new LogFileOperate("");
        //创建操作日志的接口对象
        LogDbOpeApi api = new LogAdapter(logFileApi);
        api.createLog(logbean);
    }
}
