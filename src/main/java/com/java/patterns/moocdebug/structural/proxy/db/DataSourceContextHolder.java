package com.java.patterns.moocdebug.structural.proxy.db;

/**
 * @author gongchunru
 * @create 2018-10-30 4:38 PM
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }


    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }

}
