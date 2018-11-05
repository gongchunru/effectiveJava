package com.java.patterns.book1.ch19.adapter3;

public interface LogDbOpeApi {
    /*
     * 新增日志
     * @param 需要新增的日志对象
     */
    void createLog(LogBean logbean);
}
