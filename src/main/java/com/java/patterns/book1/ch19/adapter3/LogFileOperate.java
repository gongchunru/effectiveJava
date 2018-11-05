package com.java.patterns.book1.ch19.adapter3;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 实现日志文件的存取
 */
public class LogFileOperate implements LogFileOperateApi {
    /*
     * 设置日志文件的路径和文件名称
     */
    private String logFileName = "file.log";

    /*
     * 构造方法，传入文件的路径和名称
     */
    public LogFileOperate(String logFilename) {
        if (logFilename != null) {
            this.logFileName = logFilename;
        }
    }

    @Override
    public List<LogBean> readLogFile() {
        List<LogBean> list = null;
        ObjectInputStream oin = null;
        //业务代码
        return list;
    }

    @Override
    public void writeLogFile(List<LogBean> list) {
        File file = new File(logFileName);
        ObjectOutputStream oout = null;
        //业务代码
    }


}
