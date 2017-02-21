package chapter2.No05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author gongchunru
 * @Package chapter2.No05
 * @date 2017/2/16 22:52
 *
 * 改进后的Person类，只在初始化的试试创建Calendar、TimeZone实例一次，
 * 而不是每次调用isBabyBoomer的时候都创建这些实例，
 * 如果isBabyBoomer 被频繁的调用，这种方法会显著的提高性能。
 */
public class Person2 {
    private final Date bithDate = new Date();

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();

        gmtCal.set(1964,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer(){
        return bithDate.compareTo(BOOM_START) >=0 && bithDate.compareTo(BOOM_END) < 0;
    }
}
