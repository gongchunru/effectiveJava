package com.java.patterns.book1.ch19.adapter3;

public class LogBean {

    private String logId;//日志编号
    private String opeUserId;//操作人员

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOpeUserId() {
        return opeUserId;
    }

    public void setOpeUserId(String opeUserId) {
        this.opeUserId = opeUserId;
    }

    @Override
    public String toString() {
        return "LogBean{" +
                "logId='" + logId + '\'' +
                ", opeUserId='" + opeUserId + '\'' +
                '}';
    }
}
