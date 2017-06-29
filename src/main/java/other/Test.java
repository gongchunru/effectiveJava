package other;

import com.java.improve.reflect.Person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by gongchunru on 2017/3/1.
 */
public class Test {
    public static void main(String[] args) {
//        String a = TestEnum.BLUE.toString();
//
//        TestEnum testEnum = TestEnum.valueOf(a);
//        System.out.println(testEnum);
//
//        System.out.println(Math.abs(20));
//        System.out.println(3%1);

        Date date1 = new Date();
        Date date2 = new Date(1497532162236L);

        System.out.println(date1.getTime());


        System.out.println("==="+(date1.getTime()-date2.getTime())/1000);


        SimpleDateFormat d= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化时间

        String time1=d.format(date1);//按以上格式 将当前时间转换成字符串
        String time2=d.format(date2);

        System.out.println(time1);
        System.out.println(time2);

        try {
            long timeCost = (d.parse(time1).getTime()-d.parse(time2).getTime())/1000;
            System.out.println(timeCost);
        } catch (Exception e) {

        }
    }
}
