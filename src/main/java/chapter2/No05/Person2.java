package chapter2.No05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author gongchunru
 * @Package chapter2.No05
 * @date 2017/2/16 22:52
 */
public class Person2 {
    private final Date bithDate;

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();

        gmtCal.set(1964,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer{
        return bithDate.compareTo(BOOM_START) && bithDate.compareTo(BOOM_END);
    }
}
