package com.java.patterns.book1.ch19.adapter3;

import java.util.List;

public interface LogFileOperateApi {

    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     * @return 存储的日志列表对象
     */
    List<LogBean> readLogFile();
    /**
     * 写日志文件，把日志列表写出到日志文件中去
     * @param list 要写到日志文件的日志列表
     */
    void writeLogFile(List<LogBean> list);

}
