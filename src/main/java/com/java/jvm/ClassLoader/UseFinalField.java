package com.java.jvm.ClassLoader;

/**
 * @author gongchunru
 * @Package com.java.jvm.ClassLoader
 * @date 2017/6/30 23:25
 * final 字段不会引起初始化
 *
 */
class FinalFieldClass{
    public static final String CONST_STR = "CONSTSTR";
    static {
        System.out.println("FinalFieldClass init");
    }
}


public class UseFinalField {
    public static void main(String[] args) {
        System.out.println(FinalFieldClass.CONST_STR);

    }

}
