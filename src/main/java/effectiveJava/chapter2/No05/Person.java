package effectiveJava.chapter2.No05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author gongchunru
 * @Package chapter2.No05
 * @date 2017/2/16 22:33
 */
public class Person {

    //假设是这样的
    private final Date birthDate = new Date();

    //Dont't do this!
    public boolean isBabyBoomer() {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();

        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();

        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;

    }
}


