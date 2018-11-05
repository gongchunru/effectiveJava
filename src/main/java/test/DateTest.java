package test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author gongchunru
 * @create 2018-07-05 上午10:58
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(getDayAfter(date,-83));
        System.out.println(getDayAfter(date,28));
        System.out.println(getDayAfter(date,-53));

    }


//    public static Date getStartDate(Long time) {
//
//        if (null == time)
//            return null;
//
//        Calendar cal = Calendar.getInstance();
//        cal.setTimeInMillis(time);
//        cal.set(Calendar.HOUR_OF_DAY, 0);
//        cal.set(Calendar.MINUTE, 0);
//        cal.set(Calendar.SECOND, 0);
//        cal.set(Calendar.MILLISECOND, 0);
//        return cal.getTime();
//    }

    public static Date getEndDate(Date date) {
        if (null == date)
            return null;
        return getEndDate(date.getTime());
    }

    public static Date getEndDate(Long time) {
        if (null == time)
            return null;
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }


    public static Date getStartDate(Long original) {
        if (null == original) {
            return null;
        } else {
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(original);
            cal.set(11, 0);
            cal.set(12, 0);
            cal.set(13, 0);
            return cal.getTime();
        }
    }


    /**
     * 获取多少天后的日期
     *
     * @param date      原始日期
     * @param dayOffset 日期偏移量，负数为前多少天
     */
    public static Date getDayAfter(Date date, int dayOffset) {
        if (null == date){
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(date.getTime());
        cal.add(Calendar.DAY_OF_YEAR, dayOffset);
        return cal.getTime();
    }

}
